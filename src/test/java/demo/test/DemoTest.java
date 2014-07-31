package demo.test;

import webdriver.BaseTest;
import demo.test.forms.*;

public class DemoTest extends BaseTest {
	
	
	public void runTest() {

		logger.step(1);
		browser.navigate("http://www.tut.by/");
		logger.step(2);
		TutSearchForm tsf = new TutSearchForm();
		tsf.assertLogo();
		logger.step(3);
		tsf.searchFor("A1QA");
		logger.step(4);
		browser.waitForPageToLoad();
		logger.step(5);
		tsf.searchAssert();

	}



}
