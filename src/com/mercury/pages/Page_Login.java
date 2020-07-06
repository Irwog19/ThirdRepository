package com.mercury.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Reporter;

import com.mercury.basedriver.Basedriver;

public class Page_Login extends Basedriver {//libked to base driver

	// login
	public void login(String username, String password) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//input[@name='userName']")).sendKeys(username);
		driver.findElement(By.xpath(".//input[@name='userName']//following::td//input[@name='password']"))
				.sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//input[@name='password']//following::div[@align='center']")).click();

		System.out.println("User logged in successfully.");
		Reporter.log("User logged in successfully.");

	}

	// screenshot
	public void screenshotlogin() throws IOException {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(".//images//login.png"));

		System.out.println("Login screesnshot obtained and saved.");
		Reporter.log("Login screesnshot obtained and saved.");

	}

	// validate login
	public void validatelogin() throws InterruptedException {
		Thread.sleep(1000);

		String expectedtitle = "Find a Flight: Mercury Tours:";

		if (driver.getTitle().equals(expectedtitle)) {
			System.out.println("Login 'title' validation passed.");
			Reporter.log("Login 'title' validation passed.");
		} else {
			System.out.println("Login 'title' validation failed.");
			Reporter.log("Login 'title' validation failed.");
		}
	}

}
