package com.mercury.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.mercury.basedriver.Basedriver;

public class Page_CreditCard extends Basedriver {
	
	public void creditcard(String cardtype, String cardnumber, String expirymonth, String expiryyear, String cc_firstname, String cc_middlename, String cc_lastname ) throws InterruptedException {
		Thread.sleep(1000);
		// creditcard type
		WebElement creditcard =driver.findElement(By.xpath(".//*[contains(@name,'creditCard')]"));
		Select dd_creditcard = new Select(creditcard);
		dd_creditcard.selectByVisibleText(cardtype);
		
		// card number
		driver.findElement(By.xpath(".//*[contains(@name,'creditnumber')]")).sendKeys(cardnumber);
		
		// expiry month
		WebElement expmonth = driver.findElement(By.xpath(".//*[contains(@name,'cc_exp_dt_mn')]"));
		Select dd_expmonth = new Select(expmonth);
		dd_expmonth.selectByVisibleText(expirymonth);
		
		// expiry year
		WebElement expyear = driver.findElement(By.xpath(".//*[contains(@name,'cc_exp_dt_yr')]"));
		Select dd_expyear = new Select(expyear);
		dd_expyear.selectByValue(expiryyear);	
		
		//card holder info
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[contains(@name,'cc_frst_name')]")).sendKeys(cc_firstname);
		driver.findElement(By.xpath(".//*[contains(@name,'cc_mid_name')]")).sendKeys(cc_middlename);
		driver.findElement(By.xpath(".//*[contains(@name,'cc_last_name')]")).sendKeys(cc_lastname);
		
		System.out.println("Credit card details furnised.");
		Reporter.log("Credit card details furnised.");
	}

}
