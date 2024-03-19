package com.StepDefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class stepDefination {

	WebDriver driver= null;
	int s1=3000;
	pageFactor pf;
	
	@Given("open Browser")
	public void open_browser() throws InterruptedException {
	    driver= new ChromeDriver();
	    pf= new pageFactor(driver);
	    driver.manage().window().maximize();
	    Thread.sleep(s1);
	}

	@And("Enter url  {string}")
	public void enter_url(String url) throws InterruptedException {
	   driver.get(url);
	    Thread.sleep(s1);

	}

	@When("Enter UserName {string} and password {string}")
	public void enter_user_name_and_password(String uname, String Pwd) throws InterruptedException {
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(s1));
	    pf.username(uname);
	    Thread.sleep(s1);
	    pf.password(Pwd);
	    Thread.sleep(s1);
	    
	}

	@Then("Enter Login button")
	public void enter_login_button() throws InterruptedException {
	    pf.login();
	    Thread.sleep(s1);
	}

	@And("Close Brower")
	public void close_brower() {
	    driver.close();
	}

}
