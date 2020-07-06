package com.mercury.flows;

import com.mercury.basedriver.Basedriver;
import com.mercury.pages.Page_CreditCard;

public class Flow_CreditCard extends Basedriver {
	Page_CreditCard pcc= new Page_CreditCard();
	public void creditcard_flow(String cardtype, String cardnumber, String expirymonth, String expiryyear, String cc_firstname, String cc_middlename, String cc_lastname ) throws InterruptedException {
		pcc.creditcard(cardtype, cardnumber, expirymonth, expiryyear, cc_firstname, cc_middlename, cc_lastname);
	}

}
