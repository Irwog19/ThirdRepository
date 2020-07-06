package com.mercury.flows;

import java.io.IOException;

import com.mercury.basedriver.Basedriver;
import com.mercury.pages.Page_DeliveryAddress;

public class Flow_DeliveryAddress extends Basedriver {
	Page_DeliveryAddress pda = new Page_DeliveryAddress();

	public void deliveryaddress_flow(String delAddress1, String delAddress2, String delCity, String delState,
			String delZip, String delCountry) throws InterruptedException, IOException {
		pda.deliveryaddress(delAddress1, delAddress2, delCity, delState, delZip, delCountry);
		pda.acceptalert();
		pda.sameasbilingaddress();
		pda.screenshotreservation();
	}

}
