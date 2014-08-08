package test;

import test.forms.BlogsForm;
import test.forms.ExternalBlogForm;
import test.forms.MainPageForm;
import webdriver.BaseTest;

public class BlogFindAndGoToTest extends BaseTest {
	
public void runTest() {
	
	logger.step(1);
	browser.navigate("http://www.tut.by/");
	logger.step(2);
	MainPageForm goToBlog = new MainPageForm();
	goToBlog.clickAllResources();
	logger.step(3);
	goToBlog.GoToBlogs();
	logger.step(4);
	BlogsForm blog = new BlogsForm();
	blog.OpenBlog();
	logger.step(5);
	ExternalBlogForm externalBlog = new ExternalBlogForm();
	externalBlog.AssertExternalBlog();
	logger.step(6);
	externalBlog.SearchInBlog("Творчество");			
	}

}
