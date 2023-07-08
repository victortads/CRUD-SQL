package weather.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import weather.connection.SetConnection;
import weather.model.Weather;

public class WeatherDAO {

	/*
	 * CRUD
	 * C = CREATE
	 * R = READ
	 * U = UPDATE
	 * D = DELETE
	 * */
	public void save(Weather weather) {
		
		String sql = "INSERT INTO dados(ID, temperature, lighting, windSpeed, humidity) "
				+ "values(?, ?, ?, ?, ?)";
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
//			Criando a conexão com o banco de dados
			conn = SetConnection.createConnectionToMySQL();
			
//			criamos o statemant para executar as querys
			pstm = (PreparedStatement) conn.prepareStatement(sql);
//			Adicionando os valores na query
			pstm.setInt(1, Weather.getID());
			pstm.setFloat(2, Weather.getTemperature());
			pstm.setFloat(3, Weather.getLighting());
			pstm.setFloat(4, Weather.getWindSpeed());
			pstm.setFloat(5, Weather.getHumidity());
			
//			Executar a query 
			pstm.execute();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
//			Fechar as conexões
			try {
				if(pstm!=null) {
					pstm.close();
				}
				
				if(conn!=null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}


	
	
	
	
	
	
	
}
