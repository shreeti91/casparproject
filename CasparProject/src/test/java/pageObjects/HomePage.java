package pageObjects;

import org.openqa.selenium.By;

import utils.BaseUtils;

public class HomePage {
	public By userIcon = By.xpath("/html/body/app-root/ui-view/app-top-navigation/nav/div[2]/app-user-logo/div");
	public By AddPatientButton = By.xpath("//button[contains(text(),'Add Patient')]");
	public By signoutButton = By.xpath("//button[text()='Sign out']");
	
	BaseUtils objBaseUtils = new BaseUtils();
	public void click_onAddPatientBUtton() {
		objBaseUtils.click_onLocator(AddPatientButton);
	}
	
	public void click_on_UserIcon() {
		objBaseUtils.click_onLocator(userIcon);
	}
	
	public void click_on_SignOut() {
		objBaseUtils.click_onLocator(signoutButton);
	}
}
