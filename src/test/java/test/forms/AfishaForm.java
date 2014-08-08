package test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;
import webdriver.elements.TextBox;

public class AfishaForm extends BaseForm{

	private static By formlocator = By.xpath("//span[contains(text(),'АФИША')]");	
	/**
	 * Локаторы для теста AfishaFindEvent
	 */
	private Label lbAfisha = new Label(By.xpath("//span[@class='name-resource']"),"afisha page label");	
	private TextBox SearchBox = new TextBox(By.xpath("//input[@name='str']"),"search box afisha");
	private Button btnAfishaFind = new Button(By.xpath("//input[@class='button big']"),"afisha search button");
	private Label lbAfishaFoundGroup = new Label(By.xpath("//h1[@class='title']"),"search label");
	
	/**
	 * Методы для теста AfishaFindEvent
	 */
	public void AssertAfisha () {
		doAssert(lbAfisha.isPresent(), "Afisha page is downloaded", "Error downloading afisha page");
		}
	
	public void AfishaSearch(String text) {
		SearchBox.type(text);
		btnAfishaFind.click();
		doAssert(lbAfishaFoundGroup.isPresent(), "Search success", "Search fail");
		}
		
	public AfishaForm() {
		super(formlocator, "Afisha form");
		}
}