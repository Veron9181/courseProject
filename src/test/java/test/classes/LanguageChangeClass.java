package test.classes;
import test.forms.*;

public class LanguageChangeClass extends MainPageForm{

	public void LanguageChange() {

		logger.step(1);
		MainPageForm language = new MainPageForm();
		language.Changelanguage();
		logger.step(1);
		language.SearchText("інфармацыйныя тэхналогіі");
	}
}
