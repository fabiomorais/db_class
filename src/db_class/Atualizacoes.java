package db_class;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Atualizacoes {

	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:sqlserver://localhost:1401";
		String user = "SA";
		String passwd = "<YourNewStrong!Passw0rd>";
		String dataBase = "examples";
		String connectionUrl = url + ";database=" + dataBase + ";user=" + user + ";password=" + passwd + ";";  
					 
		Connection conn = DriverManager.getConnection(connectionUrl);
		
		String sql = "update Hospedes set endereco = ? where cpf = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setString(1, "Rio Tinto");
		ps.setString(2, "621000385221");
		
		int rs = ps.executeUpdate();
		System.out.println("Numero de linhas: " + rs);
	}
}
