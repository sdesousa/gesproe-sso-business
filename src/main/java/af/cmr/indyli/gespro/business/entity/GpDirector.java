package af.cmr.indyli.gespro.business.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * The persistent class for the gp_directeur database table.
 * 
 */
@Entity
@Table(name = "GP_DIRECTOR")
@PrimaryKeyJoinColumn(name = "EMP_ID")
public class GpDirector extends GpEmployee {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GpDirector() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GpDirector(Date creationDate, String email, String fileNumber, String firstname, String lastname,
			String login, String password, int phoneNumber, Date updateDate, List<GpAddress> gpAddresses) {
		super(creationDate, email, fileNumber, firstname, lastname, login, password, phoneNumber, updateDate,
				gpAddresses);
		// TODO Auto-generated constructor stub
	}

	public GpDirector(int id, Date creationDate, String email, String fileNumber, String firstname, String lastname,
			String login, String password, int phoneNumber, Date updateDate, List<GpAddress> gpAddresses) {
		super(id, creationDate, email, fileNumber, firstname, lastname, login, password, phoneNumber, updateDate,
				gpAddresses);
		// TODO Auto-generated constructor stub
	}

}