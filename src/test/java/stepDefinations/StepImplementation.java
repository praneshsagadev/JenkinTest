package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepImplementation {
	static WebDriver driver;
	
	@Given("^I load the \"(.+)\" sample$")
	public void loadUrl(String url) {
		
		System.out.println("url - " + url);
		
		WebDriverManager.chromedriver().setup();
		
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(url);
		
		
	}
	@Then("^I enter (.+) into the username field$")
	public void enterUsername(String username) {
		System.out.println("username - " + username);
		
		
		driver.findElement(By.id("txtUsername")).sendKeys(username);
	}
	@Then("^I enter (.+) into the password field$")
	public void enterPassword(String password) {
		
		System.out.println("password -  " +  password);
		
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	}
	@Then("^I click login button$")
	public void clickButton() {
		driver.findElement(By.id("btnLogin")).click();
		System.out.println("clicked");
	}

}
