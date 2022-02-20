package af.cmr.indyli.gespro.business.dto;

import java.util.Date;

public class GpTechnicianMediumDTO extends GpTechnicianBasicDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GpTechnicianMediumDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GpTechnicianMediumDTO(Date creationDate, String email, String fileNumber, String firstname, String lastname,
			String login, String password, int phoneNumber, Date updateDate) {
		super(creationDate, email, fileNumber, firstname, lastname, login, password, phoneNumber, updateDate);
		// TODO Auto-generated constructor stub
	}

	public GpTechnicianMediumDTO(int id, Date creationDate, String email, String fileNumber, String firstname,
			String lastname, String login, String password, int phoneNumber, Date updateDate) {
		super(id, creationDate, email, fileNumber, firstname, lastname, login, password, phoneNumber, updateDate);
		// TODO Auto-generated constructor stub
	}

	public GpTechnicianMediumDTO(int graduationYear, String lastDiploma) {
		super(graduationYear, lastDiploma);
		// TODO Auto-generated constructor stub
	}

}
