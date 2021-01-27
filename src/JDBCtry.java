package src;

import java.sql.*;
import javafx.application.Application;

public class JDBCtry {

	public static void main(String[] args) {
		Application.launch(App.class, null);
		/*results();*/
	}

/*	public static void results(){
		
		try {
			// Get connection to db
			
			Class.forName("com.mysql.jdbc.Driver"); 
			
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb?characterEncoding=latin1&useConfigs=maxPerformance&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");

			// Create statement
			
			Statement myStmt = myConn.createStatement();

			// Execute SQL Query
			
			ResultSet myRs = myStmt.executeQuery("select * from tests");
			
			// Process result set
		
			while (myRs.next()) {
				System.out.println(myRs.getString("ID") + ", " + myRs.getString("Name"));
			}
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
*/
	public static int poscount(){
		
		try {
			// Get connection to db
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection myConn = DriverManager.getConnection("jdbc:mysql://prometheus.dmst.aueb.gr:3306/ipetsas_windose?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "ipetsas", "1234" );

			// Create statement
			
			Statement myStmt = myConn.createStatement();

			// Execute SQL Query
			
			ResultSet myRs = myStmt.executeQuery("select count(amka) as pcount from Patient where Positive = true");
			
			// Process result set
			
			myRs.next();
			int p = myRs.getInt("pcount");
			myRs.close();

			return p;
		
		}
		catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	public static int negcount(){
		
		try {
			// Get connection to db
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection myConn = DriverManager.getConnection("jdbc:mysql://prometheus.dmst.aueb.gr:3306/ipetsas_windose?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "ipetsas", "1234");

			// Create statement
			
			Statement myStmt = myConn.createStatement();

			// Execute SQL Query
			
			ResultSet myRs = myStmt.executeQuery("select count(AMKA) as ncount from Patient where Positive = false");
			
			// Process result set
			
			myRs.next();
			
			int n = myRs.getInt("ncount");
			
			myRs.close();
			
			return n;
			
		}
		catch (Exception e) {
			e.printStackTrace();
			return 0;
		}		
	}

	public static int MaleCount(){
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver"); 

			Connection myConn = DriverManager.getConnection("jdbc:mysql://prometheus.dmst.aueb.gr:3306/ipetsas_windose?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "ipetsas", "1234");
			
			PreparedStatement myStmt = myConn.prepareStatement("select count(AMKA) as mcount from Patient where Gender = ?");
			
			ResultSet myRs = null;
			
			myStmt.setString(1, "M");
			
			myRs = myStmt.executeQuery();
			
			myRs.next();
						
			int m = myRs.getInt("mcount");
			
			myRs.close();

			return m;
			
		}
		catch (Exception e) {
			e.printStackTrace();
			return 0;
		}		
	}

public static int FemaleCount(){
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver"); 

			Connection myConn = DriverManager.getConnection("jdbc:mysql://prometheus.dmst.aueb.gr:3306/ipetsas_windose?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "ipetsas", "1234");
			
			PreparedStatement myStmt = myConn.prepareStatement("select count(AMKA) as fcount from Patient where Gender = ?");
			
			ResultSet myRs = null;
			
			myStmt.setString(1, "F");
			
			myRs = myStmt.executeQuery();
			
			myRs.next();
						
			int f = myRs.getInt("fcount");
			
			myRs.close();

			return f;
			
		}
		catch (Exception e) {
			e.printStackTrace();
			return 0;
		}		
	}

	public static int perAreaPos(int areaId){
			
		try {
			// Get connection to db
			
			Class.forName("com.mysql.jdbc.Driver"); 
			
			Connection myConn = DriverManager.getConnection("jdbc:mysql://prometheus.dmst.aueb.gr:3306/ipetsas_windose?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "ipetsas", "1234");

			// Create statement
			
			PreparedStatement myStmt = myConn.prepareStatement("select count(ID) as areapos from positive where area = ?");

			// Process result set
			
			int p = 0;
			ResultSet myRs = null;
			switch (areaId) {
				case 1:
					myStmt.setString(1, "Attica");
					myRs = myStmt.executeQuery();
					p = myRs.getInt("areapos");
					break;
				case 2:
					myStmt.setString(1, "Macedonia");
					myRs = myStmt.executeQuery();
					p = myRs.getInt("areapos");
					break;
				case 3:
					myStmt.setString(1, "Thrace");
					myRs = myStmt.executeQuery();
					p = myRs.getInt("areapos");
					break;
				case 4:
					myStmt.setString(1, "Peloponnese");
					myRs = myStmt.executeQuery();
					p = myRs.getInt("areapos");
					break;
				case 5:
					myStmt.setString(1, "Ionian Islands");
					myRs = myStmt.executeQuery();
					p = myRs.getInt("areapos");
					break;
				case 6:
					myStmt.setString(1, "Aegean Islands");
					myRs = myStmt.executeQuery();
					p = myRs.getInt("areapos");
					break;
				case 7:
					myStmt.setString(1, "Epirus");
					myRs = myStmt.executeQuery();
					p = myRs.getInt("areapos");
					break;
				case 8:
					myStmt.setString(1, "Thessaly");
					myRs = myStmt.executeQuery();
					p = myRs.getInt("areapos");
					break;
				default:
					
			}
			
			return p;
			
		}
		catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	public static int perAreaNeg(int areaId){
		
		try {
			// Get connection to db

			Class.forName("com.mysql.jdbc.Driver"); 

			Connection myConn = DriverManager.getConnection("jdbc:mysql://prometheus.dmst.aueb.gr:3306/ipetsas_windose?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "ipetsas", "1234");

			// Create statement
			
			PreparedStatement myStmt = myConn.prepareStatement("select count(ID) as areaneg from negative where area = ?");

			// Process result set
			
			int n = 0;
			ResultSet myRs = null;
			switch (areaId) {
				case 1:
					myStmt.setString(1, "Attica");
					myRs = myStmt.executeQuery();
					n = myRs.getInt("areaneg");
					break;
				case 2:
					myStmt.setString(1, "Macedonia");
					myRs = myStmt.executeQuery();
					n = myRs.getInt("areaneg");
					break;
				case 3:
					myStmt.setString(1, "Thrace");
					myRs = myStmt.executeQuery();
					n = myRs.getInt("areaneg");
					break;
				case 4:
					myStmt.setString(1, "Peloponnese");
					myRs = myStmt.executeQuery();
					n = myRs.getInt("areaneg");
					break;
				case 5:
					myStmt.setString(1, "Ionian Islands");
					myRs = myStmt.executeQuery();
					n = myRs.getInt("areaneg");
					break;
				case 6:
					myStmt.setString(1, "Aegean Islands");
					myRs = myStmt.executeQuery();
					n = myRs.getInt("areaneg");
					break;
				case 7:
					myStmt.setString(1, "Epirus");
					myRs = myStmt.executeQuery();
					n = myRs.getInt("areaneg");
					break;
				case 8:
					myStmt.setString(1, "Thessaly");
					myRs = myStmt.executeQuery();
					n = myRs.getInt("areaneg");
					break;
				default:
					
			}
			
			return n;
			
		}
		catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	public static int perAgePos(int ageId){
		
		try {
			// Get connection to db
			
			Class.forName("com.mysql.jdbc.Driver"); 
			
			Connection myConn = DriverManager.getConnection("jdbc:mysql://prometheus.dmst.aueb.gr:3306/ipetsas_windose?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "ipetsas", "1234");

			// Create statement
			
			PreparedStatement myStmt = myConn.prepareStatement("select count(ID) as agepos from positive where age < ?");

			// Process result set
			
			int p = 0;
			ResultSet myRs = null;
			switch (ageId) {
				case 1:
					myStmt.setInt(1, 10);
					myRs = myStmt.executeQuery();
					p = myRs.getInt("agepos");
					break;
				case 2:
					myStmt.setInt(1, 10);
					myRs = myStmt.executeQuery();
					p = myRs.getInt("agepos");
					break;
				case 3:
					myStmt.setInt(1, 10);
					myRs = myStmt.executeQuery();
					p = myRs.getInt("agepos");
					break;
				case 4:
					myStmt.setInt(1, 10);
					myRs = myStmt.executeQuery();
					p = myRs.getInt("agepos");
					break;
				case 5:
					myStmt.setInt(1, 10);
					myRs = myStmt.executeQuery();
					p = myRs.getInt("agepos");
					break;
				case 6:
					myStmt.setInt(1, 10);
					myRs = myStmt.executeQuery();
					p = myRs.getInt("agepos");
					break;
				case 7:
					myStmt.setInt(1, 10);
					myRs = myStmt.executeQuery();
					p = myRs.getInt("agepos");
					break;
				case 8:
					myStmt.setInt(1, 10);
					myRs = myStmt.executeQuery();
					p = myRs.getInt("agepos");
					break;
				default:
					
			}
			
			return p;
			
		}
		catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	public static int perAgeNeg(int ageId){
		
		try {
			// Get connection to db
			
			Class.forName("com.mysql.jdbc.Driver"); 

			Connection myConn = DriverManager.getConnection("jdbc:mysql://prometheus.dmst.aueb.gr:3306/ipetsas_windose?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "ipetsas", "1234");

			// Create statement
			
			PreparedStatement myStmt = myConn.prepareStatement("select count(ID) as ageneg from negative where area < ?");

			// Process result set
			
			int n = 0;
			ResultSet myRs = null;
			switch (ageId) {
				case 1:
					myStmt.setInt(1, 10);
					myRs = myStmt.executeQuery();
					n = myRs.getInt("ageneg");
					break;
				case 2:
					myStmt.setInt(1, 20);
					myRs = myStmt.executeQuery();
					n = myRs.getInt("ageneg");
					break;
				case 3:
					myStmt.setInt(1, 30);
					myRs = myStmt.executeQuery();
					n = myRs.getInt("ageneg");
					break;
				case 4:
					myStmt.setInt(1, 40);
					myRs = myStmt.executeQuery();
					n = myRs.getInt("ageneg");
					break;
				case 5:
					myStmt.setInt(1, 50);
					myRs = myStmt.executeQuery();
					n = myRs.getInt("ageneg");
					break;
				case 6:
					myStmt.setInt(1, 60);
					myRs = myStmt.executeQuery();
					n = myRs.getInt("ageneg");
					break;
				case 7:
					myStmt.setInt(1, 70);
					myRs = myStmt.executeQuery();
					n = myRs.getInt("ageneg");
					break;
				default:
					break;
			}
			
			return n;
			
		}
		catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	public static int ECUCount(){
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver"); 

			Connection myConn = DriverManager.getConnection("jdbc:mysql://prometheus.dmst.aueb.gr:3306/ipetsas_windose?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "ipetsas", "1234");
			
			PreparedStatement myStmt = myConn.prepareStatement("select count(AMKA) as ecucount from Patient where ecu = ?");
			
			ResultSet myRs = null;
			
			myStmt.setInt(1, 1);
			
			myRs = myStmt.executeQuery();
						
			int ecu = myRs.getInt("ecucount");
			
			myRs.close();

			return ecu;
			
		}
		catch (Exception e) {
			e.printStackTrace();
			return 0;
		}		
	}

	public static int Mortality(){
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver"); 

			Connection myConn = DriverManager.getConnection("jdbc:mysql://prometheus.dmst.aueb.gr:3306/ipetsas_windose?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "ipetsas", "1234");
			
			PreparedStatement myStmt = myConn.prepareStatement("select count(AMKA) as dcount from Patient where alive = ?");
			
			ResultSet myRs = null;
			
			myStmt.setInt(1, 2);
			
			myRs = myStmt.executeQuery();
						
			int d = myRs.getInt("dcount");
			
			myRs.close();
	
			return d;
			
		}
		catch (Exception e) {
			e.printStackTrace();
			return 0;
		}		
	}

}
