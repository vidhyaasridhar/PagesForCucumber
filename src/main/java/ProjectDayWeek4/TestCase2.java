package ProjectDayWeek4;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import lib.selenium.WebDriverServiceImpl;

public class TestCase2 extends WebDriverServiceImpl {

	@Test
	public void flipKart() {
		
		
		getKeyBoardKeys("ESCAPE");
		// TODO Auto-generated method stub
		
		//WebElement eleTv = locateElement("link","TVs & Appliances");
		//mouseOver(eleTv);
		
		WebElement eleTv = locateElement("xpath","//span[text()='TVs & Appliances']");
		mouseOver(eleTv);
		
		WebElement eleSm = locateElement("xpath","(//span[text()='Samsung'])[2]");
		click(eleSm);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement eleMin = locateElement("xpath","//select[@class='fPjUPw']");
		selectDropDownUsingValue(eleMin,"25000");
		
		WebElement eleMax = locateElement("xpath","(//select[@class='fPjUPw'])[2]");
		selectDropDownUsingValue(eleMax,"60000");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement eleScrnSze = locateElement("xpath","//div[text()='Screen Size']");
		click(eleScrnSze);
		
		WebElement elesze = locateElement("xpath","//div[text()='48 - 55']");
		click(elesze);
	
		
		
		
		

	}

}
