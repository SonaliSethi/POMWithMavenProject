package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_DeleteLead extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName=" TC006_DeleteLead";
		testDescription="CreateLead for Leaftap Application";
		testNodes="Leads";
		category="Smoke";
		authors="Sarath";
		browserName="chrome";
		dataSheetName="TC006";
	}	
	
	@Test(dataProvider="fetchData")
	public void editleadtc(String uName,String pwd,String fName,String Value,String leadTitle,String deptName,String LeadID,String record ) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCrmsfa()
		.clickLeads()
		.clickFindLead()
		.enterFindLead(fName)
		.clickFindLeadButton()
		.getFirstValue()
		.clickFirstValue()
		.verifyViewLeadTitle(leadTitle)
		.clickDeleteLead()
		.clickFindLead()
		.enterLeadID(Value)
		.clickFindLeadButton()
		.verifyRecords(record);
		
			
		
}

}
