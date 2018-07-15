package week7day1cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import lib.selenium.WebDriverServiceImpl;

public class LearnHooks extends WebDriverServiceImpl {
	
	@Before
	public void beforeScenario(Scenario sc) {
		//System.out.println("The Method Name is: "+sc.getName());
		//System.out.println("The line number is: "+sc.getId());
		startReport();
		startTestCase(sc.getName(),sc.getId());
		startTestModule("Leads for Leaftaps");
		test.assignAuthor("Vidhyaa");
		test.assignCategory("Smoke");
			
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		webdriver = new ChromeDriver();
			
		driver = new EventFiringWebDriver(webdriver);
		driver.register(this);
			
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Login
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemosalesManager" );
		
		WebElement elePassword = locateElement("id", "password");
		type(elePassword, "crmsfa");
		
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
		
		WebElement eleCRM = locateElement("link", "CRM/SFA");
		click(eleCRM);
	
		
}
	
	@After
	public void afterScenario(Scenario sc) {
		
	//System.out.println("The status="+sc.getStatus());
	//System.out.println("Is Failed?: "+sc.isFailed());
		closeActiveBrowser();
		endResult();

	}

}
