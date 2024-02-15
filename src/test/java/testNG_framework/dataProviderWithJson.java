package testNG_framework;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderWithJson {

	public static WebDriver driver;
	String url = "https://www.saucedemo.com/v1/index.html";
	JSONArray userData;

	@BeforeTest
	public void setUp() throws IOException, ParseException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver21\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		JSONParser parser = new JSONParser();
		FileReader file = new FileReader(
				"C:\\Users\\Sakshi Services SSE\\eclipse-workspace\\testNG\\src\\test\\java\\testNG_framework\\loginCredentials.json");
		Object obj = parser.parse(file);
		userData = (JSONArray) obj;
		System.out.println(userData);
	}
	// JSON file ----- Parse ------> JSON array ----(json object) ---- [[][]]

	@DataProvider(name = "loginData")
	public Object[][] loginData() {
		Object[][] data = new Object[2][2];
		for (int i = 0; i < userData.size(); i++) {

			JSONObject user = (JSONObject) userData.get(i);
			data[i][0] = user.get("username").toString();
			data[i][1] = user.get("password").toString();
		}
		return data;
	}

	@Test(dataProvider = "loginData")
	public void loginTest(String username, String password) {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/index.html");
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
