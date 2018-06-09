package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLead";
		testDescription="CreateLead for Leaftap Application";
		testNodes="Leads";
		category="Smoke";
		authors="Sarath";
		browserName="chrome";
		dataSheetName="TC003";
	}	
	
	@Test(dataProvider="fetchData")
	public void createleadtc(String uName,String pwd,String compName,String fName,String lName,String firstName) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCrmsfa()
		.clickLeads()
		.clickCreateLead()
		.enterCompName(compName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickCreateLeads()
		.verifyfirstName(firstName);
		
			
	}
}
