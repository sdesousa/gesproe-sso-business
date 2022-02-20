package af.cmr.indyli.gespro.business.service;

import af.cmr.indyli.gespro.business.dao.IGpAddressRepository;
import af.cmr.indyli.gespro.business.dto.GpAddressBasicDTO;
import af.cmr.indyli.gespro.business.dto.GpAddressFullDTO;
import af.cmr.indyli.gespro.business.entity.GpAddress;

public interface IGpAddressService
		extends IAbstractGesproService<GpAddress, GpAddressBasicDTO, GpAddressFullDTO, IGpAddressRepository> {

}
