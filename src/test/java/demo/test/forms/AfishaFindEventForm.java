package demo.test.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;
import webdriver.elements.TextBox;

public class AfishaFindEventForm extends BaseForm{
	
	private static By formlocator = By.xpath("//img[@id='pageLogo']");
	
	private Button btnAfisha = new Button(By.xpath("//a[@title='Афиша']"),"afisha button");
	private Label lbAfisha = new Label(By.xpath("//span[@class='name-resource']"),"afisha");	
	private TextBox SearchBox = new TextBox(By.xpath("//input[@name='str']"),"search afisha");
	private Button btnAfishaFind = new Button(By.xpath("//input[@class='button big']"),"afisha search button");
	private Label lbAfishaFoundGroup = new Label(By.xpath("//h1[@class='title']"),"find group label");
	
	public void GoToAfisha () {
		btnAfisha.click();
		assert(lbAfisha.isPresent());
		}
	
	public void AfishaSearch(String text) {
		SearchBox.type(text);
		btnAfishaFind.click();
		}
	
	public void AssertFindGroup() {
		assert(lbAfishaFoundGroup.isPresent());
		}

	public AfishaFindEventForm() {
		super(formlocator, "My form");
		}	
	}

