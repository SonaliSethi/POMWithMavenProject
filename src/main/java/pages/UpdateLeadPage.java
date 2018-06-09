package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class UpdateLeadPage extends ProjectMethods{
	
	public UpdateLeadPage() {		
		PageFactory.initElements(driver,this);
	}	
	@FindBy(how=How.ID,using="updateLeadForm_departmentName")
	private WebElement eleSelectDept;
	
	public UpdateLeadPage enterDeptName(String data) {
		type(eleSelectDept, data);
		return this;
	}
	@FindBy(how=How.ID,using="updateLeadForm_industryEnumId")
	private WebElement eleSelectIndustry;
	
	public UpdateLeadPage selectIndustry(String data) {
		selectDropDownUsingText(eleSelectIndustry,data);
		return this;	
	}
	@FindBy(how=How.XPATH,using="//input[@class='smallSubmit']")
	private WebElement eleClickUpdate;
	
	public ViewLeadsPage clickUpdate() {
		click(eleClickUpdate);
		return new ViewLeadsPage();	
	}

	
	


}
