package af.cmr.indyli.gespro.business.dto;

import java.util.Date;

import af.cmr.indyli.gespro.business.entity.GpEmployee;
import af.cmr.indyli.gespro.business.entity.GpPhase;

public class GpEmpReaPhaseFullDTO extends GpEmpReaPhaseMediumDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GpEmpReaPhaseFullDTO() {
		super();
	}

	public GpEmpReaPhaseFullDTO(Date creationDate, GpEmployee gpEmployee, GpPhase gpPhase) {
		super(creationDate, gpEmployee, gpPhase);
	}

	public GpEmpReaPhaseFullDTO(int id, Date creationDate, GpEmployee gpEmployee, GpPhase gpPhase) {
		super(id, creationDate, gpEmployee, gpPhase);
	}

}
