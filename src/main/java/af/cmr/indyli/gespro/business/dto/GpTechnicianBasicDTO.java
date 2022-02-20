package af.cmr.indyli.gespro.business.dto;

import java.util.Date;

public class GpTechnicianBasicDTO extends GpEmployeeBasicDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int graduationYear;

	private String lastDiploma;

	public GpTechnicianBasicDTO(int graduationYear, String lastDiploma) {
		super();
		this.graduationYear = graduationYear;
		this.lastDiploma = lastDiploma;
	}

	public GpTechnicianBasicDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GpTechnicianBasicDTO(Date creationDate, String email, String fileNumber, String firstname, String lastname,
			String login, String password, int phoneNumber, Date updateDate) {
		super(creationDate, email, fileNumber, firstname, lastname, login, password, phoneNumber, updateDate);
		// TODO Auto-generated constructor stub
	}

	public GpTechnicianBasicDTO(int id, Date creationDate, String email, String fileNumber, String firstname,
			String lastname, String login, String password, int phoneNumber, Date updateDate) {
		super(id, creationDate, email, fileNumber, firstname, lastname, login, password, phoneNumber, updateDate);
		// TODO Auto-generated constructor stub
	}

	public int getGraduationYear() {
		return graduationYear;
	}

	public void setGraduationYear(int graduationYear) {
		this.graduationYear = graduationYear;
	}

	public String getLastDiploma() {
		return lastDiploma;
	}

	public void setLastDiploma(String lastDiploma) {
		this.lastDiploma = lastDiploma;
	}

}
