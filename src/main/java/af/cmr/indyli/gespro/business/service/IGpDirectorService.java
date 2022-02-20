package af.cmr.indyli.gespro.business.service;

import af.cmr.indyli.gespro.business.dao.IGpDirectorRepository;
import af.cmr.indyli.gespro.business.dto.GpDirecteurBasicDTO;
import af.cmr.indyli.gespro.business.dto.GpDirectorFullDTO;
import af.cmr.indyli.gespro.business.entity.GpDirector;

public interface IGpDirectorService
		extends IAbstractGesproService<GpDirector, GpDirecteurBasicDTO, GpDirectorFullDTO, IGpDirectorRepository> {

}
