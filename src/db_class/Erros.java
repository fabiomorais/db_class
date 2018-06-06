package db_class;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Erros {

	public static void main(String[] args) {

		System.out.println("Exemplo banco de dados");

		String url = "jdbc:sqlserver://localhost:1401";
		String user = "SA";
		String passwd = "<YourNewStrong!Passw0rd>";
		String dataBase = "dbClass";
		String connectionUrl = url + ";database=" + dataBase + ";user=" + user + ";password=" + passwd + ";";  
		String query = "select name from sys.Databases";

		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection conn = DriverManager.getConnection(connectionUrl);
			try {
				PreparedStatement ps = conn.prepareStatement(query);
				try {
					ResultSet rs = ps.executeQuery(); 
					try {
						while (rs.next()) { System.out.println(rs.getString(1)); }
					} finally {
						rs.close();
					}
				} finally {
					ps.close();
				}
			} finally {
				conn.close();
			}
		} catch (ClassNotFoundException e1) {
			System.err.println("Driver não encontrado");
		} catch (SQLException e) {
			System.err.println("Erro no SGBD: " + e.getMessage());
		} 

		Connection conn2 = null;
		try {
			conn2 = DriverManager.getConnection(connectionUrl);
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		} finally {
			if (conn2 != null) {
				try {
					conn2.close();
				} catch (SQLException e) {
					System.err.println(e.getMessage());
				}
			}
		}

	}
}
