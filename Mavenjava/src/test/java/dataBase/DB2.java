package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DB2 {
	
	@Test
	public void databasedemo() throws SQLException {
		
		String URL="jdbc:mysql://localhost:3306/names";
		String UN ="root";
		String PW="Sunmoon$786";
		String query="Select * from names";
		
		Connection con=DriverManager.getConnection(URL,UN,PW);
		Statement st = con.createStatement();
		ResultSet rs =st.executeQuery(query);
		
		while(rs.next()) {
		System.out.println(rs.getString("Age"));
		
		
}}}
