package demo.test.classes;
import demo.test.forms.*;

public class JobAdvancedSearchClass extends JobAdvancedSearchForm{
	
	public void JobAdvancedSearch() {

	logger.step(1);
	JobAdvancedSearchForm asf = new JobAdvancedSearchForm();
	asf.GoToJobs();
	logger.step(2);
	asf.AdvancedSearch();
	logger.step(3);
	asf.CompleteAndFindForm();
	}
}
