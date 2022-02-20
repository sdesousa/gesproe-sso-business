package af.cmr.indyli.gespro.business.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the gp_project database table.
 * 
 */
@Entity
@Table(name = "GP_PROJECT")
public class GpProject implements IEntity {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PROJECT_ID")
	private int id;

	@Column(name = "AMOUNT")
	private double amount;

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATION_DATE")
	private Date creationDate;

	private String description;

	@Temporal(TemporalType.DATE)
	@Column(name = "END_DATE")
	private Date endDate;

	@Column(name = "NAME")
	private String name;

	@Column(name = "PROJECT_CODE")
	private String projectCode;

	@Temporal(TemporalType.DATE)
	@Column(name = "START_DATE")
	private Date startDate;

	@Temporal(TemporalType.DATE)
	@Column(name = "UPDATE_DATE")
	private Date updateDate;

	// bi-directional many-to-one association to GpPhase
	@OneToMany(mappedBy = "gpProject")
	private List<GpPhase> gpPhases;

	// bi-directional many-to-one association to GpChefProjet
	@ManyToOne
	@JoinColumn(name = "EMP_ID")
	private GpProjectManager gpChefProjet;

	// bi-directional many-to-one association to GpOrganization
	@ManyToOne
	@JoinColumn(name = "ORG_ID")
	private GpOrganization gpOrganization;

	public GpProject() {
	}

	public GpProject(int id, double amount, Date creationDate, String description, Date endDate, String name,
			String projectCode, Date startDate, Date updateDate, List<GpPhase> gpPhases, GpProjectManager gpChefProjet,
			GpOrganization gpOrganization) {
		super();
		this.id = id;
		this.amount = amount;
		this.creationDate = creationDate;
		this.description = description;
		this.endDate = endDate;
		this.name = name;
		this.projectCode = projectCode;
		this.startDate = startDate;
		this.updateDate = updateDate;
		this.gpPhases = gpPhases;
		this.gpChefProjet = gpChefProjet;
		this.gpOrganization = gpOrganization;
	}

	public GpProject(double amount, Date creationDate, String description, Date endDate, String name,
			String projectCode, Date startDate, Date updateDate, List<GpPhase> gpPhases, GpProjectManager gpChefProjet,
			GpOrganization gpOrganization) {
		super();
		this.amount = amount;
		this.creationDate = creationDate;
		this.description = description;
		this.endDate = endDate;
		this.name = name;
		this.projectCode = projectCode;
		this.startDate = startDate;
		this.updateDate = updateDate;
		this.gpPhases = gpPhases;
		this.gpChefProjet = gpChefProjet;
		this.gpOrganization = gpOrganization;
	}

	@Override
	public int getId() {
		return this.id;
	}

	@Override
	public void setId(int id) {
		this.id = id;

	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProjectCode() {
		return this.projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public List<GpPhase> getGpPhases() {
		return this.gpPhases;
	}

	public void setGpPhases(List<GpPhase> gpPhases) {
		this.gpPhases = gpPhases;
	}

	public GpPhase addGpPhas(GpPhase gpPhas) {
		getGpPhases().add(gpPhas);
		gpPhas.setGpProject(this);

		return gpPhas;
	}

	public GpPhase removeGpPhas(GpPhase gpPhas) {
		getGpPhases().remove(gpPhas);
		gpPhas.setGpProject(null);

		return gpPhas;
	}

	public GpProjectManager getGpChefProjet() {
		return this.gpChefProjet;
	}

	public void setGpChefProjet(GpProjectManager gpChefProjet) {
		this.gpChefProjet = gpChefProjet;
	}

	public GpOrganization getGpOrganization() {
		return this.gpOrganization;
	}

	public void setGpOrganization(GpOrganization gpOrganization) {
		this.gpOrganization = gpOrganization;
	}

}