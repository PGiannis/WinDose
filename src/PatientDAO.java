import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PatientDAO {
	/**
	 * This method returns a List with all Patients
	 * 
	 * @return List<Patient>
	 */
	public List<Patient> getPatients() throws Exception {

		List<Patient> patients = new ArrayList<Patient>();
		Connection con = null;
		DB db = new DB();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String slcPatient = "SELECT * FROM Patients ;";

		try {
			con = db.getConnection();
			stmt = con.prepareStatement(slcPatient);
			rs = stmt.executeQuery();

			while (rs.next()) {
				patients.add(new Patient(rs.getInt("amka"), rs.getString("firstname"), rs.getString("lastname"),
						rs.getString("district"), rs.getDate("testDate"), rs.getDate("dob"), rs.getString("gender"),
						rs.getBoolean("positive"), rs.getBoolean("symptoms"), rs.getBoolean("ecu"),
						rs.getBoolean("alive")));
			}
			
			System.out.println(rs.getInt("AMKA"));
			rs.close();
			stmt.close();
			db.close();
			return patients;

		} catch (SQLException e) {
			throw new Exception(e.getMessage());
			// handle the exception or/and print message
		} finally {

			try {
				db.close();
			} catch (Exception e) {
				throw new Exception(e.getMessage());
			}
		}
	}

	// End of getPatients

	/**
	 * Search patient by AMKA
	 * 
	 * @param AMKA
	 * @return Patient, the Patient object
	 * @throws Exception, if patient not found
	 */
	public boolean findPatient(String amka) throws Exception {

		DB db = new DB();
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		boolean f= false;
		int a=Integer.parseInt(amka);
		String sqlQuery = "SELECT * FROM patients WHERE AMKA=?";

		try {
			con = db.getConnection();
			stmt = con.prepareStatement(sqlQuery);
			stmt.setInt(1, a);

			rs = stmt.executeQuery();

			if (rs.next()) {
				f=true;
			}

			

			rs.close();
			stmt.close();
			db.close();

			return f;

		} catch (Exception e) {
			throw new Exception(e.getMessage());
		} finally {
			try {
				db.close();
			} catch (Exception e) {
			}
		}

	} // End of findPatient

	/**
	 * Update a Patient.
	 * 
	 * @param patient, Patient
	 * @throws Exception, if encounter any error.
	 */
	public void updatePatient(Patient patient) throws Exception {

		DB db = new DB();
		Connection con = null;
		PreparedStatement stmt = null;
		String checkSql = "SELECT * FROM patients WHERE AMKA = ?";
		String sql = "UPDATE patient(Symptoms, ECU, Alive) VALUES (?, ?, ?);";

		try {

			con = db.getConnection();

			stmt = con.prepareStatement(checkSql);

			stmt.setInt(1, patient.getAmka());

			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				rs.close();
				stmt.close();
				throw new Exception("There is not patient's AMKA");
			}

			rs.close();

			stmt = con.prepareStatement(sql);

			stmt.setBoolean(2, patient.isSymptoms());
			stmt.setBoolean(3, patient.isEcu());
			stmt.setBoolean(4, patient.isAlive());

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

	}// end of updatePatient



public Patient printPatient(int amka) throws Exception {

	DB db = new DB();
	Connection con = null;
	PreparedStatement stmt = null;
	String sql = "SELECT * from patient where amka=?;";

	try {

		con = db.getConnection();

		stmt = con.prepareStatement(sql);

		stmt.setInt(1, amka);

		ResultSet rs = stmt.executeQuery();
        Patient patient= null;
		if (rs.next()) {
			 patient= new Patient(rs.getInt("amka"), rs.getString("firstname"), rs.getString("lastname"),
					rs.getString("district"), rs.getDate("testDate"), rs.getDate("dob"), rs.getString("gender"),
					rs.getBoolean("positive"), rs.getBoolean("symptoms"), rs.getBoolean("ecu"),
					rs.getBoolean("alive"));
		}
		

		rs.close();
		stmt.close();
		db.close();
		
		return patient; 	
	} catch (Exception e) {
		throw new Exception(e.getMessage());
	} finally {
		try {
			db.close();
		} catch (Exception e) {
		}
	}
	
	 

}// end of printPatient

} // End of class
