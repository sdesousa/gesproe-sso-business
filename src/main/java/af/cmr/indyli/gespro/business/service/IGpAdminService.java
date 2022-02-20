package af.cmr.indyli.gespro.business.service;

import af.cmr.indyli.gespro.business.dao.IGpAdminRepository;
import af.cmr.indyli.gespro.business.dto.GpAdminBasicDTO;
import af.cmr.indyli.gespro.business.dto.GpAdminFullDTO;
import af.cmr.indyli.gespro.business.entity.GpAdmin;

public interface IGpAdminService
		extends IAbstractGesproService<GpAdmin, GpAdminBasicDTO, GpAdminFullDTO, IGpAdminRepository> {

}
