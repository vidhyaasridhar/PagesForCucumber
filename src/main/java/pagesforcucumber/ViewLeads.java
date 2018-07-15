package pagesforcucumber;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import lib.selenium.WebDriverServiceImpl;

public class ViewLeads extends  WebDriverServiceImpl{
	
	public ViewLeads() {
		
	}
	
	@FindBy(xpath="//span[@id='viewLead_firstName_sp']")
	WebElement eleFvName;
	
	public ViewLeads verifyFName(String data) {
		verifyPartialText(eleFvName,data);
		return this;
		
	}
	
	

}
