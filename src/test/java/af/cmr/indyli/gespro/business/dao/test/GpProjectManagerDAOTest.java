package af.cmr.indyli.gespro.business.dao.test;

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
import af.cmr.indyli.gespro.business.dao.IGpProjectManagerRepository;
import af.cmr.indyli.gespro.business.entity.GpProjectManager;
import af.cmr.indyli.gespro.business.exception.GesproBusinessException;
import af.cmr.indyli.gespro.business.utils.GesproConstantes.GesproConstantesDAO;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { GesproBusinessConfig.class })
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@DirtiesContext(classMode = ClassMode.BEFORE_EACH_TEST_METHOD)
public class GpProjectManagerDAOTest {

	@Resource(name = GesproConstantesDAO.GP_CHEF_PROJET_DAO)
	private IGpProjectManagerRepository gpChefProjetRepository;

	private Integer empIdForAllTest = null;
	private Integer createEmpId = null;

	@Test
	public void createEmpId() throws GesproBusinessException {
		// Given
		GpProjectManager emp = new GpProjectManager();
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
		//TODO 9 : Decommenter la ligne ci dessous
		emp = gpChefProjetRepository.save(emp);
		this.createEmpId = emp.getId();

		// Then
		Assert.assertNotNull(emp.getId());
	}

	@Test
	public void testFindAllChefProjetWithSuccess() {
		// Given
		// When
		List<GpProjectManager> emps = gpChefProjetRepository.findAll(); //TODO 2 : Remplacer le null par un findAllApproprié;
		// Then
		Assert.assertTrue(emps.size() > 0);
	}

	@Test
	public void testFindByIdWithSuccess() throws GesproBusinessException {
		// Given
		Integer empId = this.empIdForAllTest;
		// When
		GpProjectManager emp = this.gpChefProjetRepository.findById(empId).orElse(null);//TODO 3 : Remplacer le NUll par la recherche en base;
		// Then
		Assert.assertTrue(emp.getId() == empId);
	}


	@Test
	public void testDelete() throws AccessDeniedException, Exception {
		// Given
		Integer empId = this.empIdForAllTest;
		this.empIdForAllTest = null;
		// Whens
		//TODO 4 : Decommenter la ligne ci dessous
		this.gpChefProjetRepository.deleteById(empId);
		GpProjectManager pm = gpChefProjetRepository.findById(empId).orElse(null);//TODO 5 : Tester l'existence en allant chercher en Base

		// Then
		Assert.assertNull(pm);

	}

	@Before
	public void prepareAllEntityBefore() throws GesproBusinessException {
		GpProjectManager emp = new GpProjectManager();
		emp.setFileNumber("2001");
		emp.setLastname("Laurent");
		emp.setFirstname("FABIUS");
		emp.setPhoneNumber(123);
		emp.setPassword("myThirdPassword");
		emp.setEmail("laurent.fabius@gouv.fr");
		emp.setLogin("laurent.fabius");
		emp.setCreationDate(new Date());
		emp.setUpdateDate(new Date());
		//TODO 6 : Faire le necessaire pour aller enregistrer en Base
		emp = gpChefProjetRepository.save(emp);
		this.empIdForAllTest = emp.getId();

	}

	@After
	public void deleteAllEntityAfter() throws AccessDeniedException, GesproBusinessException {
		if (this.empIdForAllTest != null) {
			//TODO 7 : Decommenter la ligne ci dessous
			this.gpChefProjetRepository.deleteById(this.empIdForAllTest);
		}

		if (!Objects.isNull(this.createEmpId)) {
			//TODO 8 : Decommenter la ligne ci dessous
			this.gpChefProjetRepository.deleteById(this.createEmpId);
		}
	}
}
