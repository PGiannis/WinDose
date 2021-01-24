import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class PatientDAO {
		
	
	/**
	 * Search patient by AMKA
	 * 
	 * @param AMKA, int
	 * @return Patient, the Patient object
	 * @throws Exception, if patient not found
	 */
	public Informations findPatient(int AMKA) throws Exception {
		

		
		DB db = new DB();
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sqlQuery = "SELECT * FROM patients WHERE AMKA=?";

			try {
				con = db.getConnection();
				stmt = con.prepareStatement(sqlQuery);
				stmt.setString(1 , AMKA);

				rs = stmt.executeQuery();

				if (!rs.next()) {
					rs.close();
					stmt.close();
					db.close();
						throw new Exception ("Patient with AMKA: "
						+ AMKA + " not found");
				}

					Patient patient = new Patient(rs.getString("First_Name"), rs.getString("Last_Name"), rs.getString("positive"), rs.getString ("negative"), rs.getString("Gender"), rs.getString("Location"), rs.getString("State"));

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
	public voAMKA register(Patient patient) throws Exception {
			

		
		DB db = new DB();
		Connection con = null;
		PreparedStatement stmt = null;
		String checkSql = "SELECT * FROM patients WHERE AMKA = ?";
		String sql = "UPDATE patient(State) VALUES (?);";

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

			stmt.setString(1 ,patient.getState());
			

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
		
	}//end of register

} //End of class