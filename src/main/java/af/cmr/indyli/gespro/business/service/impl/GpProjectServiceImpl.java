package af.cmr.indyli.gespro.business.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import af.cmr.indyli.gespro.business.dao.IGpProjectRepository;
import af.cmr.indyli.gespro.business.dto.GpProjectBasicDTO;
import af.cmr.indyli.gespro.business.dto.GpProjectFullDTO;
import af.cmr.indyli.gespro.business.entity.GpProject;
import af.cmr.indyli.gespro.business.service.IGpProjectService;
import af.cmr.indyli.gespro.business.utils.GesproConstantes.GesproConstantesDAO;
import af.cmr.indyli.gespro.business.utils.GesproConstantes.GesproConstantesService;

@Service(GesproConstantesService.GP_PROJECT_SERVICE_KEY)
public class GpProjectServiceImpl
		extends AbstractGesproServiceImpl<GpProject, GpProjectBasicDTO, GpProjectFullDTO, IGpProjectRepository>
//TODO 19 : Faire l'implémentation necessaire		
{

	@Resource(name = GesproConstantesDAO.GP_PROJECT_DAO)
	private IGpProjectRepository iGpProjectRepository;

	public GpProjectServiceImpl() {
		super(GpProject.class, GpProjectBasicDTO.class, GpProjectFullDTO.class);
	}

	@Override
	public IGpProjectRepository getDAO() {
		return this.iGpProjectRepository;

	}

}
