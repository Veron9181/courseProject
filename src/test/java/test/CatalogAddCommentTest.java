package test;

import test.forms.CatalogForm;
import test.forms.MainPageForm;
import webdriver.BaseTest;

public class CatalogAddCommentTest extends BaseTest{

	public void runTest() {
		
	logger.step(1);
	browser.navigate("http://www.tut.by/");
	logger.step(2);
	MainPageForm login = new MainPageForm();
	login.Login("courseProject", "q1w2e3r4t5y6");
	logger.step(3);
	MainPageForm goToCatalog = new MainPageForm();
	goToCatalog.GoToCatalog();
	logger.step(4);
	CatalogForm catalog = new CatalogForm();
	catalog.AssertCatalog();
	logger.step(5);
	catalog.SearchCarwash("Олекскар");
	logger.step(6);
	catalog.WriteComment("Вежливый персонал, хорошие цены", "Негативного нет)");
	logger.step(7);
	login.LoginQuit();
	}
	
}
