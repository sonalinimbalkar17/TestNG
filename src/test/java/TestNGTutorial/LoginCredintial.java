package TestNGTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginCredintial {
	WebDriver driver;

	@BeforeMethod
	public void login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");	
	}
	@Test
	public void validateLoginSuccess() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		boolean currentUrl = driver.getCurrentUrl().contains("inventory.html");
		Assert.assertTrue(currentUrl);
	}
	
	@Test
	public void validateLoginonFailuser() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secet_sce");
		driver.findElement(By.id("login-button")).click();
		
		boolean errorMsg = driver
				.findElement(By.cssSelector("#login_button_container > div > form > div.error-message-container.error > h3 > button > svg"))
				.isDisplayed();
		Assert.assertTrue(errorMsg);
	}
	
	@AfterMethod
	public void BroswerClose() {
		driver.close();
	}

}

