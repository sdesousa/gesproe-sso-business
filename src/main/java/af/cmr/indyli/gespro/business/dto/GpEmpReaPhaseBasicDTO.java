package af.cmr.indyli.gespro.business.dto;

import java.util.Date;

public class GpEmpReaPhaseBasicDTO implements IDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private Date creationDate;

	public GpEmpReaPhaseBasicDTO() {
		super();
	}

	public GpEmpReaPhaseBasicDTO(int id, Date creationDate) {
		this.id = id;
		this.creationDate = creationDate;
	}

	public GpEmpReaPhaseBasicDTO(Date creationDate) {
		super();
		this.creationDate = creationDate;
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
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

}
