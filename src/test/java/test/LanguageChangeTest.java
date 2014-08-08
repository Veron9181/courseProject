package test;

import test.forms.MainPageForm;
import webdriver.BaseTest;

public class LanguageChangeTest extends BaseTest {
	
public void runTest() {
	
	logger.step(1);
	browser.navigate("http://www.tut.by/");
	logger.step(2);
	MainPageForm language = new MainPageForm();
	language.Changelanguage();
	logger.step(3);
	language.SearchText("інфармацыйныя тэхналогіі");			
	}

}
