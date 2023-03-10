package pom.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass;

public class LoginpagePom  extends Baseclass{
	public LoginpagePom() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement Username;
	
	@FindBy(id="password")
	private WebElement Password;
	
	@FindBy(id="login")
	private WebElement Login;
	
	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLogin() {
		return Login;
	}
	
	public void loginmethod(String user,String pass) {
		enterText(getUsername(),user);
		enterText(getPassword(),pass);
	}

	public void clickloginbutton() {
		elementClick(getLogin());
}
}
