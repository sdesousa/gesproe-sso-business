package af.cmr.indyli.gespro.business.dto;

import java.util.Date;

public class GpSecretaryBasicDTO extends GpEmployeeBasicDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GpSecretaryBasicDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GpSecretaryBasicDTO(Date creationDate, String email, String fileNumber, String firstname, String lastname,
			String login, String password, int phoneNumber, Date updateDate) {
		super(creationDate, email, fileNumber, firstname, lastname, login, password, phoneNumber, updateDate);
		// TODO Auto-generated constructor stub
	}

	public GpSecretaryBasicDTO(int id, Date creationDate, String email, String fileNumber, String firstname,
			String lastname, String login, String password, int phoneNumber, Date updateDate) {
		super(id, creationDate, email, fileNumber, firstname, lastname, login, password, phoneNumber, updateDate);
		// TODO Auto-generated constructor stub
	}

}
