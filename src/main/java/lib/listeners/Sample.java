package lib.listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class Sample implements IAnnotationTransformer, IRetryAnalyzer{
	int maxcount=1;
	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testCons, Method testMethod) {
		
		annotation.setRetryAnalyzer(this.getClass());
		
		if(testMethod.getName().equals("createLead"))
		{	
		annotation.setInvocationTimeOut(10000);
		}
		
		if(testMethod.getName().equals("deleteLead"))
		{	
		annotation.setEnabled(false);
		}
	}

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub(
		if(!result.isSuccess() & maxcount<2)
		{
			maxcount++;
			return true;
		}		
		return false;
	}
	
	

}
