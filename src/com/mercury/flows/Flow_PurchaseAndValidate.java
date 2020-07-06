package com.mercury.flows;

import java.io.IOException;

import com.mercury.basedriver.Basedriver;
import com.mercury.pages.Page_PurchaseAndValidate;

public class Flow_PurchaseAndValidate extends Basedriver {
	Page_PurchaseAndValidate ppv = new Page_PurchaseAndValidate();
	public void purchaseandvalidate_flow(String purchaseconfirmationurl) throws InterruptedException, IOException {
		ppv.purchaseticket();
		ppv.validatepurchase(purchaseconfirmationurl);
		ppv.screenshotpurchase();
		ppv.backtohome();
		
	}
	

}
