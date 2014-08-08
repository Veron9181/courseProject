package test.classes;
import test.forms.*;

public class JobAdvancedSearchClass extends MainPageForm{
	
	public void JobAdvancedSearch() {
		
		logger.step(1);
		MainPageForm goToJobs = new MainPageForm();
		goToJobs.GoToJobs();
		logger.step(2);
		JobForm job = new JobForm();
		job.GoToAdvancedSearch();
		logger.step(3);
		JobAdvancedSearchForm jobAdvancedSearch = new JobAdvancedSearchForm();
		jobAdvancedSearch.AdvancedSearch();
		logger.step(4);
		jobAdvancedSearch.CompleteAndFindForm("Junior developer");
	}
}
