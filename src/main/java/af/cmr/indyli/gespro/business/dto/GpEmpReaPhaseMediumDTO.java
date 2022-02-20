package af.cmr.indyli.gespro.business.dto;

import java.util.Date;

import af.cmr.indyli.gespro.business.entity.GpEmployee;
import af.cmr.indyli.gespro.business.entity.GpPhase;

public class GpEmpReaPhaseMediumDTO extends GpEmpReaPhaseBasicDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private GpEmployee gpEmployee;
	private GpPhase gpPhase;

	public GpEmpReaPhaseMediumDTO() {
	}

	public GpEmpReaPhaseMediumDTO(Date creationDate, GpEmployee gpEmployee, GpPhase gpPhase) {
		super(creationDate);
		this.gpEmployee = gpEmployee;
		this.gpPhase = gpPhase;
	}

	public GpEmpReaPhaseMediumDTO(int id, Date creationDate, GpEmployee gpEmployee, GpPhase gpPhase) {
		super(id, creationDate);
		this.gpEmployee = gpEmployee;
		this.gpPhase = gpPhase;
	}

	public GpEmployee getGpEmployee() {
		return gpEmployee;
	}

	public void setGpEmployee(GpEmployee gpEmployee) {
		this.gpEmployee = gpEmployee;
	}

	public GpPhase getGpPhase() {
		return gpPhase;
	}

	public void setGpPhase(GpPhase gpPhase) {
		this.gpPhase = gpPhase;
	}

}
