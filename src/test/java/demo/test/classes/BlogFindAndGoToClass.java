package demo.test.classes;
import demo.test.forms.*;

public class BlogFindAndGoToClass extends BlogFindAndGoToForm{

	public void BlogFindAndGoTo(){

		logger.step(1);
		BlogFindAndGoToForm bfa = new BlogFindAndGoToForm();
		bfa.clickAllResources();
		logger.step(2);
		bfa.GoToBlog();
		logger.step(3);
		bfa.SearchInBlog("Творчество");
	}
}
