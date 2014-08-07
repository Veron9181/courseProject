package demo.test.classes;
import demo.test.forms.*;

public class LanguageChangeClass extends LanguageChangeForm{

	public void LanguageChange() {

		logger.step(1);
		LanguageChangeForm lcf = new LanguageChangeForm();
		lcf.Changelanguage();
		logger.step(2);
		lcf.SearchText("інфармацыйныя тэхналогіі");
	}
	
}
