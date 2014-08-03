package demo.test.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;
import webdriver.elements.TextBox;

public class LoginForm extends BaseForm{
	
private static By formlocator = By.xpath("//img[@id='pageLogo']");

private Button buttonEnter1 = new Button(By.xpath("//a[@class='enter']"),"enter button");
private Button buttonEnter2 = new Button(By.xpath("//input[@class='button']"),"enter button 2");
private TextBox txuserName = new TextBox(By.name("login"),"user name");
private TextBox txpassword = new TextBox(By.name("password"),"password");
private Button buttonClose = new Button(By.xpath("//button[@type='button']"),"close button");
private Label lbLoginAssert = new Label(By.id("geotarget_top_selector"),"login assert");
private Button btQuit = new Button(By.xpath("//a[@class='gray-link exit']"),"Quit button");


public void Login(String username, String password) {
	buttonEnter1.click();
	txuserName.type(username);
	txpassword.type(password);
	buttonEnter2.click();
	buttonClose.click();
}

public void LoginAssert(){
	assert(lbLoginAssert.isPresent());
	}

public void LoginQuit () {
	btQuit.click();
	}

public LoginForm() {
	super(formlocator, "My form");
}

}
