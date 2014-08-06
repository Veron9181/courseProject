package demo.test.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.*;

public class MusicFindGroupForm extends BaseForm{
	
	private static By formlocator = By.xpath("//img[@id='pageLogo']");
	
	private LinkText ltClickMusic = new LinkText(By.xpath("//a[@title='Музыка']"),"muusic page link");
	private Label lbMusicPage = new Label(By.id("my_playlists"),"label music page");	
	private LinkText ltMusicSearch = new LinkText(By.id("search"), "Music search link");
	private TextBox txGroupName = new TextBox(By.id("searchfield"),"find group text box");
	private Button btFind = new Button(By.id("searchbutton"), "find button");
	private LinkText ltcickGroup = new LinkText(By.xpath("//a[@title='ДДТ']"),"click group link");
	private Label lbCatalog = new Label(By.partialLinkText("Рожденный в СССР..."),"label group");	

	public void GoToMusic() {
		ltClickMusic.click();
		doAssert(lbMusicPage.isPresent(),"Page downloaded", "Fail downloading the page");
	}
	
	public void FindGroup() {
		ltMusicSearch.click();
		txGroupName.type("ДДТ");
		btFind.click();
		ltcickGroup.click();
		doAssert(lbCatalog.isPresent(), "Group page is downloaded", "Group page isn't downloaded");
	}
	
	public MusicFindGroupForm() {
		super(formlocator, "My form");
	}
}
