package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName="TC004_CreateLead";
		testDescription="CreateLead for Leaftap Application";
		testNodes="Leads";
		category="Smoke";
		authors="Sarath";
		browserName="chrome";
		dataSheetName="TC004";
	}	
	
	@Test(dataProvider="fetchData")
	public void editleadtc(String uName,String pwd,String fName,String leadTitle,String deptName,String industryName ) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCrmsfa()
		.clickLeads()
		.clickFindLead()
		.enterFindLead(fName)
		.clickFindLeadButton()
		.clickFirstValue()
		.verifyViewLeadTitle(leadTitle)
		.clickEditLead()
		.enterDeptName(deptName)
		.selectIndustry(industryName)
		.clickUpdate();
			
		
}

}
