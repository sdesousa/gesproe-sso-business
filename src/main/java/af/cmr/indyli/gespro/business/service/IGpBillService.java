package af.cmr.indyli.gespro.business.service;

import af.cmr.indyli.gespro.business.dao.IGpBillRepository;
import af.cmr.indyli.gespro.business.dto.GpBillBasicDTO;
import af.cmr.indyli.gespro.business.dto.GpBillFullDTO;
import af.cmr.indyli.gespro.business.entity.GpBill;

public interface IGpBillService
		extends IAbstractGesproService<GpBill, GpBillBasicDTO, GpBillFullDTO, IGpBillRepository> {

}
