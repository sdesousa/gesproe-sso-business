package af.cmr.indyli.gespro.business.dto;

import java.util.Date;
import java.util.List;

public class GpProjectFullDTO extends GpProjectMediumDTO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<GpPhaseBasicDTO> gpPhases;

	public GpProjectFullDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GpProjectFullDTO(double amount, Date creationDate, String description, Date endDate, String name,
			String projectCode, Date startDate, Date updateDate) {
		super(amount, creationDate, description, endDate, name, projectCode, startDate, updateDate);
		// TODO Auto-generated constructor stub
	}

	public GpProjectFullDTO(GpProjectManagerBasicDTO gpChefProjet, GpOrganizationBasicDTO gpOrganization) {
		super(gpChefProjet, gpOrganization);
		// TODO Auto-generated constructor stub
	}

	public GpProjectFullDTO(int id, double amount, Date creationDate, String description, Date endDate, String name,
			String projectCode, Date startDate, Date updateDate) {
		super(id, amount, creationDate, description, endDate, name, projectCode, startDate, updateDate);
		// TODO Auto-generated constructor stub
	}

	public GpProjectFullDTO(List<GpPhaseBasicDTO> gpPhases) {
		super();
		this.gpPhases = gpPhases;
	}

	public List<GpPhaseBasicDTO> getGpPhases() {
		return gpPhases;
	}

	public void setGpPhases(List<GpPhaseBasicDTO> gpPhases) {
		this.gpPhases = gpPhases;
	}

}
