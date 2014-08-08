package test;
import test.forms.AfishaForm;
import test.forms.MainPageForm;
import webdriver.BaseTest;

public class AfishaFindEventTest extends BaseTest{

	public void runTest() {
		
		logger.step(1);
		browser.navigate("http://www.tut.by/");
		logger.step(2);
		MainPageForm goToAfisha = new MainPageForm();
		goToAfisha.GoToAfisha();
		logger.step(3);
		AfishaForm afisha = new AfishaForm();
		afisha.AssertAfisha();
		logger.step(4);
		afisha.AfishaSearch("Three days grace");			
	}
}
