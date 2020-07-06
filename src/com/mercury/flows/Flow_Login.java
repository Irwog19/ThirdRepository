package com.mercury.flows;

import java.io.IOException;

import com.mercury.basedriver.Basedriver;
import com.mercury.pages.Page_Login;

public class Flow_Login extends Basedriver {
	Page_Login pl = new Page_Login();
	public void login_flow(String username, String password) throws InterruptedException, IOException {
		pl.login(username, password);
		pl.screenshotlogin();
		pl.validatelogin();
		
	}

}
