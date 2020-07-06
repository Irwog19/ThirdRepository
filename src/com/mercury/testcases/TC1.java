package com.mercury.testcases;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mercury.basedriver.Basedriver;
import com.mercury.flows.Flow_Login;

public class TC1 extends Basedriver {//I am checking the login finctionality after the before suite/test
	Flow_Login fl = new Flow_Login();
	
	@Test
	//We need to supply the below parameters as we are sending the values via xml
	@Parameters({"username", "password"})
	public void test_login(String username, String password) throws InterruptedException, IOException {
		fl.login_flow(username, password);
		
	}

}
