package dataProviderPractice;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class atDataProvider {
	
	WebDriver driver;
	
	@Parameters({"browserName"})
	@Test
	public void launchUrl(String browserName) {
		
		System.out.println("The Browser Running is  "+browserName);
		
	    if(browserName.equalsIgnoreCase("chrome")) {
	    	
	    	System.setProperty("webdriver.chrome.driver", "C:/Users/asket/Desktop/Softwares/chromedriver/chromedriver.exe");
	    	
	    	driver = new ChromeDriver();
	    	
	    	driver.get("www.google.com");
	    	driver.close();
	    	driver.quit();
	    	
	    } else if (browserName.equalsIgnoreCase("ie")) {
	    	
	    	System.setProperty("webdriver.chrome.driver", "C:/Users/asket/Desktop/Softwares/IEDriverServer/IEDriverServer.exe");
	    	driver = new InternetExplorerDriver();
	    	
	    	driver.get("www.google.com");
	    	driver.close();
	    	driver.quit();
	    	
	    }
		
	}

}
