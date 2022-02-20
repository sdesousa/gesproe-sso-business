package af.cmr.indyli.gespro.business.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import af.cmr.indyli.gespro.business.dao.IGpBillRepository;
import af.cmr.indyli.gespro.business.dto.GpBillBasicDTO;
import af.cmr.indyli.gespro.business.dto.GpBillFullDTO;
import af.cmr.indyli.gespro.business.entity.GpBill;
import af.cmr.indyli.gespro.business.service.IGpBillService;
import af.cmr.indyli.gespro.business.utils.GesproConstantes.GesproConstantesDAO;
import af.cmr.indyli.gespro.business.utils.GesproConstantes.GesproConstantesService;

@Service(GesproConstantesService.GP_BILL_SERVICE_KEY)
public class GpBillServiceImpl extends
		AbstractGesproServiceImpl<GpBill, GpBillBasicDTO, GpBillFullDTO, IGpBillRepository> implements IGpBillService {

	@Resource(name = GesproConstantesDAO.GP_BILL_DAO)
	private IGpBillRepository iGpBillRepository;

	public GpBillServiceImpl() {
		super(GpBill.class, GpBillBasicDTO.class, GpBillFullDTO.class);
	}

	@Override
	public IGpBillRepository getDAO() {
		return this.iGpBillRepository;
	}

}
