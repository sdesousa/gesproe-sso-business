package af.cmr.indyli.gespro.business.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import af.cmr.indyli.gespro.business.dao.IGpAdminRepository;
import af.cmr.indyli.gespro.business.dto.GpAdminBasicDTO;
import af.cmr.indyli.gespro.business.dto.GpAdminFullDTO;
import af.cmr.indyli.gespro.business.entity.GpAdmin;
import af.cmr.indyli.gespro.business.service.IGpAdminService;
import af.cmr.indyli.gespro.business.utils.GesproConstantes.GesproConstantesDAO;
import af.cmr.indyli.gespro.business.utils.GesproConstantes.GesproConstantesService;

@Service(GesproConstantesService.GP_ADMIN_SERVICE_KEY)
public class GpAdminServiceImpl
		extends AbstractGesproServiceImpl<GpAdmin, GpAdminBasicDTO, GpAdminFullDTO, IGpAdminRepository>
		implements IGpAdminService {

	public GpAdminServiceImpl() {
		super(GpAdmin.class, GpAdminBasicDTO.class, GpAdminFullDTO.class);
		// TODO Auto-generated constructor stub
	}

	@Resource(name = GesproConstantesDAO.GP_ADMIN_DAO)
	private IGpAdminRepository gpAdminRepository;

	@Override
	public IGpAdminRepository getDAO() {
		// TODO Auto-generated method stub
		return this.gpAdminRepository;
	}

}
