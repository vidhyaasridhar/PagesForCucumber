package ProjectDayWeek4;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import lib.selenium.WebDriverServiceImpl;

public class TestCase1 extends WebDriverServiceImpl{

	@Test
	public void createLead() {
		// TODO Auto-generated method stub
		
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		
		WebElement elePassword = locateElement("id", "password");
		type(elePassword, "crmsfa");
		
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
		
		WebElement eleCRM = locateElement("link", "CRM/SFA");
		click(eleCRM);
		
		WebElement eleAc = locateElement("link","Accounts");
		click(eleAc);
		
		WebElement eleCac = locateElement("link","Create Account");
		click(eleCac);
		
		WebElement eleAcName = locateElement("id","accountName");
		type(eleAcName, "CreditAutoloan");
		
		WebElement eleIndus = locateElement("name", "industryEnumId");
		selectDropDownUsingIndex(eleIndus, 3);
		
		WebElement eleCur = locateElement("id", "currencyUomId");
		selectDropDownUsingValue(eleCur, "AMD");
		
		WebElement eleSource = locateElement("id", "dataSourceId");
		type(eleSource, "Partner");
				
		WebElement eleMc = locateElement("id", "marketingCampaignId");
		selectDropDownUsingVisibleText(eleMc, "eCommerce Site Internal Campaign");
		
		WebElement elePh = locateElement("id","primaryPhoneNumber");
		type(elePh,"8939958090");
		
		WebElement eleCty = locateElement("id","generalCity");
		type(eleCty,"Chennai");
		
		WebElement eleEmail = locateElement("id","primaryEmail");
		type(eleEmail, "Arun87@gmail.com");
		
		WebElement eleCtry = locateElement("id", "generalCountryGeoId");
		selectDropDownUsingVisibleText(eleCtry, "India");
		
		WebElement eleState = locateElement("id","generalStateProvinceGeoId");
		selectDropDownUsingValue(eleState,"IN-TN");
		
		WebElement eleSubmit = locateElement("class","smallSubmit");
		click(eleSubmit);
		
		WebElement eleAcNme = locateElement("xpath","//span[text()='Account Name']/following::span[1]");
		String txt = getText(eleAcNme);
		
		String accountId = txt.replaceAll("\\D", "");
		String[] accountName = txt.split(" ");
		String aName = accountName[0];
		
		WebElement eleFl = locateElement("link","Find Accounts");
		click(eleFl);
		
		WebElement eleAcId = locateElement("xpath","//input[@name='id']");
		type(eleAcId,accountId);
		
		WebElement eleAcNm = locateElement("xpath"," (//input[@name='accountName'])[2]");
		type(eleAcNm,aName);
		
		WebElement eleFindAc = locateElement("xpath","//button[text()='Find Accounts']");
		click(eleFindAc);
		
		WebElement eleFr = locateElement("xpath","(//a[@class='linktext'])[4]");
		click(eleFr);
		
		WebElement eleAcNme1 = locateElement("xpath","//span[text()='Account Name']/following::span[1]");
		String txt1 = getText(eleAcNme1);
		
		if(txt.equals(txt1)) {
			System.out.println("Account details matches");
		}
			else
			{
				System.out.println("Account details doesnot matches");
			}
		}
			
		
		
		

	}


