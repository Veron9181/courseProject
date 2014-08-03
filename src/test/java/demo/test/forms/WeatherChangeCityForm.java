package demo.test.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;

public class WeatherChangeCityForm extends BaseForm{

	private static By formlocator = By.xpath("//img[@id='pageLogo']");
	
	private Button btWeather = new Button(By.xpath("//a[@title='Погода']"),"go to weather");
	private Label lbWatherAssert = new Label(By.xpath("//a[@class='dotted']"),"weather download");
	private Button btSelectCity = new Button(By.xpath("//a[@class='dotted']"),"click button to change");
	private Button btChangeWeather = new Button(By.xpath("//a[@href='?wtgt=26863']"),"choose the city");
	private Label lbChageAssert = new Label(By.xpath("//a[@data-weathercode='26863']"),"weather changed");
		
	public void WeatherPage() {
		btWeather.click();
		assert(lbWatherAssert.isPresent());
			}
	
	public void ChangeCity() {
		btSelectCity.click();
		btChangeWeather.click();
		assert(lbChageAssert.isPresent());
			}
		
	public WeatherChangeCityForm() {
		super(formlocator, "My form");
		}	
	}