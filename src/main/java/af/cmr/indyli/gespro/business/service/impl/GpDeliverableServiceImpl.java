package af.cmr.indyli.gespro.business.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import af.cmr.indyli.gespro.business.dao.IGpDeliverableRepository;
import af.cmr.indyli.gespro.business.dto.GpDeliverableBasicDTO;
import af.cmr.indyli.gespro.business.dto.GpDeliverableFullDTO;
import af.cmr.indyli.gespro.business.entity.GpDeliverable;
import af.cmr.indyli.gespro.business.service.IGpDeliverableService;
import af.cmr.indyli.gespro.business.utils.GesproConstantes.GesproConstantesDAO;
import af.cmr.indyli.gespro.business.utils.GesproConstantes.GesproConstantesService;

@Service(GesproConstantesService.GP_DELIVERABLE_SERVICE_KEY)
public class GpDeliverableServiceImpl extends
		AbstractGesproServiceImpl<GpDeliverable, GpDeliverableBasicDTO, GpDeliverableFullDTO, IGpDeliverableRepository>
		implements IGpDeliverableService {

	@Resource(name = GesproConstantesDAO.GP_DELIVERABLE_DAO)
	private IGpDeliverableRepository iGpDeliverableRepository;

	public GpDeliverableServiceImpl() {
		super(GpDeliverable.class, GpDeliverableBasicDTO.class, GpDeliverableFullDTO.class);
	}

	@Override
	public IGpDeliverableRepository getDAO() {
		return this.iGpDeliverableRepository;
	}

}
