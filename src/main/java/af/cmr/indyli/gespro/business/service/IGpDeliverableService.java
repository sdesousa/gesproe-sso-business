package af.cmr.indyli.gespro.business.service;

import af.cmr.indyli.gespro.business.dao.IGpDeliverableRepository;
import af.cmr.indyli.gespro.business.dto.GpDeliverableBasicDTO;
import af.cmr.indyli.gespro.business.dto.GpDeliverableFullDTO;
import af.cmr.indyli.gespro.business.entity.GpDeliverable;

public interface IGpDeliverableService extends
		IAbstractGesproService<GpDeliverable, GpDeliverableBasicDTO, GpDeliverableFullDTO, IGpDeliverableRepository> {

}
