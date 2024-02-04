package testNG_framework;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class browserTestCase {
	static ChromeDriver driver;

	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver21\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
	}

	@Test(priority = 1, description = "verifyTitle", enabled = true)
	public static void verifyTitle() {
		String actualTitle = driver.getTitle();
		assertEquals(actualTitle, "WebDriverUniversity.com");
	}

	@Test(priority = 2, description = "verifyCurrentUrl", enabled = true)
	public static void verifyCurrentUrl() {
		String actualUrl = driver.getCurrentUrl();
		Boolean word = actualUrl.contains("university");
		assertEquals(true, true);

	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
