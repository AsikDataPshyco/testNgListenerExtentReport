package tesNg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class aboutMe {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/asket/Desktop/Softwares/chromedriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String newLine = System.getProperty("line.separator");
		
		System.out.println("MY Name is Asik Ali Peermuhammed Syed Ziadueen");
		
		System.out.println(newLine);
		 
		System.out.println("I have 10+ expereince in Software Quality Assurance - ETL & Automation");
		
		System.out.println(newLine);
		
		System.out.println("My Blog can be found at -  asiketltestanalyst.wordpress.com");
		
		driver.get("https://asiketltestanalyst.wordpress.com/");
		
		System.out.println(newLine);
		
		System.out.println("My LinkedIn Profile : https://www.linkedin.com/in/asik-ali-1b353923/");
		
		driver.get("https://www.linkedin.com/in/asik-ali-1b353923/");
		
		System.out.println(newLine);
		
		System.out.println("My GitHUb: https://github.com/AsikDataPshyco");
		
		driver.get("https://github.com/AsikDataPshyco");
		
		System.out.println(newLine);
		
		
        System.out.println("Work Experience - HCL Technologies - Software QA Analyst - 2009 to 2014");
        
        System.out.println(newLine);
        
        System.out.println("Work Experience - Wipro Technologies - Senior ETL QA Lead- 2014 to 2019");
        
        System.out.println(newLine);
        
        System.out.println("Work Experience -Exacz Matrix IFS - QA Lead- 2019 to till Date");
		
		System.out.println(newLine);
		
		List<String> myTechStack = new ArrayList<String>() ;
		
		myTechStack.add("-----Core Java");
		myTechStack.add("-----Spring Boot / Batch / JPA");
		myTechStack.add("-----Spring Boot MVC - CRUD");
		myTechStack.add("-----Oracle SQL");
		myTechStack.add("-----CICD Pipeline Jenkins GitHub DockerHub Vulcan Splunk Logs");
		myTechStack.add("-----API Testing - RESTAssured / PostMan Runner Get Post Delete");
		myTechStack.add("-----Actimize RCM AIS IDM");
		myTechStack.add("-----Selenium WebDriver / Grid / Docker / BDD / TestNg / Cucumber /Page Object Model / QAF QMetry");
		
		
		for(String skillSet : myTechStack){
	        System.out.println(skillSet+"  ");
	    }
		
		System.out.println(newLine);
		
		
		List<String> javaPgmInterviePrograms = new ArrayList<String>() ;
	
		System.out.println("-----------------------javaPgmInterviePrograms------------------------------------------");
		javaPgmInterviePrograms.add("-----Reverse  String - swap the i - j , start from j=i+1");
		javaPgmInterviePrograms.add("-----Palindrom - user reverse a string logic");
		javaPgmInterviePrograms.add("-----Anangram - two loops, second loop to reverse the compare i to j");
		javaPgmInterviePrograms.add("-----Copy Array - two loops");
		javaPgmInterviePrograms.add("-----Remove duplicate chars/string - HashMap - getKeyValue=1");
		javaPgmInterviePrograms.add("-----First non repeating charecter - Map - LinkedHash Map - break in the loop getvalue>1");
		javaPgmInterviePrograms.add("-----No of occurrance - HashMap - print key and value");
		javaPgmInterviePrograms.add("-----Remove a char or string - array list , iterator - itrator.remove");
		javaPgmInterviePrograms.add("-----Sort an array based on Condition - implement Comparator interface");
		
			
		for(String interviewPgm : javaPgmInterviePrograms){
	        System.out.println(interviewPgm+"  ");
	    }
		
		
		List<String> seleniumInterViewQuestions = new ArrayList<String>() ;
		
		System.out.println("-----------------------seleniumInterViewQuestions------------------------------------------");
		seleniumInterViewQuestions.add("-----WebDriver is Interface - Chrome Driver is a Class");
		seleniumInterViewQuestions.add("-----WebDriver has BrowserCommands, Get Commands , Navigation Commands, Action Commands , Result Commands");
		seleniumInterViewQuestions.add("-----Find element - ID , Class , Link Text , Partial Link Text , Xpath CSS Path , Tag Name");
		seleniumInterViewQuestions.add("-----Xpath Axes - Ancestor, Parents, Child, descendant , following prceding ");
		seleniumInterViewQuestions.add("-----javaScriptExecutor if the element is hidden (hided buttons)");		
		seleniumInterViewQuestions.add("-----Exceptions - Checked Compile Time - Unchecked - Compiled Does not need Error - Program Fatal Error");
		seleniumInterViewQuestions.add("-----NoSuch Element / Window / Frame Exception");
		seleniumInterViewQuestions.add("-----NoSuch Element / Window / Frame Exception");
		seleniumInterViewQuestions.add("-----Element Not Visible / Selectable");
		seleniumInterViewQuestions.add("-----TimeOutException / No Such Session");
		seleniumInterViewQuestions.add("-----Implicit Wait for some time Explicit Wait for condition to meet Fluent Wait Time to Wait Untill the Conditions are met");
		seleniumInterViewQuestions.add("-----");
		
		
			
		for(String interviewPgmSelenium : seleniumInterViewQuestions){
	        System.out.println(interviewPgmSelenium+"  ");
	    }
	
		
		

	}

}
