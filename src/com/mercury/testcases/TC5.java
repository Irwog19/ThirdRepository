package com.mercury.testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mercury.basedriver.Basedriver;
import com.mercury.flows.Flow_CreditCard;

public class TC5 extends Basedriver {
	Flow_CreditCard fcc = new Flow_CreditCard();
	
	@Test
	@Parameters ({"cardtype","cardnumber","expirymonth","expiryyear","cc_firstname","cc_middlename","cc_lastname"})
	public void test_creditcard(String cardtype, String cardnumber, String expirymonth, String expiryyear, String cc_firstname, String cc_middlename, String cc_lastname ) throws InterruptedException {
		fcc.creditcard_flow(cardtype, cardnumber, expirymonth, expiryyear, cc_firstname, cc_middlename, cc_lastname);
		
	}

}
