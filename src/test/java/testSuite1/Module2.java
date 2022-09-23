package testSuite1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Module2 {

	@Test
	public void test001() {

		System.out.println(" I am executing test case 001 from module 2");

	}

	@Test
	public void test002() {

		System.out.println(" I am executing test case 002 from module 2");

	}

	@Test(groups = { "smoke" })
	public void test004() {

		System.out.println(" I am executing test case 004 from module 2 and in groups");

	}

	@Test
	public void test003() {

		System.out.println(" I am executing test case 003 from module 2");

	}
//====================================================================================================================================================

	@BeforeSuite
	public void BeforeSuiteMethod() {
		System.out.println("This is from before suite method from module 2");
	}

	@BeforeTest

	public void BeforeTestmethod() {

		System.out.println("This is Before Test Method from Module 2");

	}

	@BeforeClass
	public void BeforeClassMethod() {

		System.out.println("This is Before Class Method from Module 2");
	}

	@BeforeMethod
	public void BeforeMethodMethod() {

		System.out.println("This is Before Method from Module 2");
	}

	@AfterMethod
	public void AfterMethodMethod() {

		System.out.println("This is After Method from Module 2");
	}

	@AfterClass
	public void AfterClassMethod() {
		System.out.println("This is After Class Method from Module 2");
	}

	@AfterTest
	public void AfterTestMethod() {

		System.out.println("This is After Test Method from Module 2");
	}

	@AfterSuite
	public void AfterSuiteMethod() {
		System.out.println("This is After Suite Method from Module 2");
	}

	@BeforeGroups(groups = { "smoke", "sanity" })
	public void beforeGroup() {
		System.out.println("I am exeuting before group of Smoke/Sanity");
	}

	@AfterGroups(groups = { "smoke", "sanity" })
	public void AfterGroup() {
		System.out.println("I am exeuting After group of Smoke/Sanity");
	}

}
