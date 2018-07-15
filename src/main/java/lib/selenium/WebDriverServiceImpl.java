package lib.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import lib.listeners.WebDriverListener;

public class WebDriverServiceImpl extends WebDriverListener implements WebDriverService{

	public WebElement locateElement(String locator, String locValue) {
		
		switch (locator) {
		case "id": return driver.findElement(By.id(locValue));
		
		case "class": return driver.findElement(By.className(locValue));
		
		case "link" : return driver.findElement(By.linkText(locValue));
		
		case "name" : return driver.findElement(By.name(locValue));  
		
		case "xpath": return driver.findElement(By.xpath(locValue));
	
		default:
			break;
		}
		return null;
	}

	public void type(WebElement ele, String data) {
		ele.sendKeys(data);		
	}
	
	public void clear(WebElement ele) {
		driver.unregister(this);
		ele.clear();
		driver.register(this);
		
	}

	public void click(WebElement ele) {
		ele.click();		
	}

	public String getText(WebElement ele) {
		// TODO Auto-generated method stub
		String text = ele.getText();		
		
		return text;
	}

	public void selectDropDownUsingVisibleText(WebElement ele, String value) {
		
		Select dd= new Select(ele);
		dd.selectByVisibleText(value);
		
		// TODO Auto-generated method stub
		
		
	}

	public void selectDropDownUsingValue(WebElement ele, String value) {
		// TODO Auto-generated method stub
		Select dd = new Select(ele);
		dd.selectByValue(value);
		
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub
		
		Select dd = new Select(ele);
		List<WebElement> listOpt=dd.getOptions();
		int size = listOpt.size();
		dd.selectByIndex(size-index);
		
		
	}
	
	
	public void getKeyBoardKeys(String data) {
		switch (data) {
		case "ESCAPE": driver.getKeyboard().sendKeys(Keys.ESCAPE);			
			break;
		case "ENTER": driver.getKeyboard().sendKeys(Keys.ENTER);			
		break;
			

		default:
			break;
		}
	}
	
	public void mouseOver(WebElement ele) {
		
		Actions builder=new Actions(driver);
		builder.moveToElement(ele).perform();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public boolean verifyExactTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean verifyPartialTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		return false;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		
	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		if(ele.getText().contains(expectedText)) {
			System.out.println("Text Mathces with expected Text"+ expectedText);
			}
			else {
				System.out.println("Text Doesn't Matches");
			}
		}
			
	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		
	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		
	}

	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	public void switchToWindow(int index) {
		// TODO Auto-generated method stub
		Set<String> allwindows = driver.getWindowHandles();
	    List<String> listOfWindow= new ArrayList<String>();
	    listOfWindow.addAll(allwindows);
	    driver.switchTo().window(listOfWindow.get(index));
		
	}

	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		Alert alert = driver.switchTo().alert();
	    alert.accept();
		
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		Alert alert = driver.switchTo().alert();
	    alert.dismiss();
		
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}

	public void closeActiveBrowser() {
		// TODO Auto-generated method stub
		
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		
	}

}
 