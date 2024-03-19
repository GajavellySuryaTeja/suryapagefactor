package com.StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class pageFactor {

	WebDriver driver;
	
	public pageFactor(WebDriver d) {
		this.driver=d;
	}
	
	private By uName=By.name("username");
	private By password=By.name("password");
	private By button=By.tagName("button");
	
	
	public void username(String u_name) {
		driver.findElement(uName).sendKeys(u_name);
	}
	
	public void password(String p_word) {
		driver.findElement(password).sendKeys(p_word);
	}
	public void login() {
		driver.findElement(button).click();
	}
}
