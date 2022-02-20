package af.cmr.indyli.gespro.business.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * The persistent class for the gp_technician database table.
 * 
 */
@Entity
@Table(name = "GP_TECHNICIAN")
@PrimaryKeyJoinColumn(name = "EMP_ID")
public class GpTechnician extends GpEmployee {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "GRADUATION_YEAR")
	private int graduationYear;

	@Column(name = "LAST_DIPLOMA")
	private String lastDiploma;

	public GpTechnician() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GpTechnician(Date creationDate, String email, String fileNumber, String firstname, String lastname,
			String login, String password, int phoneNumber, Date updateDate, List<GpAddress> gpAddresses) {
		super(creationDate, email, fileNumber, firstname, lastname, login, password, phoneNumber, updateDate,
				gpAddresses);
		// TODO Auto-generated constructor stub
	}

	public GpTechnician(int id, Date creationDate, String email, String fileNumber, String firstname, String lastname,
			String login, String password, int phoneNumber, Date updateDate, List<GpAddress> gpAddresses) {
		super(id, creationDate, email, fileNumber, firstname, lastname, login, password, phoneNumber, updateDate,
				gpAddresses);
		// TODO Auto-generated constructor stub
	}

	public GpTechnician(int graduationYear, String lastDiploma) {
		super();
		this.graduationYear = graduationYear;
		this.lastDiploma = lastDiploma;
	}

}