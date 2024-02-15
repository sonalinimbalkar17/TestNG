package testNG_framework;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hard_Soft_assert {
	// hard assert not execute after test then fail test
	// soft assert is execute after fail test
	@Test
	public void testHardAssertion() {
		String myCity = "Pune";
		Assert.assertEquals(myCity, "pune");
		System.out.println("its a big city");
	}

	@Test
	public static void testSoftAssertion() {
		SoftAssert softA = new SoftAssert();
		String myName = "Sonali";
		softA.assertEquals(myName, "sonali");
		System.out.println("my name is" + myName);
		softA.assertEquals(true, true);
		softA.assertAll();
	}
}
