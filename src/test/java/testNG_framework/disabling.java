package testNG_framework;

import org.testng.annotations.Test;

public class disabling {
	
	//method are prograce skip this test use enabled
	@Test(priority = 1)
	void test1() {
		System.out.println("test 1");
	}

	@Test(priority = 2, enabled = false)
	void test2() {
		System.out.println("test 2");
	}

	@Test(priority = 3)
	void test3() {
		System.out.println("test 3");
	}
}
