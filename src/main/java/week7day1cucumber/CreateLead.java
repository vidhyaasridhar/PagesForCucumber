package week7day1cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead {
	/*ChromeDriver driver;

@Given("open the browser")
public void openBrowser() {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	driver=new ChromeDriver();
}

@And("set timeouts")
public void setTimeOuts() {
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

}

@And("launch the url")
public void launchUrl() {
	driver.get("http://leaftaps.com/opentaps/");
}

@And("maximize the browser")
public void maximizeBrwsr() {
	driver.manage().window().maximize();
}

@And("enter the UserName as (.*)")
public void enterUN(String UserName) {
	driver.findElementById("username").sendKeys(UserName);
}

@And("enter the Password as (.*)")
public void enterPW(String passWord) {
    driver.findElementById("password").sendKeys(passWord);
}

@When("click on the login button")
public void clicklogin() {
    driver.findElementByClassName("decorativeSubmit").click();
}

@When("Click on the CRMSFA")
public void clickCrmSfa() {
    driver.findElementByLinkText("CRM/SFA").click();
}

@Given("Click on Create Lead")
public void clickCreateLead() {
    driver.findElementByLinkText("Create Lead").click();
}

@And("Enter the CompanyName as (.*)")
public void enterCN(String cmpnyName) {
	 driver.findElementById("createLeadForm_companyName").sendKeys(cmpnyName);
}

@And("Enter the FirstName as (.*)")
public void enterFN(String fn) {
    driver.findElementById("createLeadForm_firstName").sendKeys(fn);
}

@And("Enter the LastName as (.*)")
public void enterLN(String ln) {
    driver.findElementById("createLeadForm_lastName").sendKeys(ln);

}

@And("Enter the Email as (.*)")
public void enterEmail(String email) {
	driver.findElementById("createLeadForm_primaryEmail").sendKeys(email);
}

/*@And("Enter the PhoneNumber as (.*)")
public void enterPhNumbr(phnumber) {
	driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys(phnumber);
}*/

/*@When("click on CreateLead")
public void clkCreateLead() {
   driver.findElementByName("submitButton").click(); 

}*/

}
