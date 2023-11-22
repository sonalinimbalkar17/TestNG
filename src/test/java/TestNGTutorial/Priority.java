package TestNGTutorial;

import org.testng.annotations.Test;

public class Priority {

	@Test (priority = 1)

	public void betaTest() {
		System.out.println("Beta test is passed");
	}
	
	
	@Test (priority = 2)
	public void alphaTest() {
		System.out.println(" alpha test is passed");
	}
	
	@Test (priority = 3)
	public void gammaTest() {
		System.out.println("gamma test is passed");
	}
	
	@Test(priority = 0)
	public void zeroTest() {
		System.out.println("Zero  test is passed");
	}
	
	@Test(priority = -1)
	public void ZzeroTest() {
		System.out.println("Minus  test is passed");
	}
	
	
	
	
	
	
}
