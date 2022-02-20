package af.cmr.indyli.gespro.business.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import af.cmr.indyli.gespro.business.dao.IGpAddressRepository;
import af.cmr.indyli.gespro.business.dto.GpAddressBasicDTO;
import af.cmr.indyli.gespro.business.dto.GpAddressFullDTO;
import af.cmr.indyli.gespro.business.entity.GpAddress;
import af.cmr.indyli.gespro.business.service.IGpAddressService;
import af.cmr.indyli.gespro.business.utils.GesproConstantes.GesproConstantesDAO;
import af.cmr.indyli.gespro.business.utils.GesproConstantes.GesproConstantesService;

@Service(GesproConstantesService.GP_ADDRESS_SERVICE_KEY)
public class GpAddressServiceImpl
		extends AbstractGesproServiceImpl<GpAddress, GpAddressBasicDTO, GpAddressFullDTO, IGpAddressRepository>
		implements IGpAddressService {

	public GpAddressServiceImpl() {
		super(GpAddress.class, GpAddressBasicDTO.class, GpAddressFullDTO.class);
	}

	@Resource(name = GesproConstantesDAO.GP_ADDRESS_DAO)
	private IGpAddressRepository gpAddressRepository;

	@Override
	public IGpAddressRepository getDAO() {
		return this.gpAddressRepository;
	}

}
