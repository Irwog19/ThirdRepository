package com.mercury.flows;

import com.mercury.basedriver.Basedriver;
import com.mercury.pages.Page_BillingAddress;

public class Flow_BillingAddress extends Basedriver {
	Page_BillingAddress pba= new Page_BillingAddress();
	public void billingaddress_flow(String billAddress1, String billAddress2, String billCity, String billState, String billZip, String billCountry) throws InterruptedException {
		pba.billingaddress(billAddress1, billAddress2, billCity, billState, billZip, billCountry);
		pba.ticketlesstravel();
	}

}
