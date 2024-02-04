package testNG_framework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testA {

	@BeforeSuite
	public static void BeforeSuite() {
		System.out.println("before suite is executed");
	}

	@AfterSuite
	public static void AfterSuite() {
		System.out.println("after suite is executed");
	}

	@BeforeTest
	public static void BeforeTest() {
		System.out.println("before test is executed");
	}

	@AfterTest
	public static void AfterTest() {
		System.out.println("after test is executed");
	}

	@BeforeClass
	public static void BeforeClass() {
		System.out.println("before class is executed");
	}

	@AfterClass
	public static void AfterClass() {
		System.out.println("after class is executed");
	}

	@BeforeMethod
	public static void BeforeMethod() {
		System.out.println("before method is executed");
	}

	@AfterMethod
	public static void AfterMethod() {
		System.out.println("after method is executed");
	}
	
	@Test
	public static void testOne() {
		System.out.println("test one");
	}
	
	@Test
	public static void testTwo() {
		System.out.println("test two");
	}
}
