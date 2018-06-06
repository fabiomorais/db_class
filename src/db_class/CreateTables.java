package db_class;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateTables {

	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:sqlserver://localhost:1401";
		String user = "SA";
		String passwd = "<YourNewStrong!Passw0rd>";
		String dataBase = "examples";
		String connectionUrl = url + ";database=" + dataBase + ";user=" + user + ";password=" + passwd + ";";  
					 
		Connection conn = DriverManager.getConnection(connectionUrl);
		int result;
		
		result = conn.prepareStatement(createHospedes()).executeUpdate();
		System.out.println(result);
		result = conn.prepareStatement(createQuartos()).executeUpdate();
		System.out.println(result);
		result = conn.prepareStatement(createEstadias()).executeUpdate();
		System.out.println(result);
		result = conn.prepareStatement(createServicos()).executeUpdate();
		System.out.println(result);
		conn.prepareStatement(createSolicitacoes()).executeUpdate();
		System.out.println(result);
		
		conn.commit();
		conn.close();
	}

	private static String createSolicitacoes() {
		String sql = "Create Table Solicitacoes (\n" + 
				"hospede varchar(12) not null,\n" + 
				"servico int not null,\n" + 
				"data datetime,\n" + 
				"hora datetime,\n" + 
				"\n" + 
				"Foreign Key (hospede) References Hospedes (CPF),\n" + 
				"Foreign Key (servico) References Servicos (codServico)\n" + 
				")";
		return sql;
	}

	private static String createEstadias() {
		String sql = "Create Table Estadias (\n" + 
				"hospede varchar(12) not null,\n" + 
				"quarto int not null,\n" + 
				"dataEntrada datetime,\n" + 
				"dataSaida datetime,\n" + 
				"\n" + 
				"Foreign Key (hospede) References Hospedes (CPF),\n" + 
				"Foreign Key (quarto) References Quartos (numero),\n" + 
				"Check (dataSaida > dataEntrada)\n" + 
				")";
		return sql;
	}

	private static String createServicos() {
		String sql = "Create Table Servicos (\n" + 
				"codServico int not null,\n" + 
				"descricao varchar (40),\n" + 
				"preco money,\n" + 
				"\n" + 
				"Primary Key (codServico),\n" + 
				"check (preco > 0)\n" + 
				")";
		return sql;
	}

	private static String createQuartos() {
		String sql = "Create Table Quartos (\n" + 
				"numero int not null,\n" + 
				"tipo varchar (40),\n" + 
				"valorDiaria money,\n" + 
				"\n" + 
				"Primary Key (numero),\n" + 
				"check (valorDiaria > 0)\n" + 
				")";
		return sql;
	}

	private static String createHospedes() {
		
		String sql = "Create Table Hospedes (\n" + 
				"CPF varchar (12) not null,\n" + 
				"nome varchar (50) not null,\n" + 
				"endereco varchar (50),\n" + 
				"sexo char(1),\n" + 
				"dataNascimento datetime,\n" + 
				"\n" + 
				"Primary Key (CPF),\n" + 
				"check (sexo in ('M', 'F'))\n" + 
				")";
		
		return sql;
	}
}