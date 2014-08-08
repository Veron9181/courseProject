package test;

import test.forms.JobForm;
import test.forms.MainPageForm;
import webdriver.BaseTest;

public class JobFindAndSortTest extends BaseTest{

	public void runTest() {
		
		logger.step(1);
		browser.navigate("http://www.tut.by/");
		logger.step(2);
		MainPageForm goToJobs = new MainPageForm();
		goToJobs.GoToJobs();
		logger.step(3);
		JobForm job = new JobForm();
		job.AssertJobs();
		logger.step(4);
		job.FindJob("Junior developer", "Информационные технологии, интернет, телеком", "1000000");
		}
}
