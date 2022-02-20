package af.cmr.indyli.gespro.business.service;

import af.cmr.indyli.gespro.business.dao.IGpEmpReaPhaseRepository;
import af.cmr.indyli.gespro.business.dto.GpEmpReaPhaseBasicDTO;
import af.cmr.indyli.gespro.business.dto.GpEmpReaPhaseFullDTO;
import af.cmr.indyli.gespro.business.entity.GpEmpReaPhase;

public interface IGpEmpReaPhaseService extends
		IAbstractGesproService<GpEmpReaPhase, GpEmpReaPhaseBasicDTO, GpEmpReaPhaseFullDTO, IGpEmpReaPhaseRepository> {

}
