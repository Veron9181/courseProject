package test.classes;
import test.forms.*;

public class FindRoadRulesClass extends MainPageForm{

	public void FindRoadRules() {
		
		logger.step(1);
		MainPageForm goToAuto = new MainPageForm();
		goToAuto.clickAllResources();
		logger.step(2);
		goToAuto.GoToAuto();
		logger.step(3);
		AutoForm searchRules = new AutoForm();
		searchRules.FindRoadRules();
		}
}
