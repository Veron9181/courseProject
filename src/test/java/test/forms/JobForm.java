package test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.CheckBox;
import webdriver.elements.Label;
import webdriver.elements.LinkText;
import webdriver.elements.SelectBox;
import webdriver.elements.TextBox;

public class JobForm extends BaseForm{
	
	private static By formlocator = By.xpath("//h2[contains(text(), 'Вакансии дня')]");
	/**
	 * Локаторы для теста JobsFindAndSort
	 */
	private Label lbJobsPage = new Label(By.xpath("//img[@title='Работа TUT']"),"label page download");	
	private TextBox txFindJob = new TextBox(By.id("main-search-applicant"),"find job  text box");
	private SelectBox sbProfSphere = new SelectBox(By.name("specialization"),"Professional sphere select box");
	private CheckBox chPrograming = new CheckBox(By.xpath("//input[@value='1.221']"),"Programing check box");
	private TextBox txSalary = new TextBox(By.name("salary"), "salary text box");
	private Button btFindJob = new Button(By.xpath("//input[@value='Найти']"),"Find job button");
	private Label lbSearchResult = new Label(By.partialLinkText("Изменить запрос"));	
	/**
	 * Локатор для теста JobAdvancedSearch
	 */
	private LinkText ltAdvancedSearch = new LinkText(By.className("searchbox-advancedlink"), "advanced search link");
			
	/**
	 * Методы для теста JobsFindAndSort
	 */
	public void AssertJobs() {
		doAssert(lbJobsPage.isPresent(), "Jobs Page is downloaded", "Jobs Page isn't downloaded");
	}
	
	public void FindJob(String job, String SelectText, String number) {
		txFindJob.type(job);
		sbProfSphere.select(SelectText);
		chPrograming.click();
		txSalary.type(number);
		btFindJob.click();
		doAssert(lbSearchResult.isPresent(), "Search success", "Search fail");
	}
	/**
	 * Метод для теста JobAdvancedSearch
	 */
	public void GoToAdvancedSearch() {
		ltAdvancedSearch.click();
		}
		
	public JobForm() {
		super(formlocator, "My form");
	}
}
