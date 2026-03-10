package com.Octopussaas.ObjectRepository;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RouteAssignment {


	WebDriver driver;

	public RouteAssignment(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//div[@class='text-sm flex gap-5 items-center']")
	private WebElement addservice;
	@FindBy(id = "route")
	private WebElement routes;
	@FindBy(xpath = "//input[@placeholder='Search options...']")
	private WebElement placeholder;
	@FindBy(xpath = "//div[@class='flex']")
	private WebElement flex;
	@FindBy(xpath = "//div[@class='ml-auto absolute top-0 right-0']")
	private WebElement addser;
	@FindBy(xpath = "(//div[@class='flex items-center gap-2'])[8]")
	private WebElement nayanroute;
	@FindBy(xpath = "(//span[contains(text(),'Route')])[2]")
	private WebElement Routedd;
	@FindBy(xpath = "//div[contains(text(),'Nayan Route')]")
	private WebElement nayan;
	@FindBy(xpath = "//button[@id='service-input-0']")
	private WebElement servicetypedd;
	@FindBy(xpath = "//div[contains(text(),'Medical Waste')]")
	private WebElement medicalwaste;
	@FindBy(id  = "service-frequency")
	private WebElement servicefreq;
	@FindBy(xpath = "//div[contains(text(),'Multiple Times Weekly (MTW)')]")
	private WebElement mutli;
	@FindBy(xpath = "//span[contains(text(),'Select Weekdays')]")
	private WebElement selectweekday;
	@FindBy(xpath = "(//input[@type='checkbox'])[4]")
	private WebElement Thusday;
	@FindBy(xpath = "(//input[@type='checkbox'])[5]")
	private WebElement Friday;
	@FindBy(xpath = "(//input[@type='checkbox'])[6]")
	private WebElement Satday;
	@FindBy(xpath = "(//input[@type='checkbox'])[7]")
	private WebElement Sunday;
	@FindBy(xpath = "(//div[@class='flex items-center gap-1 overflow-x-hidden py-1 pl-2 w-full'])[2]")
	private WebElement scopeofwrk;
	@FindBy(xpath = "(//input[@type='checkbox'])[15]")
	private WebElement seventeengalCheck;
	@FindBy(xpath = "(//input[@type='checkbox'])[16]")
	private WebElement EighteengalCheck;
	@FindBy(xpath = "//div[@class='react-datepicker__input-container']")
	private WebElement calendar;
	@FindBy(xpath = "(//div[contains(text(),'10')])[1]")                 //remember to change date
	private WebElement todaytdate;
	@FindBy(xpath = "(//div[@class='relative w-2/3']/descendant::button[@type=\"button\"])[1]")
	private WebElement galoneinc;
	@FindBy(xpath = "(//div[@class='relative w-2/3']/descendant::button[@type=\"button\"])[3]")
	private WebElement galtwoinc;
	@FindBy(xpath = "//button[contains(text(),'Add to Route')]")
	private WebElement addroutebtn;
	@FindBy(xpath = "//a[contains(text(),'Price Book')]")
	private WebElement pricebook;
	@FindBy(xpath = "(//button[@type='button'])[3]")
	private WebElement togglebtn;
	@FindBy(xpath = "//h6[@title='Generator Name']")
	private WebElement generatorname;
	@FindBy(xpath = "//span[@class='text-cardTextGray']")
    private WebElement genAddress;
	@FindBy(xpath = "//h6[.//span and contains(text(),'Created Date')]/span")
	private WebElement createddate;
	@FindBy(xpath = "//button[@id='tag-add-button']")
	private WebElement addtagbtn;
	@FindBy(xpath = "//div[@id='tag-options-list']//label")
	private  WebElement taglist;
	@FindBy(xpath = "//button[contains(text(),'Go Back to Generator Profile')]")
	private WebElement GobacktorouteAssignmentpageBtn;
	@FindBy(xpath = "//div[contains(@class,'marker-container')]//*[name()='svg']")
	private WebElement starsymbol;
	@FindBy(xpath = "//p[@class='text-base font-semibold']")
	private WebElement mapGenName;
	@FindBy(xpath = "(//button[.//*[name()='svg']])[17]")
	private WebElement plusIconinMap;
	@FindBy(xpath = "//span[contains(text(),'Subcontractor Service Request (SSR)')]")
	private WebElement SSRbtn;
	
	
	
	
	public WebElement getSSRbtn() {
		return SSRbtn;
	}
	public WebElement getPlusIconinMap() {
		return plusIconinMap;
	}
	public WebElement getMapGenName() {
		return mapGenName;
	}
	public WebElement getStarsymbol() {
		return starsymbol;
	}
	public WebElement getGobacktorouteAssignmentpageBtn() {
		return GobacktorouteAssignmentpageBtn;
	}
	public WebElement getTaglist() {
		return taglist;
	}
	public WebElement getAddtagbtn() {
		return addtagbtn;
	}
	public WebElement getCreateddate() {
		return createddate;
	}
	public WebElement getGenAddress() {
		return genAddress;
	}
	public WebElement getGeneratorname() {
		return generatorname;
	}
	public WebElement getTogglebtn() {
		return togglebtn;
	}
	public WebElement getPricebook() {
		return pricebook;
	}
	public WebElement getAddroutebtn() {
		return addroutebtn;
	}
	public WebElement getGaloneinc() {
		return galoneinc;
	}
	public WebElement getGaltwoinc() {
		return galtwoinc;
	}
	public WebElement getTodaytdate() {
		return todaytdate;
	}
	public WebElement getCalendar() {
		return calendar;
	}
	public WebElement getSeventeengalCheck() {
		return seventeengalCheck;
	}
	public WebElement getEighteengalCheck() {
		return EighteengalCheck;
	}
	public WebElement getScopeofwrk() {
		return scopeofwrk;
	}
	public WebElement getFriday() {
		return Friday;
	}
	public WebElement getSatday() {
		return Satday;
	}
	public WebElement getSunday() {
		return Sunday;
	}
	public WebElement getThusday() {
		return Thusday;
	}
	public WebElement getSelectweekday() {
		return selectweekday;
	}
	public WebElement getMutli() {
		return mutli;
	}
	public WebElement getServicefreq() {
		return servicefreq;
	}
	public WebElement getMedicalwaste() {
		return medicalwaste;
	}
	public WebElement getServicetypedd() {
		return servicetypedd;
	}
	public WebElement getNayan() {
		return nayan;
	}
	public WebElement getRoutedd() {
		return Routedd;
	}
	public WebElement getNayanroute() {
		return nayanroute;
	}
	public WebElement getAddser() {
		return addser;
	}
	public WebElement getFlex() {
		return flex;
	}
	public WebElement getPlaceholder() {
		return placeholder;
	}
	public WebElement getRoute() {
		return routes;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getAddservice() {
		return addservice;
	}
	public void AddService() throws InterruptedException
	{
		
		Actions act = new Actions(driver);
		act.scrollToElement(flex).perform();
		Thread.sleep(10000);

		addser.click();
	
		
	}
	public void Route1() throws AWTException, InterruptedException
	{
		Actions act1 = new Actions(driver);
	
		Routedd.click();
		act1.moveToElement(placeholder).sendKeys("Nayan Route").perform();
		act1.moveToElement(nayan).click().perform();
		
	}
	public void ServiceType()
	{
		//Actions act1 = new Actions(driver);
		servicetypedd.click();
		/*
		 Select s = new Select(servicetypedd);
		 s.selectByVisibleText("Medical Waste");
		 

		*/
		Actions act1 = new Actions(driver);
		act1.moveToElement(medicalwaste).click().perform();

	}
	public void ServiceFrequency() throws InterruptedException
	{
		servicefreq.click();
		Actions act1 = new Actions(driver);
		act1.moveToElement(mutli).click().perform();
		Thread.sleep(2000);

	}
	public void SelectWeekDay()
	{
		selectweekday.click();
		Thusday.click();
		Friday.click();
		Satday.click();
		Sunday.click();
	}
	public void ScopeOfWork()
	{
		scopeofwrk.click();
		Actions act1 = new Actions(driver);
		act1.moveToElement(seventeengalCheck).click().perform();
		act1.moveToElement(EighteengalCheck).click().perform();
		
	}
	public void AnchorDate() 
	{
		calendar.click();
		Actions act1 = new Actions(driver);
		act1.moveToElement(todaytdate).click().perform();
		
	}
	public void IncreaseGalone()
	{
		galoneinc.click();
		galoneinc.click();
		galoneinc.click();
	}
	public void IncreaseGaltwo()
	{
		galtwoinc.click();
		galtwoinc.click();
		galtwoinc.click();
	}
	public void AddRoute() throws InterruptedException
	{
		Thread.sleep(2000);
		Actions act1 = new Actions(driver);
         act1.scrollToElement(addroutebtn).perform();
		addroutebtn.click();
	}
	public void PriceBook()
	{
		pricebook.click();
	}
	public void ViewModeToggleBtn()
	{
		togglebtn.click();
	}
	public String GeneratorName()
	{
		String txt = generatorname.getText();
		return txt;
	}
}
