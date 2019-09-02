package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import testRunner.TestRunner;
import utils.BaseUtils;

public class AddNewPatient {
	public By addNewPatient = By.xpath("//h1[contains(text(),'Add New Patient')]");
	public By firstName = By.xpath("//label[contains(text(),'First Name')]");
	public By lastName = By.xpath("//label[contains(text(),'Last Name')]");
	public By dayWB = By.xpath("//span[text()='Day']");
	public By MonthWB = By.xpath("//span[text()='Month']");
	public By YearWB = By.xpath("//span[text()='Year']");
	public By GenderWB = By.xpath("//span[text()='Gender']");
	public By Date = By.id("mat-select-3");
	public By Month = By.id("mat-select-4");
	public By Year = By.id("mat-select-5");
	public By gender = By.id("mat-select-2");
	public By height = By.id("mat-input-11");
	public By weight = By.id("mat-input-12");
	public By bmi = By.id("mat-input-13");
	/*public By therapy_goal = By.id("mat-input-14");
	public By therapy_recommend = By.id("mat-input-15");
	public By other_text = By.id("mat-input-16");*/
	public By therapy_goal = By.xpath("//*[@id=\"mat-input-14\"]");
	public By therapy_recommend = By.xpath("//*[@id=\"mat-input-15\"]");
	public By other_text = By.xpath("//*[@id=\"mat-input-16\"]");
	public By email = By.xpath("//input[@type='email']");
	public By telephone = By.xpath("//input[@type='tel']");
	public By street = By.xpath("//label[text()='Street']");
	public By streetNumber = By.xpath("//label[text()='Street Number']");
	public By zip = By.xpath("//label[text()='Zip']");
	public By city = By.xpath("//label[text()='City']");
	public By country = By.xpath("//span[text()='Country']");
	public By SaveButton = By.xpath("//button[@type='submit']");
	public By successMsg = By.xpath("//div[@id='mat-dialog-title-0']//following::div/div[1]");
	public By casparID = By.xpath("//div[@id='mat-dialog-title-0']//following::div/div[3]/div[3]/div[2]");
	public By tempPwd = By.xpath("//div[@id='mat-dialog-title-0']//following::div/div[3]/div[4]/div[2]");
	public By closeSuccessMsg = By.xpath("//button[@type='button']/span[text()='Close']");
	
	BaseUtils objBaseUtils = new BaseUtils();
	public String getNewCasparID() {
		return TestRunner.objDriver.findElement(casparID).getText();
	}
	
	public String getNewTempPwd() {
		return TestRunner.objDriver.findElement(tempPwd).getText();
	}
	
	public void enter_Personal_Information() {
		objBaseUtils.wait_visibilityOfElementLocated(firstName);
		objBaseUtils.enter_details_using_Action_class(firstName,"Shreeti");
		objBaseUtils.enter_details_using_Action_class(lastName,"Lal");
		objBaseUtils.click_onLocator(dayWB);
		WebElement wbDate = TestRunner.objDriver.findElement(By.xpath("//div[@id='cdk-overlay-0']/div"));
		List<WebElement> listOfDates = wbDate.findElements(By.tagName("span"));
		if (!listOfDates.isEmpty() && listOfDates.size()>5) {
			//Selecting 6
			listOfDates.get(5).click();
		}
		
		objBaseUtils.click_onLocator(MonthWB);
		WebElement wbMonth = TestRunner.objDriver.findElement(By.xpath("//div[@id='cdk-overlay-1']/div"));
		List<WebElement> listOfMonth = wbMonth.findElements(By.tagName("span"));
		if (!listOfMonth.isEmpty() && listOfMonth.size()>8) {
			//Selecting September
			listOfMonth.get(8).click();
		}
		
		objBaseUtils.click_onLocator(YearWB);
		WebElement wbYear = TestRunner.objDriver.findElement(By.xpath("//div[@id='cdk-overlay-2']/div"));
		List<WebElement> listOfYear = wbYear.findElements(By.tagName("span"));
		if (!listOfYear.isEmpty() && listOfYear.size()>25) {
			//Selecting 1991
			listOfYear.get(25).click();
		}
		
		/*boolean staleElement = true; 
		while(staleElement){
		  try{
			  if (!listOfYear.isEmpty() && listOfYear.size()>25) {
					//Selecting 1991
					listOfDates.get(25).click();
				}

		     staleElement = false;

		  } catch(StaleElementReferenceException e){
		    staleElement = true;
		  }
		}*/
		
		
		/*if (!listOfYear.isEmpty() && listOfYear.size()>25) {
			//Selecting 1991
			Robot rb = new Robot();
			for (int j = 0 ; j<25;j++) {
				rb.keyPress(KeyEvent.VK_DOWN);
				rb.keyRelease(KeyEvent.VK_DOWN);
			}
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			
		}*/

		objBaseUtils.click_onLocator(GenderWB);
		WebElement wbGender = TestRunner.objDriver.findElement(By.xpath("//div[@id='cdk-overlay-3']/div"));
		List<WebElement> listOfGender = wbGender.findElements(By.tagName("span"));
		if (!listOfGender.isEmpty() && listOfGender.size()>1) {
			//Selecting Female
			listOfGender.get(1).click();
		}
		
		objBaseUtils.enter_details_using_Action_class(height,"152");
		objBaseUtils.sendKeys_onTextField(weight, "65");
		objBaseUtils.sendKeys_onTextField(bmi, "28.1");
	}
	
	public void enter_TherapyDetails() {

		objBaseUtils.wait_visibilityOfElementLocated(therapy_goal);
		objBaseUtils.sendKeys_onTextField(therapy_goal, "Test Therapy");
		objBaseUtils.sendKeys_onTextField(therapy_recommend, "Test Recommendations");
		objBaseUtils.sendKeys_onTextField(other_text,"Test others");
	}
	
	public void enter_ContactInformation() {
		objBaseUtils.enter_details_using_Action_class(email, "shreeti28@gmail.com");
		objBaseUtils.enter_details_using_Action_class(telephone, "9677070690");
		objBaseUtils.enter_details_using_Action_class(street, "Dummy Street");
		objBaseUtils.enter_details_using_Action_class(streetNumber, "16/A");
		objBaseUtils.enter_details_using_Action_class(zip, "65365");
		objBaseUtils.enter_details_using_Action_class(city, "Frankfurt");
		objBaseUtils.wait_visibilityOfElementLocated(country);
		objBaseUtils.click_onLocator(country);
		WebElement wbCountry = TestRunner.objDriver.findElement(By.xpath("//div[@id='cdk-overlay-4']/div"));
		List<WebElement> listOfCountries = wbCountry.findElements(By.tagName("span"));
		 if (!listOfCountries.isEmpty() && listOfCountries.size()>0) {
				//Selecting Germany
				listOfCountries.get(0).click();
			}
	}
	
	public void click_onSaveButton() {
		objBaseUtils.click_onLocator(SaveButton);
	}
	
	public String getSuccessMessage() {
		String message;
		message = objBaseUtils.getText(successMsg);
		return message;
	}
	
	public void close_Success_Message() {
		objBaseUtils.click_onLocator(closeSuccessMsg);
	}
	
}
