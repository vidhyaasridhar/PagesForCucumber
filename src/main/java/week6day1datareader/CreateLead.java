package week6day1datareader;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.reader.ReadExcel;
import lib.selenium.PreAndPost;

public class CreateLead extends PreAndPost{
	
		
	@BeforeTest
	public void setValue() {
		testCaseName="CreateLead";
		testDesc = "Create a New Lead";
		nodeName="Lead";
		author="Vidhyaa";
		category="Sanity";
		excelFileName="CreateLead";
	}

	@Test(dataProvider="Set1")
	public void createLead(String cName, String fName, String lName, String phNmbr) {
		
		//Create Lead
		WebElement eleCreateLead = locateElement("link", "Create Lead");
		click(eleCreateLead);
		
		WebElement eleCmpnyName = locateElement("id", "createLeadForm_companyName");
		type(eleCmpnyName,cName);
		
		WebElement eleFn = locateElement("id", "createLeadForm_firstName");
		type(eleFn, fName);
		
		WebElement eleLn = locateElement("id","createLeadForm_lastName");
		type(eleLn, lName);
		
		WebElement eledd = locateElement("id", "createLeadForm_dataSourceId");
		type(eledd, "Direct Mail");
		
		WebElement elemc = locateElement("id", "createLeadForm_marketingCampaignId");
		selectDropDownUsingIndex(elemc, 3);
		
		WebElement eleIndus = locateElement("id", "createLeadForm_industryEnumId");
		selectDropDownUsingValue(eleIndus, "IND_DISTRIBUTION");
		
		WebElement eleOwn = locateElement("id", "createLeadForm_ownershipEnumId");
		selectDropDownUsingVisibleText(eleOwn, "Corporation");
		
		WebElement elePh = locateElement("id","createLeadForm_primaryPhoneNumber");
		type(elePh,""+phNmbr);
				
		WebElement elecl = locateElement("name", "submitButton");
		click(elecl);
		
				
	}
	
	
}




