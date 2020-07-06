package com.mercury.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Reporter;

import com.mercury.basedriver.Basedriver;

public class Page_ContinueAndReserveFlight extends Basedriver {

	// continue to find flights
	public void continuetoflights() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@name='findFlights']")).click();

	}

	// choose unified airlines only
	public void selectflights() throws InterruptedException {
		Thread.sleep(1000);
		// depart with Unified airline
		driver.findElement(By.xpath(".//*[@name='outFlight' and contains(@value,'Unified')]")).click();
		// return with Unified airline
		driver.findElement(By.xpath(".//*[@name='inFlight' and contains(@value,'Unified')]")).click();
	}

	// screenshot
	public void screeshotofselectedflights() throws IOException {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(".//images//selectedFlights.png"));

	}

	// continue to reserve flights
	public void continuetoreserve() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				".//*[@name='inFlight' and contains(@value,'Unified')]//following::input[@name='reserveFlights']"))
				.click();

	}

	// Validate
	public void validateurl(String expectedurl) {
		// String expectedurl1= "http://newtours.demoaut.com/mercurypurchase.php";

		if (expectedurl.equals(driver.getCurrentUrl())) {
			System.out.println("Reseved flights and navigated to passenger details page.");
			Reporter.log("Reseved flights and navigated to passenger details page.");
		} else {
			System.out.println("Something went wrong.");
			Reporter.log("Something went wrong.");
		}

	}

}
