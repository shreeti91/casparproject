package stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.AddNewPatient;
import pageObjects.HomePage;
import pageObjects.TermsAndConditionsPage;
import testRunner.TestRunner;
import utils.BaseUtils;

public class HomePage_tests {
	
	HomePage objHomePageObjects = new HomePage();
	BaseUtils objBaseUtils = new BaseUtils();

	@Given("^user is on homepage$")
	public void user_is_on_homepage() throws Throwable {
		objBaseUtils.wait_presenceOfElementLocated(objHomePageObjects.userIcon);
	    Assert.assertTrue(objBaseUtils.locator_isDisplayed_onPage(objHomePageObjects.userIcon));
	}

	@When("^user clicks on Add Patient button$")
	public void user_clicks_on_Add_Patient_button() throws Throwable {
		objBaseUtils.wait_presenceOfElementLocated(objHomePageObjects.AddPatientButton);
		objHomePageObjects.click_onAddPatientBUtton();
	}
	
	@Given("^logout the user$")
	public void logout_the_user() throws Throwable {
		objBaseUtils.wait_presenceOfElementLocated(objHomePageObjects.userIcon);
		objHomePageObjects.click_on_UserIcon();
		objBaseUtils.wait_presenceOfElementLocated(objHomePageObjects.signoutButton);
		objHomePageObjects.click_on_SignOut();
	}

	
}
