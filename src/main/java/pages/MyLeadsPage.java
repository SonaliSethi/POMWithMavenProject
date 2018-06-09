package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods{
	
	public MyLeadsPage() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement eleClickcreateLead;
	
	public MyCreateLeadPage clickCreateLead() {
		click(eleClickcreateLead);
		return new MyCreateLeadPage();	
	}
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleClickfindLead;
	
	public MyFindLeadPage clickFindLead() {
		click(eleClickfindLead);
		return new MyFindLeadPage();	
	}
	
	
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement eleClickmergeLead;
	
	public MyMergeLeadPage clickMergeLead() {
		click(eleClickmergeLead);
		return new MyMergeLeadPage();	
	}
}