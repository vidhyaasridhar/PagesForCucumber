package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;

public class MergeLead extends PreAndPost{
	

	@Test(enabled=false)
	public void mergeLead() {
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
				
				//MergeLead
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
				
				acceptAlert();
				
				
	}

}
