package af.cmr.indyli.gespro.business.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import af.cmr.indyli.gespro.business.dao.IGpSecretaryRepository;
import af.cmr.indyli.gespro.business.dto.GpSecretaryBasicDTO;
import af.cmr.indyli.gespro.business.dto.GpSecretaireFullDTO;
import af.cmr.indyli.gespro.business.entity.GpSecretary;
import af.cmr.indyli.gespro.business.service.IGpSecretaryService;
import af.cmr.indyli.gespro.business.utils.GesproConstantes.GesproConstantesDAO;
import af.cmr.indyli.gespro.business.utils.GesproConstantes.GesproConstantesService;

@Service(GesproConstantesService.GP_SECRETAIRE_SERVICE_KEY)
public class GpSecretaryServiceImpl extends
		AbstractGesproServiceImpl<GpSecretary, GpSecretaryBasicDTO, GpSecretaireFullDTO, IGpSecretaryRepository>
		implements IGpSecretaryService {

	public GpSecretaryServiceImpl() {
		super(GpSecretary.class, GpSecretaryBasicDTO.class, GpSecretaireFullDTO.class);
		// TODO Auto-generated constructor stub
	}

	@Resource(name = GesproConstantesDAO.GP_SECRETAIRE_DAO)
	private IGpSecretaryRepository gpSecretaireRepository;

	@Override
	public IGpSecretaryRepository getDAO() {
		// TODO Auto-generated method stub
		return this.gpSecretaireRepository;
	}

}
