package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.LoggerForTests;

public class SeleniumBasicTest {

	@Test
	public void validateSeleniumSetup() {
		
		
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\shubh\\eclipse-workspace\\Hello-selenium\\src\\test\\resources\\drivers\\msedgedriver.exe");

		WebDriver edgeDriver = new EdgeDriver();
		
		
		
		edgeDriver.get("https://amazon.com");
		String screenTitle = edgeDriver.getTitle();
		
		Assert.assertEquals(screenTitle, "Amazon.com. Spend less. Smile more.");
		
		
		WebElement we = edgeDriver.findElement(By.id("twotabsearchtextbox"));
		
		we.sendKeys("drone");
		
		WebElement searchButton = edgeDriver.findElement(By.id("nav-search-submit-button"));
		
		searchButton.click();
		
		
		LoggerForTests.info("Opening Edge browser.");
		edgeDriver.close();
		
	}

	
	/*
	 * https://cosmocode.io/automation-practice/ (sample is available in drive)
https://www.techlistic.com/p/selenium-practice-form.html (except upload and download)
https://demoqa.com/automation-practice-form 
https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm

	 */
	
	
	
	
	
}
