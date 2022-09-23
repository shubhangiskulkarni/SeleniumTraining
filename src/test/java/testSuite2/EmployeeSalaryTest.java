package testSuite2;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Salary.EmployeeSalary;
import utilities.LoggerForTests;

public class EmployeeSalaryTest {

	EmployeeSalary empSal = new EmployeeSalary();

	@Test
	public void validateEmpId() {

		int expectedEmpId = 16;
		int actualEmpId;

		actualEmpId = empSal.getEmpId(expectedEmpId);

		Assert.assertEquals(actualEmpId, expectedEmpId);

		// Assert.assertEquals(empSal.getEmpId(16), 16);

	}

	@Test
	public void validateEmpName() {

		String name = "Shardul";
		String nm;
		nm = empSal.getEmpName(name);
		Assert.assertEquals(nm, name);

	}

	@Test

	public void validateEmpDiv() {
		String empDiv;
		String divNm = "Devloper";
		empDiv = empSal.getEmpDivision(divNm);
		Assert.assertEquals(empDiv, divNm);

	}

	@Test

	public void validateEmpId1() {

		int id;
		int empId = 20;
		id = empSal.getEmpId(empId);
		Assert.assertEquals(id, empId);

	}

	@Test
	public void validateEmpNm()

	{
		String eNm;
		String eName = "Shardul";

		eNm = empSal.getEmpName(eName);

		Assert.assertEquals(eNm, eName);

	}

	@Test
	public void validateempDiv() {

		String div;
		String empDiv = " Product Owner";

		div = empSal.getEmpDivision(empDiv);
		Assert.assertEquals(div, empDiv);

	}

	@Test
	public void ValidateEmpSal() {

		float sal;
		float empsal = 5000.00f;

		sal = empSal.getEmpSalary(empsal);
		Assert.assertEquals(sal, empsal);

	}

	@Test
	public void validateMaxInt() {

		int max;
		int jMax = 2147483647;

		max = empSal.getEmpId(jMax);

		Assert.assertEquals(max, jMax);

	}

	@Test
	public void validateMinValue() {

		int min;
		int jmin = -2147483648;

		min = empSal.getEmpId(jmin);
		Assert.assertEquals(min, jmin);

	}

	@DataProvider
	public Object[][] dataForEmpName() {

		Object[][] Nmdata = {

				{ "Shardul", 10 }, { "Shubhangi", 122 }, { "Shardul", 122 }, { "Shubhangi", 122 }, { "Shardul", 122 },
				{ "Shubhangi", 122 }, { "Shardul", 122 }, { "Shubhangi", 122 }, { "Shardul", 122 },
				{ "Shubhangi", 122 }, { "Shardul", 122 }, { "Shubhangi", 122 }, { "Shardul", 1 }

		};

		return Nmdata;

	}

	@Test(dataProvider = "dataForEmpName")
	public void validateEmpName1(String nm, int id) {

		String aNm;
		aNm = empSal.getEmpName(nm);
		Assert.assertEquals(aNm, nm);

	}

	@DataProvider
	public Object[][] dataEmpSal() {

		Object[][] empSal = { { 500.00f }, { 501.00f }, { 502.00f }, { 503.00f }, { 504.00f }, { 505.00f } };

		return empSal;

	}

	@Test(dataProvider = "dataEmpSal")
	public void validateEmpSalDP(float sal) {

		float empSal1;
		empSal1 = empSal.getEmpSalary(sal);
		Assert.assertEquals(empSal1, sal);

	}

	@DataProvider
	public Object[][] dataEmpDiv() {

		Object[][] empDiv = { { "Tester" }, { "Dev" }, { "Pwoner" }, { "Dir" }, { "VP" } };
		return empDiv;

	}

	@Test(dataProvider = "dataEmpDiv")
	public void validateEmpDiv1(String empDiv)

	{
		String aempDiv;
		LoggerForTests.info("Info log from employee division validation. Expected value is " + empDiv);

		aempDiv = empSal.getEmpDivision(empDiv);

		Assert.assertEquals(aempDiv, empDiv);
	}

}