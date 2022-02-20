package af.cmr.indyli.gespro.business.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import af.cmr.indyli.gespro.business.dao.IGpTechnicianRepository;
import af.cmr.indyli.gespro.business.dto.GpTechnicianBasicDTO;
import af.cmr.indyli.gespro.business.dto.GpTechnicianFullDTO;
import af.cmr.indyli.gespro.business.entity.GpTechnician;
import af.cmr.indyli.gespro.business.service.IGpTechnicianService;
import af.cmr.indyli.gespro.business.utils.GesproConstantes.GesproConstantesDAO;
import af.cmr.indyli.gespro.business.utils.GesproConstantes.GesproConstantesService;

@Service(GesproConstantesService.GP_TECHNICIAN_SERVICE_KEY)
public class GpTechnicianServiceImpl extends
		AbstractGesproServiceImpl<GpTechnician, GpTechnicianBasicDTO, GpTechnicianFullDTO, IGpTechnicianRepository>
		implements IGpTechnicianService {

	public GpTechnicianServiceImpl() {
		super(GpTechnician.class, GpTechnicianBasicDTO.class, GpTechnicianFullDTO.class);
	}

	@Resource(name = GesproConstantesDAO.GP_TECHNICIAN_DAO)
	private IGpTechnicianRepository gpTechnicianRepository;

	@Override
	public IGpTechnicianRepository getDAO() {
		return this.gpTechnicianRepository;
	}

}
