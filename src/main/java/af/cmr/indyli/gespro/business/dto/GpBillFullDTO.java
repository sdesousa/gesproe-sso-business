package af.cmr.indyli.gespro.business.dto;

import af.cmr.indyli.gespro.business.entity.GpPhase;

public class GpBillFullDTO extends GpBillMediumDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GpBillFullDTO() {
	}

	public GpBillFullDTO(double amount, String billCode, String billStatus, GpPhase gpPhase) {
		super(amount, billCode, billStatus, gpPhase);
		// TODO Auto-generated constructor stub
	}

	public GpBillFullDTO(int id, double amount, String billCode, String billStatus, GpPhase gpPhase) {
		super(id, amount, billCode, billStatus, gpPhase);
		// TODO Auto-generated constructor stub
	}

}
