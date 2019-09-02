package pageObjects;

import org.openqa.selenium.By;

import utils.BaseUtils;

public class TermsAndConditionsPage {
  public By termsandConditionsLink = By.xpath("//span[text()='terms and conditions']");
  public By releaseofmedicalinfoLink = By.xpath("//span[text()='release of medical information.']");
  public By termandconditions_content = By.xpath("//h3[text()='Allgemeine Geschäftsbedingungen (Stand: 19.07.2018)']");
  public By close_tc_content = By.xpath("/html/body/app-root/div/ui-view/ng-component/ui-view/app-terms-of-service/app-contract-preview/div/div/div[2]/button/span/mat-icon");
  public By close_release_content = By.xpath("/html/body/app-root/div/ui-view/ng-component/ui-view/app-terms-of-service/app-contract-preview/div/div[1]/div[2]/button[2]/span/mat-icon");
  public By release_content = By.xpath("//div[text()='Release of medical information']");
  
  BaseUtils objBaseUtils = new BaseUtils();
  public void click_on_Terms_and_Conditions() {
	  objBaseUtils.click_onLocator(termsandConditionsLink);
  }
  
  public void click_Close_TC() {
	  objBaseUtils.click_onLocator(close_tc_content);
  }
  
  public void click_on_Release_of_Medical_Information_link() {
	  objBaseUtils.click_onLocator(releaseofmedicalinfoLink);
  }
  
  public void click_close_release_content() {
	  objBaseUtils.click_onLocator(close_release_content);
  }
}
