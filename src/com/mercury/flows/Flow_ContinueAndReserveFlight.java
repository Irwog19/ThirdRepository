package com.mercury.flows;

import java.io.IOException;

import com.mercury.basedriver.Basedriver;
import com.mercury.pages.Page_ContinueAndReserveFlight;

public class Flow_ContinueAndReserveFlight extends Basedriver {
	Page_ContinueAndReserveFlight pcr = new Page_ContinueAndReserveFlight();

	public void continueandreserveflight_flow(String expectedurl) throws InterruptedException, IOException {
		pcr.continuetoflights();
		pcr.selectflights();
		pcr.screeshotofselectedflights();
		pcr.continuetoreserve();
		pcr.validateurl(expectedurl);
	}

}
