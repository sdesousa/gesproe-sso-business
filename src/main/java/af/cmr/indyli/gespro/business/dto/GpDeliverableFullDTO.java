package af.cmr.indyli.gespro.business.dto;

import java.util.Date;

import af.cmr.indyli.gespro.business.entity.GpPhase;

public class GpDeliverableFullDTO extends GpDeliverableMediumDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GpDeliverableFullDTO() {
	}

	public GpDeliverableFullDTO(Date creationDate, String delCode, String delPath, String description, String label,
			GpPhase gpPhase) {
		super(creationDate, delCode, delPath, description, label, gpPhase);
		// TODO Auto-generated constructor stub
	}

	public GpDeliverableFullDTO(int id, Date creationDate, String delCode, String delPath, String description,
			String label, GpPhase gpPhase) {
		super(id, creationDate, delCode, delPath, description, label, gpPhase);
		// TODO Auto-generated constructor stub
	}

}
