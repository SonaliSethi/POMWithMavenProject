package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadsPage extends ProjectMethods{
	
	public ViewLeadsPage() {		
		PageFactory.initElements(driver,this);

	}
	@FindBy(how=How.ID,using="viewLead_firstName_sp")	
	private WebElement eleverifyfName;
	
	public ViewLeadsPage verifyfirstName(String data) 
	{
		verifyExactText(eleverifyfName,data);
		return this;
	}
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Edit')]")
	private WebElement eleverifyViewLeadTitle;
	
	public ViewLeadsPage verifyViewLeadTitle(String title) {
		verifyTitle(title);
		return this;	
	}

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Edit')]")
	private WebElement eleClickEditLead;
	
	public UpdateLeadPage clickEditLead() {
		click(eleClickEditLead);
		return new UpdateLeadPage();	
	}
	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	private WebElement eleClickDuplicateLead;
	public DuplicateLeadPage clickDuplicateLead() {
		click(eleClickDuplicateLead);
		return new DuplicateLeadPage();	
	}
	@FindBy(how=How.LINK_TEXT,using="Delete")
	private WebElement eleClickDeleteLead;
	public MyLeadsPage clickDeleteLead() {
		click(eleClickDeleteLead);
		return new MyLeadsPage();	
	}
	
	
}