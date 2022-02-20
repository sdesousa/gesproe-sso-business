package af.cmr.indyli.gespro.business.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import af.cmr.indyli.gespro.business.dao.IGpDirectorRepository;
import af.cmr.indyli.gespro.business.dto.GpDirecteurBasicDTO;
import af.cmr.indyli.gespro.business.dto.GpDirectorFullDTO;
import af.cmr.indyli.gespro.business.entity.GpDirector;
import af.cmr.indyli.gespro.business.service.IGpDirectorService;
import af.cmr.indyli.gespro.business.utils.GesproConstantes.GesproConstantesDAO;
import af.cmr.indyli.gespro.business.utils.GesproConstantes.GesproConstantesService;

@Service(GesproConstantesService.GP_DIRECTEUR_SERVICE_KEY)
public class GpDirectorServiceImpl
		extends AbstractGesproServiceImpl<GpDirector, GpDirecteurBasicDTO, GpDirectorFullDTO, IGpDirectorRepository>
		implements IGpDirectorService {

	public GpDirectorServiceImpl() {
		super(GpDirector.class, GpDirecteurBasicDTO.class, GpDirectorFullDTO.class);
	}

	@Resource(name = GesproConstantesDAO.GP_DIRECTEUR_DAO)
	private IGpDirectorRepository gpDirecteurRepository;

	@Override
	public IGpDirectorRepository getDAO() {
		return this.gpDirecteurRepository;
	}

}
