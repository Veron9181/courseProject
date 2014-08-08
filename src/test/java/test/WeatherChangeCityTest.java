package test;

import test.forms.MainPageForm;
import test.forms.WeatherForm;
import webdriver.BaseTest;

public class WeatherChangeCityTest extends BaseTest {
	
public void runTest() {
	
	logger.step(1);
	browser.navigate("http://www.tut.by/");
	logger.step(2);
	MainPageForm goToWeather = new MainPageForm();
	goToWeather.GoToWeather();
	logger.step(3);
	WeatherForm weather = new WeatherForm();
	weather.WeatherPageAssert();
	logger.step(4);
	weather.ChangeCity();			
	}

}
