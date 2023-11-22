package SeleniumTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IFrame {

	WebDriver driver;
	@Test
	public void iFrametestCase1(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://www.webdriveruniversity.com/IFrame/index.html");
	    
	    //Basically, we can switch over the elements and handle frames in Selenium using 3 ways.
	    //  Switch to the frame by Element
	    WebElement iframe=driver.findElement(By.cssSelector("#frame"));
	    driver.switchTo().frame(iframe);
	    boolean avail = driver.findElement(By.cssSelector("#div-main-nav > div > ul > li.active > a")).isDisplayed();
		Assert.assertTrue(avail);
	}
   
	    
	
	@Test
	public void iFrametestCase2(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://www.webdriveruniversity.com/IFrame/index.html");
	    
	    // Switch to the frame by index
		   driver.switchTo().frame(0);
		   boolean avail = driver.findElement(By.cssSelector("#div-main-nav > div > ul > li.active > a")).isDisplayed();
			Assert.assertTrue(avail);
			driver.switchTo().defaultContent();
			System.out.println(driver.getTitle());
			Assert.assertTrue(driver.getTitle().contains("IFrame"));
			driver.close();
			
		}
		
	@Test
	public void iFrametestCase3() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://www.webdriveruniversity.com/IFrame/index.html");
	    
	    // Switch to the frame by Name or ID
	    driver.switchTo().frame("frame");
		boolean avail = driver.findElement(By.cssSelector("#div-main-nav > div > ul > li.active > a")).isDisplayed();
		Assert.assertTrue(avail);
	}
		
	}
	    
   

	
	

