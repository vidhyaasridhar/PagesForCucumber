package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentTest;

import data.reader.ReadExcel;
import lib.selenium.PreAndPost;

public class ViewLeads extends  PreAndPost{
	
	public ViewLeads(EventFiringWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[@id='viewLead_firstName_sp']")
	WebElement eleFvName;
	
	public ViewLeads verifyFName(String data) {
		verifyPartialText(eleFvName,data);
		return this;
		
	}
	
	

}
