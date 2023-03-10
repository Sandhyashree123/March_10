package com.stepdefi;

import java.time.Duration;

import com.base.Baseclass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooksclass extends Baseclass {
	@Before
	public  void BeforeExecution() {
		browserLaunch("http://adactinhotelapp.com/");
		implicitwait(20);
	}
@After
	public void AfterExecution()  {
	driver.manage().deleteAllCookies();
	implicitwait(20);
	Screenshot("C:\\Users\\Admin\\Desktop\\DataTable\\target","Adactin");
	
	driver.close();
	
		
	}
}
