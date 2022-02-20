package af.cmr.indyli.gespro.business.dto;

import java.util.Date;

import af.cmr.indyli.gespro.business.entity.GpPhase;

public class GpDeliverableMediumDTO extends GpDeliverableBasicDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private GpPhase gpPhase;

	public GpDeliverableMediumDTO() {
	}

	public GpDeliverableMediumDTO(Date creationDate, String delCode, String delPath, String description, String label,
			GpPhase gpPhase) {
		super(creationDate, delCode, delPath, description, label);
		this.gpPhase = gpPhase;
	}

	public GpDeliverableMediumDTO(int id, Date creationDate, String delCode, String delPath, String description,
			String label, GpPhase gpPhase) {
		super(id, creationDate, delCode, delPath, description, label);
		this.gpPhase = gpPhase;
	}

	public GpPhase getGpPhase() {
		return gpPhase;
	}

	public void setGpPhase(GpPhase gpPhase) {
		this.gpPhase = gpPhase;
	}

}
