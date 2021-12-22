package stepsDefinations;

import org.openqa.selenium.WebDriver;
import PageObjects.BasePage;
import PageObjects.CountdownPage;
import PageObjects.HomePage;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseClass {
	
	  protected static BasePage basePage;
	   protected static HomePage homePage;
	   protected static CountdownPage countdownPage;
	
public static WebDriver driver;
	
	@Before
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		driver = new ChromeDriver();
		
	}
	
	
	@After
	public void teardown() {
		
		driver.quit();
	}
	
    public void initalize(WebDriver driver) {
        basePage = new BasePage(driver);
        homePage = new HomePage(driver);
        countdownPage = new CountdownPage(driver);
    }

}
