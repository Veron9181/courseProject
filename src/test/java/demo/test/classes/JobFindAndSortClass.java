package demo.test.classes;
import demo.test.forms.*;

public class JobFindAndSortClass extends JobFindAndSortForm{

	public void JobFindAndSort() {
	
		logger.step(1);
		JobFindAndSortForm jfs = new JobFindAndSortForm();
		jfs.GoToJobs();
		logger.step(2);
		jfs.FindJob();
		// дописать фреймворк
		}
}
