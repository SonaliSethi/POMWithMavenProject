package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriverException;
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
	
	public MyFindLeadPopupPage clickFirstIcon() {
		clickWithNoSnap(elefindLead);
		switchToWindow(1);
		return  new MyFindLeadPopupPage();
		
		
	}
}
