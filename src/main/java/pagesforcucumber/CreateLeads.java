package pagesforcucumber;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import lib.selenium.WebDriverServiceImpl;

public class CreateLeads extends WebDriverServiceImpl  {
	
	public CreateLeads() {

	}
	@FindBy(id="createLeadForm_companyName")
	WebElement eleCnName;
	
	@FindBy(id="createLeadForm_firstName")
	WebElement eleFName;
	
	@FindBy(id="createLeadForm_lastName")
	WebElement eleLName;
	
	@FindBy(id="createLeadForm_primaryEmail")
	WebElement eleEmail;
	
	@FindBy(className="smallSubmit")
	WebElement eleSubmit;
		
	@And("Enter the CompanyName as (.*)")
	public CreateLeads typeCnName(String cName) {
		type(eleCnName, cName);
		return this;
		
	}
	
	@And("Enter the FirstName as (.*)")
	public CreateLeads typeFN(String fName) {
	type(eleFName, fName);
	return this;
	}
	
	@And("Enter the LastName as (.*)")
	public CreateLeads typeLN(String lName) {
		type(eleLName, lName);
		return this;
		
	}
	
	@And("Enter the Email as (.*)")
	public CreateLeads typeEmail(String email) {
		type(eleLName, email);
		return this;
		
	}
	
	@When("click on submit")
	public ViewLeads clickSubmit() {
		click(eleSubmit);
		return new ViewLeads();
	}
	
	
}

