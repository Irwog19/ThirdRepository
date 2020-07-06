package com.mercury.testcases;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mercury.basedriver.Basedriver;
import com.mercury.flows.Flow_DeliveryAddress;

public class TC7 extends Basedriver {
	Flow_DeliveryAddress fda = new Flow_DeliveryAddress();
	
	@Test
	@Parameters ({"delAddress1", "delAddress2", "delCity", "delState", "delZip", "delCountry"})
	public void test_deliveryaddress(String delAddress1, String delAddress2, String delCity, String delState,
			String delZip, String delCountry) throws InterruptedException, IOException {
		fda.deliveryaddress_flow(delAddress1, delAddress2, delCity, delState, delZip, delCountry);
	}

}
