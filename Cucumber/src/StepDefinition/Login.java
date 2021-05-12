package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	WebDriver driver;
	@Given("^Open the chrome and go to Home page of the application$")
	public void open_the_chrome_and_go_to_Home_page_of_the_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChaithraNK\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^Enter name$")
	public void enter_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	}

	@When("^Enter password$")
	public void enter_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}

	@When("^Click on submit btn$")
	public void click_on_submit_btn() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^Login should be successful$")
	public void login_should_be_successful() {
		String name = driver.findElement(By.id("welcome")).getText();
		String ActualData = "Welcome Dalia";
		Assert.assertEquals(name,ActualData);
		System.out.println("Login Successfully");
	    // Write code here that turns the phrase above into concrete actions
	    
	}



}
