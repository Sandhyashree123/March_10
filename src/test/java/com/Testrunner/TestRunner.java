package com.Testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Admin\\Desktop\\DataTable\\src\\test\\resources\\Feature\\login.feature",glue="com.stepdefi",
plugin={"json:C:\\Users\\Admin\\Desktop\\DataTable\\target\\loginjvm.json"})
public class TestRunner {
	
	@AfterClass
	public static void tc0() {
		CucumberJVM.generatingReport("C:\\Users\\Admin\\Desktop\\DataTable\\target\\loginjvm.json");
	}
	
}
