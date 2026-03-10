package com.Octopussaas.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Octopussaass.WebdriverUtility.webDriverutility;

public class TransporterProfile {
	WebDriver driver;

	public TransporterProfile(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "(//input[@type='text'])[1]")
	private WebElement companynametxtfield;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement Submitbtn;
	@FindBy(xpath = "//div[@class='ml-6']")
	private WebElement ClickOnOtherside;
	@FindBy(xpath = "//input[@placeholder='Enter company display name']")
	private WebElement ccompanydisplayname;
	@FindBy(xpath = "(//input[@placeholder='(123) 456-7890'])[1]")
	private WebElement phonenumber;
	@FindBy(xpath = "//input[@placeholder='name@company.com']")
	private WebElement generalEmail;
	@FindBy(xpath = "//input[@placeholder='https://example.com']")
	private WebElement websiteUrl;
	@FindBy(xpath = "//button[@title='Open link']")
	private WebElement RedirectUrl;
	@FindBy(xpath = "//div[@data-testid='custom-date-picker']")
	private WebElement Startfacialyear;
	@FindBy(xpath = "//input[@placeholder='https://example.com/reviews']")
	private WebElement googleReviewLink;
	@FindBy(xpath = "//div[@data-testid='custom-date-picker']")
	private WebElement datePicker;
    @FindBy(xpath = "(//*[local-name()='svg' and contains(@class,'text-cardTextGray')])[1]")
    private WebElement uploadfile;
    @FindBy(xpath = "(//h3[contains(text(),'Generator Profile Not Setup')])[2]")
    private WebElement profilenotsetuppopup;
	
	
	
	public WebElement getProfilenotsetuppopup() {
		return profilenotsetuppopup;
	}
	public WebElement getUploadfile() {
		return uploadfile;
	}
	public WebElement getDatePicker() {
		return datePicker;
	}
	public WebElement getGoogleReviewLink() {
		return googleReviewLink;
	}
	public WebElement getStartfacialyear() {
		return Startfacialyear;
	}
	public WebElement getRedirectUrl() {
		return RedirectUrl;
	}
	public WebElement getWebsiteUrl() {
		return websiteUrl;
	}
	public WebElement getGeneralEmail() {
		return generalEmail;
	}
	public WebElement getPhonenumber() {
		return phonenumber;
	}
	public WebElement getCcompanydisplayname() {
		return ccompanydisplayname;
	}
	public WebElement getClickOnOtherside() {
		return ClickOnOtherside;
	}
	public WebElement getSubmitbtn() {
		return Submitbtn;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getCompanynametxtfield() {
		return companynametxtfield;
	}
	
	public void CompanyNameTextField()
	{
		companynametxtfield.click();
	}
	public void SubmitBtn()
	{
		webDriverutility wlib = new webDriverutility();
		wlib.scrollToelement(driver, Submitbtn);
		Submitbtn.click();
	}
	public void GeneralPhoneNumberWithInput(String Input)
	{
		phonenumber.sendKeys(Input);
	}
	public void GeneralPhoneWithAlphbets(String Input)
	{
		phonenumber.sendKeys(Input);
	}
	public void GeneralPhoneWithNumbers(String Input)
	{
		phonenumber.sendKeys(Input);
	}
	public void GeneralPhoneWithSpecialCharacter(String Input)
	{
		phonenumber.sendKeys(Input);
	}
	public void GeneralEmailwithInput(String Input)
	{
		generalEmail.sendKeys(Input);
	}
	public void GeneralEmailwithAlphabets(String Input)
	{
		generalEmail.sendKeys(Input);
	}
	public void GeneralEmailwithNumbers(String Input)
	{
		generalEmail.sendKeys(Input);
	}
	public void WebSiteURLwithValiInput(String Input)
	{
		websiteUrl.sendKeys(Input);
	}

	public void WebSiteURLwithAlphabet(String Input)
	{
		websiteUrl.sendKeys(Input);
	}

	public void WebSiteURLwithNumber(String Input)
	{
		websiteUrl.sendKeys(Input);
	}

	public void WebSiteURLwithSpecialChar(String Input)
	{
		websiteUrl.sendKeys(Input);
	}
	public void GoogleReviewLink(String linkInput)
	{
		googleReviewLink.sendKeys(linkInput);
	}
}
