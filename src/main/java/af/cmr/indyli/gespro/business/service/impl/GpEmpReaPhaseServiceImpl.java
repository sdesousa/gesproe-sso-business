package af.cmr.indyli.gespro.business.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import af.cmr.indyli.gespro.business.dao.IGpEmpReaPhaseRepository;
import af.cmr.indyli.gespro.business.dto.GpEmpReaPhaseBasicDTO;
import af.cmr.indyli.gespro.business.dto.GpEmpReaPhaseFullDTO;
import af.cmr.indyli.gespro.business.entity.GpEmpReaPhase;
import af.cmr.indyli.gespro.business.service.IGpEmpReaPhaseService;
import af.cmr.indyli.gespro.business.utils.GesproConstantes.GesproConstantesDAO;
import af.cmr.indyli.gespro.business.utils.GesproConstantes.GesproConstantesService;

@Service(GesproConstantesService.GP_EMP_REA_PHASE_KEY)
public class GpEmpReaPhaseServiceImpl extends
		AbstractGesproServiceImpl<GpEmpReaPhase, GpEmpReaPhaseBasicDTO, GpEmpReaPhaseFullDTO, IGpEmpReaPhaseRepository>
		implements IGpEmpReaPhaseService {

	@Resource(name = GesproConstantesDAO.GP_EMP_REA_PHASE_DAO)
	private IGpEmpReaPhaseRepository iGpEmpReaPhaseRepository;

	public GpEmpReaPhaseServiceImpl() {
		super(GpEmpReaPhase.class, GpEmpReaPhaseBasicDTO.class, GpEmpReaPhaseFullDTO.class);
	}

	@Override
	public IGpEmpReaPhaseRepository getDAO() {
		return this.iGpEmpReaPhaseRepository;
	}
}
