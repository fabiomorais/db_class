package db_class;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Consultas {

	public static void main(String[] args) throws SQLException {
	
		String url = "jdbc:sqlserver://localhost:1401";
		String user = "SA";
		String passwd = "<YourNewStrong!Passw0rd>";
		String dataBase = "examples";
		String connectionUrl = url + ";database=" + dataBase + ";user=" + user + ";password=" + passwd + ";";  
					 
		Connection conn = DriverManager.getConnection(connectionUrl);
		
		String sql = "select nome, endereco from Hospedes where sexo = 'F'";
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ResultSet result = ps.executeQuery();
		
		while (result.next()) {
			System.out.println("Hospede: " + result.getString(1) + " Endereço: " + result.getString("endereco"));
		}
		
		conn.close();

		
		System.out.println("");
		selectBySexoIdade(conn, "M", 1960);
	}
	
	static private void selectBySexoIdade(Connection conn, String sexo, int dataNascimento) throws SQLException {
		
		String sql = "select nome, endereco from Hospedes where sexo = ? and year(dataNascimento) = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setString(1, sexo);
		ps.setInt(2, dataNascimento);
		
		ResultSet result = ps.executeQuery();
		
		while (result.next()) {
			System.out.println("Hospede: " + result.getString(1) + " Endereço: " + result.getString("endereco"));
		}
	}
		
}
