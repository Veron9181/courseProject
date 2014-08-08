package demo.test;

import test.classes.*;
import webdriver.BaseTest;

public class DemoTest extends BaseTest {
		
	public void runTest() {
						
		//test 1 Login
		browser.navigate("http://www.tut.by/");
		LoginClass lc = new LoginClass();
		lc.Login();
		
		//test 2 AfishaFindEvent
		browser.navigate("http://www.tut.by/");
		AfishaFindEventClass afc = new AfishaFindEventClass();
		afc.AfishaFindEvent();
		
		//test 3 WeatherChangeCity
		browser.navigate("http://www.tut.by/");
		WeatherChangeCityClass wcc = new WeatherChangeCityClass();
		wcc.WeatherChangeCity();
		
//		//test 4 CatalogAddComment
//		browser.navigate("http://www.tut.by/");
//		CatalogAddCommentClass cac = new CatalogAddCommentClass();
//		cac.CatalogAddComment();
		
		//test 5 MusicFindGroup
		browser.navigate("http://www.tut.by/");
		MusicFindGroupClass mfg = new MusicFindGroupClass();
		mfg.MusicFindGroup();
		
		//test 6 JobFindAndSort
		browser.navigate("http://www.tut.by/");
		JobFindAndSortClass jfs = new JobFindAndSortClass();
		jfs.JobFindAndSort();
		
		//test 7 JobAdvancedSearch
		browser.navigate("http://www.tut.by/");
		JobAdvancedSearchClass jas = new JobAdvancedSearchClass();
		jas.JobAdvancedSearch();
		
		//test 8 BlogFindAndGoTo
		browser.navigate("http://www.tut.by/");
		BlogFindAndGoToClass bfg = new BlogFindAndGoToClass();
		bfg.BlogFindAndGoTo();
				
		//test 9 FindRoadRules
		browser.navigate("http://www.tut.by/");
		FindRoadRulesClass frr = new FindRoadRulesClass();
		frr.FindRoadRules();
				
		//test 10 LanguageChange
		browser.navigate("http://www.tut.by/");
		LanguageChangeClass lcc = new LanguageChangeClass();
		lcc.LanguageChange();
						
	}
}
