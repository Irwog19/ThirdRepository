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

// flight details
public class Page_Flight extends Basedriver { 
	public void triptype() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//input[@value='oneway']")).click();
		driver.findElement(By.xpath(".//input[@value='oneway']//preceding::input[@value='roundtrip']")).click();

	}

	// no of passengers
	public void passengers(String noofpassengers) throws InterruptedException {
		Thread.sleep(1000);
		WebElement passengers = driver.findElement(By.xpath(".//*[@name='passCount']"));
		Select dd_passengers = new Select(passengers);
		dd_passengers.selectByValue(noofpassengers);

	}

	// departure/arrival details
	public void departureinformation(String departfrom, String departmonth, String departday, String arrivein)
			throws InterruptedException {
		Thread.sleep(1000);

		WebElement departurefrom = driver
				.findElement(By.xpath(".//*[@name='passCount']//following::select[@name='fromPort']"));
		Select dd_departurefrom = new Select(departurefrom);
		dd_departurefrom.selectByValue(departfrom);

		WebElement departuremonth = driver
				.findElement(By.xpath(".//*[@name='fromPort']//following::select[@name='fromMonth']"));
		Select dd_departuremonth = new Select(departuremonth);
		dd_departuremonth.selectByVisibleText(departmonth);

		WebElement departureday = driver
				.findElement(By.xpath(".//*[@name='toPort']//preceding::select[@name='fromDay']"));
		Select dd_departureday = new Select(departureday);
		dd_departureday.selectByValue(departday);

		WebElement arrival = driver.findElement(By.xpath(".//*[@name='toPort']"));
		Select dd_arrival = new Select(arrival);
		dd_arrival.selectByValue(arrivein);

	}

	// return details
	public void returninformation(String returningmonth, String returningday) throws InterruptedException {
		Thread.sleep(2000);

		WebElement returnmonth = driver
				.findElement(By.xpath(".//*[@name='toDay']//preceding::select[contains(@name,'toMonth')]"));
		Select dd_returnmonth = new Select(returnmonth);
		dd_returnmonth.selectByVisibleText(returningmonth);

		WebElement returnday = driver.findElement(By.xpath(".//*[@name='toDay']"));
		Select dd_returnday = new Select(returnday);
		dd_returnday.selectByVisibleText(returningday);

	}

	// preferences
	public void preferences(String airline) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//input[contains(@value,'First')]")).click();

		WebElement airlines = driver
				.findElement(By.xpath(".//input[contains(@value,'First')]//following::td[2]//select[@name='airline']"));
		Select dd_airlines = new Select(airlines);
		dd_airlines.selectByVisibleText(airline);

	}

	// screenshot
	public void screenshotflight() throws IOException {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(".//images.png"));

		System.out.println("Flight details furnised, screenshot obtained/saved.");
		Reporter.log("Flight details furnised, screenshot obtained/saved.");

	}

}
