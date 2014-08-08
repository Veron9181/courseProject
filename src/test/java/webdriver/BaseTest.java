package webdriver;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

/**
 * An abstract class that describes the basic test application contains
 * methods for logging and field test settings (options)
 */
public abstract class BaseTest extends BaseEntity{
	
	/**
	 * To override.
	 */
	
	public String username, password, site, searchAfisha, searchBlog, carwashName, carwashComment,
	job, jobSpecialization, jobSalary, languageSearch, musicSearch;
    @Test
     @Parameters({"username", "password", "site", "searchAfisha", "searchBlog", "carwashName", 
    	 "carwashComment", "job", "jobSpecialization", "jobSalary", "languageSearch", "musicSearch"})
     public void readParams(String username, String password, String site, String searchAfisha, String searchBlog,
    		 String carwashName, String carwashComment, String job, String jobSpecialization, String jobSalary,
    		 String languageSearch, String musicSearch) throws Throwable {
      this.username = username;
      this.password = password;
      this.username = username;
      this.password	= password;
      this.site	= site;
      this.searchAfisha	= searchAfisha;
      this.searchBlog = searchBlog;
      this.carwashName = carwashName;
      this.carwashComment = carwashComment;
      this.job = job;
      this.jobSpecialization = jobSpecialization;
      this.jobSalary = jobSalary;
      this.languageSearch = languageSearch;
      this.musicSearch = musicSearch;

      
      xTest();
     }
     
     @Parameters()
	
	public abstract void runTest();

	/**
	 * Test
	 * @throws Throwable Throwable
	 */
	@Test
	public void xTest() throws Throwable {
		Class<? extends BaseTest> currentClass = this.getClass();
		
		try {
			logger.logTestName(currentClass.getName());
			runTest();
			logger.logTestEnd(currentClass.getName());
		} catch (Throwable e) {
			
				logger.warn("");
				logger.warnRed(getLoc("loc.test.failed"));
				logger.warn("");
				throw e;
			}
		
	}

	/**
	 * Format logging
	 * @param message Message
	 * @return Message
	 */
	protected String formatLogMsg(final String message) {
		return message;
	}

}
