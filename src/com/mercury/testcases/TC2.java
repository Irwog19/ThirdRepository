package com.mercury.testcases;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mercury.basedriver.Basedriver;
import com.mercury.flows.Flow_Flight;

public class TC2 extends Basedriver {
	Flow_Flight ff = new Flow_Flight();
	
	@Test//this is the actual test
	@Parameters ({"noofpassengers","departfrom","departmonth","departday","arrivein","returningmonth","returningday", "airline"})
	public void test_flight(String noofpassengers, String  departfrom, String  departmonth, String  departday, String  arrivein, String  returningmonth, String  returningday, String airline) throws InterruptedException, IOException {
		ff.flight_flow(noofpassengers, departfrom, departmonth, departday, arrivein, returningmonth, returningday, airline);
	}	

}
