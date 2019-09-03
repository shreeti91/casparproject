package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import contextCucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import enums.Context;
import pageObjects.AddNewPatient;
import pageObjects.HomePage;
import pageObjects.Login;
import testRunner.TestRunner;
import utils.BaseUtils;

public class Login_test {
	
	Login objLoginPageObjects = new Login();
	HomePage objHomePageObjects = new HomePage();
	AddNewPatient objAddNewPatient = new AddNewPatient();
	BaseUtils objBaseUtils = new BaseUtils();
	TestContext objTestContext;
	
	@Given("^the user launches login page \"([^\"]*)\"$")
	public void the_user_launches_login_page(String URL) throws Throwable {
		
		try{
			objBaseUtils.wait_presenceOfElementLocated(objLoginPageObjects.loginButton);
		}catch(TimeoutException | NoSuchElementException ex) {
			objLoginPageObjects.launch_URL(URL);
			objBaseUtils.wait_presenceOfElementLocated(objLoginPageObjects.loginButton);
		}
		Assert.assertTrue(objBaseUtils.locator_isDisplayed_onPage(objLoginPageObjects.loginButton));
	}

	@When("^the user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_enters_and(String strCasparID, String strPassword) throws Throwable {
		
		if (strCasparID.matches("newPatient") && strPassword.matches("newTempPwd")) {
				String strNewCasparID, strNewTempPwd;
				strNewCasparID = Add_New_Patient_tests.strUserId;
				strNewTempPwd = Add_New_Patient_tests.strPwd;
				objLoginPageObjects.enter_Credentials(strNewCasparID, strNewTempPwd);
				/*objTestContext.scenarioContext.setContext(Context.CASPARID, strNewCasparID);
				objTestContext.scenarioContext.setContext(Context.TEMPPWD, strNewTempPwd);*/
		}else {
				objLoginPageObjects.enter_Credentials(strCasparID, strPassword);
		}
	}

	@Then("^he clicks on Login Button$")
	public void he_clicks_on_Login_Button() throws Throwable {
		objLoginPageObjects.click_LoginButton();       
	}
	
	@Given("^is able to see Add Patient button$")
	public void is_able_to_see_Add_Patient_button() throws Throwable {
		objBaseUtils.wait_presenceOfElementLocated(objHomePageObjects.AddPatientButton);
	    Assert.assertTrue(objBaseUtils.locator_isDisplayed_onPage(objHomePageObjects.AddPatientButton));
	}
	
	

}
