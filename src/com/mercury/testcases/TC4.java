package com.mercury.testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mercury.basedriver.Basedriver;
import com.mercury.flows.Flow_Passengers;

public class TC4 extends Basedriver {
	Flow_Passengers fp = new Flow_Passengers();

	@Test
	@Parameters({ "firstname1", "lastname1", "mealtype1", "firstname2", "lastname2", "mealtype2"})
	public void test_passengers(String firstname1, String lastname1, String mealtype1, String firstname2,
			String lastname2, String mealtype2) throws InterruptedException {
		fp.passengers_flow(firstname1, lastname1, mealtype1, firstname2, lastname2, mealtype2);

	}
}
