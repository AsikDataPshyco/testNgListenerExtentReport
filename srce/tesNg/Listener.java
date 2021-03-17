package tesNg;

import java.util.ArrayList;
import java.util.List;

import org.testng.IRetryAnalyzer;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class Listener implements ITestListener , IRetryAnalyzer {
	
	private int retryCount = 0;
	private static final int maxRetryCount = 2;

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("The Test is running  "+ result.getName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("The Passed Test is  "+ result.getName());

	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		  XmlSuite suite = new XmlSuite();
	      suite.setName("rerunFailedTestClasses");
	      XmlTest test = new XmlTest(suite);
	      test.setName(result.getTestName());
	      List<XmlClass> classes = new ArrayList<XmlClass>();
	      classes.add(result.getTestClass().getXmlClass());
	      test.setXmlClasses(classes) ;
	      List<XmlSuite> suites = new ArrayList<XmlSuite>();
	      suites.add(suite);
	      TestNG tng = new TestNG();
	      tng.setXmlSuites(suites);
	      tng.run();
		System.out.println("The Failed Test is  "+ result.getName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("The Skipped Test is  "+ result.getName());
	}

	@Override
	public boolean retry(ITestResult result) {
		if (retryCount < maxRetryCount) {
		      retryCount++;
		      
		      System.out.println("The Failed test Retry  "+ result.getName());
		      return true;
		    }
		    return false;
	}

}
