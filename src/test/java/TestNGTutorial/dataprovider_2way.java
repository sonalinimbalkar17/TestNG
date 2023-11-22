package TestNGTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class dataprovider_2way {
	WebDriver driver;
	//With the help of Parameters annotation and TestNG XML file.
	@Parameters({"username","password"})
	
	@Test 
	public void login(String un , String pw) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.id("user-name")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pw);
		driver.findElement(By.cssSelector("#login-button")).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
		
}
}