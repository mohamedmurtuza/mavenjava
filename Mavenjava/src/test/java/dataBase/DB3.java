package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DB3 {
	
	@Test
	public void db3() throws SQLException {
		
		String url="jdbc:mysql://localhost:3306/house";
		String user="root";
		String password="Sunmoon$786";
		String sql="select * from mem";
		
		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		ResultSet set= st.executeQuery(sql);
		
		
		while(set.next()) {
		System.out.println(set.getString("names"));
		System.out.println(set.getString("age"));
		
	}
	}
}
