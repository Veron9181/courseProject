package test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;
import webdriver.elements.LinkText;
import webdriver.elements.TextBox;

public class CatalogForm extends BaseForm{

	private static By formlocator = By.xpath("//span[contains(text(), 'КАТАЛОГ')]");
	/**
	 * Локаторы для теста CatalogAddComment
	 */
	private Label lbCatalog = new Label(By.xpath("//a[@href='http://catalog.tut.by/']"),"catalog label");	
	private TextBox SearchBox = new TextBox(By.name("str"),"search box catalog");
	private Button btFind = new Button(By.xpath("//input[@value='Найти']"),"Find button");
	private LinkText ltGoToCarwash = new LinkText(By.xpath("//a[contains(text(),'Олекскар')]"),"Go to carwash link");
	private TextBox txPositiveComment = new TextBox(By.name("f[comment_positive]"),"comment positive box");
	private TextBox txNegativeComment = new TextBox(By.name("f[comment_negative]"),"comment negative box");
	private Button btAddComment = new Button(By.xpath("//a[contains(text(),'Добавить отзыв')]"),"add comment button");
	private Label lbCommentAdded = new Label(By.xpath("//div[@class='b-success']"),"comment added label");
	/**
	 * Методы для теста CatalogAddComment
	 */
	public void AssertCatalog() {
		doAssert(lbCatalog.isPresent(), "Field catalog is present", "Field catalog isn't present");
		}
	
	public void SearchCarwash(String text) { 
		SearchBox.type(text);
		btFind.click();
		doAssert(ltGoToCarwash.isPresent(), "Search succes", "Search fail");
	}
	
	public void WriteComment(String positive, String negative) {
		ltGoToCarwash.click();
		txPositiveComment.type(positive);
		txNegativeComment.type(negative);;
		btAddComment.click();
		doAssert(lbCommentAdded.isPresent(), "Comment added", "Comment isn't added");
	}
	
	public CatalogForm() {
		super(formlocator, "Catalog form");
	}
}
