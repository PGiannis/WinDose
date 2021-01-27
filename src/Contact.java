package src;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Contact {

	private int id;
	private String name;
	private String phone;
	private Patient patient;
	public void setName(String firstName) {
		this.name = firstName;
	}
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getId() {
		return id;
	}
	public Patient getPatient() {
		return patient;
	}
	public Contact(String name, String phone, Patient patient) {
		super();
		this.name = name;
		this.phone = phone;
		this.patient = patient;
	}
	public Contact(int id, String name, String phone, Patient patient) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.patient = patient;
	}
	
	public void writeContactToDB() throws Exception {
		DB db = new DB();
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement stmt = null;

		String sql = "INSERT INTO Contacts (Name, Phone, Positive_case) VALUES (?, ?, ?);";
		try {
			con = db.getConnection();

			stmt = con.prepareStatement(sql);

			stmt.setString(1, this.getName());
			stmt.setString(2, this.getPhone());
			stmt.setInt(3, this.getPatient().getAmka());

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