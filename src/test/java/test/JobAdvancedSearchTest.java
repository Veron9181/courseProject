package test;

import test.forms.JobAdvancedSearchForm;
import test.forms.JobForm;
import test.forms.MainPageForm;
import webdriver.BaseTest;

public class JobAdvancedSearchTest extends BaseTest{

public void runTest() {
	
	logger.step(1);
	browser.navigate("http://www.tut.by/");
	logger.step(2);
	MainPageForm goToJobs = new MainPageForm();
	goToJobs.GoToJobs();
	logger.step(3);
	JobForm job = new JobForm();
	job.GoToAdvancedSearch();
	logger.step(4);
	JobAdvancedSearchForm jobAdvancedSearch = new JobAdvancedSearchForm();
	jobAdvancedSearch.AdvancedSearch();
	logger.step(5);
	jobAdvancedSearch.CompleteAndFindForm("Junior developer");			
		}
}
