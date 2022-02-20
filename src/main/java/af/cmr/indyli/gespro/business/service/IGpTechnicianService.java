package af.cmr.indyli.gespro.business.service;

import af.cmr.indyli.gespro.business.dao.IGpTechnicianRepository;
import af.cmr.indyli.gespro.business.dto.GpTechnicianBasicDTO;
import af.cmr.indyli.gespro.business.dto.GpTechnicianFullDTO;
import af.cmr.indyli.gespro.business.entity.GpTechnician;

public interface IGpTechnicianService
		extends IAbstractGesproService<GpTechnician, GpTechnicianBasicDTO, GpTechnicianFullDTO, IGpTechnicianRepository> {

}
