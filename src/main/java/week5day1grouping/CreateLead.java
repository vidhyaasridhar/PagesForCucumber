package week5day1grouping;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;

public class CreateLead extends PreAndPost{

	@Test(groups= {"Smoke"})
	public void createLead() {
		
		//Login
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		
		WebElement elePassword = locateElement("id", "password");
		type(elePassword, "crmsfa");
		
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
		
		WebElement eleCRM = locateElement("link", "CRM/SFA");
		click(eleCRM);
		
		//Create Lead
		WebElement eleCreateLead = locateElement("link", "Create Lead");
		click(eleCreateLead);
		
		WebElement eleCmpnyName = locateElement("id", "createLeadForm_companyName");
		type(eleCmpnyName, "TestLeaf");
		
		WebElement eleFn = locateElement("id", "createLeadForm_firstName");
		type(eleFn, "Vidhyaa");
		
		WebElement eleLn = locateElement("id","createLeadForm_lastName");
		type(eleLn, "Lakshmi");
		
		WebElement eledd = locateElement("id", "createLeadForm_dataSourceId");
		type(eledd, "Direct Mail");
		
		WebElement elemc = locateElement("id", "createLeadForm_marketingCampaignId");
		selectDropDownUsingIndex(elemc, 3);
		
		WebElement eleIndus = locateElement("id", "createLeadForm_industryEnumId");
		selectDropDownUsingValue(eleIndus, "IND_DISTRIBUTION");
		
		WebElement eleOwn = locateElement("id", "createLeadForm_ownershipEnumId");
		selectDropDownUsingVisibleText(eleOwn, "Corporation");
		
		WebElement elecl = locateElement("name", "submitButton");
		click(elecl);
		
				
	}
	
}




