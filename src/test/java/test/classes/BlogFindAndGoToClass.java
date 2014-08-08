package test.classes;
import test.forms.*;

public class BlogFindAndGoToClass extends MainPageForm{

	public void BlogFindAndGoTo(){

		logger.step(1);
		MainPageForm goToBlog = new MainPageForm();
		goToBlog.clickAllResources();
		logger.step(2);
		goToBlog.GoToBlog();
		logger.step(3);
		BlogsForm blog = new BlogsForm();
		blog.OpenBlog();
		logger.step(4);
		ExternalBlogForm externalBlog = new ExternalBlogForm();
		externalBlog.AssertExternalBlog();
		logger.step(5);
		externalBlog.SearchInBlog("Творчество");
	}
}
