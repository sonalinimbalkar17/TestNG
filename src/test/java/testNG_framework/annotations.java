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

public class annotations {
	@BeforeSuite
	public static void beforeSuite() {
		System.out.println("before suite");
	}

	@BeforeTest
	public static void beforeTest() {
		System.out.println("before test");
	}

	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class");
	}

	@BeforeMethod
	public static void beforeMethod() {
		System.out.println("before method");
	}

	// method 1
	@Test
	public static void test1() {
		System.out.println("test one");
	}

	// method 2
	@Test
	public static void test2() {
		System.out.println("test two");
	}

	@AfterMethod
	public static void afterMethod() {
		System.out.println("after method");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("after class");
	}

	@AfterTest
	public static void afterTest() {
		System.out.println("after test");
	}

	@AfterSuite
	public static void afterSuite() {
		System.out.println("after suite");
	}

}
