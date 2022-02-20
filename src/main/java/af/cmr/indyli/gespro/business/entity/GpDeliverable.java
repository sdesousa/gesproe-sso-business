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
 * The persistent class for the gp_deliverable database table.
 * 
 */
@Entity
@Table(name = "GP_DELIVERABLE")
public class GpDeliverable implements IEntity {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DEL_ID")
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATION_DATE")
	private Date creationDate;

	@Column(name = "DEL_CODE")
	private String delCode;

	@Column(name = "DEL_PATH")
	private String delPath;

	private String description;

	@Column(name = "LABEL")
	private String label;

	// bi-directional many-to-one association to GpPhase
	@ManyToOne
	@JoinColumn(name = "PHASE_ID")
	private GpPhase gpPhase;

	public GpDeliverable() {
	}

	public GpDeliverable(int id, Date creationDate, String delCode, String delPath, String description, String label,
			GpPhase gpPhase) {
		super();
		this.id = id;
		this.creationDate = creationDate;
		this.delCode = delCode;
		this.delPath = delPath;
		this.description = description;
		this.label = label;
		this.gpPhase = gpPhase;
	}

	public GpDeliverable(Date creationDate, String delCode, String delPath, String description, String label,
			GpPhase gpPhase) {
		super();
		this.creationDate = creationDate;
		this.delCode = delCode;
		this.delPath = delPath;
		this.description = description;
		this.label = label;
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

	public String getDelCode() {
		return this.delCode;
	}

	public void setDelCode(String delCode) {
		this.delCode = delCode;
	}

	public String getDelPath() {
		return this.delPath;
	}

	public void setDelPath(String delPath) {
		this.delPath = delPath;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public GpPhase getGpPhase() {
		return this.gpPhase;
	}

	public void setGpPhase(GpPhase gpPhase) {
		this.gpPhase = gpPhase;
	}

}