package TestNGTutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class withoutMainMethod {
	WebDriver driver;
	@Test
	public void validateTitle() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		String actualTitle =driver.getTitle();
		String expectedTitle = "WebDriverUniversity.com";
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.close();

	}
	
	@Test
	public void validateCurrentUrl() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		String url = driver.getCurrentUrl();
		boolean  avail = url.contains("university");
		Assert.assertTrue(avail);
		driver.close();
		
	}
	
	
	
	
	
	
}
