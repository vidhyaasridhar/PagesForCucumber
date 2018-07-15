package week5day2testnglisteners;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtenetReports {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub 
		ExtentHtmlReporter html=new ExtentHtmlReporter("./reports/result.html");
		html.setAppendExisting(true);
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(html);
		ExtentTest test=extent.createTest("TC_001_CreateLead", "Create a Lead");
		test.assignCategory("Smoke");
		test.assignAuthor("Vidhyaa");
		test.pass("The Data DemosalesManager is Entered Successfully", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps//snap1.jpg").build());
		test.pass("The Data cremsfa is clicked successfully");
		test.pass("The Login Button is clicked succesfully");
		extent.flush();
		
		

	}

}
