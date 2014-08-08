package test;

import test.forms.AutoForm;
import test.forms.MainPageForm;
import webdriver.BaseTest;

public class FindRoadRulesTest extends BaseTest{
	
public void runTest() {
		
		logger.step(1);
		browser.navigate("http://www.tut.by/");
		logger.step(2);
		MainPageForm goToAuto = new MainPageForm();
		goToAuto.clickAllResources();
		logger.step(3);
		goToAuto.GoToAuto();
		logger.step(4);
		AutoForm searchRules = new AutoForm();
		searchRules.FindRoadRules();
		}
	}
