package testNG_framework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency {
	@Test
	public void startCar() {
		System.out.println("car started");// execute only
		Assert.fail();
	}

	// ignore this test fail because all methods are depends
	@Test(dependsOnMethods = { "startCar" })
	public void driveCar() {
		System.out.println("car drived");
	}

	@Test(dependsOnMethods = { "driveCar" })
	public void stopCar() {
		System.out.println("car stoped");
	}

	@Test(dependsOnMethods = { "startCar", "stopCar" }, alwaysRun = true)
	public void parkCar() {
		System.out.println("car parked");//car parked
	}

}
