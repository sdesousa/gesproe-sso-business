package af.cmr.indyli.gespro.business.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import af.cmr.indyli.gespro.business.dao.IGpProjectManagerRepository;
import af.cmr.indyli.gespro.business.dto.GpProjectManagerBasicDTO;
import af.cmr.indyli.gespro.business.dto.GpProjectManagerFullDTO;
import af.cmr.indyli.gespro.business.entity.GpProjectManager;
import af.cmr.indyli.gespro.business.service.IGpProjectManagerService;
import af.cmr.indyli.gespro.business.utils.GesproConstantes.GesproConstantesDAO;
import af.cmr.indyli.gespro.business.utils.GesproConstantes.GesproConstantesService;

@Service(GesproConstantesService.GP_CHEF_PROJET_SERVICE_KEY)
public class GpProjectManagerServiceImpl 

		//extends AbstractGesproServiceImpl<GpProjectManager, GpProjectManagerBasicDTO, GpProjectManagerFullDTO, IGpProjectManagerRepository>
		//implements IGpProjectManagerService 
{


	public GpProjectManagerServiceImpl() {
		//super(GpProjectManager.class, GpProjectManagerBasicDTO.class, GpProjectManagerFullDTO.class);
	}

	@Resource(name = GesproConstantesDAO.GP_CHEF_PROJET_DAO)
	private IGpProjectManagerRepository gpChefProjetRepository;

	//@Override
	public IGpProjectManagerRepository getDAO() {
		return this.gpChefProjetRepository;
	}

}
