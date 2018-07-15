package week6day2page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.reader.ReadExcel;
import lib.selenium.PreAndPost;
import pages.CreateLeads;
import pages.MyHome;
import pages.MyLeads;
import pages.ViewLeads;

public class CreateLead1 extends PreAndPost{
	
		
	@BeforeTest
	public void setValue() {
		testCaseName="CreateLead";
		testDesc = "Create a New Lead";
		nodeName="Lead";
		author="Vidhyaa";
		category="Sanity";
		excelFileName="CreateLead";
		verifyexcel="data";
		
	}

	@Test(dataProvider="Set1")
	public void createLead(String cName, String fName, String lName) {
		
		//Create Lead
		
		new MyHome(driver, test).clickLeads();
		new MyLeads(driver,test).clickCreateLeads();
		new CreateLeads(driver,test).typeCnName(cName).typeFN(fName).typeLN(lName).clickSubmit();
		new ViewLeads(driver,test).verifyFName(fName);
		
		
		/*WebElement eleCreateLead = locateElement("link", "Create Lead");
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
		*/
				
	}
	
	
}




