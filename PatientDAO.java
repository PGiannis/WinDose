import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class PatientDAO {
	/**
	 * This method returns a List with all Users
	 * 
	 * @return List<User>
	 */
	public List<Patient getPatients() {

		List<Patient> patients = new ArrayList<Patient>();
		
		// adding some users for the sake of the example
		patients.add(new Patient("John", "Doe", "jdoe@somewhere.com", "jdoe", "1111"));
		patients.add(new Patient("Mary", "Smith", "msmith@somewhere.com", "msmith",  "1111"));
		
		return patients;

	} //End of getUsers
	
	/**
	 * Search patient by AMKA
	 * 
	 * @param AMKA
	 * @return Patient, the Patient object
	 * @throws Exception, if patient not found
	 */
	public Patient findPatient(int AMKA) throws Exception {
		

		
		DB db = new DB();
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sqlQuery = "SELECT * FROM patients WHERE AMKA=?";

			try {
				con = db.getConnection();
				stmt = con.prepareStatement(sqlQuery);
				stmt.setInt(1 , AMKA);

				rs = stmt.executeQuery();

				if (!rs.next()) {
					rs.close();
					stmt.close();
					db.close();
						throw new Exception ("Patient with AMKA: "
						+ AMKA + " not found");
				}

					Patient patient = new Patient(rs.getString("First_Name"), rs.getString("Last_Name"), rs.getString("Gender"), rs.getInt ("Age"), rs.getBoolean("Positive"), rs.getBoolean("Symptoms"), rs.getBoolean("ECU"), rs.getBoolean("Alive"));

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
		
		
	} //End of findPatient
	
	/**
	 * Update a Patient.
	 * 
	 * @param patient, Patient
	 * @throws Exception, if encounter any error.
	 */
	public void updatePatient (Patient patient) throws Exception {
			

		
		DB db = new DB();
		Connection con = null;
		PreparedStatement stmt = null;
		String checkSql = "SELECT * FROM patients WHERE AMKA = ?";
		String sql = "UPDATE patient(Symptoms, ECU, Alive) VALUES (?, ?, ?);";

		try {

			con = db.getConnection();

			stmt = con.prepareStatement(checkSql);

			stmt.setString(1 ,patient.getAMKA());
			
			ResultSet rs = stmt.executeQuery();

			            if (rs.next()) {
			                rs.close();
			                stmt.close();
			                throw new Exception("There is not patient's AMKA");
			            }

            			rs.close();

			stmt = con.prepareStatement(sql);

			stmt.setString(2 ,patient.getSymptoms());
			stmt.setString(3 ,patient.getECU());
			stmt.setString(4 ,patient.getAlive());

			stmt.executeUpdate();

			stmt.close();




		}catch (Exception e) {
						throw new Exception(e.getMessage());
					}finally {
						try {
							db.close();
						}catch (Exception e) {
						}
			}
		
	}//end of updatePatient

} //End of class