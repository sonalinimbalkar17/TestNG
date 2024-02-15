package testNG_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
	@DataProvider(name = "loginData")
	public Object[][] loginData() {
		return new Object[][] {
			{ "standard_user", "secret_sauce" },
			{ "locked_out_user", "secret_sauce" },
			{ "problem_user", "secret_sauce" },
			{ "performance_glitch_user", "secret_sauce" } };
	}

	@Test(dataProvider = "loginData")
	public static void loginPage(String username, String password) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver21\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/index.html");
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
	}

}
