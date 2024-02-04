package testNG_framework;

import org.testng.annotations.Test;

public class Groups2 {
	@Test(groups = { "regression" })
	public void test6() {
		System.out.println("This is test6...");
	}

	@Test(groups = "login")
	public void test7() {
		System.out.println("This is test7...");
	}

	@Test(groups = { "login", "regression" })
	public void test8() {
		System.out.println("This is test8...");
	}

}
