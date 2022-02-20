package af.cmr.indyli.gespro.business.dto;

import java.util.Date;

public class GpProjectManagerFullDTO extends GpProjectManagerMediumDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GpProjectManagerFullDTO() {
		super();
	}

	public GpProjectManagerFullDTO(Date creationDate, String email, String fileNumber, String firstname, String lastname,
			String login, String password, int phoneNumber, Date updateDate) {
		super(creationDate, email, fileNumber, firstname, lastname, login, password, phoneNumber, updateDate);
	}

	public GpProjectManagerFullDTO(int id, Date creationDate, String email, String fileNumber, String firstname,
			String lastname, String login, String password, int phoneNumber, Date updateDate) {
		super(id, creationDate, email, fileNumber, firstname, lastname, login, password, phoneNumber, updateDate);
	}

}
