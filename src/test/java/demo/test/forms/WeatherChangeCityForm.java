package demo.test.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.*;

public class WeatherChangeCityForm extends BaseForm{

	private static By formlocator = By.xpath("//img[@id='pageLogo']");
	
	private LinkText ltWeather = new LinkText(By.xpath("//a[@title='Погода']"),"eather page link");
	private Label lbWatherAssert = new Label(By.xpath("//a[@class='dotted']"),"weather download label");
	private LinkText ltSelectCity = new LinkText(By.xpath("//a[@class='dotted']"),"click button to change");
	private LinkText ltChangeWeather = new LinkText(By.xpath("//a[@href='?wtgt=26863']"),"choose the city");
	private Label lbChageAssert = new Label(By.xpath("//a[@data-weathercode='26863']"),"weather changed");
		
	public void WeatherPage() {
		ltWeather.click();
		doAssert(lbWatherAssert.isPresent(), "Weather page is downloaded", "Weather page isn't downloaded");
			}
	
	public void ChangeCity() {
		ltSelectCity.click();
		ltChangeWeather.click();
		doAssert(lbChageAssert.isPresent(), "City changed successfuly", "City isn't changed");
			}
		
	public WeatherChangeCityForm() {
		super(formlocator, "My form");
		}	
	}