package demo.test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.*;

public class JobFindAndSortForm extends BaseForm{
	
	private static By formlocator = By.xpath("//img[@id='pageLogo']");
	
	private Button btClickJobs = new Button(By.xpath("//a[@title='Работа']"),"Go to jobs");
	private Label lbJobsPage = new Label(By.xpath("//img[@title='Работа TUT']"),"label page download");	
	private TextBox txFindJob = new TextBox(By.id("main-search-applicant"),"find job  text box");
	private SelectBox sbProfSphere = new SelectBox(By.name("specialization"),"Professional sphere select box");
	private CheckBox chPrograming = new CheckBox(By.xpath("//input[@value='1.221']"),"Programing check box");
	
	private TextBox txSalary = new TextBox(By.name("salary"), "salary text box");
	private Button btFindJob = new Button(By.xpath("//input[@value='Найти']"),"Find job button");
	private Label lbSearchResult = new Label(By.xpath("//a[@href='http://jobs.tut.by/vacancy/11106092?query=junior%20developer']"),"label search result");	
	
	//дописать для селекта
	
	public void GoToJobs() {
		btClickJobs.click();
		assert(lbJobsPage.isPresent());
	}
	
	public void FindJob() {
		txFindJob.type("Junior developer");
		sbProfSphere.select("Информационные технологии, интернет, телеком");
		chPrograming.click();
		txSalary.type("1000000");
		btFindJob.click();
		assert(lbSearchResult.isPresent());
	}
	
		public JobFindAndSortForm() {
		super(formlocator, "My form");
	}
}
