package test.classes;
import test.forms.*;

public class AfishaFindEventClass extends  MainPageForm{

	public void AfishaFindEvent() {
		
	logger.step(1);
	MainPageForm goToAfisha = new MainPageForm();
	goToAfisha.GoToAfisha();
	logger.step(2);
	AfishaForm afisha = new AfishaForm();
	afisha.AssertAfisha();
	logger.step(3);
	afisha.AfishaSearch("Three days grace");
	}
}
