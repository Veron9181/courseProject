package demo.test.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.*;

public class BlogFindAndGoToForm extends BaseForm{

	private static By formlocator = By.xpath("//img[@id='pageLogo']");
	
	private LinkText ltAllResources = new LinkText(By.xpath("//a[@href='http://www.tut.by/resource/']"), "all resources link");
	private Label lbAllResourcesTable = new Label(By.xpath("//ul[@class='b-topbar-more']"), "all resources table");
	private LinkText ltBlogs = new LinkText(By.xpath("//a[@title='Блоги']"), "blog link");
	private LinkText ltCataloOfBlogs = new LinkText(By.xpath("//a[@title='Каталог блогов']"), "catalog of blogs link");
	private Label lbSelectBlog = new Label(By.partialLinkText("Школа и творчество"), "select blog label");
	private Label lbBlogAppear = new Label(By.id("site-description"), "blog appear label");
	private TextBox txSearchField = new TextBox(By.id("s"),"search field");
	private Button btFind = new Button(By.id("searchsubmit"), "find button");
	private Label lbTextFound = new Label(By.xpath("//h1[@class='page-title']"), "select blog label");
	
		
	public void clickAllResources() {
		ltAllResources.click();
		doAssert(lbAllResourcesTable.isPresent(),"Field 'All Resources' appeared" ,"Field 'All Resources' didn't appear");
	}
	
	public void GoToBlog() {
		ltBlogs.click();
		ltCataloOfBlogs.click();
		lbSelectBlog.click();
		doAssert(lbBlogAppear.isPresent(), "Blog is downloaded", "Blog isn't downloaded");
	}
	
	public void SearchInBlog() {
		txSearchField.type("Творчество");
		btFind.click();
		doAssert(lbTextFound.isPresent(), "Search success", "Search fail");
	}
	
	
	public BlogFindAndGoToForm() {
		super(formlocator, "My form");
		}
}
