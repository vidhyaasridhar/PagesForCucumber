package week5day2dataprovider;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;

public class EditLead extends PreAndPost{

	@Test(dataProvider="Set1")
	public void editLead(String cName, String fName, String lName, String cNameEdit, String fNameEdit, String lNameEdit) {
		// TODO Auto-generated method stub

	//Create Lead
		WebElement eleCreateLead = locateElement("link", "Create Lead");
		click(eleCreateLead);
		
		WebElement eleCmpnyName = locateElement("id", "createLeadForm_companyName");
		type(eleCmpnyName, cName);
		
		WebElement eleFn = locateElement("id", "createLeadForm_firstName");
		type(eleFn, fName);
		
		WebElement eleLn = locateElement("id","createLeadForm_lastName");
		type(eleLn, lName);
		
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
		type(eleCnEdit, cNameEdit);
		
		WebElement eleclr1 = locateElement("id", "updateLeadForm_firstName");
		clear(eleclr1);
	    
	    WebElement eleFnedit = locateElement("id","updateLeadForm_firstName");
	    type(eleFnedit, fNameEdit);
	    
	    WebElement eleclr2 = locateElement("id", "updateLeadForm_lastName");
		clear(eleclr2);
	    
	    WebElement eleLnEdit = locateElement("id", "updateLeadForm_lastName");
	    type(eleLnEdit, lNameEdit);
	    
	    WebElement eleSubmit = locateElement("name","submitButton");
	    click(eleSubmit);
 
  
	}
	
	@DataProvider(name="Set1")
	public String[][] getData() {
		
		String[][] data=new String[2][6];
		
		data[0][0]="TCS";
		data[0][1]="Vidhyaa";
		data[0][2]="Sridhar";
		data[0][3]="Amazon";
		data[0][4]="Sridhar";
		data[0][5]="Muthukrishnan";
				
		
		data[1][0]="CTS";
		data[1][1]="Lalitha";
		data[1][2]="Sri";
		data[1][3]="Capgemini";
		data[1][4]="Saranya";
		data[1][5]="Anantharaman";
		
		return data;
		
	}	

}
 