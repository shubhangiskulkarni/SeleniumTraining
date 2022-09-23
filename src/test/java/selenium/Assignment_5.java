package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/* Please fill the form in the below URL for all possible given inputs
• Please use required unique property (name or id or class name) for
the given web elements
https://omayo.blogspot.com/

*/

public class Assignment_5 {

	@Test
	public void validateWebPageload() {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\shubh\\Downloads\\edgedriver_win64\\msedgedriver.exe");

		WebDriver edgeDriver = new EdgeDriver();

		edgeDriver.get("https://omayo.blogspot.com");

		String screenTitle = edgeDriver.getTitle();
		Assert.assertEquals(screenTitle, "omayo (QAFox.com)");

		edgeDriver.close();

	}

	@Test
	public void validateTextAreaField() {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\shubh\\Downloads\\edgedriver_win64\\msedgedriver.exe");

		WebDriver edgeDriver = new EdgeDriver();
		edgeDriver.get("https://omayo.blogspot.com");

		WebElement texAreaFld = edgeDriver.findElement(By.id("ta1"));

		texAreaFld.sendKeys("fhrfhfhfjfjgfjgjh");
		edgeDriver.close();

	}

	// textbox1
	@Test
	public void validateTexbox1() {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\shubh\\Downloads\\edgedriver_win64\\msedgedriver.exe");

		WebDriver edgeDriver = new EdgeDriver();
		edgeDriver.get("https://omayo.blogspot.com");

		WebElement texBox1 = edgeDriver.findElement(By.id("textbox1"));

		texBox1.click();
		texBox1.clear();

		texBox1.sendKeys("From send keys");
		edgeDriver.close();

	}

	@Test
	public void validateButton2() {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\shubh\\Downloads\\edgedriver_win64\\msedgedriver.exe");

		WebDriver edgeDriver = new EdgeDriver();
		edgeDriver.get("https://omayo.blogspot.com");

		WebElement we = edgeDriver.findElement(By.id("but2"));

		boolean isDisplaye = we.isDisplayed();

		Assert.assertEquals(isDisplaye, true);

		String buttonText = we.getText();

		Assert.assertEquals(buttonText, "Button2");
		edgeDriver.close();

	}

	@Test
	public void validateButton1() {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\shubh\\Downloads\\edgedriver_win64\\msedgedriver.exe");

		WebDriver edgeDriver = new EdgeDriver();
		edgeDriver.get("https://omayo.blogspot.com");

		WebElement we = edgeDriver.findElement(By.id("but1"));

		boolean disable = we.isEnabled();

		Assert.assertEquals(disable, false);
		edgeDriver.close();

	}
	
	
// Enter your name in Username Text box.
	
	
	@Test
	public void validateUserName ()
	{
		
		//Tell system from where to pick WebDriver executable file.
		System.setProperty("webdriver.edge.driver", "C:\\Users\\shubh\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		
		//Create WebDriver object for Edge Driver
		WebDriver edgeDriver = new EdgeDriver();
		
		//Point WebDriver  to a desired WebDriver 
		edgeDriver.get("http://omayo.blogspot.com/");
		
		//find web element from the same WebPage.
		WebElement we =edgeDriver.findElement(By.name("userid"));
		 
		//perform actions on the WebElement.
		we.sendKeys("Shubhangi Kulkarni");
		
	}
	
	
	@Test
	public void validatePassword()
	{
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\shubh\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriver edgeDriver = new EdgeDriver(); 
		edgeDriver.get("http://omayo.blogspot.com/");
		
		WebElement we = edgeDriver.findElement(By.name("pswrd"));
		we.sendKeys("Abcdefg");
		
	
		
		
		
		
		
		
	}
	
	@Test
	public void ValidateButtonX()
	{
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\shubh\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriver edgeDriver = new EdgeDriver();
		
		edgeDriver.get("http://omayo.blogspot.com/");
		
		WebElement we = edgeDriver.findElement(By.id("button9"));
		we.click()	;
		
		
	}
	
	
	
	@Test
	public void ValiadateButtonX1()
	{
		
	System.setProperty("webdriver.edge.driver", "C:\\Users\\shubh\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	
	WebDriver edgeDriver = new EdgeDriver();
	
	edgeDriver.get("http://omayo.blogspot.com/");
	
	WebElement we = edgeDriver.findElement(By.id("button9"));
	   //we.getText(): String - WebElement
		String getTex = we.getText();
		
		 System.out.println("Button 9 is " + getTex);
		 
		// we.isDisplayed(): boolean- WebElement
		 
		boolean isdisplay = we.isDisplayed();
		Assert.assertEquals(isdisplay, true);
		
		
	}
	@Test
	public void ValidateSameIDName()
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\shubh\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriver edgeDriver = new EdgeDriver();
		edgeDriver.get("http://omayo.blogspot.com/");
		WebElement we = edgeDriver.findElement(By.id("HTML23"));
		
	WebElement we1	= we.findElement(By.id("sa"));
		String tex = we1.getText();
		Assert.assertEquals(tex,"SameIDName");
	//test case Fail..	
		
	}
	
@Test
public void ValidateLocateusingClass()
{
	System.setProperty("webdriver.edge.driver","C:\\Users\\shubh\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	
	WebDriver edgeDriver = new EdgeDriver();
	edgeDriver.get("http://omayo.blogspot.com/");
	WebElement we = edgeDriver.findElement(By.id("HTML24"));
	WebElement we1 = we.findElement(By.className("classone"));
	we1.sendKeys("Locate Using Class by Shubhangi!");
	
}
	
@Test
public void ValidateElementHavingSameClass()
{
	System.setProperty("webdriver.edge.driver","C:\\Users\\shubh\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	
	WebDriver edgeDriver = new EdgeDriver();
	edgeDriver.get("http://omayo.blogspot.com/");
	WebElement we = edgeDriver.findElement(By.id("HTML28"));
	WebElement we1 = we.findElement(By.className("classone"));
	we1.sendKeys("Element Having Same Class by Shubhangi!");
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
