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
 * The persistent class for the gp_phase database table.
 * 
 */
@Entity
@Table(name = "GP_PHASE")
public class GpPhase implements IEntity {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PHASE_ID")
	private int id;
	@Column(name = "AMOUNT")
	private double amount;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATION_DATE")
	private Date creationDate;

	private String description;

	@Temporal(TemporalType.DATE)
	@Column(name = "END_DATE")
	private Date endDate;

	@Column(name = "IS_ENDED")
	private byte isEnded;

	@Column(name = "PHASE_CODE")
	private String phaseCode;

	@Temporal(TemporalType.DATE)
	@Column(name = "START_DATE")
	private Date startDate;

	@Column(name = "STATUS")
	private byte status;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATE_DATE")
	private Date updateDate;

	// bi-directional many-to-one association to GpBill
	@OneToMany(mappedBy = "gpPhase")
	private List<GpBill> gpBills;

	// bi-directional many-to-one association to GpDeliverable
	@OneToMany(mappedBy = "gpPhase")
	private List<GpDeliverable> gpDeliverables;

	// bi-directional many-to-one association to GpEmpReaPhase
	@OneToMany(mappedBy = "gpPhase")
	private List<GpEmpReaPhase> gpEmpReaPhases;

	// bi-directional many-to-one association to GpProject
	@ManyToOne
	@JoinColumn(name = "PROJECT_ID")
	private GpProject gpProject;

	public GpPhase() {
	}

	public GpPhase(int id, double amount, Date creationDate, String description, Date endDate, byte isEnded,
			String phaseCode, Date startDate, byte status, Date updateDate, List<GpBill> gpBills,
			List<GpDeliverable> gpDeliverables, List<GpEmpReaPhase> gpEmpReaPhases, GpProject gpProject) {
		super();
		this.id = id;
		this.amount = amount;
		this.creationDate = creationDate;
		this.description = description;
		this.endDate = endDate;
		this.isEnded = isEnded;
		this.phaseCode = phaseCode;
		this.startDate = startDate;
		this.status = status;
		this.updateDate = updateDate;
		this.gpBills = gpBills;
		this.gpDeliverables = gpDeliverables;
		this.gpEmpReaPhases = gpEmpReaPhases;
		this.gpProject = gpProject;
	}

	public GpPhase(double amount, Date creationDate, String description, Date endDate, byte isEnded, String phaseCode,
			Date startDate, byte status, Date updateDate, List<GpBill> gpBills, List<GpDeliverable> gpDeliverables,
			List<GpEmpReaPhase> gpEmpReaPhases, GpProject gpProject) {
		super();
		this.amount = amount;
		this.creationDate = creationDate;
		this.description = description;
		this.endDate = endDate;
		this.isEnded = isEnded;
		this.phaseCode = phaseCode;
		this.startDate = startDate;
		this.status = status;
		this.updateDate = updateDate;
		this.gpBills = gpBills;
		this.gpDeliverables = gpDeliverables;
		this.gpEmpReaPhases = gpEmpReaPhases;
		this.gpProject = gpProject;
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

	public byte getIsEnded() {
		return this.isEnded;
	}

	public void setIsEnded(byte isEnded) {
		this.isEnded = isEnded;
	}

	public String getPhaseCode() {
		return this.phaseCode;
	}

	public void setPhaseCode(String phaseCode) {
		this.phaseCode = phaseCode;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public List<GpBill> getGpBills() {
		return this.gpBills;
	}

	public void setGpBills(List<GpBill> gpBills) {
		this.gpBills = gpBills;
	}

	public GpBill addGpBill(GpBill gpBill) {
		getGpBills().add(gpBill);
		gpBill.setGpPhase(this);

		return gpBill;
	}

	public GpBill removeGpBill(GpBill gpBill) {
		getGpBills().remove(gpBill);
		gpBill.setGpPhase(null);

		return gpBill;
	}

	public List<GpDeliverable> getGpDeliverables() {
		return this.gpDeliverables;
	}

	public void setGpDeliverables(List<GpDeliverable> gpDeliverables) {
		this.gpDeliverables = gpDeliverables;
	}

	public GpDeliverable addGpDeliverable(GpDeliverable gpDeliverable) {
		getGpDeliverables().add(gpDeliverable);
		gpDeliverable.setGpPhase(this);

		return gpDeliverable;
	}

	public GpDeliverable removeGpDeliverable(GpDeliverable gpDeliverable) {
		getGpDeliverables().remove(gpDeliverable);
		gpDeliverable.setGpPhase(null);

		return gpDeliverable;
	}

	public List<GpEmpReaPhase> getGpEmpReaPhases() {
		return this.gpEmpReaPhases;
	}

	public void setGpEmpReaPhases(List<GpEmpReaPhase> gpEmpReaPhases) {
		this.gpEmpReaPhases = gpEmpReaPhases;
	}

	public GpEmpReaPhase addGpEmpReaPhas(GpEmpReaPhase gpEmpReaPhas) {
		getGpEmpReaPhases().add(gpEmpReaPhas);
		gpEmpReaPhas.setGpPhase(this);

		return gpEmpReaPhas;
	}

	public GpEmpReaPhase removeGpEmpReaPhas(GpEmpReaPhase gpEmpReaPhas) {
		getGpEmpReaPhases().remove(gpEmpReaPhas);
		gpEmpReaPhas.setGpPhase(null);

		return gpEmpReaPhas;
	}

	public GpProject getGpProject() {
		return this.gpProject;
	}

	public void setGpProject(GpProject gpProject) {
		this.gpProject = gpProject;
	}

}