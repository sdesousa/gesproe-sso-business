package af.cmr.indyli.gespro.business.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import af.cmr.indyli.gespro.business.dao.IGpAccountantRepository;
import af.cmr.indyli.gespro.business.dto.GpComptableBasicDTO;
import af.cmr.indyli.gespro.business.dto.GpComptableFullDTO;
import af.cmr.indyli.gespro.business.entity.GpAccountant;
import af.cmr.indyli.gespro.business.service.IGpAccountantService;
import af.cmr.indyli.gespro.business.utils.GesproConstantes.GesproConstantesDAO;
import af.cmr.indyli.gespro.business.utils.GesproConstantes.GesproConstantesService;

@Service(GesproConstantesService.GP_COMPTABLE_SERVICE_KEY)
public class GpAccountantServiceImpl
		extends AbstractGesproServiceImpl<GpAccountant, GpComptableBasicDTO, GpComptableFullDTO, IGpAccountantRepository>
		implements IGpAccountantService {

	public GpAccountantServiceImpl() {
		super(GpAccountant.class, GpComptableBasicDTO.class, GpComptableFullDTO.class);
		// TODO Auto-generated constructor stub
	}

	@Resource(name = GesproConstantesDAO.GP_COMPTABLE_DAO)
	private IGpAccountantRepository gpComptableRepository;

	@Override
	public IGpAccountantRepository getDAO() {
		// TODO Auto-generated method stub
		return this.gpComptableRepository;
	}

}
