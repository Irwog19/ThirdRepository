package com.mercury.basedriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Basedriver {

	public static WebDriver driver = null;

	@BeforeTest
	@Parameters({ "url" }) // mercury url is specified in the xml file
	// Initialise browser
	public void basedriver(String url) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");// initialixed chrome
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		Thread.sleep(1000);
		driver.get(url); // travel site opened
		System.out.println("Browser initialised and website opened.");
		Reporter.log("Browser initialised and website opened.");

	}

	@AfterTest
	// close browser
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
