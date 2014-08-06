package demo.test.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.*;

public class AfishaFindEventForm extends BaseForm{
	
	private static By formlocator = By.xpath("//img[@id='pageLogo']");
	
	private LinkText ltnAfisha = new LinkText(By.xpath("//a[@title='Афиша']"),"afisha link");
	private Label lbAfisha = new Label(By.xpath("//span[@class='name-resource']"),"afisha page label");	
	private TextBox SearchBox = new TextBox(By.xpath("//input[@name='str']"),"search box afisha");
	private Button btnAfishaFind = new Button(By.xpath("//input[@class='button big']"),"afisha search button");
	private Label lbAfishaFoundGroup = new Label(By.xpath("//h1[@class='title']"),"search label");
	
	public void GoToAfisha () {
		ltnAfisha.click();
		doAssert(lbAfisha.isPresent(), "Afisha page is downloaded", "Error downloading afisha page");
		}
	
	public void AfishaSearch(String text) {
		SearchBox.type(text);
		btnAfishaFind.click();
		doAssert(lbAfishaFoundGroup.isPresent(), "Search success", "Search fail");
		}
	
	public AfishaFindEventForm() {
		super(formlocator, "My form");
		}	
	}

