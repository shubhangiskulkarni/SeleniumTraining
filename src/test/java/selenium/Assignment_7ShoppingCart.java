package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Assignment_7ShoppingCart {

	@Test
	public void ValidateShoppingCart() throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\shubh\\Downloads\\edgedriver_win64\\msedgedriver.exe");

		WebDriver edgeDriver = new EdgeDriver();

// TestStep #1
		edgeDriver.get("http://tutorialsninja.com/demo/index.php");

		try {
			
			
			
			
			


// TestStep #2 
			WebElement we = edgeDriver.findElement(By.id("form-currency"));
			we.click();
			WebElement currency = edgeDriver.findElement(By.name("EUR"));
			currency.click();

// TestStep #3 
			// *[@id='content']/div[2]/div[4]/div/div/a/img

			WebElement camera = edgeDriver.findElement(By.xpath("//*[@id='content']/div[2]/div[4]/div/div/a/img"));
			camera.click();
			WebElement addCameraToCart = edgeDriver.findElement(By.id("button-cart"));
			addCameraToCart.click();

			// Thread.sleep(1000);

			WebDriverWait w = new WebDriverWait(edgeDriver, Duration.ofSeconds(5));

			w.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//*[@class='form-group required has-error']/div")));

			// *[@class='form-group required has-error']/div
			WebElement selectMsg = edgeDriver.findElement(By.xpath("//*[@class='form-group required has-error']/div"));
			System.out.println(selectMsg.getText());

//Teststep #4
			// *[@class='breadcrumb']/li/a/i
			// *[@id="product-product"]/ul/li[1]/a/i //
//			Thread.sleep(2000);
//			edgeDriver.findElement(By.className("fa-home")).click();
			
			Thread.sleep(2000);
			edgeDriver.findElement(By.xpath("//*[@class='breadcrumb']/li/a/i")).click();
			
			Thread.sleep(1000); // *[@id='content']/div[2]/div[2]/div/div[2]/h4/a
			
			WebElement iphone = edgeDriver.findElement(By.xpath("//*[@id='content']/div[2]/div[2]/div/div[2]/h4/a"));
			iphone.click(); //

			WebElement quntity = edgeDriver.findElement(By.id("input-quantity"));

			quntity.clear();

			quntity.sendKeys("2");
			addCameraToCart = edgeDriver.findElement(By.id("button-cart"));

			addCameraToCart.click();
			Thread.sleep(2000);

// TestStep#5 
			// *[@id='product-product']/div
			WebElement successMsg = edgeDriver.findElement(By.xpath("//div[@id='product-product']/div[1]"));

			System.out.println(successMsg.getText());

// TestStep#6

			WebElement cart = edgeDriver.findElement(By.id("cart"));
			cart.click();

			// *[@id="cart"]/ul/li[2]/div/p/a[1]
			WebElement viewCart = edgeDriver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]"));
			viewCart.click();

// Teststep #7

			WebElement changeQuantity = edgeDriver
					.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/input"));

			changeQuantity.clear();
			changeQuantity.sendKeys("3");

			WebElement updateButton = edgeDriver
					.findElement(By.xpath("//*[@id='content']/form/div/table/tbody/tr/td[4]/div/span/button/i"));

			updateButton.click();

// TestStep #8

			// *[@id='content']/div[2]/div[1]//tr[2]/td[2]
			WebElement ecoTax = edgeDriver.findElement(By.xpath("//*[@id='content']/div[2]/div[1]//tr[2]/td[2]"));

			System.out.println("Eco Tax - " + ecoTax.getText());

			// *[@id='content']/div[2]/div[1]//tr[3]/td[2]

			WebElement vat = edgeDriver.findElement(By.xpath("//*[@id='content']/div[2]/div[1]//tr[3]/td[2]"));

			System.out.println("VAT - " + vat.getText());
			Thread.sleep(500);

			// div[@class='pull-right']/a

			WebElement checkOut = edgeDriver.findElement(By.xpath("//div[@class='pull-right']/a"));
			checkOut.click();

// TestStep #9 
			// div[contains(@class,"alert alert-danger alert-dismissible")]

			WebElement productErrorMsg = edgeDriver
					.findElement(By.xpath("//div[contains(@class,\"alert alert-danger alert-dismissible\")]"));

			System.out.println(productErrorMsg.getText());

			// div[@id='content']//tbody/tr/td[4]//span/button[2]/i
			WebElement remove = edgeDriver
					.findElement(By.xpath("//div[@id='content']//tbody/tr/td[4]//span/button[2]/i"));
			remove.click();

			Thread.sleep(1000);

			// div[@id='content']/p
			WebElement display = edgeDriver.findElement(By.xpath("//*[@id=\"content\"]/p"));
//			boolean dis = display.isDisplayed();

			System.out.println("Cart screen displayed? - " + display.isDisplayed());

			Thread.sleep(1000);

			if (display.isDisplayed()) {

				WebElement continuebtn = edgeDriver.findElement(By.xpath("//div[@id='content']/div/div/a"));

				System.out.println("Continue Button displayed? - " + continuebtn.isDisplayed());

				Thread.sleep(1000);

				continuebtn.click();
			} else {

				System.out.println("Cart is not empty!");
			}



// TestStep #10

			Thread.sleep(1000);
			// div[@id='content']/div[2]/div[1]//h4/a
			WebElement macBook = edgeDriver.findElement(By.xpath("//div[@id='content']/div[2]/div[1]//h4/a"));
			macBook.click();

			WebElement macBookQty = edgeDriver.findElement(By.xpath("//div[@id='product']/div/input[1]"));

			Thread.sleep(1000);

			String qtyCheck = macBookQty.getAttribute("value");

			if (qtyCheck.equalsIgnoreCase("1")) {

				System.out.println("Macbook Quntity is 1 ");

			} else {
				System.out.println("Macbook Quntity is NOT 1.");

			}

			WebElement macBookAtc = edgeDriver.findElement(By.id("button-cart"));

			macBookAtc.click();
			Thread.sleep(1000);

			// div[contains(@class,"alert alert-success alert-dismissible")]

			WebElement showSuccessMsg = edgeDriver
					.findElement(By.xpath("//div[contains(@class,\"alert alert-success alert-dismissible\")]"));

			String macBooksuccessMsg = showSuccessMsg.getText();

			if (macBooksuccessMsg.contains("Success: You have added MacBook to your shopping cart!")) {

				System.out.println("Success Message is displayed ");

			} else {
				System.out.println("Success Message is NOT displayed");

			}

//TestStep #11

			// CLICK ON SHOPPING CART
			// div[@class='container']/div[@id='top-links']/ul[@class='list-inline']/li[4]/a
			WebElement shoppingCart = edgeDriver.findElement(
					By.xpath("//div[@class='container']/div[@id='top-links']/ul[@class='list-inline']/li[4]/a"));
			shoppingCart.click();
			System.out.println("Shopping cart displayed.");

			Thread.sleep(500);

			// CLICK ON USE CUPUON CODE
			// div[@id='accordion']//a[contains(@href,"#collapse-coupon")]
			WebElement useCouponCode = edgeDriver
					.findElement(By.xpath("//div[@id='accordion']//a[contains(@href,\"#collapse-coupon\")]"));
			useCouponCode.click();
			System.out.println("Code button clicked.");

			Thread.sleep(3000);

			// TEXT BOX TO ENTER CODE
			WebElement enterCouponCode = edgeDriver.findElement(By.xpath("//div[@id='collapse-coupon']/div/div/input"));
			enterCouponCode.sendKeys("ABCD123");
			System.out.println("Entering code in the text box");
			Thread.sleep(1000);

			// APPLY CODE
			// div[@id='collapse-coupon']/div[@class='panel-body']//input[@id='button-coupon']
			WebElement applyCouponCode = edgeDriver.findElement(By.xpath("//input[@id='button-coupon']"));
			applyCouponCode.click();
			System.out.println("Code applied!");
			Thread.sleep(1000);

			// *[@id="checkout-cart"]/div[1]/text()
			WebElement invalidCuponCodeMsg = edgeDriver
					.findElement(By.xpath("//*[@class='alert alert-danger alert-dismissible']"));
			System.out.println("Cupon error message is- " + invalidCuponCodeMsg.getText());

//TestStep #12		 

			// CLICK ON USE CUPUON CODE
			// div[@id='accordion']//a[contains(@href,"#collapse-coupon")]
			WebElement useGiftCard = edgeDriver
					.findElement(By.xpath("//div[@id='accordion']//a[contains(@href,\"#collapse-voucher\")]"));
			useGiftCard.click();
			System.out.println("Gift Card button clicked.");

			Thread.sleep(3000);

			// TEXT BOX TO ENTER CODE
			WebElement enterGiftCardCode = edgeDriver
					.findElement(By.xpath("//div[@id='collapse-voucher']/div/div/input"));
			enterGiftCardCode.sendKeys("AXDFGH123");
			System.out.println("Entered gift card code in the text box");
			Thread.sleep(1000);

			// APPLY CODE
			// div[@id='collapse-coupon']/div[@class='panel-body']//input[@id='button-coupon']
			WebElement applyGiftCardCode = edgeDriver.findElement(By.xpath("//input[@id='button-voucher']"));
			applyGiftCardCode.click();
			System.out.println("Gift Card Code applied!");
			Thread.sleep(1000);

			// *[@id="checkout-cart"]/div[1]/text()
			WebElement invalidGiftCardCodeMsg = edgeDriver
					.findElement(By.xpath("//*[@class='alert alert-danger alert-dismissible']"));
			System.out.println("Gift Card error message is- " + invalidGiftCardCodeMsg.getText());

//TestStep #13

			Thread.sleep(1000);
			useCouponCode.click();
			Thread.sleep(1000);
			System.out.println("Apply cupoin Code clicked!");
			enterCouponCode.clear();
			System.out.println("Apply cupoin Code cleared!");
			Thread.sleep(1000);
			useGiftCard.click();
			Thread.sleep(1000);
			System.out.println("Apply gift card Code clicked!");
			enterGiftCardCode.clear();
			System.out.println("Cleared Gift Card Code.");
			// div[@id="content"]//div[@class="pull-right"]/a
			WebElement cartCheckOut = edgeDriver
					.findElement(By.xpath("//div[@id=\"content\"]//div[@class=\"pull-right\"]/a"));
			cartCheckOut.click();
			System.out.println("Clicked on checkout.");

//TestStep #14
			
			//button-account
			Thread.sleep(2000);
			WebElement checkoutContinue = edgeDriver.findElement(By.id("button-account"));
			checkoutContinue.click();
			
			
			Thread.sleep(2000);
			//input-payment-firstname
			
			WebElement checkoutFirstName= edgeDriver.findElement(By.id("input-payment-firstname"));
			checkoutFirstName.sendKeys("Ghanashyam");

			WebElement checkoutLastName= edgeDriver.findElement(By.id("input-payment-lastname"));
			checkoutLastName.sendKeys("Sundar");
			//input-payment-email

			WebElement email= edgeDriver.findElement(By.id("input-payment-email"));
			System.out.println("email address registered is: " + "ghanashya.sunder" + Math.random() + "@yahoo.com");
			email.sendKeys("ghanashya.sunder" + Math.random() + "@yahoo.com");
			
			WebElement telephone= edgeDriver.findElement(By.id("input-payment-telephone"));
			telephone.sendKeys("512-400-6789");
			
			WebElement password= edgeDriver.findElement(By.id("input-payment-password"));
			password.sendKeys("Bappamorya!");
			
			WebElement confirmPassword= edgeDriver.findElement(By.id("input-payment-confirm"));
			confirmPassword.sendKeys("Bappamorya!");
			
			Thread.sleep(500);
			
			WebElement companyName= edgeDriver.findElement(By.id("input-payment-company"));
			companyName.sendKeys("Nimpy Ninja");
			
			WebElement address1= edgeDriver.findElement(By.id("input-payment-address-1"));
			address1.sendKeys("412,Spring Hill Pkwy");
			
			WebElement address2= edgeDriver.findElement(By.id("input-payment-address-2"));
			address2.sendKeys("Apt-1300");
			
			WebElement city= edgeDriver.findElement(By.id("input-payment-city"));
			city.sendKeys("Atlanta");
			
			WebElement postCode= edgeDriver.findElement(By.id("input-payment-postcode"));
			postCode.sendKeys("12345");
			
			//WebElement country= edgeDriver.findElement(By.id("input-payment-country"));country.sendKeys("12345");
			
			Thread.sleep(3000);
			WebElement state= edgeDriver.findElement(By.xpath("//*[@id=\"input-payment-zone\"]/option[8]"));
			Thread.sleep(3000);
			state.click();
			Thread.sleep(3000);
			
			//newsletter
			WebElement newsletter= edgeDriver.findElement(By.id("newsletter"));
			newsletter.click();
			
			Thread.sleep(500);
			
			//*[@name="agree"]
			WebElement agree= edgeDriver.findElement(By.xpath("//*[@name=\"agree\"]"));
			agree.click();
			Thread.sleep(500);

			
			//button-register
			WebElement register= edgeDriver.findElement(By.id("button-register"));
			register.click();
			System.out.println("Clicked on register button.");

			Thread.sleep(2000);
			
			//Billing Details
			//a[@href="#collapse-payment-address"]
			
			WebElement billingDetails= edgeDriver.findElement(By.xpath("//a[@href=\"#collapse-payment-address\"]"));
			billingDetails.click();
			Thread.sleep(2000);
			
			WebElement billContinue = edgeDriver.findElement(By.xpath("//*[@id=\"button-payment-address\"]"));
			billContinue.click();
			
			Thread.sleep(2000);
			
//TestStep #15	
			
			//Payment Method/Comment Box///textarea[@name='comment']
			
			WebElement commentsBox= edgeDriver.findElement(By.xpath("//textarea[@name='comment']"));
			commentsBox.sendKeys("I want discount on my Shopping");
			Thread.sleep(500);
			//agree radiobtn-//input[@name='agree']
			
			WebElement agreeTC= edgeDriver.findElement(By.xpath("//input[@type=\"checkbox\"]"));
			agreeTC.click();
			
			///Payment-continue-//'button-payment-method'/
			
			Thread.sleep(500);
			WebElement paymentContinue = edgeDriver.findElement(By.id("button-payment-method"));
			paymentContinue.click();
			
			Thread.sleep(1000);
			
			//warnimgMsg-//div[@class="alert alert-danger alert-dismissible"]
			
			WebElement warningMsg = edgeDriver.findElement(By.xpath("//div[@class=\"alert alert-danger alert-dismissible\"]"));
			System.out.println("Warning :- " + warningMsg.getText());
			
			
			Thread.sleep(1000);


//TestStep #16	
			//contact us-//div[2][@class="col-sm-3"]//li[1]
			
			WebElement contactUs = edgeDriver.findElement(By.xpath("//div[2][@class=\"col-sm-3\"]//li[1]/a"));
			contactUs.click();
			System.out.println("On contact us page!");
			
			Thread.sleep(1000);
			
			WebElement contactEnquiry = edgeDriver.findElement(By.id("input-enquiry"));
			contactEnquiry.sendKeys("Error on Payment");
			
			//input[@type='submit']-submit
			
			WebElement contactUsSubmit = edgeDriver.findElement(By.xpath("//input[@type='submit']"));
			contactUsSubmit.click();
			
			Thread.sleep(1000);			
			//*[@id="content"]/div/div/a
			WebElement contactUsContinueBtn = edgeDriver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a"));
			contactUsContinueBtn.click();

			
		} catch (Exception e) {
			e.printStackTrace();

		}

		Thread.sleep(3000);
		edgeDriver.quit();

	}

}
