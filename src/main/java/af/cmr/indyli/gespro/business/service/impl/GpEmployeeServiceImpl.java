package af.cmr.indyli.gespro.business.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import af.cmr.indyli.gespro.business.dao.IGpEmployeeRepository;
import af.cmr.indyli.gespro.business.dto.GpEmployeeBasicDTO;
import af.cmr.indyli.gespro.business.dto.GpEmployeeFullDTO;
import af.cmr.indyli.gespro.business.entity.GpEmployee;
import af.cmr.indyli.gespro.business.service.IGpEmployeeService;
import af.cmr.indyli.gespro.business.utils.GesproConstantes.GesproConstantesDAO;
import af.cmr.indyli.gespro.business.utils.GesproConstantes.GesproConstantesService;

@Service(GesproConstantesService.GP_EMPLOYEE_SERVICE_KEY)
public class GpEmployeeServiceImpl
		extends AbstractGesproServiceImpl<GpEmployee, GpEmployeeBasicDTO, GpEmployeeFullDTO, IGpEmployeeRepository>
		implements IGpEmployeeService {

	public GpEmployeeServiceImpl() {
		super(GpEmployee.class, GpEmployeeBasicDTO.class, GpEmployeeFullDTO.class);
		// TODO Auto-generated constructor stub
	}

	@Resource(name = GesproConstantesDAO.GP_EMPLOYEE_DAO)
	private IGpEmployeeRepository gpEmployeeRepository;

	@Override
	public IGpEmployeeRepository getDAO() {
		// TODO Auto-generated method stub
		return this.gpEmployeeRepository;
	}

	@Override
	public GpEmployeeBasicDTO createNew(GpEmployeeBasicDTO emp) {

		GpEmployee gpEmployee = this.getModelMapper().map(emp, GpEmployee.class);
		gpEmployee = gpEmployeeRepository.save(gpEmployee);
		emp = this.getModelMapper().map(gpEmployee, GpEmployeeBasicDTO.class);
		return emp;

	}

}
