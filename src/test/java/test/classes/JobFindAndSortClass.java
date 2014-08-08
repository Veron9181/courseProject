package test.classes;
import test.forms.MainPageForm;
import test.forms.*;

public class JobFindAndSortClass extends MainPageForm{

	public void JobFindAndSort() {
			
		logger.step(1);
		MainPageForm goToJobs = new MainPageForm();
		goToJobs.GoToJobs();
		logger.step(1);
		JobForm job = new JobForm();
		job.AssertJobs();
		logger.step(2);
		job.FindJob("Junior developer", "Информационные технологии, интернет, телеком", "1000000");
		}
}
