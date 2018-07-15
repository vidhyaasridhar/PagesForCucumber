package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;

public class EditLead extends PreAndPost{

	@Test(dependsOnMethods= {"tests.CreateLead.createLead"}, description="Edit lead will edit the customer details")
	public void editLead() {
		// TODO Auto-generated method stub

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
		
		WebElement elecl = locateElement("name", "submitButton");
		click(elecl);
		
	 //Edit Lead
		WebElement eleEdit=locateElement("link","Edit");
		click(eleEdit);
		
		WebElement eleclr = locateElement("id", "updateLeadForm_companyName");
		clear(eleclr);
						
		WebElement eleCnEdit = locateElement("id", "updateLeadForm_companyName");
		type(eleCnEdit, "Amazon");
		
		WebElement eleclr1 = locateElement("id", "updateLeadForm_firstName");
		clear(eleclr1);
	    
	    WebElement eleFnedit = locateElement("id","updateLeadForm_firstName");
	    type(eleFnedit, "Vidhyaa");
	    
	    WebElement eleclr2 = locateElement("id", "updateLeadForm_lastName");
		clear(eleclr2);
	    
	    WebElement eleLnEdit = locateElement("id", "updateLeadForm_lastName");
	    type(eleLnEdit, "Sridhar");
	    
	    WebElement eleSubmit = locateElement("name","submitButton");
	    click(eleSubmit);
 
  
	}

}
 