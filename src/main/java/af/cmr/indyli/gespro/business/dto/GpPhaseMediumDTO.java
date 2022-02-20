package af.cmr.indyli.gespro.business.dto;

import java.util.Date;

public class GpPhaseMediumDTO extends GpPhaseBasicDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4260030171218074417L;
	private GpProjectBasicDTO gpProject;

	public GpPhaseMediumDTO() {
	}

	public GpPhaseMediumDTO(int id, String description, double amount, Date endDate, byte isEnded, String phaseCode,
			Date startDate, byte status) {
		super(id, description, amount, endDate, isEnded, phaseCode, startDate, status);
	}

	public GpPhaseMediumDTO(String description, double amount, Date endDate, byte isEnded, String phaseCode,
			Date startDate, byte status) {
		super(description, amount, endDate, isEnded, phaseCode, startDate, status);
	}

	public GpProjectBasicDTO getGpProject() {
		return gpProject;
	}

	public void setGpProject(GpProjectBasicDTO gpProject) {
		this.gpProject = gpProject;
	}

}
