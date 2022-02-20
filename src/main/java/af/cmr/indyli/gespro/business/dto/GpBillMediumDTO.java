package af.cmr.indyli.gespro.business.dto;

import af.cmr.indyli.gespro.business.entity.GpPhase;

public class GpBillMediumDTO extends GpBillBasicDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private GpPhase gpPhase;

	public GpBillMediumDTO() {
	}

	public GpBillMediumDTO(int id, double amount, String billCode, String billStatus, GpPhase gpPhase) {
		super(id, amount, billCode, billStatus);
		this.gpPhase = gpPhase;
	}

	public GpBillMediumDTO(double amount, String billCode, String billStatus, GpPhase gpPhase) {
		super(amount, billCode, billStatus);
		this.gpPhase = gpPhase;
	}

	public GpPhase getGpPhase() {
		return gpPhase;
	}

	public void setGpPhase(GpPhase gpPhase) {
		this.gpPhase = gpPhase;
	}
}
