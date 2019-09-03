package testRunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features"
		,glue= {"stepDefinitions"}
		,plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}
		,monochrome = true
		)
public class TestRunner {
	public static WebDriver objDriver;
	
	@BeforeClass
	public static void setUp() {
			final String chromeDriverPath = "..\\CasparProject\\resources\\";
			System.setProperty("webdriver.chrome.driver", chromeDriverPath+"chromedriver.exe");
			objDriver = new ChromeDriver();	
		}
		
	@AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File("config/report.xml"));
    
    }
	

}
