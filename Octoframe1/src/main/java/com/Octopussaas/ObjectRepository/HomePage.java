package com.Octopussaas.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//h6[contains(text(),'Add New')]")
	private WebElement Addnewdd;
	@FindBy(xpath = "//li[contains(text(),'Generator')]")
	private WebElement Gen;

	public WebElement getGen() {
		return Gen;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getAddnewdd() {
		return Addnewdd;
	}
	
	public void AddNew()
	{
		Addnewdd.click();
	}
	public void Generator()
	{
		Gen.click();
	}

}
