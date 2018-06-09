package runner;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class CreateLeadSteps {
	RemoteWebDriver driver;
	@Given("Invoke LeafTap Application")
	public void invokeApp()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
	}
	@And ("enter the username as (.*)") 
	public void enterUserName(String uname)
	{
		driver.findElementById("username").sendKeys(uname);

	}
	@And ("enter the password (.*)") 
	public void enterPassword(String pwd)
	{

		driver.findElementById("password").sendKeys(pwd);


	}
	@And("click on Login")
	public void clickLogin()
	{
		driver.findElementByClassName("decorativeSubmit").click();

	}
	@And("Verify login is successful")
	public void verifyLogin()
	{
		System.out.println("Login is successful");

	}
	@And("click on CRMSFA")
	public void clickCRMSFA()
	{		
		driver.findElementByLinkText("CRM/SFA").click();


	}
	@And("click on createLeadtab")
	public void clickCreateLeadtab()
	{		
		driver.findElementByLinkText("Create Lead").click();
	}
	
	@And ("enter the companyname") 
	public void enterCompanyname()
	{
		driver.findElementById("createLeadForm_companyName").sendKeys("Hexaware Technologies");
	}
	@And ("enter the firstname") 
	public void enterFirstname()
	{
		driver.findElementById("createLeadForm_firstName").sendKeys("Sonali");
	}
	@And ("enter the lastname") 
	public void enterLastname()
	{
		driver.findElementById("createLeadForm_lastName").sendKeys("Sethi");
	}
	@And("click on createLeadbutton")
	public void clickCreateLeadbutton()
	{		
		driver.findElementByName("submitButton").click();
	}
	@And("verify CreateLead (.*)")
	public void verifyCreateLead(String name2)
	{	
		System.out.println("Create Lead is successful");
		String verifyName = driver.findElementById("viewLead_firstName_sp").getText();
		System.out.println("NAME 2"+verifyName);
		if(verifyName.contains(name2))
		{
			System.out.println("both names are same");
		}
	}
	
}


