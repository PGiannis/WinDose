package src;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DB {
	private final String dbServer = "prometheus.dmst.aueb.gr";
	private final String dbServerPort = "3306";
	private final String dbName = "ipetsas_windose";
	private final String dbusername = "ipetsas";
	private final String dbpassword = "1234";
    private Connection con = null;
	public Connection getConnection() throws Exception {

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();

		} catch (final Exception e) {

			throw new Exception("MySQL Driver error: " + e.getMessage());
		}

		try {

			con = DriverManager.getConnection("jdbc:mysql://" 
				+ dbServer + ":" + dbServerPort + "/" + dbName, dbusername, dbpassword);

		
			return con;

		} catch (final Exception e) {
			throw new Exception("Could not establish connection with the Database Server: " 
				+ e.getMessage());
		}

	}
	public void close() throws SQLException {

		try {

			
			if (con != null)
				con.close(); 

		} catch (final SQLException e) {

			throw new SQLException("Could not close connection with the Database Server: " 
				+ e.getMessage());
		}

	}
    
}