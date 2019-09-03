package pageObjects;

import org.openqa.selenium.By;

import testRunner.TestRunner;
import utils.BaseUtils;

public class Login {
	public By loginButton = By.className("login");
	public By loginTextBox = By.name("login");
	public By pwdTextBox = By.name("password");
	
	
	BaseUtils objBaseUtils = new BaseUtils();
	public void launch_URL(String URL) {
		TestRunner.objDriver.navigate().to(URL);
		TestRunner.objDriver.manage().window().maximize();
	}
	
	public void enter_Credentials(String user,String pwd) {
		objBaseUtils.sendKeys_onTextField(loginTextBox, user); 
		objBaseUtils.sendKeys_onTextField(pwdTextBox,pwd);
	}
	
	public void click_LoginButton() {
		objBaseUtils.click_onLocator(loginButton);
	}
}
