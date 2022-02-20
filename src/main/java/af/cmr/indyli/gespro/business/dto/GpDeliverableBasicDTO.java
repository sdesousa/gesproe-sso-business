package af.cmr.indyli.gespro.business.dto;

import java.util.Date;

public class GpDeliverableBasicDTO implements IDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private Date creationDate;
	private String delCode;
	private String delPath;
	private String description;
	private String label;

	public GpDeliverableBasicDTO() {
	}

	public GpDeliverableBasicDTO(Date creationDate, String delCode, String delPath, String description, String label) {
		super();
		this.creationDate = creationDate;
		this.delCode = delCode;
		this.delPath = delPath;
		this.description = description;
		this.label = label;
	}

	public GpDeliverableBasicDTO(int id, Date creationDate, String delCode, String delPath, String description,
			String label) {
		super();
		this.id = id;
		this.creationDate = creationDate;
		this.delCode = delCode;
		this.delPath = delPath;
		this.description = description;
		this.label = label;
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

	public String getDelCode() {
		return delCode;
	}

	public void setDelCode(String delCode) {
		this.delCode = delCode;
	}

	public String getDelPath() {
		return delPath;
	}

	public void setDelPath(String delPath) {
		this.delPath = delPath;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}
