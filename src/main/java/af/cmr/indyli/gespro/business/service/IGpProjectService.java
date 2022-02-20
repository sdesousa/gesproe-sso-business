package af.cmr.indyli.gespro.business.service;

import af.cmr.indyli.gespro.business.dao.IGpProjectRepository;
import af.cmr.indyli.gespro.business.dto.GpProjectBasicDTO;
import af.cmr.indyli.gespro.business.dto.GpProjectFullDTO;
import af.cmr.indyli.gespro.business.entity.GpProject;

public interface IGpProjectService
		extends IAbstractGesproService<GpProject, GpProjectBasicDTO, GpProjectFullDTO, IGpProjectRepository> {

}
