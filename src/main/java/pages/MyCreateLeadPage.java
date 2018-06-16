package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyCreateLeadPage extends ProjectMethods{
	
	public MyCreateLeadPage() {		
		PageFactory.initElements(driver,this);

	}	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	
	private WebElement eleCompName;
	@And("enter the companyname as (.*)")
	public MyCreateLeadPage enterCompName(String data) {
		type(eleCompName, data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
 
	private WebElement elefName;
	@And ("enter the firstname as(.*)")
	public MyCreateLeadPage enterFirstName(String data) {
		type(elefName, data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	
	private WebElement elelName;
	@And ("enter the lastname as(.*)")
	public MyCreateLeadPage enterLastName(String data) {
		type(elelName, data);
		return this;
	}

	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneNumber")
	
	private WebElement elelNumber;
	public MyCreateLeadPage enterPhoneNo(String number) {
		type(elelNumber, number);
		return this;
	}
	
	@FindBy(how=How.NAME,using="submitButton")

	private WebElement eleviewLead;
	@And("verify CreateLead")
	public ViewLeadsPage clickCreateLeads() {
		click(eleviewLead);
		return new ViewLeadsPage();	
	}
	
}
