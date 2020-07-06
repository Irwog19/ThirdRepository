package com.mercury.testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mercury.basedriver.Basedriver;
import com.mercury.flows.Flow_BillingAddress;

public class TC6 extends Basedriver {
	Flow_BillingAddress fba= new Flow_BillingAddress();
	@Test
	@Parameters({"billAddress1","billAddress2", "billCity","billState" ,"billZip", "billCountry"})
	public void test_billingaddress(String billAddress1, String billAddress2, String billCity, String billState, String billZip, String billCountry) throws InterruptedException {
		fba.billingaddress_flow(billAddress1, billAddress2, billCity, billState, billZip, billCountry);
		
	}

}
