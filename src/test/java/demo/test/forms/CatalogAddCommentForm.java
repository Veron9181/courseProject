package demo.test.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;
import webdriver.elements.TextBox;

public class CatalogAddCommentForm extends BaseForm{

	private static By formlocator = By.xpath("//img[@id='pageLogo']");
	
	private Button btnCatalog = new Button(By.xpath("//a[@title='Каталог']"),"catalog button");
	private Label lbCatalog = new Label(By.xpath("//a[@href='http://catalog.tut.by/']"),"afisha");	
	
	private TextBox SearchBox = new TextBox(By.xpath("//input[@name='str']"),"search afisha");
	
	public void GoToCatalog() {
		btnCatalog.click();
		assert(lbCatalog.isPresent());
	}
	
	
	
	
	
	
	
	
	public CatalogAddCommentForm() {
		super(formlocator, "My form");
	}
}
