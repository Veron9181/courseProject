package demo.test.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.*;

public class JobAdvancedSearchForm extends BaseForm{

	private static By formlocator = By.xpath("//img[@id='pageLogo']");
	
	private LinkText ltClickJobs = new LinkText(By.xpath("//a[@title='Работа']"),"jobs link");
	private Label lbJobsPage = new Label(By.xpath("//img[@title='Работа TUT']"),"label page download");	
	private LinkText ltAdvancedSearch = new LinkText(By.className("searchbox-advancedlink"), "advanced search link");
	private Label lbAdvancedSearch = new Label(By.id("advancedsearchmainfield"),"advanced search page label");	
	private TextBox txSearchField = new TextBox(By.id("advancedsearchmainfield"),"search field");
	private LinkText ltSpecialization = new LinkText(By.name("specialization"), "specialization libk");
	private CheckBox chSelectSpec = new CheckBox(By.xpath("//input[@value='1']"), "specialization checkbox");
	private Button btEnter = new Button(By.xpath("//input[@value='Выбрать']"), "enter button");
	private RadioButton rbExperience = new RadioButton(By.xpath("//input[@value='noExperience']"), "experience radio button");
	private CheckBox chEmployment = new CheckBox(By.xpath("//input[@value='full']"), "employment checkbox");
	private CheckBox chSchedule = new CheckBox(By.xpath("//input[@value='fullDay']"), "schedule checkbox");
	private Button btFind = new Button(By.id("submit-bottom"), "find button");
	private Label lbSearchComlete = new Label(By.className("resumesearch__reset"),"label advanced search complete");	
	
	
	public void GoToJobs() {
		ltClickJobs.click();
		doAssert(lbJobsPage.isPresent(), "Jobs page is present]", "Jobs page is absent");
	}
	
	public void AdvancedSearch() {
		ltAdvancedSearch.click();
		doAssert(lbAdvancedSearch.isPresent(), "advanced search page is present", "advanced search page is absent");
		}
	
	public void CompleteAndFindForm(String SearchText) {
		txSearchField.type(SearchText);
		ltSpecialization.click();
		chSelectSpec.click();
		btEnter.click();
		rbExperience.click();
		chEmployment.click();
		chSchedule.click();
		btFind.click();
		doAssert(lbSearchComlete.isPresent(), "Search success", "Search fail");
		}
	
	public JobAdvancedSearchForm() {
		super(formlocator, "My form");
	}
}
