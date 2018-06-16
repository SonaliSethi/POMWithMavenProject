package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MyFindLeadPage;
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
	public void editleadtc(String uName,String pwd,String fName,String leadTitle,String record ) {
		MyFindLeadPage flp= new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCrmsfa()
		.clickLeads()
		.clickFindLead()
		.enterFindLead(fName)
		.clickFindLeadButton();
		String firstResLead=flp.getFirstLeadID();
		flp.clickFirstValue()
		.verifyViewLeadTitle(leadTitle)
		.clickDeleteLead()
		.clickFindLead()
		.enterLeadID(firstResLead)
		.clickFindLeadButton()
		.verifyRecords(record);
		
			
		
}

}
