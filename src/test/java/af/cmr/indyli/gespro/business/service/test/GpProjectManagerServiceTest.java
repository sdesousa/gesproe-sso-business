package af.cmr.indyli.gespro.business.service.test;

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
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import af.cmr.indyli.gespro.business.config.GesproBusinessConfig;
import af.cmr.indyli.gespro.business.dto.GpProjectManagerBasicDTO;
import af.cmr.indyli.gespro.business.dto.GpProjectManagerFullDTO;
import af.cmr.indyli.gespro.business.exception.GesproBusinessException;
import af.cmr.indyli.gespro.business.service.IGpProjectManagerService;
import af.cmr.indyli.gespro.business.utils.GesproConstantes.GesproConstantesService;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { GesproBusinessConfig.class })
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@DirtiesContext(classMode = ClassMode.BEFORE_EACH_TEST_METHOD)
public class GpProjectManagerServiceTest {

	@Resource(name = GesproConstantesService.GP_CHEF_PROJET_SERVICE_KEY)
	private IGpProjectManagerService empPMService;

	private Integer empIdForAllTest = null;
	private Integer createEmpId = null;

	@Test
	public void createEmpId() throws GesproBusinessException {
		// Given
		GpProjectManagerFullDTO emp = new GpProjectManagerFullDTO();
		emp.setFileNumber("3001");
		emp.setLastname("Gesto");
		emp.setFirstname("PRISZ");
		emp.setPhoneNumber(321);
		emp.setPassword("newPassword");
		emp.setEmail("gzstot.prisz@gouv.fr");
		emp.setLogin("gzstot.prisz");
		emp.setCreationDate(new Date());
		emp.setUpdateDate(new Date());
		// When
		//TODO 13 : Decommenter la ligne ci dessous
		emp = empPMService.create(emp);
		this.createEmpId = emp.getId();

		// Then
		Assert.assertNotNull(emp.getId());
	}

	@Test
	public void testFindAllChefProjetWithSuccess() {
		// Given
		// When
		List<GpProjectManagerBasicDTO> emps = empPMService.findAll(); //TODO 14 : Remplacer la valeur null
		// Then
		Assert.assertTrue(emps.size() > 0);
	}

	@Test
	public void testFindByIdWithSuccess() throws GesproBusinessException {
		// Given
		Integer empId = this.empIdForAllTest;
		// When
		GpProjectManagerFullDTO emp = empPMService.findById(empId);//TODO 15 : remplacer le null;
		// Then
		Assert.assertTrue(emp.getId() == empId);
	}


	@Test
	public void testDelete() throws AccessDeniedException, Exception {
		// Given
		Integer empId = this.empIdForAllTest;
		this.empIdForAllTest = null;
		// When
		//TODO 16 : Decommenter la ligne ci dessous , et recuperer l'emp par empId
		this.empPMService.deleteById(empId);
		GpProjectManagerFullDTO emp = this.empPMService.findById(empId);

		// Then
		Assert.assertNull(emp);

	}

	@Before
	public void prepareAllEntityBefore() throws GesproBusinessException {
		GpProjectManagerFullDTO emp = new GpProjectManagerFullDTO();
		emp.setFileNumber("2001");
		emp.setLastname("Laurent");
		emp.setFirstname("FABIUS");
		emp.setPhoneNumber(123);
		emp.setPassword("myThirdPassword");
		emp.setEmail("laurent.fabius@gouv.fr");
		emp.setLogin("laurent.fabius");
		emp.setCreationDate(new Date());
		emp.setUpdateDate(new Date());
		//TODO 16 : Decommenter la ligne ci dessous
		emp = empPMService.create(emp);
		this.empIdForAllTest = emp.getId();

	}

	@After
	public void deleteAllEntityAfter() throws AccessDeniedException, GesproBusinessException {
		if (this.empIdForAllTest != null) {
			//TODO 17 : Decommenter la ligne ci dessous
			this.empPMService.deleteById(this.empIdForAllTest);
		}

		if (!Objects.isNull(this.createEmpId)) {
			//TODO 18 : Decommenter la ligne ci dessous
			this.empPMService.deleteById(this.createEmpId);
		}
	}
}
