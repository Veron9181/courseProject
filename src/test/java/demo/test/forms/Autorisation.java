package demo.test.forms;

import org.apache.tools.ant.taskdefs.Sleep;
import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;
import webdriver.elements.TextBox;

public class Autorisation extends BaseForm{
		
private static String formlocator="//body[@class='main-page']";

private Button buttonEnter1 = new Button(By.xpath(".//*[@id='authorize']/div/a[1]"),"enter button");
private Button buttonEnter2 = new Button(By.xpath(".//*[@id='authorize']//div[4]/input"),"enter button");
private TextBox lblogin = new TextBox(By.xpath(".//*[@id='authorize']//div[1]/input"),"login");
private TextBox lbpassword = new TextBox(By.xpath(".//*[@id='authorize']//div[2]/input"),"password");
private Label lbLogo = new Label(By.xpath("//img[@id='pageLogo']"),"tut.by logo");	
private Button buttonClose = new Button(By.xpath("//button[@type='button']"),"enter button");
private Label autorizationAssert = new Label(By.id("geotarget_top_selector"));


public void assertLogo(){
	assert(lbLogo.isPresent());
}

public void login(String username, String password) {
	buttonEnter1.click();
	lblogin.type(username);
	lbpassword.type(password);
	buttonEnter2.click();
	buttonClose.click();
}

public Autorisation() {
	super(By.xpath(formlocator), "My form");
}

public void autorizationAssert(){
	assert(autorizationAssert.isPresent());
	
}
}
