package test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.*;

public class ShopsForm extends BaseForm {

	private static By formlocator = By.xpath("//span[contains(text(),'КУПИ')]");
	/**
	 * Локаторы для теста ShopsSearch
	 */
	private LinkText ltfan = new LinkText(By.xpath("//a[contains(text(),'Вентиляторы')]"), "fan link");
	private CheckBox ltFirm = new CheckBox(By.id("1870187"), "firm checkbox");
	private TextBox ttPrice = new TextBox(By.id("2140131888"), "price textbox");
	private LinkText ltPower = new LinkText(By.xpath("//label[contains(text(),'Мощность')]"), "power link");
	private TextBox txPower = new TextBox(By.id("2142560545"), "power textbox");
	private Button ttSearch = new Button(By.xpath("//input[@value='Подобрать']"), "search button");
	private Label lbSearch = new Label(By.xpath("//a[@title='Rolsen RSF-3106RT']"), "search label");
		
	/**
	 * Метод для теста ShopsSearch
	 */
	public void CompleteFormAndSearch (String price, String power) {
		ltfan.click();
		ltFirm.check(true);
		ttPrice.type(price);
		ltPower.click();
		txPower.type(power);
		ttSearch.click();
		doAssert(lbSearch.isPresent(), "search success", "serach fail");
	}

		
	public ShopsForm() {
		super(formlocator, "Shops form");
		}

}
