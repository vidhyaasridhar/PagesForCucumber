package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.PreAndPost;

public class CreateLeads extends PreAndPost  {
	
	public CreateLeads(EventFiringWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="createLeadForm_companyName")
	WebElement eleCnName;
	
	@FindBy(id="createLeadForm_firstName")
	WebElement eleFName;
	
	@FindBy(id="createLeadForm_lastName")
	WebElement eleLName;
	
	@FindBy(className="smallSubmit")
	WebElement eleSubmit;
		
	public CreateLeads typeCnName(String cName) {
		type(eleCnName, cName);
		return this;
		
	}
	
	public CreateLeads typeFN(String fName) {
	type(eleFName, fName);
	return this;
	}
	
	public CreateLeads typeLN(String lName) {
		type(eleLName, lName);
		return this;
		
	}
	
	public ViewLeads clickSubmit() {
		click(eleSubmit);
		return new ViewLeads(driver, test);
	}
	
	
}

