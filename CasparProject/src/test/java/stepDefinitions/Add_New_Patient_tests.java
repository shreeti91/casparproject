package stepDefinitions;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.AddNewPatient;
import testRunner.TestRunner;
import utils.BaseUtils;

public class Add_New_Patient_tests {
	BaseUtils objBaseUtils = new BaseUtils();
	AddNewPatient objAddNewPatientObjects = new AddNewPatient();
	static String strUserId;
	 static String strPwd;
	
	@Then("^the page for adding patient information is opened$")
	public void the_page_for_adding_patient_information_is_opened() throws Throwable {
		objBaseUtils.wait_presenceOfElementLocated(objAddNewPatientObjects.addNewPatient);
		Assert.assertTrue(objBaseUtils.locator_isDisplayed_onPage(objAddNewPatientObjects.addNewPatient));
		
	}
	
	@Then("^the user enters patient information$")
	public void the_user_enters_patient_information() throws Throwable {
		//Enter Personal Information
		objAddNewPatientObjects.enter_Personal_Information();	
		
		//Therapy Details
		objAddNewPatientObjects.enter_TherapyDetails();
		objBaseUtils.press_pageDown();
		Thread.sleep(2000);
		
		//Contact Information
		objAddNewPatientObjects.enter_ContactInformation();

	}
	
	
	@Given("^clicks on Save Button$")
	public void clicks_on_Save_Button() throws Throwable {
		objBaseUtils.wait_elementToBeClickable(objAddNewPatientObjects.SaveButton);
		objAddNewPatientObjects.click_onSaveButton();
	}

	@Given("^the patient details are added successfully$")
	public void the_patient_details_are_added_successfully() throws Throwable {
		String strSuccessMsgtext ;
		objBaseUtils.wait_presenceOfElementLocated(objAddNewPatientObjects.successMsg);
		strSuccessMsgtext = objAddNewPatientObjects.getSuccessMessage();			
		Assert.assertEquals(strSuccessMsgtext,"Patient was successfully created." );
		
		objBaseUtils.wait_presenceOfElementLocated(objAddNewPatientObjects.casparID);
		strUserId= objAddNewPatientObjects.getNewCasparID();
		objBaseUtils.wait_presenceOfElementLocated(objAddNewPatientObjects.tempPwd);
		strPwd = objAddNewPatientObjects.getNewTempPwd();
		objBaseUtils.wait_presenceOfElementLocated(objAddNewPatientObjects.closeSuccessMsg);
		objAddNewPatientObjects.close_Success_Message();
		
	}
	

}
