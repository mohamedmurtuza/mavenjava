package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DB1 {

	@Test
	public void dbDemo() throws SQLException {
		
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qualityassurancedb","root","Sunmoon$786");
		
		Statement s = con.createStatement();
		
		ResultSet rs =s.executeQuery("select * from EmployeeInfo where location = 'mysore'");
		
		rs.next();
		System.out.println(rs.getString("name"));
		System.out.println(rs.getString("id"));
		System.out.println(rs.getString("age"));
		System.out.println(rs.getString("location"));
		
		
		
		
		
			}
}
