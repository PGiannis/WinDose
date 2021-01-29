package src;

import java.sql.*;
import javafx.application.Application;

public class JDBCtry {

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

			myConn.close();
			myStmt.close();
			return p;
		
		}
		catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	public static int negcount(){
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection myConn = DriverManager.getConnection("jdbc:mysql://prometheus.dmst.aueb.gr:3306/ipetsas_windose?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "ipetsas", "1234");
			
			Statement myStmt = myConn.createStatement();

			ResultSet myRs = myStmt.executeQuery("select count(AMKA) as ncount from Patient where Positive = false");
			
			myRs.next();
			
			int n = myRs.getInt("ncount");
			
			myRs.close();
			
			myConn.close();
			myStmt.close();
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

			myConn.close();
			myStmt.close();
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

			myConn.close();
			myStmt.close();
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
			
			PreparedStatement myStmt = myConn.prepareStatement("select count(AMKA) as areapos from Patient where District = ?");

			// Process result set
			
			int p = 0;
			ResultSet myRs = null;
			switch (areaId) {
				case 1:
					myStmt.setString(1, "Perifereia Dytikis Elladas");
					myRs = myStmt.executeQuery();
					myRs.next();
					p = myRs.getInt("areapos");
					myRs.close();
					break;
				case 2:
					myStmt.setString(1, "Pereiferia Anatolikis Makedonias & Thrakis");
					myRs = myStmt.executeQuery();
					myRs.next();
					p = myRs.getInt("areapos");
					myRs.close();
					break;
				case 3:
					myStmt.setString(1, "Perifereia Krhths");
					myRs = myStmt.executeQuery();
					myRs.next();
					p = myRs.getInt("areapos");
					myRs.close();
					break;
				case 4:
					myStmt.setString(1, "Perifereia Attikis");
					myRs = myStmt.executeQuery();
					myRs.next();
					p = myRs.getInt("areapos");
					myRs.close();
					break;
				case 5:
					myStmt.setString(1, "Perifereia Boreiou Aigaiou");
					myRs = myStmt.executeQuery();
					myRs.next();
					p = myRs.getInt("areapos");
					myRs.close();
					break;
				case 6:
					myStmt.setString(1, "Perifereia Thessalias");
					myRs = myStmt.executeQuery();
					myRs.next();
					p = myRs.getInt("areapos");
					myRs.close();
					break;
				case 7:
					myStmt.setString(1, "Perifereia Notiou Aigaiou");
					myRs = myStmt.executeQuery();
					myRs.next();
					p = myRs.getInt("areapos");
					myRs.close();
					break;
				case 8:
					myStmt.setString(1, "Perifereia Stereas Elladas");
					myRs = myStmt.executeQuery();
					myRs.next();
					p = myRs.getInt("areapos");
					myRs.close();
					break;
				default:
					myStmt.setString(1, "Perifereia Kentrikis Makedonias");
					myRs = myStmt.executeQuery();
					myRs.next();
					p = myRs.getInt("areapos");
					myRs.close();
					break;
					
			}
			myConn.close();
			myStmt.close();
			return p;
			
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
			
			PreparedStatement myStmt = myConn.prepareStatement("select count(AMKA) as agepos from Patient where Age > ? and Age <= ?");

			// Process result set
			
			int p = 0;
			ResultSet myRs = null;
			switch (ageId) {
				case 1:
					myStmt.setInt(1, 0);
					myStmt.setInt(2, 20);
					myRs = myStmt.executeQuery();
					myRs.next();
					p = myRs.getInt("agepos");
					myRs.close();
					break;
				case 2:
					myStmt.setInt(1, 20);
					myStmt.setInt(2, 30);
					myRs = myStmt.executeQuery();
					myRs.next();
					p = myRs.getInt("agepos");
					myRs.close();
					break;
				case 3:
					myStmt.setInt(1, 30);
					myStmt.setInt(2, 40);
					myRs = myStmt.executeQuery();
					myRs.next();
					p = myRs.getInt("agepos");
					myRs.close();
					break;
				case 4:
					myStmt.setInt(1, 40);
					myStmt.setInt(2, 50);
					myRs = myStmt.executeQuery();
					myRs.next();
					p = myRs.getInt("agepos");
					myRs.close();
					break;
				case 5:
					myStmt.setInt(1, 50);
					myStmt.setInt(2, 60);
					myRs = myStmt.executeQuery();
					myRs.next();
					p = myRs.getInt("agepos");
					myRs.close();
					break;
				case 6:
					myStmt.setInt(1, 60);
					myStmt.setInt(2, 70);
					myRs = myStmt.executeQuery();
					myRs.next();
					p = myRs.getInt("agepos");
					myRs.close();
					break;
				case 7:
					myStmt.setInt(1, 70);
					myStmt.setInt(2, 80);
					myRs = myStmt.executeQuery();
					myRs.next();
					p = myRs.getInt("agepos");
					myRs.close();
					break;
				default:
					myStmt.setInt(1, 80);
					myStmt.setInt(2, 150);
					myRs = myStmt.executeQuery();
					myRs.next();
					p = myRs.getInt("agepos");
					myRs.close();
					break;
					
			}
			myConn.close();
			myStmt.close();
			return p;
			
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
			
			Statement myStmt = myConn.createStatement();
			
			ResultSet myRs = myStmt.executeQuery("select count(amka) as ecucount from Patient where ECU = true");
									
			myRs.next();
						
			int ecu = myRs.getInt("ecucount");
			
			myRs.close();
			
			myConn.close();
			myStmt.close();
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
			
			PreparedStatement myStmt = myConn.prepareStatement("select count(AMKA) as dcount from Patient where Alive = ?");
			
			ResultSet myRs = null;
			
			myStmt.setBoolean(1, true);
			
			myRs = myStmt.executeQuery();
			
			myRs.next();
						
			int d = myRs.getInt("dcount");
			
			myRs.close();
			
			myConn.close();
			myStmt.close();
			return d;
			
		}
		catch (Exception e) {
			e.printStackTrace();
			return 0;
		}		
	}

}
