package SeleniumTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testSuite {
	WebDriver driver;
@Test
public void testCaseOne() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
    driver.get("http://www.webdriveruniversity.com/");
    WebElement e=  driver.findElement(By.cssSelector("#contact-us"));
    e.click();
    driver.close();
	
}

//JavascriptExecutor
@Test
public void testCaseTwo() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
    driver.get("http://www.webdriveruniversity.com/");
    WebElement e=  driver.findElement(By.cssSelector("#contact-us"));
    String script="arguments[0].click()";
    JavascriptExecutor je=(JavascriptExecutor)driver;
    je.executeScript(script, e);
}

//scrolling-around
@Test
public void testCaseThree() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
    driver.get("http://www.webdriveruniversity.com/");
    WebElement e=  driver.findElement(By.cssSelector("#scrolling-around"));
    String script="arguments[0].scrollIntoView(true)";
    JavascriptExecutor je=(JavascriptExecutor)driver;
    je.executeScript(script, e);
}

//<h1 data-cy="two">Hello<h1>
//adding the attribute to the element
@Test
public void testCaseFour() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
    driver.get("http://www.webdriveruniversity.com/");
    WebElement e=  driver.findElement(By.cssSelector("#scrolling-around"));
    String script="arguments[0].setAttribute('data-cy','two')";
    JavascriptExecutor je=(JavascriptExecutor)driver;
    je.executeScript(script, e);
    String attributeVal=e.getAttribute("data-cy");
    Assert.assertEquals(attributeVal, "two");

}

@Test
public void testCaseFive() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
    driver.get("http://www.webdriveruniversity.com/");
    String title = driver.getTitle();
//	Assert.assertEquals(title, "WebDriverUniversity.com");
	String script = "return document.title";
	JavascriptExecutor je = (JavascriptExecutor)driver;
	String actualTitle = (String) je.executeScript(script);
	Assert.assertEquals(actualTitle, "WebDriverUniversity.com");
	
	
}


}

