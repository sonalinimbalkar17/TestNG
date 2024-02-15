package testNG_framework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class screenshotInJava {

	public static WebDriver driver;

	@Test
	public static void takeSS() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver21\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/index.html");
		driver.findElement(By.id("user-name")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin12");
		driver.findElement(By.id("login-button")).click();

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\Users\\Sakshi Services SSE\\eclipse-workspace\\TestNG\\src\\test\\java\\testNG_framework\\img.png");

		try {
			FileUtils.copyFile(src, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}