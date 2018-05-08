package db_class;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Example {

	public static void main(String[] args) {
		
		System.out.println("Exemplo banco de dados");
			
		try {
		
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			String connectionUrl = "jdbc:sqlserver://localhost:1401;" +  
					   "databaseName=TestDB;user=SA;password=<YourNewStrong!Passw0rd>;";  
			Connection conn = DriverManager.getConnection(connectionUrl);  
					
			String sql = "SELECT Name from sys.Databases";
			//Prepara a instrução SQL
			PreparedStatement ps = conn.prepareStatement(sql);
			//Executa a instrução SQL
			//ps.execute();
			
			ResultSet rs = ps.executeQuery();
 
			// itera pelo conjunto de resultados, perguntando se tem um próximo (next)
			while (rs.next()) {
				String name = rs.getString("Name");
				System.out.println(name);
			}
			
		} catch (SQLException | ClassNotFoundException e) {
			System.err.println(e);
		}

	}
}
