package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyMergeLeadPage extends ProjectMethods{
	
	public MyMergeLeadPage() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="(//img[@alt='Lookup'])[1]")
	private WebElement elefindLead;
	
	public MyMergeLeadPage enterFindLead(String data) {
		type(elefindLead, data);
		return this;
			
	}	
}
