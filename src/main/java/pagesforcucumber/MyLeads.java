package pagesforcucumber;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import lib.selenium.WebDriverServiceImpl;

public class MyLeads extends WebDriverServiceImpl {
	
	public MyLeads() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Create Lead")
	WebElement eleCreateLeads;
	
	@And("Click on Create Lead")
	public CreateLeads clickCreateLeads() {
		click(eleCreateLeads);
		return new CreateLeads();
	}
	
	
	

}
