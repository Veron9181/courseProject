package test.classes;
import test.forms.*;

public class CatalogAddCommentClass extends MainPageForm{

	public void CatalogAddComment() {
		
		logger.step(1);
		MainPageForm login = new MainPageForm();
		login.Login("courseProject", "q1w2e3r4t5y6");
		logger.step(2);
		MainPageForm goToCatalog = new MainPageForm();
		goToCatalog.GoToCatalog();
		logger.step(3);
		CatalogForm catalog = new CatalogForm();
		catalog.AssertCatalog();
		logger.step(4);
		catalog.SearchCarwash("Олекскар");
		logger.step(5);
		catalog.WriteComment("Хорошая автомойка! Советую.");
		logger.step(6);
		login.LoginQuit();
		}
}
