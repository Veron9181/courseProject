package test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Label;
import webdriver.elements.LinkText;

public class AutoForm extends BaseForm{

	private static By formlocator = By.xpath("//a[contains(text(),'АВТО')]");
	/**
	 * Локаторы для теста FindRoadRules
	 */
	private LinkText ltRoadRules = new LinkText(By.xpath("//a[@href='http://auto.tut.by/pdd_rules/']"), "road rules");
	private LinkText ltChaper = new LinkText(By.name("p7"), "chapter button");
	private Label lbFoundChapter = new Label(By.id("tooltip7"), "chapter label");
	
	/**
	 * Метод для теста FindRoadRules
	 */
	
	public void FindRoadRules() {
		ltRoadRules.click();
		ltChaper.click();
		doAssert(lbFoundChapter.isPresent(), "Chapter found", "Chapter isn't found");
	}
	
	public AutoForm() {
		super(formlocator, "My form");
		}
}
