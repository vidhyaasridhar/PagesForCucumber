package pagesforcucumber;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import lib.selenium.WebDriverServiceImpl;

public class MyHome extends WebDriverServiceImpl {
	
	public MyHome() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Leads")
	WebElement eleLeads;
	
	@Given("Click On Leads")
	public MyLeads clickLeads() {
		click(eleLeads);
		return new MyLeads();
	}
	
	
	
}
