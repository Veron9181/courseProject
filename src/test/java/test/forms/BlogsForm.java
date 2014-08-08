package test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.LinkText;

public class BlogsForm extends BaseForm{

	private static By formlocator = By.id("logo_block");
	/**
	 * Локаторы для теста BlogFindAndGoTo
	 */
	private LinkText ltCataloOfBlogs = new LinkText(By.xpath("//a[@title='Каталог блогов']"), "catalog of blogs link");
	private LinkText lbSelectBlog = new LinkText(By.partialLinkText("Школа и творчество"), "select blog label");
	
	/**
	 * Метод для теста BlogFindAndGoTo
	 */
	public void OpenBlog() {
		ltCataloOfBlogs.click();
		lbSelectBlog.click();
		}
		
	public BlogsForm() {
		super(formlocator, "Blogs form");
		}
}
