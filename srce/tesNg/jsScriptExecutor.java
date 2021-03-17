package tesNg;

import java.beans.EventHandler;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class jsScriptExecutor {
	
	
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "C:/Users/asket/Desktop/Softwares/chromedriver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		EventFiringWebDriver entwebDriver = new EventFiringWebDriver(driver);
		
		//EventHandler entHandlar = new EventHandler();

	}


}
