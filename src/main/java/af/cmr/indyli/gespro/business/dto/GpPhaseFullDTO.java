package af.cmr.indyli.gespro.business.dto;

import java.util.Date;
import java.util.List;

public class GpPhaseFullDTO extends GpPhaseMediumDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4733905362071828680L;
	private List<GpBillBasicDTO> gpBills;
	private List<GpDeliverableBasicDTO> gpDeliverables;
	private List<GpEmpReaPhaseBasicDTO> gpEmpReaPhases;

	public GpPhaseFullDTO() {
	}

	public GpPhaseFullDTO(int id, String description, double amount, Date endDate, byte isEnded, String phaseCode,
			Date startDate, byte status) {
		super(id, description, amount, endDate, isEnded, phaseCode, startDate, status);
		// TODO Auto-generated constructor stub
	}

	public GpPhaseFullDTO(String description, double amount, Date endDate, byte isEnded, String phaseCode,
			Date startDate, byte status) {
		super(description, amount, endDate, isEnded, phaseCode, startDate, status);
		// TODO Auto-generated constructor stub
	}

	public GpPhaseFullDTO(List<GpBillBasicDTO> gpBills, List<GpDeliverableBasicDTO> gpDeliverables,
			List<GpEmpReaPhaseBasicDTO> gpEmpReaPhases) {
		super();
		this.gpBills = gpBills;
		this.gpDeliverables = gpDeliverables;
		this.gpEmpReaPhases = gpEmpReaPhases;
	}

	public List<GpBillBasicDTO> getGpBills() {
		return gpBills;
	}

	public void setGpBills(List<GpBillBasicDTO> gpBills) {
		this.gpBills = gpBills;
	}

	public List<GpDeliverableBasicDTO> getGpDeliverables() {
		return gpDeliverables;
	}

	public void setGpDeliverables(List<GpDeliverableBasicDTO> gpDeliverables) {
		this.gpDeliverables = gpDeliverables;
	}

	public List<GpEmpReaPhaseBasicDTO> getGpEmpReaPhases() {
		return gpEmpReaPhases;
	}

	public void setGpEmpReaPhases(List<GpEmpReaPhaseBasicDTO> gpEmpReaPhases) {
		this.gpEmpReaPhases = gpEmpReaPhases;
	}

}
