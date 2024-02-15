package testNG_framework;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListeners implements ITestListener {

	// this belongs to ITestListener and will execute before starting of the test set
	public void onStart(ITestResult result) {
		System.out.println("Starts test excution....");
	}

	// this belongs to ITestListener and will execute after starting of the test set
	public void onFinish(ITestResult result) {
		System.out.println("Finish test excution....");
	}

	// this belongs to ITestListener and will execute before the main test start
	// i.e. @Test
	public void onTestStart(ITestResult result) {
		System.out.println("Starts test....");
	}

	// this belongs to ITestListener and will execute when a test is skipped
	public void onTestSkipped(ITestResult result) {
		System.out.println("Skipped test....");
	}

	// this belongs to ITestListener and will execute when a test is passed
	public void onTestSuccess(ITestResult result) {
		System.out.println("Success test....");
	}

	// this belongs to ITestListener and will execute when a test is failed
	public void onTestFailure(ITestResult result) {
		System.out.println("failed test....");
	}

}
