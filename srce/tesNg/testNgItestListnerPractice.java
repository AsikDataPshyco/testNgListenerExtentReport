package tesNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNgItestListnerPractice {

	WebDriver driver = null;

	@BeforeTest
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "C:/Users/asket/Desktop/Softwares/chromedriver/chromedriver.exe");

		driver = new ChromeDriver();

	}

	@Test
	public void testNgOPenTheBrower() {

		driver.get("https://www.facebook.com/");
		Assert.assertEquals("Asik", "Asik");

	}

	@Test
	public void testNgCloseTheBrower() {
		
		Assert.assertEquals("Asik", "pol");
		
		driver.close();

		driver.quit();

		

	}

}
