package com.mercury.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.mercury.basedriver.Basedriver;

public class Page_DeliveryAddress extends Basedriver {
	public void deliveryaddress(String delAddress1, String delAddress2, String delCity, String delState,
			String delZip, String delCountry) throws InterruptedException {
		Thread.sleep(2000);

		// address 1 and 2
		driver.findElement(By.name("delAddress1")).clear();
		driver.findElement(By.name("delAddress1")).sendKeys(delAddress1);

		driver.findElement(By.name("delAddress2")).clear();
		driver.findElement(By.name("delAddress2")).sendKeys(delAddress2);

		// city
		driver.findElement(By.xpath(".//*[contains(@name,'delCity')]")).clear();
		driver.findElement(By.xpath(".//*[contains(@name,'delCity')]")).sendKeys(delCity);

		// state
		driver.findElement(By.xpath("//*[contains(@name,'delCity')]//following::tr//td//input[@name='delState']"))
				.clear();
		driver.findElement(By.xpath("//*[contains(@name,'delCity')]//following::tr//td//input[@name='delState']"))
				.sendKeys(delState);

		// postal code
		driver.findElement(By.xpath(".//*[contains(@name,'delCountry')]//preceding::td//input[@name='delZip']"))
				.clear();
		driver.findElement(By.xpath(".//*[contains(@name,'delCountry')]//preceding::td//input[@name='delZip']"))
				.sendKeys(delZip);

		// country
		WebElement country = driver.findElement(By.xpath(".//*[contains(@name,'delCountry')]"));
		Select dd_country = new Select(country);
		dd_country.selectByVisibleText(delCountry);

	}	

	// accept alert
	public void acceptalert() throws InterruptedException {
		Thread.sleep(1000);
		// alert accepted
		driver.switchTo().alert().accept();
		Reporter.log("Alert accepted.");
		System.out.println("Alert accepted.");

	}

	// same as billing address chosen
	public void sameasbilingaddress() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				".//*[contains(@name,'billCountry')]//following::tr[@bgcolor='#CCCCCC'] //td[@align='right']//input"))
				.click();

		System.out.println("Delivery address furnised and 'same as billing address' clicked.");
		Reporter.log(("Delivery address furnised and 'same as billing address' clicked."));

	}
	// screenshot
	public void screenshotreservation() throws IOException {
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(".//images//reservation.png"));		
		System.out.println("Reservation image obtained and saved.");
		Reporter.log("Reservation image obtained and saved.");
	}

	
}
