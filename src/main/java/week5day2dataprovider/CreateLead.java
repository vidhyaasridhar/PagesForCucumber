package week5day2dataprovider;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;

public class CreateLead extends PreAndPost{

	@Test(dataProvider="Set1")
	public void createLead(String cName, String fName, String lName, int phNmbr) {
		
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
		
		//WebElement elePh = locateElement("id","createLeadForm_primaryPhoneNumber");
		//type(elePh,""+phNmbr);
				
		WebElement elecl = locateElement("name", "submitButton");
		click(elecl);
		
				
	}
	
	@DataProvider(name="Set1")
	public String[][] getData() {
		
		String[][] data=new String[2][4];
		
		data[0][0]="TCS";
		data[0][1]="Vidhyaa";
		data[0][2]="Sridhar";
		//data[0][3]= 896547252;
		
		data[1][0]="CTS";
		data[1][1]="Lalitha";
		data[1][2]="Sri";
		//data[1][3]= 982547254;
		return data;
		
	
		
	}
	
}




