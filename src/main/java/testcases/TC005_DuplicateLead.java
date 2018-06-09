package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DuplicateLead extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName="TC005_DuplicateLead";
		testDescription="CreateLead for Leaftap Application";
		testNodes="Leads";
		category="Smoke";
		authors="Sarath";
		browserName="chrome";
		dataSheetName="TC005";
	}	
	
	@Test(dataProvider="fetchData")
	public void editleadtc(String uName,String pwd,String number ,String firstvalue ) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCrmsfa()
		.clickLeads()
		.clickFindLead()
		.clickPhonetab()
		.enterPhoneno(number)
		.clickFindLeadButton()
		.getFirstValue()
		.clickValue()
		.clickDuplicateLead()
		.clickCreateLead();
			
		
}

}
