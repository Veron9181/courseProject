package test;
import test.forms.*;
import webdriver.BaseTest;

public class ShopsSearchTest extends BaseTest {
	
	public void runTest() {
		
		logger.step(1);
		browser.navigate("http://www.tut.by/");
		logger.step(2);
		MainPageForm goToShops = new MainPageForm();
		goToShops.GoToShops();
		logger.step(3);
		ShopsForm shop = new ShopsForm();
		shop.CompleteFormAndSearch("500000", "80");		
		}
}