package SeleniumTestNG;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class titleUrl {
	
	@Test
	public void TitleTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com");

		String expectedTitle = "WebDriverUniversity.com";
		String actualTitle = driver.getTitle();
		
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("test case Pass");
		} else {
			System.out.println("test case Fail");
		}

		
		String url=driver.getCurrentUrl();
		if(url.contains("webdriver")) {
			System.out.println("test Case Pass");
		}else {
			System.out.println("test Case Fail");
		}
		
		driver.close();
	}
	
}