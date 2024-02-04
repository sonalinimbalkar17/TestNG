package testNG_framework;

import org.testng.annotations.Test;

public class Groups1 {
	
	//groups----execute specific number of test
	@Test(groups = "login")
	public static void test1() {
		System.out.println("This is test1...");
	}

	@Test
	public static void test2() {
		System.out.println("This is test2...");
	}

	@Test(groups = "login")
	public static void test3() {
		System.out.println("This is test3...");
	}

	@Test
	public static void test4() {
		System.out.println("This is test4...");
	}

	@Test(groups = "login")
	public static void test5() {
		System.out.println("This is test5...");
	}


}
