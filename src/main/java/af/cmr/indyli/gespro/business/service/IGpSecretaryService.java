package af.cmr.indyli.gespro.business.service;

import af.cmr.indyli.gespro.business.dao.IGpSecretaryRepository;
import af.cmr.indyli.gespro.business.dto.GpSecretaryBasicDTO;
import af.cmr.indyli.gespro.business.dto.GpSecretaireFullDTO;
import af.cmr.indyli.gespro.business.entity.GpSecretary;

public interface IGpSecretaryService
		extends IAbstractGesproService<GpSecretary, GpSecretaryBasicDTO, GpSecretaireFullDTO, IGpSecretaryRepository> {

}
