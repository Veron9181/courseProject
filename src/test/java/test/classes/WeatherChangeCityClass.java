package test.classes;
import test.forms.*;

public class WeatherChangeCityClass extends MainPageForm {

	
	public void WeatherChangeCity() {
	
	logger.step(1);
	MainPageForm goToWeather = new MainPageForm();
	goToWeather.GoToWeather();
	logger.step(1);
	WeatherForm weather = new WeatherForm();
	weather.WeatherPageAssert();
	logger.step(2);
	weather.ChangeCity();
	}
}
