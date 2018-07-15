package lib.selenium;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import data.reader.ReadExcel;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class PreAndPost extends WebDriverServiceImpl{
	
	public String testCaseName, testDesc, nodeName, author, category, excelFileName, verifyexcel;
	
	@BeforeMethod()
	@Parameters({"Url","username","Password"})
	  public void beforeMethod(String url, String userName, String pswd) {
		 // System.out.println("Before Method");
		
		startTestCase(testCaseName,testDesc);
		startTestModule(nodeName);
		test.assignAuthor(author);
		test.assignCategory(category);
			
		
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			webdriver = new ChromeDriver();
			
			driver = new EventFiringWebDriver(webdriver);
			driver.register(this);
			
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		//Login
			WebElement eleUserName = locateElement("id", "username");
			type(eleUserName, userName );
			
			WebElement elePassword = locateElement("id", "password");
			type(elePassword, pswd);
			
			WebElement eleLogin = locateElement("class", "decorativeSubmit");
			click(eleLogin);
			
			WebElement eleCRM = locateElement("link", "CRM/SFA");
			click(eleCRM);
			
	  }

	  @AfterMethod
	  public void afterMethod() {
		  closeActiveBrowser();

	  }

	  @BeforeClass
	  public void beforeClass() {
	  
	  }

	  @AfterClass
		public void afterClass() {
			System.out.println("afterClass");
		}

		@BeforeTest
		public void beforeTest() {
			System.out.println("beforeTest");
		}

		@AfterTest
		public void afterTest() {
			System.out.println("afterTest");
		}

		@BeforeSuite
		public void beforeSuite() {
			startReport();
		}


		@AfterSuite
		public void afterSuite() {
			endResult();
		}
	  
	  @DataProvider(name="Set1")
		public String[][] getData() throws IOException {
			
			ReadExcel excel=new ReadExcel();
			String[][] data = excel.readExcel("CreateLead");
			return data;
		
			
		}
	  
	  @DataProvider(name="Set2")
		public String[][] verifyData() throws IOException {
			
			ReadExcel excel=new ReadExcel();
			String[][] data = excel.readExcel("data");
			return data;
		

	  }
}