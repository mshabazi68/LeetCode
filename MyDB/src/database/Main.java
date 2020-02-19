package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Main {
	// public String first = "Cris";
	// public String last = "Shah";

	public static void main(String[] args) throws Exception {
		Main obj = new Main();
		obj.createTable();
		obj.post();
		obj.get();
	}


public  ArrayList<String> get() throws Exception{


	try {
		Connection conn = getConnection();
		PreparedStatement statement =conn.prepareStatement("SELECT first , last  FROM testtable ");
	    ResultSet result = statement.executeQuery();
		
		ArrayList<String> array = new ArrayList <String>();
		
		while (result.next()) {
			System.out.print(result.getString("first"));
			System.out.print(" ");
			System.out.println(result.getString("last"));
			
		//	array.add(result.getString("first"));
			
		array.add(result.getString("last") );
		}
		System.out.println("All recored have been selected. ");
		return array;
	}
	
	catch(Exception e) {
		System.out.println(e);
		
	}
	return null;
	
}
	/*
	 * public void setName(String name) { String myName = name; }
	 * 
	 * public void setLast(String last) { String myLast = last; }
	 * 
	 * public String getLast() { return last; }
	 * 
	 * public String getName() { return first; }
	 */

	public void post() throws Exception {
		final String var1 = "Ray";
		final String var2 = "Shah";
		String query = "INSERT INTO testtable (" + "first," + " last ) VALUES (" + " ?, ?)";
		try {
			Connection conn = getConnection();
			PreparedStatement posted = conn
					.prepareStatement("INSERT INTO testtable (first, last) VALUES ('" + var1 + "', '" + var2 + "')");
			/*
			 * PreparedStatement posted = conn.prepareStatement(query); posted.setString(1,
			 * getName()); posted.setString(2, getLast());
			 */
			posted.executeUpdate();
			conn.close();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Insert Completed.");
		}

	}

	public void createTable() throws Exception {

		try {
			Connection conn = getConnection();
			PreparedStatement create = conn.prepareStatement(
					" CREATE TABLE IF NOT EXISTS testtable (id int NOT NULL AUTO_INCREMENT, first VARCHAR (255) , last VARCHAR (255), PRIMARY KEY (id)) ");
			create.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Function has been compeleted.");
		}
	}

	public Connection getConnection() throws Exception {
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/mytest";
			String username = "root";
			String password = "Iranpay77";
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("Successfully Connected");
			return conn;
		} catch (Exception e) {
			System.out.println(e);
		}

		return null;
	}
}
