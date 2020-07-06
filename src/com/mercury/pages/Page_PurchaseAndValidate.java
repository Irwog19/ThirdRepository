package com.mercury.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Reporter;

import com.mercury.basedriver.Basedriver;

public class Page_PurchaseAndValidate extends Basedriver {

	// secure purchase
	public void purchaseticket() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[contains(@name, 'delCountry')]//following::td//input[@name='buyFlights']"))
				.click();

	}

	// validation
	public void validatepurchase(String purchaseconfirmationurl) throws InterruptedException {
		Thread.sleep(1000);
		// Sring purchasconfirmationurl=
		// "http://newtours.demoaut.com/mercurypurchase2.php";
		if (driver.getCurrentUrl().equals(purchaseconfirmationurl)) {
			System.out.println("Purchase validation is successfully done.");
			Reporter.log("Purchase validation is successfully done.");
		} else {
			System.out.println("Purchase validation unsuccessfull.");

		}

	}

	// screenshot
	public void screenshotpurchase() throws IOException {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(".//images//purchaseconfirmation.png"));

		System.out.println("Purchase confirmation image obtained and saved.");
		Reporter.log("Purchase confirmation image obtained and saved.");

	}

	// back to home screen
	public void backtohome() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@src='/images/forms/home.gif']")).click();

		System.out.println("Navigated back to home screen.");
		Reporter.log("Navigated back to home screen.");

	}
	
	// validate homescreen
	//

}
