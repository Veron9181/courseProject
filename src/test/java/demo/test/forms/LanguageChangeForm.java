package demo.test.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.*;

public class LanguageChangeForm extends BaseForm{
	
	private static By formlocator = By.xpath("//img[@id='pageLogo']");
	
	private LinkText ltSwitchToBelarus = new LinkText(By.id("lCSwitch_bel"), "language link");
	private Label lbLanguageChanged = new Label(By.id("lCSwitch_rus"), "language changed label");
	private TextBox txSearchField = new TextBox(By.id("search_from_str"),"search field");
	private Button btFind = new Button(By.xpath("//input[@value='Знайсцi']"), "find button");
	private Label lbSearchComplete = new Label(By.id("extended_search"), "search complete button");
			
	public void Changelanguage() {
		ltSwitchToBelarus.click();
		assert(lbLanguageChanged.isPresent());	
	}
	
	public void SearchText(String SearchText) {
		txSearchField.type(SearchText);
		btFind.click();
		assert(lbSearchComplete.isPresent());
	}
		
	public LanguageChangeForm() {
		super(formlocator, "My form");
	}	

}
