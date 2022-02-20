package af.cmr.indyli.gespro.business.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * The persistent class for the gp_chef_projet database table.
 * 
 */
@Entity
@Table(name = "GP_PROJECT_MANAGER")
@PrimaryKeyJoinColumn(name = "EMP_ID")
public class GpProjectManager extends GpEmployee {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1239043720956888381L;
	// bi-directional many-to-one association to GpProject
	@OneToMany(mappedBy = "gpChefProjet")
	private List<GpProject> gpProjects;

	public GpProjectManager() {
		super();
	}

	public GpProjectManager(List<GpProject> gpProjects) {
		super();
		this.gpProjects = gpProjects;
	}

	public List<GpProject> getGpProjects() {
		return gpProjects;
	}

	public void setGpProjects(List<GpProject> gpProjects) {
		this.gpProjects = gpProjects;
	}

}