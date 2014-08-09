package test;
import test.forms.MainPageForm;

import webdriver.BaseTest;

public class LoginTest extends BaseTest {
	
	public void runTest() {
		
		logger.step(1);
		browser.navigate("http://www.tut.by/");
		logger.step(2);
		MainPageForm login = new MainPageForm();
		login.Login("courseProject", "q1w2e3r4t5y6");
		logger.step(3);
		login.LoginQuit();				
		}
}