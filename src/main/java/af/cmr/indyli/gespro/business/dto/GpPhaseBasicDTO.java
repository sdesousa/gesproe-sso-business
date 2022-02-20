package af.cmr.indyli.gespro.business.dto;

import java.util.Date;

public class GpPhaseBasicDTO implements IDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5646877524961814491L;
	/**
	 * 
	 */
	private int id;
	private double amount;
	private Date creationDate;
	private String description;
	private Date endDate;
	private byte isEnded;
	private String phaseCode;
	private Date startDate;
	private byte status;
	private Date updateDate;

	public GpPhaseBasicDTO() {
		super();
	}

	public GpPhaseBasicDTO(String description, double amount, Date endDate, byte isEnded, String phaseCode,
			Date startDate, byte status) {
		super();
		this.description = description;
		this.amount = amount;
		this.endDate = endDate;
		this.isEnded = isEnded;
		this.phaseCode = phaseCode;
		this.startDate = startDate;
		this.status = status;
	}

	public GpPhaseBasicDTO(int id, String description, double amount, Date endDate, byte isEnded, String phaseCode,
			Date startDate, byte status) {
		super();
		this.id = id;
		this.description = description;
		this.amount = amount;
		this.endDate = endDate;
		this.isEnded = isEnded;
		this.phaseCode = phaseCode;
		this.startDate = startDate;
		this.status = status;
	}

	@Override
	public int getId() {
		return this.id;
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public byte getIsEnded() {
		return isEnded;
	}

	public void setIsEnded(byte isEnded) {
		this.isEnded = isEnded;
	}

	public String getPhaseCode() {
		return phaseCode;
	}

	public void setPhaseCode(String phaseCode) {
		this.phaseCode = phaseCode;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public byte getStatus() {
		return status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}
