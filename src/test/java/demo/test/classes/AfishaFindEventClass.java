package demo.test.classes;
import demo.test.forms.*;

public class AfishaFindEventClass extends AfishaFindEventForm{

	public void AfishaFindEvent() {
		
	logger.step(1);
	AfishaFindEventForm afe = new AfishaFindEventForm();
	afe.GoToAfisha();
	logger.step(2);
	afe.AfishaSearch("Three days grace");
	}
}
