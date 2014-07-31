package demo.test;

import webdriver.BaseTest;
import demo.test.forms.*;

public class DemoTest extends BaseTest {
	
	
	public void runTest() {

		logger.step(1);
		browser.navigate("http://www.tut.by/");
		logger.step(2);
		Autorisation tsf = new Autorisation();
		tsf.assertLogo();
		logger.step(3);
		tsf.login("courseProject", "q1w2e3r4t5y6");
		logger.step(4);
		browser.waitForPageToLoad();
		logger.step(5);
		tsf.autorizationAssert();
			}



}
