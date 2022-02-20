package af.cmr.indyli.gespro.business.service;

import af.cmr.indyli.gespro.business.dao.IGpPhaseRepository;
import af.cmr.indyli.gespro.business.dto.GpPhaseBasicDTO;
import af.cmr.indyli.gespro.business.dto.GpPhaseFullDTO;
import af.cmr.indyli.gespro.business.entity.GpPhase;

public interface IGpPhaseService
		extends IAbstractGesproService<GpPhase, GpPhaseBasicDTO, GpPhaseFullDTO, IGpPhaseRepository> {

}
