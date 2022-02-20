package af.cmr.indyli.gespro.business.dto;

import java.util.Date;

public class GpProjectBasicDTO implements IDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private double amount;
	private Date creationDate;
	private String description;
	private Date endDate;
	private String name;
	private String projectCode;
	private Date startDate;
	private Date updateDate;

	public GpProjectBasicDTO() {
		super();
		this.creationDate = new Date();
	}

	public GpProjectBasicDTO(int id, double amount, Date creationDate, String description, Date endDate, String name,
			String projectCode, Date startDate, Date updateDate) {
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
	}

	public GpProjectBasicDTO(double amount, Date creationDate, String description, Date endDate, String name,
			String projectCode, Date startDate, Date updateDate) {
		super();
		this.amount = amount;
		this.creationDate = creationDate;
		this.description = description;
		this.endDate = endDate;
		this.name = name;
		this.projectCode = projectCode;
		this.startDate = startDate;
		this.updateDate = updateDate;
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
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProjectCode() {
		return projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}
