package af.cmr.indyli.gespro.business.service;

import af.cmr.indyli.gespro.business.dao.IGpOrganizationRepository;
import af.cmr.indyli.gespro.business.dto.GpOrganizationBasicDTO;
import af.cmr.indyli.gespro.business.dto.GpOrganizationFullDTO;
import af.cmr.indyli.gespro.business.entity.GpOrganization;

public interface IGpOrganizationService
		extends IAbstractGesproService<GpOrganization, GpOrganizationBasicDTO, GpOrganizationFullDTO, IGpOrganizationRepository> {

}
