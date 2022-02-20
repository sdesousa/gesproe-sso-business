package af.cmr.indyli.gespro.business.service;

import af.cmr.indyli.gespro.business.dao.IGpAccountantRepository;
import af.cmr.indyli.gespro.business.dto.GpComptableBasicDTO;
import af.cmr.indyli.gespro.business.dto.GpComptableFullDTO;
import af.cmr.indyli.gespro.business.entity.GpAccountant;

public interface IGpAccountantService
		extends IAbstractGesproService<GpAccountant, GpComptableBasicDTO, GpComptableFullDTO, IGpAccountantRepository> {

}
