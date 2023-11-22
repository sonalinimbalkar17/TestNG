package SeleniumTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Action_Class {

	WebDriver driver;
	Actions action;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Actions/index.html");
		action = new Actions(driver);
	}

	//dragAndDrop
	@Test
	public void dragAndDrop() {

		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		action.dragAndDrop(drag, drop).build().perform();
		Assert.assertEquals(drop.getText(), "Dropped!");

	}
	
	//double-click
	@Test
	public void doubleClick() {
		WebElement ele = driver.findElement(By.id("double-click"));
		action.doubleClick(ele).build().perform();
		//div-double-click double  --- expected class attribute after double click
		String expectedClass = ele.getAttribute("class");
		Assert.assertEquals(expectedClass, "div-double-click double");
	}

	
	// click-box
	@Test
	public void clickAndHold() {
		WebElement ele = driver.findElement(By.id("click-box"));
		action.clickAndHold(ele).build().perform();
		Assert.assertEquals(ele.getText(),"Well done! keep holding that click now.....");
	
	}
	
	//moveToElement
	@Test
	public void moveToElement() {
		WebElement ele = driver.findElement(By.cssSelector("#div-hover > div.dropdown.hover > button"));
		action.moveToElement(ele).build().perform();
		boolean visible = driver.findElement(By.cssSelector("#div-hover > div.dropdown.hover > div > a")).isDisplayed();
		Assert.assertTrue(visible);
	}
	
	
	//contextClick
	@Test
	public void contextClick() {
		
		WebElement ele = driver.findElement(By.cssSelector("#double-click"));
		action.contextClick(ele).build().perform();
	}	
	
	@AfterMethod
	public void closeBroser() {
		driver.close();
	}
	
}