package demo.test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.*;

public class FindRoadRulesForm extends BaseForm{

	private static By formlocator = By.xpath("//img[@id='pageLogo']");
	
	private LinkText ltAuto = new LinkText(By.xpath("//a[@title='Авто']"), "blog link");
	private LinkText ltRoadRules = new LinkText(By.xpath("//a[@href='http://auto.tut.by/pdd_rules/']"), "road rules");
	private LinkText ltChaper = new LinkText(By.name("p7"), "chapter button");
	private Label lbFoundChapter = new Label(By.id("tooltip7"), "chapter label");
			
	public void FindRoadRules() {
		ltAuto.click();
		ltRoadRules.click();
		ltChaper.click();
		doAssert(lbFoundChapter.isPresent(), "Chapter found", "Chapter isn't found");
	}
			
	public FindRoadRulesForm() {
		super(formlocator, "My form");
	}
}
