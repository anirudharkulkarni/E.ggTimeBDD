package stepsDefinations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import PageObjects.HomePage;

public class TimerCode {
	WebDriver driver = BaseClass.driver;
	
	protected static HomePage homePage;
	
	
	@Given("^Timer site is opened and page is loaded$")
    public void timer_site_is_opened_and_page_is_loaded() throws Throwable {
		
		 driver.get("https://e.ggtimer.com/");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			System.out.println("Timer Page is loaded");
        
    }

    @When("^User enters time and click on start$")
    public void user_enters_time_and_click_on_start() throws Throwable {
    	
    	WebElement EnterTime = driver.findElement(By.xpath("//input[@class=\"EggTimer-start-time-input-text\"]"));
        EnterTime.sendKeys("5 minutes");
        Thread.sleep(3000);
        WebElement StartButton = driver.findElement(By.xpath("//*[text()=\"Start\"]"));
        StartButton.click();
        Thread.sleep(3000);
        System.out.println("Teme entered and clicked on Go");
        
    }

    @Then("^Countdown timer started$")
    public void countdown_timer_started() throws Throwable {
    	WebElement TimerDisplayed = driver.findElement(By.xpath("//p[@class=\\\"ClassicTimer-time\\\"]")); 
    	TimerDisplayed.isDisplayed();
    	System.out.println("Timer Page is displayed");
    }

    @And("^Remaining time decreases in one-sec increments$")
    public void remaining_time_decreases_in_onesec_increments() throws Throwable {
    	
    	homePage.CountdownTimerWorking();
    	
    	System.out.println("Timer is working");
    }

}
