package stepDefinitions;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import cucumber.api.java.en.Given;
import pageObjects.TermsAndConditionsPage;
import testRunner.TestRunner;
import utils.BaseUtils;

public class TermsAndConditions_Tests {

	
	BaseUtils objBaseUtils = new BaseUtils();
	TermsAndConditionsPage objTermsAndConditionsPage = new TermsAndConditionsPage();
	
	@Given("^able to click on terms and conditions and see it$")
	public void able_to_click_on_terms_and_conditions_and_see_it() throws Throwable {
		objBaseUtils.wait_presenceOfElementLocated(objTermsAndConditionsPage.termsandConditionsLink);
		objTermsAndConditionsPage.click_on_Terms_and_Conditions();
		objBaseUtils.wait_presenceOfElementLocated(objTermsAndConditionsPage.termandconditions_content);
		Assert.assertTrue(objBaseUtils.locator_isDisplayed_onPage(objTermsAndConditionsPage.termandconditions_content));
		
		objBaseUtils.wait_presenceOfElementLocated(objTermsAndConditionsPage.close_tc_content);
		objTermsAndConditionsPage.click_Close_TC();
		
	}

	@Given("^able to click on release of medical information and see it$")
	public void able_to_click_on_release_of_medical_information_and_see_it() throws Throwable {
		
		objBaseUtils.wait_presenceOfElementLocated(objTermsAndConditionsPage.releaseofmedicalinfoLink);
		objTermsAndConditionsPage.click_on_Release_of_Medical_Information_link();
		objBaseUtils.wait_presenceOfElementLocated(objTermsAndConditionsPage.release_content);
		Assert.assertTrue(objBaseUtils.locator_isDisplayed_onPage(objTermsAndConditionsPage.release_content));
		
		objBaseUtils.wait_presenceOfElementLocated(objTermsAndConditionsPage.close_release_content);
		objTermsAndConditionsPage.click_close_release_content();
	    
	}

}
