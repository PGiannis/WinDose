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
						rs.getString("district"), rs.getDate("testDate"),rs.getDate("dob"), rs.getString("gender"), rs.getBoolean("positive"),
						rs.getBoolean("symptoms"), rs.getBoolean("ecu"), rs.getBoolean("alive")));
			}
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

	 //End of getPatients
	
	/**
	 * Search patient by AMKA
	 * 
	 * @param AMKA
	 * @return Patient, the Patient object
	 * @throws Exception, if patient not found
	 */
	public Patient findPatient(int amka) throws Exception {
		

		
		DB db = new DB();
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sqlQuery = "SELECT * FROM patients WHERE AMKA=?";

			try {
				con = db.getConnection();
				stmt = con.prepareStatement(sqlQuery);
				stmt.setInt(1 , amka);

				rs = stmt.executeQuery();

				if (!rs.next()) {
					rs.close();
					stmt.close();
					db.close();
						throw new Exception ("Patient with AMKA: "
						+ amka + " not found");
				}

					Patient patient = new Patient(rs.getInt("amka"), rs.getString("firstname"), rs.getString("lastname"),
							rs.getString("district"), rs.getDate("testDate"),rs.getDate("dob"), rs.getString("gender"), rs.getBoolean("positive"),
							rs.getBoolean("symptoms"), rs.getBoolean("ecu"), rs.getBoolean("alive"));

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

			stmt.setString(1 ,patient.getAmka());
			
			ResultSet rs = stmt.executeQuery();

			            if (rs.next()) {
			                rs.close();
			                stmt.close();
			                throw new Exception("There is not patient's AMKA");
			            }

            			rs.close();

			stmt = con.prepareStatement(sql);

			stmt.setString(2 ,patient.isSymptoms());
			stmt.setString(3 ,patient.isEcu());
			stmt.setString(4 ,patient.isAlive());

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