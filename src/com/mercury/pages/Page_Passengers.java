package com.mercury.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.mercury.basedriver.Basedriver;

//passengers details
public class Page_Passengers extends Basedriver {
	public void passengerinfo(String firstname1, String lastname1, String mealtype1, String firstname2,
			String lastname2, String mealtype2) throws InterruptedException {
		Thread.sleep(1000);
		// Passenger1 name and meal
		driver.findElement(By.xpath(".//*[@name='passFirst0']")).sendKeys(firstname1);
		driver.findElement(By.xpath(".//*[@name='passFirst0']//following::input[@name='passLast0']"))
				.sendKeys(lastname1);
		WebElement meal1 = driver.findElement(By.xpath("//*[@name='pass.0.meal']"));
		Select dd_meal1 = new Select(meal1);
		dd_meal1.selectByVisibleText(mealtype1);

		// Passenger2 name and meal
		driver.findElement(By.xpath(".//*[@name='passFirst1']")).sendKeys(firstname2);
		driver.findElement(By.xpath(".//*[@name='passFirst1']//following::input[@name='passLast1']"))
				.sendKeys(lastname2);
		WebElement meal2 = driver
				.findElement(By.xpath(".//*[@name='passLast1']//following::select[@name='pass.1.meal']"));
		Select dd_meal2 = new Select(meal2);
		dd_meal2.selectByVisibleText(mealtype2);
		
		System.out.println("Passengers(2) details provided.");
		Reporter.log("Passengers(2) details provided.");

	}

}
