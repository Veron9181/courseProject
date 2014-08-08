package test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Label;
import webdriver.elements.LinkText;

public class WeatherForm extends BaseForm{

	private static By formlocator = By.xpath("//a[contains(text(), 'ПОГОДА')]");
	/**
	 * Локаторы для теста WeatherChangeCity
	 */
	private Label lbWatherAssert = new Label(By.xpath("//a[@class='dotted']"),"weather download label");
	private LinkText ltSelectCity = new LinkText(By.xpath("//a[@class='dotted']"),"click button to change");
	private LinkText ltChangeWeather = new LinkText(By.xpath("//a[@href='?wtgt=26863']"),"choose the city");
	private Label lbChangeAssert = new Label(By.xpath("//a[@data-weathercode='26863']"),"weather changed");
	
	/**
	 * Методы для теста WeatherChangeCity
	 */
	public void WeatherPageAssert() {
		doAssert(lbWatherAssert.isPresent(), "Weather page is downloaded", "Weather page isn't downloaded");
		}

	public void ChangeCity() {
		ltSelectCity.click();
		ltChangeWeather.click();
		doAssert(lbChangeAssert.isPresent(), "City changed successfuly", "City isn't changed");
		}
	
	public WeatherForm() {
		super(formlocator, "Weather form");
		}	
	}
