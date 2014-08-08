package test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;
import webdriver.elements.LinkText;
import webdriver.elements.TextBox;

public class MusicForm extends BaseForm{
	
	private static By formlocator = By.xpath("//a[contains(text(),'новости шоубизнеса')]");
	/**
	 * Локаторы для теста MusicFindGroup
	 */
	private Label lbMusicPage = new Label(By.id("my_playlists"),"label music page");	
	private LinkText ltMusicSearch = new LinkText(By.id("search"), "Music search link");
	private TextBox txGroupName = new TextBox(By.id("searchfield"),"find group text box");
	private Button btFind = new Button(By.id("searchbutton"), "find button");
	private LinkText ltcickGroup = new LinkText(By.xpath("//a[@title='ДДТ']"),"click group link");
	private Label lbCatalog = new Label(By.partialLinkText("Рожденный в СССР..."),"label group");	
	
	/**
	 * Метод для теста MusicFindGroup
	 */
	public void AssertMusic() {
		doAssert(lbMusicPage.isPresent(),"Page downloaded", "Fail downloading the page");
	}
	public void FindGroup(String SearchText) {
		ltMusicSearch.click();
		txGroupName.type(SearchText);
		btFind.click();
		ltcickGroup.click();
		doAssert(lbCatalog.isPresent(), "Group page is downloaded", "Group page isn't downloaded");
	}
		
	public MusicForm() {
		super(formlocator, "Music form");
	}
}
