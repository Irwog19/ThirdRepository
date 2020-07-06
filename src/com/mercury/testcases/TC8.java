package com.mercury.testcases;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mercury.basedriver.Basedriver;
import com.mercury.flows.Flow_PurchaseAndValidate;

public class TC8 extends Basedriver {
	Flow_PurchaseAndValidate fpv = new Flow_PurchaseAndValidate();
	@Test
	@Parameters({"purchaseconfirmationurl"})
	public void test_purchaseandvalidate(String purchaseconfirmationurl) throws InterruptedException, IOException {
		fpv.purchaseandvalidate_flow(purchaseconfirmationurl);		
	}

}
