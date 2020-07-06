package com.mercury.flows;

import com.mercury.basedriver.Basedriver;
import com.mercury.pages.Page_Passengers;

public class Flow_Passengers extends Basedriver {
	Page_Passengers pp = new Page_Passengers();

	public void passengers_flow(String firstname1, String lastname1, String mealtype1, String firstname2,
			String lastname2, String mealtype2) throws InterruptedException {
		pp.passengerinfo(firstname1, lastname1, mealtype1, firstname2, lastname2, mealtype2);

	}

}
