package af.cmr.indyli.gespro.business.service.test;

import static org.assertj.core.api.Assertions.assertThat;

import java.nio.file.AccessDeniedException;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.annotation.Resource;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import af.cmr.indyli.gespro.business.config.GesproBusinessConfig;
import af.cmr.indyli.gespro.business.dto.GpProjectManagerFullDTO;
import af.cmr.indyli.gespro.business.dto.GpOrganizationFullDTO;
import af.cmr.indyli.gespro.business.dto.GpProjectBasicDTO;
import af.cmr.indyli.gespro.business.dto.GpProjectFullDTO;
import af.cmr.indyli.gespro.business.exception.GesproBusinessException;
import af.cmr.indyli.gespro.business.service.IGpProjectManagerService;
import af.cmr.indyli.gespro.business.service.IGpOrganizationService;
import af.cmr.indyli.gespro.business.service.IGpProjectService;
import af.cmr.indyli.gespro.business.utils.GesproConstantes.GesproConstantesService;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { GesproBusinessConfig.class })
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class GpProjectServiceTest {

	@Resource(name = GesproConstantesService.GP_CHEF_PROJET_SERVICE_KEY)
	private IGpProjectManagerService empService;

	@Resource(name = GesproConstantesService.GP_PROJECT_SERVICE_KEY)
	private IGpProjectService projectService;

	@Resource(name = GesproConstantesService.GP_ORGANIZATION_KEY)
	private IGpOrganizationService organizationService;

	private Integer pjIdForAllTest = null;
	private Integer pjIdCreateTest = null;

	private GpOrganizationFullDTO orgTest;
	private GpProjectManagerFullDTO pmTest;

	@Test
	public void testCreateProjectWithSuccess() throws GesproBusinessException {
		// Given
		GpProjectFullDTO project = new GpProjectFullDTO();

		project.setProjectCode("Code-1");
		project.setName("Project-1");
		project.setDescription("First Project");
		project.setStartDate(new Date());
		project.setEndDate(new Date());
		project.setAmount(5623.66);
		project.setCreationDate(new Date());

		Assert.assertNotNull(this.pmTest.getId());
		Assert.assertNotNull(this.orgTest.getId());

		project.setGpOrganization(this.orgTest);
		project.setGpChefProjet(pmTest);

		project = this.projectService.create(project);
		Assert.assertNotNull(project.getId());

		this.pjIdCreateTest = project.getId();

	}

	@Test
	public void testFindAllProjectsWithSuccess() {
		// Given

		// When
		List<GpProjectBasicDTO> projects = this.projectService.findAll();

		// Then
		Assert.assertTrue(projects.size() > 0);
	}

	@Test
	public void testFindByIdWithSuccess() throws GesproBusinessException {
		// Given
		Integer projectId = this.pjIdForAllTest;

		// When
		GpProjectFullDTO project = this.projectService.findById(projectId);

		// Then
		Assert.assertNotNull(project);
	}

	@Test
	public void testUpdateProjectsWithSuccess() throws GesproBusinessException, AccessDeniedException {
		// Given
		Integer projectId = this.pjIdForAllTest;
		// When

		GpProjectFullDTO gpProject = this.projectService.findById(projectId);
		gpProject.setAmount(8659);

		projectService.update(gpProject);
		assertThat(gpProject.getAmount()).isEqualTo(8659);
	}

	@Test
	public void testDeleteProjectWithSuccess() throws AccessDeniedException, GesproBusinessException {
		// Given
		Integer projectId = this.pjIdForAllTest;
		pjIdForAllTest = null;
		// When
		this.projectService.deleteById(projectId);

		// Then
		GpProjectFullDTO project = this.projectService.findById(projectId);
		Assert.assertNull(project);
	}

	@Before
	public void prepareAllEntityBefore() throws GesproBusinessException {

		// Init GpProjetManager
		GpProjectManagerFullDTO emp = new GpProjectManagerFullDTO();

		emp.setFileNumber("852");
		emp.setLastname("Izi");
		emp.setFirstname("Ben");
		emp.setPhoneNumber(6985725);
		emp.setPassword("manager[pass");
		emp.setEmail("izi.ben@gouv.fr");
		emp.setLogin("ben.izi");
		emp.setCreationDate(new Date());
		//emp = empService.create(emp);

		this.pmTest = new GpProjectManagerFullDTO();
		this.pmTest = emp;

		// creation organisation

		GpOrganizationFullDTO organization = new GpOrganizationFullDTO();

		organization.setOrgCode("O-Fr");
		organization.setName("Oracle");
		organization.setAdrWeb("oracle.com");
		organization.setContactEmail("oracle@mail.com");
		organization.setContactName("Oracle");
		organization.setPhoneNumber(7895);
		organization = organizationService.create(organization);

		this.orgTest = new GpOrganizationFullDTO();
		this.orgTest = organization;
		Assert.assertNotNull(this.orgTest.getId());

		// cr�ation project
		GpProjectFullDTO project = new GpProjectFullDTO();
		project.setProjectCode("J19");
		project.setName("Jre 19");
		project.setDescription("Create JRE 19");
		project.setStartDate(new Date());
		project.setEndDate(new Date());
		project.setAmount(98598.66);
		project.setCreationDate(new Date());
		project.setGpOrganization(this.orgTest);
		project.setGpChefProjet(this.pmTest);
		project.setCreationDate(new Date());
		project = this.projectService.create(project);

		Assert.assertNotNull(project.getId());

		this.pjIdForAllTest = project.getId();
	}

	@After
	public void deleteAllEntityAfter() throws GesproBusinessException, AccessDeniedException {
		if (!Objects.isNull(this.pjIdCreateTest)) {
			this.projectService.deleteById(this.pjIdForAllTest);
		}
		if (!Objects.isNull(this.pjIdCreateTest)) {
			this.projectService.deleteById(pjIdCreateTest);
		}

		if (!Objects.isNull(this.pmTest)) {
			//this.empService.deleteById(this.pmTest.getId());
		}

		if (!Objects.isNull(this.orgTest)) {
			this.organizationService.deleteById(this.orgTest.getId());
		}
	}

}
