package demo.test.classes;
import demo.test.forms.*;

public class FindRoadRulesClass extends FindRoadRulesForm{

	public void FindRoadRules() {
		
	logger.step(1);
	BlogFindAndGoToForm bfa = new BlogFindAndGoToForm();
	bfa.clickAllResources();
	logger.step(2);
	FindRoadRulesForm brr = new FindRoadRulesForm();
	brr.FindRoadRules();
	}
}
