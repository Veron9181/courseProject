package test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;
import webdriver.elements.LinkText;
import webdriver.elements.TextBox;

public class MainPageForm extends BaseForm{
	
	private static By formlocator = By.xpath("//img[@id='pageLogo']");
	/**
	 * Локаторы для теста Login
	 */
	private Button btEnter1 = new Button(By.xpath("//a[@class='enter']"),"enter button");
	private Button btEnter2 = new Button(By.xpath("//input[@class='button']"),"enter button 2");
	private TextBox txuserName = new TextBox(By.name("login"),"user name");
	private TextBox txpassword = new TextBox(By.name("password"),"password");
	private Button btLoginClose = new Button(By.xpath("//button[@type='button']"),"close button");
	private Label lbLoginAssert = new Label(By.id("geotarget_top_selector"),"login assert");
	private Button btLogout = new Button(By.xpath("//a[@class='gray-link exit']"),"logout button");
	/**
	 * Локаторы для теста AfishaFindEvent
	 */
	private LinkText ltAfisha = new LinkText(By.xpath("//a[@title='Афиша']"),"afisha link");
	/**
	 * Локаторы для теста WeatherChangeCity
	 */
	private LinkText ltWeather = new LinkText(By.xpath("//a[@title='Погода']"),"eather page link");
	/**
	 * Локаторы для теста CatalogAddComment
	 */
	private LinkText ltCatalog = new LinkText(By.xpath("//a[@title='Каталог']"),"catalog link");
	/**
	 * Локаторы для теста MusicFindGroup
	 */
	private LinkText ltMusic = new LinkText(By.xpath("//a[@title='Музыка']"),"muusic page link");
	/**
	 * Локаторы для теста JobsFindAndSort
	 */
	private Button btJobs = new Button(By.xpath("//a[@title='Работа']"),"Go to jobs");
	/**
	 * Локаторы для тестов BlogFindAndGoTo & FindRoadRules
	 */
	private LinkText ltAllResources = new LinkText(By.xpath("//a[@href='http://www.tut.by/resource/']"), "all resources link");
	private Label lbAllResourcesTable = new Label(By.xpath("//ul[@class='b-topbar-more']"), "all resources table");
	/**
	 * Локаторы для теста BlogFindAndGoTo
	 */
	private LinkText ltBlogs = new LinkText(By.xpath("//a[@title='Блоги']"), "blog link");
	/**
	 * Локаторы для теста FindRoadRules
	 */
	private LinkText ltAuto = new LinkText(By.xpath("//a[@title='Авто']"), "blog link");
	/**
	 * Локаторы для теста LanguageChange
	 */
	private LinkText ltSwitchToBelarus = new LinkText(By.id("lCSwitch_bel"), "language link");
	private Label lbLanguageChanged = new Label(By.id("lCSwitch_rus"), "language changed label");
	private TextBox txSearchField = new TextBox(By.id("search_from_str"),"search field");
	private Button btFind = new Button(By.xpath("//input[@value='Знайсцi']"), "find button");
	private Label lbSearchComplete = new Label(By.id("extended_search"), "search complete button");
	
	
	
	/**
	 * Методы для теста Login
	 */
	public void Login(String username, String password) {
		btEnter1.click();
		txuserName.type(username);
		txpassword.type(password);
		btEnter2.click();
		btLoginClose.click();
		doAssert(lbLoginAssert.isPresent(), "Login success", "Login fail");
		}
	
	public void LoginQuit () {
		btLogout.click();
		doAssert(btEnter1.isPresent(), "Logout success", "Logout fail");
		}

	/**
	 * Метод для теста AfishaFindEvent
	 */
	public void GoToAfisha () {
		ltAfisha.click();
		}
	/**
	 * Метод для теста WeatherChangeCity
	 */
	public void GoToWeather() {
		ltWeather.click();
		}	
	/**
	 * Метод для теста CatalogAddComment
	 */
	public void GoToCatalog() {
		ltCatalog.click();
		}
	/**
	 * Метод для теста MusicFindGroup
	 */
	public void GoToMusic() {
		ltMusic.click();
		}
	/**
	 * Метод для теста JobsFindAndSort
	 */
	public void GoToJobs() {
		btJobs.click();
		}
	/**
	 * Метод для тестов BlogFindAndGoTo & FindRoadRules
	 */
	public void clickAllResources() {
		ltAllResources.click();
		doAssert(lbAllResourcesTable.isPresent(),"Field 'All Resources' appeared" ,"Field 'All Resources' didn't appear");
		}
	/**
	 * Метод для теста BlogFindAndGoTo
	 */
	public void GoToBlog() {
		ltBlogs.click();
		}
	/**
	 * Метод для теста FindRoadRules
	 */
	public void GoToAuto() {
	ltAuto.click();
	}
	/**
	 * Метод для теста LanguageChange
	 */
	public void Changelanguage() {
		ltSwitchToBelarus.click();
		doAssert(lbLanguageChanged.isPresent(), "Language is changed", "Language isn't changed");	
	}
	
	public void SearchText(String SearchText) {
		txSearchField.type(SearchText);
		btFind.click();
		doAssert(lbSearchComplete.isPresent(), "Search success", "Search fail");
	}
		
	
	public MainPageForm() {
		super(formlocator, "My form");
		}	
}