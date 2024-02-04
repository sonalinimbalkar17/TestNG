package testNG_framework;

import org.testng.annotations.Test;

public class priority {
	
	// By default priority is same and zero

	@Test(priority = 1)
	public static void testOne() {
		System.out.println("test one");//print 3rd
	}
	
	@Test(priority = 2)
	public static void testTwo() {
		System.out.println("test two");//print 4th
	}
	
	@Test (priority = 0)
	public static void testThree() {
		System.out.println("test three");//print 2nd
	}
	
	@Test(priority = -1)
	public static void testFour() {
		System.out.println("test four");//print 1st
	}

}
