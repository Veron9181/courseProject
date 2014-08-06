package demo.test.classes;
import demo.test.forms.*;

public class WeatherChangeCityClass extends WeatherChangeCityForm {

	
	public void WeatherChangeCity() {
	
	logger.step(1);
	WeatherChangeCityForm wcc = new WeatherChangeCityForm();
	wcc.WeatherPage();
	logger.step(2);
	wcc.ChangeCity();
	
	}
}
