package com.mercury.flows;

import java.io.IOException;

import com.mercury.basedriver.Basedriver;
import com.mercury.pages.Page_Flight;


public class Flow_Flight extends Basedriver {
	Page_Flight pf = new Page_Flight();
	
	public void flight_flow(String noofpassengers, String departfrom, String departmonth, String departday, String arrivein, String returningmonth, String returningday, String airline) throws InterruptedException, IOException {
	//	pf.triptype();
		pf.passengers(noofpassengers);
//		pf.departureinformation( departfrom,  departmonth,  departday,  arrivein);
//		pf.returninformation(returningmonth, returningday);
//		pf.preferences(airline);
//		pf.screenshotflight();
	}

}
