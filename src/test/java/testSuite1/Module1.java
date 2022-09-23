package testSuite1;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Module1 {

	@Test // TestNG Annotation
	public void test001() { // Method signature = "Access Specifier" "Return Type" "Method Name" (Parameter
							// list) {}

		System.out.println(" I am executing test case 001 from module 1");

	}

	@Test
	public void test002() {

		System.out.println(" I am executing test case 002 from module 1");

	}

	@Test
	public void test003() {

		System.out.println(" I am executing test case 003 from module 1");

		Assert.assertEquals(12, 12);

	}

	@BeforeSuite
	public void BeforeSuiteMethod() {
		System.out.println("This is from before suite method from module 1");
	}

}
