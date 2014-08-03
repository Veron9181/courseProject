package demo.test;

import webdriver.BaseTest;
import demo.test.forms.*;

public class DemoTest extends BaseTest {
	
	
	public void runTest() {

	//test.Login
		
		logger.step(1);
		browser.navigate("http://www.tut.by/");
		logger.step(2);
		LoginForm lgf = new LoginForm();
		lgf.Login("courseProject", "q1w2e3r4t5y6");
		logger.step(3);
		lgf.LoginAssert();
		logger.step(4);
		lgf.LoginQuit();
			
	// test.AfishaFindEvent
		
		logger.step(1);
		browser.navigate("http://www.tut.by/");
		logger.step(2);
		AfishaFindEventForm afe = new AfishaFindEventForm();
		afe.GoToAfisha();
		logger.step(3);
		afe.AfishaSearch("Three days grace");
		logger.step(4);
		afe.AssertFindGroup();
		
	// test.WeatherChangeCity
		
		logger.step(1);
		browser.navigate("http://www.tut.by/");
		logger.step(2);
		WeatherChangeCityForm wcc = new WeatherChangeCityForm();
		wcc.WeatherPage();
		logger.step(3);
		wcc.ChangeCity();
		
		
	
	}



}
