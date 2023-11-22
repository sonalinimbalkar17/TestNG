package SeleniumTestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Autocomplete_TextField {
	WebDriver driver;
	@Test
	public void testCaseOne() {
		// Auto suggestive drop down testcase one
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://www.webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");
	    
	    WebElement input= driver.findElement(By.id("myInput"));
	    input.sendKeys("p");
	    
	    List <WebElement> list=driver.findElements(By.cssSelector("#myInputautocomplete-list >div"));
	    //for loop
	    for(int i=0;i<list.size();i++) {
	    	//System.out.println(i);//0 1 2
	    	String options=list.get(i).getText();
	    	System.out.println(options);
	    	
	    	if(options.equals("Pancakes")) {
	    		list.get(i).click();
	    		break;
	    	}
	    }
	    
	    
	   driver.findElement(By.cssSelector("#submit-button")).click();
	   String url=driver.getCurrentUrl();
	   boolean avail=url.contains("Pancakes");
	   Assert.assertTrue(avail);
	   driver.close();
	}
	    
	    
	    
	// Auto suggestive drop down testcase two
	// Select the first value without looping through the list  
	   
	   @Test
	   public void TestcaseTwo() {
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
		    driver = new ChromeDriver();
			driver.get("http://www.webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");
			
			WebElement inpute = driver.findElement(By.id("myInput"));
			inpute.sendKeys("p");
			inpute.sendKeys(Keys.ARROW_DOWN);
			inpute.sendKeys(Keys.ENTER);
			
			driver.findElement(By.cssSelector("#submit-button")).click();
			String url = driver.getCurrentUrl(); // Pizza
			boolean avail = url.contains("Pizza");
			Assert.assertTrue(avail);
			driver.close();   
	    
	   }	
	
	
}
