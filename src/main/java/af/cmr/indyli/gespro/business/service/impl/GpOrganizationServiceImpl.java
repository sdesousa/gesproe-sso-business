package af.cmr.indyli.gespro.business.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import af.cmr.indyli.gespro.business.dao.IGpOrganizationRepository;
import af.cmr.indyli.gespro.business.dto.GpOrganizationBasicDTO;
import af.cmr.indyli.gespro.business.dto.GpOrganizationFullDTO;
import af.cmr.indyli.gespro.business.entity.GpOrganization;
import af.cmr.indyli.gespro.business.service.IGpOrganizationService;
import af.cmr.indyli.gespro.business.utils.GesproConstantes.GesproConstantesDAO;
import af.cmr.indyli.gespro.business.utils.GesproConstantes.GesproConstantesService;

@Service(GesproConstantesService.GP_ORGANIZATION_KEY)
public class GpOrganizationServiceImpl extends
		AbstractGesproServiceImpl<GpOrganization, GpOrganizationBasicDTO, GpOrganizationFullDTO, IGpOrganizationRepository>
		implements IGpOrganizationService {

	@Resource(name = GesproConstantesDAO.GP_ORGANIZATION_DAO)
	private IGpOrganizationRepository gpOrganizationRepository;

	public GpOrganizationServiceImpl() {
		super(GpOrganization.class, GpOrganizationBasicDTO.class, GpOrganizationFullDTO.class);

	}

	@Override
	public IGpOrganizationRepository getDAO() {
		// TODO Auto-generated method stub
		return this.gpOrganizationRepository;
	}

}
