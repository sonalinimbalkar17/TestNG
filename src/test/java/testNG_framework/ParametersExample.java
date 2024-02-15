package testNG_framework;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExample {
	@Parameters({ "firstName", "lastName", "email", "message" })
	@Test
	public static void myInfo(String fn, String ln, String e, String msg) {
		System.out.println("its my info");
		System.out.println(fn);
		System.out.println(ln);
		System.out.println(e);
		System.out.println(msg);

	}

}
