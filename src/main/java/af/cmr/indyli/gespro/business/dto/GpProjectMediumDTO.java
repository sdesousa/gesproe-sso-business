package af.cmr.indyli.gespro.business.dto;

import java.util.Date;

public class GpProjectMediumDTO extends GpProjectBasicDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9030913772624886568L;
	private GpProjectManagerBasicDTO gpChefProjet;
	private GpOrganizationBasicDTO gpOrganization;

	public GpProjectMediumDTO() {
		super();
	}

	public GpProjectMediumDTO(double amount, Date creationDate, String description, Date endDate, String name,
			String projectCode, Date startDate, Date updateDate) {
		super(amount, creationDate, description, endDate, name, projectCode, startDate, updateDate);
	}

	public GpProjectMediumDTO(int id, double amount, Date creationDate, String description, Date endDate, String name,
			String projectCode, Date startDate, Date updateDate) {
		super(id, amount, creationDate, description, endDate, name, projectCode, startDate, updateDate);
	}

	public GpProjectMediumDTO(GpProjectManagerBasicDTO gpChefProjet, GpOrganizationBasicDTO gpOrganization) {
		super();
		this.gpChefProjet = gpChefProjet;
		this.gpOrganization = gpOrganization;
	}

	public GpProjectManagerBasicDTO getGpChefProjet() {
		return gpChefProjet;
	}

	public void setGpChefProjet(GpProjectManagerBasicDTO gpChefProjet) {
		this.gpChefProjet = gpChefProjet;
	}

	public GpOrganizationBasicDTO getGpOrganization() {
		return gpOrganization;
	}

	public void setGpOrganization(GpOrganizationBasicDTO gpOrganization) {
		this.gpOrganization = gpOrganization;
	}

}
