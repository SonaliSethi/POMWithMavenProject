package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class DuplicateLeadPage extends ProjectMethods{
	
	public DuplicateLeadPage() {		
		PageFactory.initElements(driver,this);
	}	
	@FindBy(how=How.XPATH,using="//input[@name='submitButton']")
	private WebElement eleviewLead1;
	
	public ViewLeadsPage clickCreateLead() {
		click(eleviewLead1);
		return new ViewLeadsPage();	
	}
	
}

