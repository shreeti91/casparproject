package contextCucumber;

import org.openqa.selenium.WebDriver;

public class TestContext {
	 public ScenarioContext scenarioContext;
	 
	 public TestContext(){
	 scenarioContext = new ScenarioContext();
	 }
	 
	 public ScenarioContext getScenarioContext() {
	 return scenarioContext;
	 }
	 
}
