package com.mercury.testcases;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mercury.basedriver.Basedriver;
import com.mercury.flows.Flow_ContinueAndReserveFlight;

public class TC3 extends Basedriver {
	Flow_ContinueAndReserveFlight fcr= new Flow_ContinueAndReserveFlight();
	
	@Test
	@Parameters ({"expectedurl"})
	public void test_continueandreserveflights(String expectedurl) throws InterruptedException, IOException {
		fcr.continueandreserveflight_flow(expectedurl);
	}
	
}
