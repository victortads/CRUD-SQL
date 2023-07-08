package weather.aplication;

import weather.dao.WeatherDAO;
import weather.model.Weather;

public class Main {

	public static void main(String[] args) {


		WeatherDAO climadao = new WeatherDAO();

		Weather clima = new Weather();
			
		clima.setTemperature(65);
		clima.setLighting(12);
		clima.setWindSpeed(44);
		clima.setHumidity(97);

		climadao.save(clima);
		





	}

}
