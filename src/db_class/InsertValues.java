package db_class;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertValues {

	
	public static void main(String[] args) throws IOException, SQLException {
		
		String sqlContent = readFile("src/hotel/Inserts_Hotel.sql", StandardCharsets.UTF_8);
		//System.out.println(sqlContent);
		
		String url = "jdbc:sqlserver://localhost:1401";
		String user = "SA";
		String passwd = "<YourNewStrong!Passw0rd>";
		String dataBase = "examples";
		String connectionUrl = url + ";database=" + dataBase + ";user=" + user + ";password=" + passwd + ";";  
					 
		Connection conn = DriverManager.getConnection(connectionUrl);
		int result;
		
		result = conn.prepareStatement(sqlContent).executeUpdate();
		System.out.println(result);
	}
	
	static String readFile(String path, Charset encoding) throws IOException {
			  byte[] encoded = Files.readAllBytes(Paths.get(path));
			  return new String(encoded, encoding);
	}
}
