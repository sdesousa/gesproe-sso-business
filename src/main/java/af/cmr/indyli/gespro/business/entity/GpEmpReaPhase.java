package af.cmr.indyli.gespro.business.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the gp_emp_rea_phase database table.
 * 
 */
@Entity
@Table(name = "GP_EMP_REA_PHASE")
public class GpEmpReaPhase implements IEntity {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ASSO_REA_ID")
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATION_DATE")
	private Date creationDate;

	// bi-directional many-to-one association to GpEmployee
	@ManyToOne
	@JoinColumn(name = "EMP_ID")
	private GpEmployee gpEmployee;

	// bi-directional many-to-one association to GpPhase
	@ManyToOne
	@JoinColumn(name = "PHASE_ID")
	private GpPhase gpPhase;

	public GpEmpReaPhase() {
	}

	public GpEmpReaPhase(int id, Date creationDate, GpEmployee gpEmployee, GpPhase gpPhase) {
		super();
		this.id = id;
		this.creationDate = creationDate;
		this.gpEmployee = gpEmployee;
		this.gpPhase = gpPhase;
	}

	public GpEmpReaPhase(Date creationDate, GpEmployee gpEmployee, GpPhase gpPhase) {
		super();
		this.creationDate = creationDate;
		this.gpEmployee = gpEmployee;
		this.gpPhase = gpPhase;
	}

	@Override
	public int getId() {
		return this.id;
	}

	@Override
	public void setId(int id) {
		this.id = id;

	}

	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public GpEmployee getGpEmployee() {
		return this.gpEmployee;
	}

	public void setGpEmployee(GpEmployee gpEmployee) {
		this.gpEmployee = gpEmployee;
	}

	public GpPhase getGpPhase() {
		return this.gpPhase;
	}

	public void setGpPhase(GpPhase gpPhase) {
		this.gpPhase = gpPhase;
	}

}