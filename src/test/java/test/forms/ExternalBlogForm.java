package test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;
import webdriver.elements.TextBox;

public class ExternalBlogForm extends BaseForm{

	private static By formlocator = By.id("site-description");
	/**
	 * Локаторы для теста BlogFindAndGoTo
	 */
	private Label lbBlogAppear = new Label(By.id("site-description"), "blog appear label");
	private TextBox txSearchField = new TextBox(By.id("s"),"search field");
	private Button btFind = new Button(By.id("searchsubmit"), "find button");
	private Label lbTextFound = new Label(By.xpath("//h1[@class='page-title']"), "select blog label");
	
	/**
	 * Метод для теста BlogFindAndGoTo
	 */
	public void AssertExternalBlog() {
	doAssert(lbBlogAppear.isPresent(), "Blog is downloaded", "Blog isn't downloaded");	
	}
		
	public void SearchInBlog(String SearchText) {
		txSearchField.type(SearchText);
		btFind.click();
		doAssert(lbTextFound.isPresent(), "Search success", "Search fail");
	}
		
	public ExternalBlogForm() {
		super(formlocator, "My form");
		}	
}
