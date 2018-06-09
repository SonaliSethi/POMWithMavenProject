package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyFindLeadPage extends ProjectMethods{
	
	public MyFindLeadPage() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement elefindLead;
	
	public MyFindLeadPage enterFindLead(String data) {
		type(elefindLead, data);
		return this;
			
	}
	//click on phone tab 
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Phone')]")
	private WebElement eleclickPhonetab;
	
	public MyFindLeadPage clickPhonetab() {
		click(eleclickPhonetab);
		return this;	
			
	}
	//entering the phone no
	@FindBy(how=How.NAME,using="phoneNumber")
	private WebElement elePhoneno;
	
	public MyFindLeadPage enterPhoneno(String data) {
		type(elePhoneno, data);
		return this;
			
	}
	
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Find Leads')]")
	private WebElement eleClickFindLeadButton;
	
	public MyFindLeadPage clickFindLeadButton() {
		click(eleClickFindLeadButton);
		return this;	
	}
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleGetFirstValue;
	public MyFindLeadPage getFirstValue() {
		click(eleGetFirstValue);
		return this;	
	}
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleClickValue;
	public ViewLeadsPage clickValue() {
		clickWithNoSnap(eleClickValue);
		return new ViewLeadsPage();		
	}
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleClickFirstValue;
	
	public ViewLeadsPage clickFirstValue() 
	{
		click(eleClickFirstValue);
		return new ViewLeadsPage();		
	}
	
	@FindBy(how=How.XPATH,using="//label[contains(text(),'Lead ID:')]/following::input")
	private WebElement eleEnterLeadID;
	
	public MyFindLeadPage enterLeadID(String data) {
		type(eleEnterLeadID, data);
		return this;
			
	}
	@FindBy(how=How.XPATH,using="//div[@class='x-paging-info']")
	private WebElement eleverifyRecords;
	
	public MyFindLeadPage verifyRecords(String record) {
		type(eleverifyRecords, record);
		return this;
			
	}
	
	
}
	
	