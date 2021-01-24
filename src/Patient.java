import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;

public class Patient {

	private int amka;
	private String firstname;
	private String lastname;
	private String district;
	private Date testDate;
	private Date dob;
	private int age;
	private String gender;
	private boolean positive;
	private boolean symptoms;
	private boolean ecu;
	private boolean alive;

	public Patient(int amka, String firstname, String lastname, String district, Date testDate, Date dob, String gender,
			boolean positive, boolean symptoms, boolean ecu, boolean alive) {
		this.amka = amka;
		this.firstname = firstname;
		this.lastname = lastname;
		this.district = district;
		this.testDate = testDate;
		this.dob = dob;
		this.gender = gender;
		this.positive = positive;
		this.symptoms = symptoms;
		this.ecu = ecu;
		LocalDate l = dob.toLocalDate();
		this.age = 2021 - l.getYear();
		this.alive = alive;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public Date getTestDate() {
		return testDate;
	}

	public void setTestDate(Date testDate) {
		this.testDate = testDate;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isPositive() {
		return positive;
	}

	public void setPositive(boolean positive) {
		this.positive = positive;
	}

	public boolean isSymptoms() {
		return symptoms;
	}

	public void setSymptoms(boolean symptoms) {
		this.symptoms = symptoms;
	}

	public boolean isEcu() {
		return ecu;
	}

	public void setEcu(boolean ecu) {
		this.ecu = ecu;
	}

	public int getAmka() {
		return amka;
	}
	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public void writePatientToDB() throws Exception {
		DB db = new DB();
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement stmt = null;

		String checkSql = "SELECT * FROM Patient WHERE AMKA = ? ;";

		String sql = "INSERT INTO Patient (AMKA, First_Name, Last_Name, District, Date_of_checkin, Date_of_birth, Age, Gender, Positive, Symptoms, ECU, Alive) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
		try {
			con = db.getConnection();

			stmt = con.prepareStatement(checkSql);
			stmt.setInt(1, this.getAmka());
			rs = stmt.executeQuery();

			if (rs.next()) {
				rs.close();
				stmt.close();
				throw new Exception("Patient already registered!");
			}

			rs.close();

			stmt = con.prepareStatement(sql);

			stmt.setInt(1, this.getAmka());
			stmt.setString(2, this.getFirstname());
			stmt.setString(3, this.getLastname());
			stmt.setString(4, this.getDistrict());
			stmt.setDate(5, this.getTestDate());
			stmt.setDate(6, this.getDob());
			stmt.setInt(7, this.getAge());
			stmt.setString(8, this.getGender());
			stmt.setBoolean(9, this.isPositive());
			stmt.setBoolean(10, this.isSymptoms());
			stmt.setBoolean(11, this.isEcu());
			stmt.setBoolean(12, this.isAlive());

			stmt.executeUpdate();

			stmt.close();

		} catch (Exception e) {
			throw new Exception(e.getMessage());
		} finally {

			try {
				db.close();
			} catch (Exception e) {

			}

		}
	}

}
