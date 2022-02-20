package af.cmr.indyli.gespro.business.service.test;

import static org.junit.Assert.assertNotNull;

import java.nio.file.AccessDeniedException;
import java.util.Calendar;
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
import af.cmr.indyli.gespro.business.dto.GpPhaseBasicDTO;
import af.cmr.indyli.gespro.business.dto.GpPhaseFullDTO;
import af.cmr.indyli.gespro.business.dto.GpProjectFullDTO;
import af.cmr.indyli.gespro.business.exception.GesproBusinessException;
import af.cmr.indyli.gespro.business.service.IGpProjectManagerService;
import af.cmr.indyli.gespro.business.service.IGpOrganizationService;
import af.cmr.indyli.gespro.business.service.IGpPhaseService;
import af.cmr.indyli.gespro.business.service.IGpProjectService;
import af.cmr.indyli.gespro.business.utils.GesproConstantes.GesproConstantesService;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { GesproBusinessConfig.class })
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class GpPhaseServiceTest {
	@Resource(name = GesproConstantesService.GP_PHASE_SERVICE_KEY)
	private IGpPhaseService phaseService;

	@Resource(name = GesproConstantesService.GP_PROJECT_SERVICE_KEY)
	private IGpProjectService projectService;

	@Resource(name = GesproConstantesService.GP_CHEF_PROJET_SERVICE_KEY)
	private IGpProjectManagerService empService;

	@Resource(name = GesproConstantesService.GP_ORGANIZATION_KEY)
	private IGpOrganizationService organizationService;

	private GpProjectManagerFullDTO pmTest;
	private GpOrganizationFullDTO orgTest;
	private GpProjectFullDTO pjTest;
	private Integer phaseIdForAllTest;
	private Integer createPhaseId;

	@Test
	public void testCreatePhaseWithSuccess() throws GesproBusinessException {
		// Given
		GpPhaseFullDTO phase = new GpPhaseFullDTO();

		Calendar c = Calendar.getInstance();
		c.add(Calendar.DATE, -40);
		Date d = c.getTime();
		phase.setPhaseCode("ServiceTest");
		phase.setDescription("Deuxième phase du projet");
		phase.setStartDate(d);
		phase.setEndDate(new Date());
		phase.setAmount(78553.66);
		phase.setCreationDate(new Date());
		phase.setGpProject(pjTest);
		phase.setCreationDate(new Date());
		// When
		phase = this.phaseService.create(phase);
		this.createPhaseId = phase.getId();

		// Then
		Assert.assertNotNull(phase);
	}

	@Test
	public void testFindAllPhasesWithSuccess() {
		// Given

		// When
		List<GpPhaseBasicDTO> phases = this.phaseService.findAll();

		// Then
		Assert.assertTrue(phases.size() > 0);
	}

	@Test
	public void testFindByIdWithSuccess() throws GesproBusinessException {
		// Given
		Integer phaseId = this.phaseIdForAllTest;
		// When
		GpPhaseBasicDTO phase = this.phaseService.findById(phaseId);
		// Then
		Assert.assertNotNull(phase);
	}

	@Test
	public void testUpdatePhaseWithSuccess() throws GesproBusinessException, AccessDeniedException {
		// Given
		Integer phaseId = this.phaseIdForAllTest;
		Assert.assertNotNull(phaseId);
		// When

		GpPhaseFullDTO gpPhase = this.phaseService.findById(phaseId);
		gpPhase.setDescription("New Description");
		this.phaseService.update(gpPhase);
	}

	@Test
	public void testDeletePhaseWithSuccess() throws AccessDeniedException, GesproBusinessException {
		Integer phaseId = this.phaseIdForAllTest;
		phaseIdForAllTest = null;
		// When
		this.phaseService.deleteById(phaseId);

		// Then
		GpPhaseFullDTO phase = this.phaseService.findById(phaseId);
		Assert.assertNull(phase);
	}

	@Before
	public void prepareAllEntityBefore() throws GesproBusinessException {

		// Init GpProjetManager
		GpProjectManagerFullDTO emp = new GpProjectManagerFullDTO();
		emp.setFileNumber("1050");
		emp.setLastname("Turbo");
		emp.setFirstname("Pascal");
		emp.setPhoneNumber(897856);
		emp.setPassword("thisismymdp");
		emp.setEmail("turbo.pascal@mail.fr");
		emp.setLogin("turbo.pascal");
		emp.setCreationDate(new Date());
		//TODO 10 : Decommenter la ligne ci dessous
		//emp = empService.create(emp);

		this.pmTest = emp;
		assertNotNull(this.pmTest);

		// création organisation
		GpOrganizationFullDTO organization = new GpOrganizationFullDTO();
		organization.setOrgCode("100Trace");
		organization.setName("Sans Trace");
		organization.setAdrWeb("100trace.com");
		organization.setContactEmail("sanstrace@org.com");
		organization.setContactName("100-Trace");
		organization.setPhoneNumber(7895);
		organization = organizationService.create(organization);

		this.orgTest = organization;
		assertNotNull(this.orgTest);

		// création project
		GpProjectFullDTO project = new GpProjectFullDTO();
		project.setProjectCode("BETA");
		project.setName("SOLSTAR");
		project.setDescription("First Project Service Test");
		project.setStartDate(new Date());
		project.setEndDate(new Date());
		project.setAmount(5623.66);
		project.setCreationDate(new Date());

		project.setGpOrganization(this.orgTest);
		project.setGpChefProjet(this.pmTest);
		project = this.projectService.create(project);

		this.pjTest = project;
		Assert.assertNotNull(pjTest);

		GpPhaseFullDTO phase = new GpPhaseFullDTO();
		phase.setPhaseCode("1.1");
		phase.setDescription("Première phase du projet");
		phase.setStartDate(new Date());
		phase.setEndDate(new Date());
		phase.setAmount(7854.66);
		phase.setCreationDate(new Date());

		phase.setGpProject(pjTest);
		phase = this.phaseService.create(phase);
		Assert.assertNotNull(phase.getId());

		this.phaseIdForAllTest = phase.getId();
	}

	@After
	public void deleteAllEntityAfter() throws GesproBusinessException, AccessDeniedException {

		if (!Objects.isNull(this.phaseIdForAllTest)) {
			this.phaseService.findById(this.phaseIdForAllTest);
		}
		if (!Objects.isNull(this.createPhaseId)) {
			this.phaseService.deleteById(this.createPhaseId);
		}
		if (!Objects.isNull(this.pmTest)) {
			//TODO 11 : Decommenter la ligne ci dessous
			//this.empService.deleteById(this.pmTest.getId());
		}
		if (!Objects.isNull(this.orgTest)) {
			this.organizationService.deleteById(this.orgTest.getId());
		}

	}

}
