package af.cmr.indyli.gespro.business.service;

import af.cmr.indyli.gespro.business.dao.IGpEmployeeRepository;
import af.cmr.indyli.gespro.business.dto.GpEmployeeBasicDTO;
import af.cmr.indyli.gespro.business.dto.GpEmployeeFullDTO;
import af.cmr.indyli.gespro.business.entity.GpEmployee;

public interface IGpEmployeeService
		extends IAbstractGesproService<GpEmployee, GpEmployeeBasicDTO, GpEmployeeFullDTO, IGpEmployeeRepository> {

	GpEmployeeBasicDTO createNew(GpEmployeeBasicDTO emp);

}
