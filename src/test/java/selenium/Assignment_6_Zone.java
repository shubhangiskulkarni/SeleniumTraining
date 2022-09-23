package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Assignment_6_Zone {

	@Test
	public void ValidateCovidDetails() throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\shubh\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver edgeDriver = new EdgeDriver();
		edgeDriver.get("http://office.suratsmartcity.com/SuratCOVID19/Home/COVID19BedAvailabilitydetails");

		for (int j = 2; j <= 10; j++) {

			WebElement zone = edgeDriver
					.findElement(By.xpath("//div[@class='clearfix text-right mb-2']//select[2]//option[" + j + "]"));

			zone.click();
			Thread.sleep(1000);

			// reading the element again as page is refreshed after zone.click()
			zone = edgeDriver
					.findElement(By.xpath("//div[@class='clearfix text-right mb-2']//select[2]//option[" + j + "]"));

			System.out.println("Selected zone is : " + zone.getText());

			List<WebElement> hosplist = edgeDriver.findElements(By.xpath("//div[@class='card custom-card']"));

			int noOfHospitals = hosplist.size();
			System.out.println("Total Number of Hospitals : " + noOfHospitals);

			for (int i = 1; i <= noOfHospitals; i++) {

				//// div[@class='card custom-card'][1]//a
				// div[@class='card custom-card'][1]//span[@class='count-text']

				//// div[@class='card custom-card'][2]//a
				WebElement we = edgeDriver.findElement(By.xpath("//div[@class='card custom-card'][" + i + "]//a"));

				String hospNm = we.getText();
				System.out.println("Name of The Hospital :  " + hospNm);

				WebElement totalBeds = edgeDriver.findElement(
						By.xpath("//div[@class='card custom-card'][" + i + "]//span[@class='count-text']"));

				String totalBedCnt = totalBeds.getText();
				System.out.println("Total Available Beds :  " + totalBedCnt);

				we.click();
				Thread.sleep(1000);
				WebElement contNo = edgeDriver.findElement(By.id("lblhosCno"));

				String contno = contNo.getText();
				System.out.println("Contact of The Hospital :  " + contno);

				WebElement close = edgeDriver.findElement(By.xpath("//div[@class='modal-content']//button//span"));
				
				//Name of The Hospital :  SANGINI ADVANCE WOMEN'S CARE Contact - doesn't have dialog for contact number
				if (close.isDisplayed()) {
					close.click();
				}
				Thread.sleep(1000);

				WebElement o2Bed = edgeDriver.findElement(By.xpath("//div[@class='card custom-card'][" + i
						+ "]//ul[@class='list-unstyled list-customised clearfix']/li[2]//div[@class='count-text']"));

				String o2beds = o2Bed.getText();
				System.out.println("O2 beds availability :  " + o2beds);

				WebElement vBed = edgeDriver.findElement(By.xpath("//div[@class='card custom-card'][" + i
						+ "]//ul[@class='list-unstyled list-customised clearfix']/li[4]//div[@class='count-text']"));

				String ventBeds = vBed.getText();
				System.out.println("Ventialtor beds availability :  " + ventBeds);

				System.out.println("--------------------------------------------------");

			}

		}
		edgeDriver.close();
	}

}
