package af.cmr.indyli.gespro.business.dto;

public class GpBillBasicDTO implements IDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private double amount;
	private String billCode;
	private String billStatus;

	public GpBillBasicDTO() {
	}

	public GpBillBasicDTO(int id, double amount, String billCode, String billStatus) {
		super();
		this.id = id;
		this.amount = amount;
		this.billCode = billCode;
		this.billStatus = billStatus;
	}

	public GpBillBasicDTO(double amount, String billCode, String billStatus) {
		super();
		this.amount = amount;
		this.billCode = billCode;
		this.billStatus = billStatus;
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

	public String getBillCode() {
		return billCode;
	}

	public void setBillCode(String billCode) {
		this.billCode = billCode;
	}

	public String getBillStatus() {
		return billStatus;
	}

	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}

}
