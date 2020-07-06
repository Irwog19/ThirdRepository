package com.mercury.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.mercury.basedriver.Basedriver;

public class Page_BillingAddress extends Basedriver {
	// billing address
	public void billingaddress(String billAddress1, String billAddress2, String billCity, String billState,
			String billZip, String billCountry) throws InterruptedException {
		Thread.sleep(2000);
		// address line 1 & 2
		driver.findElement(By.xpath(".//*[@name='billAddress1']")).clear();
		driver.findElement(By.xpath(".//*[@name='billAddress1']")).sendKeys(billAddress1);
		driver.findElement(By.xpath(".//*[@name='billAddress1']//following::input[1]")).sendKeys(billAddress2);

		// city
		driver.findElement(By.xpath(".//*[@name='billCity']")).clear();
		driver.findElement(By.xpath(".//*[@name='billCity']")).sendKeys(billCity);

		// state/province
		driver.findElement(By.xpath(".//*[@name='billState']")).clear();
		driver.findElement(By.xpath(".//*[@name='billState']")).sendKeys(billState);

		// postcode
		driver.findElement(By.xpath(".//*[@name='billZip']")).clear();
		driver.findElement(By.xpath(".//*[@name='billZip']")).sendKeys(billZip);

		// country
		WebElement country = driver.findElement(By.xpath(".//*[@name='billCountry']"));
		Select dd_country = new Select(country);
		dd_country.selectByVisibleText(billCountry);

	}

	public void ticketlesstravel() {
		driver.findElement(By.xpath(".//*[@name='delAddress1']//preceding::td[@align='right']"
				+ "//following::font[contains(text(),'Ticket')]//preceding::input[@name='ticketLess']")).click();

		System.out.println("Billing address furnised and ticketless travel clicked.");
		Reporter.log(("Billing address furnised and ticketless travel clicked."));
	}
	
	

}
