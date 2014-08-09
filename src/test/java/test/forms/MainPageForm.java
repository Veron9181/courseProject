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
	 * Navigate
	 */
	private LinkText ltAfisha = new LinkText(By.xpath("//a[@title='Афиша']"),"afisha link");
	private LinkText ltWeather = new LinkText(By.xpath("//a[@title='Погода']"),"Weather page link");
	private LinkText ltCatalog = new LinkText(By.xpath("//a[@title='Каталог']"),"catalog link");
	private LinkText ltMusic = new LinkText(By.xpath("//a[@title='Музыка']"),"muusic page link");
	private Button btJobs = new Button(By.xpath("//a[@title='Работа']"),"Go to jobs");
	private LinkText ltBlogs = new LinkText(By.xpath("//a[@title='Блоги']"), "blog link");
	private LinkText ltAuto = new LinkText(By.xpath("//a[@title='Авто']"), "blog link");
	/**
	 * Локаторы для тестов BlogFindAndGoTo & FindRoadRules
	 */
	private LinkText ltAllResources = new LinkText(By.xpath("//a[@href='http://www.tut.by/resource/']"), "all resources link");
	private Label lbAllResourcesTable = new Label(By.xpath("//ul[@class='b-topbar-more']"), "all resources table");
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
	
		public void Login(String userName, String passWord) {
		btEnter1.click();
		txuserName.type(userName);
		txpassword.type(passWord);
		btEnter2.click();
		if (btLoginClose.isPresent()) btLoginClose.click();
		doAssert(lbLoginAssert.isPresent(), "Login success", "Login fail");
		}
	
	public void LoginQuit () {
		btLogout.click();
		doAssert(btEnter1.isPresent(), "Logout success", "Logout fail");
		}
	
	/**
	 * Метод для тестов BlogFindAndGoTo & FindRoadRules
	 */
	public void clickAllResources() {
		ltAllResources.click();
		doAssert(lbAllResourcesTable.isPresent(),"Field 'All Resources' appeared" ,"Field 'All Resources' didn't appear");
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
		
	/**
	 * Navigate
	 */
	public void GoToAfisha() {
		ltAfisha.click();
	}
	public void GoToWeather() {
		ltWeather.click();
	}
	public void GoToCatalog() {
		ltCatalog.click();
	}
	public void GoToMusic() {
		ltMusic.click();
	}
	public void GoToJobs() {
		btJobs.click();
	}
	public void GoToBlogs() {
		ltBlogs.click();
	}
	public void GoToAuto() {
		ltAuto.click();
	}
	
	
	
	
	public MainPageForm() {
		super(formlocator, "Main form");
		}	
}