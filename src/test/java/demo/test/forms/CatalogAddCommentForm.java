package demo.test.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.*;

public class CatalogAddCommentForm extends BaseForm{

	private static By formlocator = By.xpath("//img[@id='pageLogo']");
	
	private LinkText ltCatalog = new LinkText(By.xpath("//a[@title='Каталог']"),"catalog link");
	private Label lbCatalog = new Label(By.xpath("//a[@href='http://catalog.tut.by/']"),"catalog label");	
	private TextBox SearchBox = new TextBox(By.name("str"),"search box catalog");
	private Button btFind = new Button(By.xpath("//input[@value='Найти']"),"Find button");
	private LinkText ltGoToCarwash = new LinkText(By.partialLinkText("Олекскар"),"Go to carwash link");
	private TextBox WriteComment = new TextBox(By.id("txt-comment"),"comment box");
	private Button btAddComment = new Button(By.xpath("//input[@value='Добавить отзыв']"),"add comment button");
	private Label lbCommentAdded = new Label(By.xpath("//div[@class='b-success']"),"comment added label");
	
	public void GoToCatalog() {
		ltCatalog.click();
		doAssert(lbCatalog.isPresent(), "Field catalog is present", "Field catalog isn't present");
		}
	
	public void SearchCarwash(String text) { 
		SearchBox.type(text);
		btFind.click();
	}
	
	public void WriteComment(String comment) {
		ltGoToCarwash.click();
		WriteComment.type(comment);
		btAddComment.click();
		doAssert(lbCommentAdded.isPresent(), "Comment added", "Comment isn't added");
	}
		
	public CatalogAddCommentForm() {
		super(formlocator, "My form");
	}
}
