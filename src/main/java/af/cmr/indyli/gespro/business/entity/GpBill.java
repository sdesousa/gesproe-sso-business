package af.cmr.indyli.gespro.business.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the gp_bill database table.
 * 
 */
@Entity
@Table(name = "GP_BILL")
public class GpBill implements IEntity {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BILL_ID")
	private int id;

	@Column(name = "AMOUNT")
	private double amount;

	@Column(name = "BILL_CODE")
	private String billCode;

	@Column(name = "BILL_STATUS")
	private String billStatus;

	// bi-directional many-to-one association to GpPhase
	@ManyToOne
	@JoinColumn(name = "PHASE_ID")
	private GpPhase gpPhase;

	public GpBill() {
	}

	public GpBill(int id, double amount, String billCode, String billStatus, GpPhase gpPhase) {
		super();
		this.id = id;
		this.amount = amount;
		this.billCode = billCode;
		this.billStatus = billStatus;
		this.gpPhase = gpPhase;
	}

	public GpBill(double amount, String billCode, String billStatus, GpPhase gpPhase) {
		super();
		this.amount = amount;
		this.billCode = billCode;
		this.billStatus = billStatus;
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

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getBillCode() {
		return this.billCode;
	}

	public void setBillCode(String billCode) {
		this.billCode = billCode;
	}

	public String getBillStatus() {
		return this.billStatus;
	}

	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}

	public GpPhase getGpPhase() {
		return this.gpPhase;
	}

	public void setGpPhase(GpPhase gpPhase) {
		this.gpPhase = gpPhase;
	}

}