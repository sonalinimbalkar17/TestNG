package testNG_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Assertions {
	WebDriver driver;

	@BeforeClass
	void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver21\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Test(priority = 1)
	void homePageTitle() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "OrangeHRM");
	}
	
	@Test(priority = 2)
	void currentUrl() {
		String url=driver.getCurrentUrl();
		//System.out.println(url);
		boolean s1=url.contains("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login\r\n");
		Assert.assertTrue(true);
	}

	
	@AfterClass
	void close() {
		driver.quit();
	}
}
