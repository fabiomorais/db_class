package db_class;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Exemplo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		System.out.println("Exemplo banco de dados");
			
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

		String url = "jdbc:sqlserver://104.197.137.34:1433";
		String user = "SA";
		String passwd = "<YourNewStrong!Passw0rd>";
		String dataBase = "dbclass";
		String connectionUrl = url + ";database=" + dataBase + ";user=" + user + ";password=" + passwd + ";";  
				
		Connection conn = DriverManager.getConnection(connectionUrl);
		
		String query = "select name from sys.Databases";
		PreparedStatement ps = conn.prepareStatement(query);
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			String name = rs.getString("Name");
			System.out.println(name);
		}
			
		rs.close();
		ps.close();
		
		String query2 = "create database examples";
		Statement st = conn.createStatement();
		int res = st.executeUpdate(query2);
		
		System.out.println(res);
		
		st.close();
		conn.close();
		
	}
}
