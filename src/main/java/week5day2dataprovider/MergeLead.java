package week5day2dataprovider;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;

public class MergeLead extends PreAndPost{
	

	@Test(dataProvider="Set1")
	public void mergeLead(String cName, String fName, String lName) {
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
			
			WebElement elecl = locateElement("name", "submitButton");
			click(elecl);
				
			WebElement eleAcNme = locateElement("xpath","//span[@id='viewLead_companyName_sp']");
			String txt = getText(eleAcNme);
			System.out.println("From Lead:"+ txt );
		

				
			/*	//MergeLead
				WebElement eleMrg = locateElement("link","Merge Leads");
				click(eleMrg);
				
				WebElement eleFrm = locateElement("xpath", "(//img[@alt='Lookup'])[1]");
				click(eleFrm);
				
				switchToWindow(1);
				
				WebElement eleLead1 = locateElement("name", "id");
				type(eleLead1, "10194");
		
				WebElement eleFl = locateElement("xpath", "//button[text()='Find Leads']");
				click(eleFl);
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				WebElement eleFirst = locateElement("xpath", "(//a[@class='linktext'])[1]");
				click(eleFirst);
				
				switchToWindow(0);
				
				WebElement eleTo = locateElement("xpath", "(//img[@alt='Lookup'])[2]");
				click(eleTo);
				
				switchToWindow(1);
				
				WebElement eleLead2 = locateElement("name", "id");
				type(eleLead2,"10216");
				
				WebElement eleF2 = locateElement("xpath", "//button[text()='Find Leads']");
				click(eleF2);
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				WebElement eleSecond = locateElement("xpath","(//a[@class='linktext'])[1]");
				click(eleSecond);
				
				switchToWindow(0);
				
				WebElement eleMrg1 = locateElement("link", "Merge");
				click(eleMrg1);
				
				acceptAlert();*/
				
				
	}
	
	@DataProvider(name="Set1")
	public String[][] getData() {
		
		String[][] data=new String[2][3];
		
		data[0][0]="TCS";
		data[0][1]="Vidhyaa";
		data[0][2]="Sridhar";
		
		data[1][0]="CTS";
		data[1][1]="Lalitha";
		data[1][2]="Sri";
		return data;
	}
}
