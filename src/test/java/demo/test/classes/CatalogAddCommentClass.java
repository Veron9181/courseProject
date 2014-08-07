package demo.test.classes;
import demo.test.forms.*;

public class CatalogAddCommentClass extends CatalogAddCommentForm{

	public void CatalogAddComment() {
		
		
		logger.step(1);
		LoginForm lgf = new LoginForm();
		lgf.Login("courseProject", "q1w2e3r4t5y6");
		logger.step(2);
		CatalogAddCommentForm cac = new CatalogAddCommentForm();
		cac.GoToCatalog();
		logger.step(3);
		cac.SearchCarwash("Олекскар");
		logger.step(4);
		cac.WriteComment("Хорошая автомойка! Советую.");
		logger.step(5);
		lgf.LoginQuit();
		
		
		
	}
}
