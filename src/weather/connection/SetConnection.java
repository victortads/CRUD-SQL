package weather.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class SetConnection {

//	declarando o username do mysql
	public static final String USERNAME = "root";
	
//	declarando a senha do mysql
	public static final String PASSWORD = "root";
	
//	declarando a url do mysql
	private static final String URL = "jdbc:mysql://localhost:3306/weather";
	
	
	/*
	 * Conexão com o banco
	 */

	public static Connection createConnectionToMySQL() throws Exception{
//		carregar a classe
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		cria a conexão com o banco
		Connection connection = DriverManager.getConnection(URL,USERNAME, PASSWORD);
		
		return connection;
	}
	
	public static void main(String[] args) throws Exception{
		
//		recuperar a conexão
		Connection con = createConnectionToMySQL();
		
//		testar a conexão
		if(con!=null) {
			System.out.println("Conexão obtida com sucesso");
			con.close();
		}
		
	}

	

}
