package af.cmr.indyli.gespro.business.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import af.cmr.indyli.gespro.business.dao.IGpPhaseRepository;
import af.cmr.indyli.gespro.business.dto.GpPhaseBasicDTO;
import af.cmr.indyli.gespro.business.dto.GpPhaseFullDTO;
import af.cmr.indyli.gespro.business.entity.GpPhase;
import af.cmr.indyli.gespro.business.service.IGpPhaseService;
import af.cmr.indyli.gespro.business.utils.GesproConstantes.GesproConstantesDAO;
import af.cmr.indyli.gespro.business.utils.GesproConstantes.GesproConstantesService;

@Service(GesproConstantesService.GP_PHASE_SERVICE_KEY)
public class GpPhaseServiceImpl
		extends AbstractGesproServiceImpl<GpPhase, GpPhaseBasicDTO, GpPhaseFullDTO, IGpPhaseRepository>
		implements IGpPhaseService {

	@Resource(name = GesproConstantesDAO.GP_PHASE_DAO)
	private IGpPhaseRepository iGpPhaseRepository;

	public GpPhaseServiceImpl() {
		super(GpPhase.class, GpPhaseBasicDTO.class, GpPhaseFullDTO.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IGpPhaseRepository getDAO() {
		// TODO Auto-generated method stub
		return this.iGpPhaseRepository;
	}

}
