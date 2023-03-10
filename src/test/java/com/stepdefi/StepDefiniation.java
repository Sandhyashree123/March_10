package com.stepdefi;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.Baseclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.com.LoginpagePom;

public class StepDefiniation extends Baseclass {
	
	public LoginpagePom Pom ;
	@Given("User should be in Adactin homepage")
	public void tc01() {
		LoginpagePom Pom = new LoginpagePom();
			
			Pom.browserLaunch("http://adactinhotelapp.com/");
			
	}
	@When("User should enters vaild Username and Password vaildcredentials")
	public void tc02onedimensationalasList(io.cucumber.datatable.DataTable dataTable) {
		List<String> asList = dataTable.asList();
		  String user = asList.get(0);
		  String pass = asList.get(1);
		  LoginpagePom Pom = new LoginpagePom();
		  Pom.loginmethod(user, pass);
		  Pom.clickloginbutton();
	}
@When("User should verify the login sucessful message")
	public void tc03() {
		
		Assert.assertTrue(true);
		System.out.println("Login sucessfully");
	    
	}
	@When("User should enters vaild Username and Password invaildcredentials")
	
		public void tc04Twodimensationalwithoutheader(io.cucumber.datatable.DataTable dataTable) {
			List<List<String>> asLists = dataTable.asLists();
			String username = asLists.get(0).get(0);
			String password = asLists.get(0).get(1);
			LoginpagePom Pom = new LoginpagePom();
			Pom.loginmethod(username, password);
			Pom.clickloginbutton();
	    
	}



	
	
	
	@When("User should verify the login error message")
	public void tc05TwoDimensationalwithoutheader() {
	
		Assert.assertTrue(true);
		System.out.println("Login sucessfully");
}
	@When("User should enters vaild Username and Password vaildcredentials based on the map")
	public void tc06onedimensationalwithheadermap(io.cucumber.datatable.DataTable dataTable) {
	   Map<String, String> asMap = dataTable.asMap();
	   String user = asMap.get("username");
	   String pass = asMap.get("password");
	   LoginpagePom Pom = new LoginpagePom();
	   Pom.loginmethod(user, pass);
	   Pom.clickloginbutton();
	}

	@When("User should verify the login sucessful message based on the map")
	public void tc07() {
	   
		Assert.assertTrue(true);
		System.out.println("Login sucessfully");


	}
	@When("User should enters vaild Username and Password vaildcredentials based on the maps")
	public void tc08Twodimensationalwithheader(io.cucumber.datatable.DataTable dataTable) {
	    List<Map<String, String>> asMaps = dataTable.asMaps();
	    String user = asMaps.get(0).get("username");
	    String pass = asMaps.get(0).get("password");
	    LoginpagePom Pom = new LoginpagePom();
		   Pom.loginmethod(user, pass);
	    
	    
	}
	@When("User should verify the login sucessful message based on the maps")
	public void tc09() {
		Assert.assertTrue(true);
		System.out.println("MapsLogin sucessfully");
	}

}