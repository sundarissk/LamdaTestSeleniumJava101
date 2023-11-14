package ModulePagePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BasePagePackage.InputFormPojo;

public class InputFormSubmit {
	WebDriver driver;
	// 1. Defining Page Element --> OR Object Repository
	static final By submitbutton = By.xpath("//button[contains(text(),'Submit')]");

	static final By validate = By.id("name");// need to getAttribute value

	static final By name = By.id("name");
	static final By emailid = By.id("inputEmail4");
	static final By password = By.id("inputPassword4");
	static final By company = By.id("company");
	static final By website = By.id("websitename");
	static final By country = By.name("country");
	static final By city = By.id("inputCity");
	static final By add1 = By.id("inputAddress1");
	static final By add2 = By.id("inputAddress2");
	static final By state = By.id("inputState");
	static final By zip = By.id("inputZip");
	// static final By buttonclick = By.id("//button[contains(text(),'Submit')]\"");

	static final By textvalidate = By.xpath("//p[contains(text(),'Thanks for contacting us,')]");

	// 2. Initializing Page Object
	public InputFormSubmit(WebDriver driver) {
		this.driver = driver;
	}

	// 3. Actions

	public void validateErrorMessage() {
		String emsg = "Please fill out this field.";
		driver.findElement(submitbutton).click();
		String textv = driver.findElement(validate).getAttribute("validationMessage");

		if (textv.equals(emsg))
			System.out.println(emsg+" : Error Message Assertion Pass : "+textv );
		else
			System.out.println(emsg+" : Error Message Assertion Fail : "+textv );

	}

	public void fillingFormdetails() {

		InputFormPojo fp = new InputFormPojo();
		fp.setName("abcd");
		fp.setEmail("abcd@gmail.com");
		fp.setPassword("abcd12345");
		fp.setWebsite("abcdcompany.org");
		fp.setCompany("abcdcompany");
		fp.setAddress1("abcdaddress1");
		fp.setAddress2("abcdaddress2");
		fp.setCity("abcdcity");
		fp.setState("abcdstate");
		fp.setZip("12345");

		driver.findElement(name).sendKeys(fp.getName());
		driver.findElement(emailid).sendKeys(fp.getEmail());
		driver.findElement(password).sendKeys(fp.getPassword());
		driver.findElement(website).sendKeys(fp.getWebsite());

		WebElement e = driver.findElement(country);
		Select dropd = new Select(e);
		dropd.selectByVisibleText("United States");

		driver.findElement(company).sendKeys(fp.getCompany());
		driver.findElement(add1).sendKeys(fp.getAddress1());
		driver.findElement(add2).sendKeys(fp.getAddress2());
		driver.findElement(city).sendKeys(fp.getCity());
		driver.findElement(state).sendKeys(fp.getState());
		driver.findElement(zip).sendKeys(fp.getZip());

		driver.findElement(submitbutton).click();

	}

	public void validateSubmissionMessage() {

		String etext = "Thanks for contacting us, we will get back to you shortly.";
		String vtext = driver.findElement(textvalidate).getText();
		if (vtext.equals(etext))
			System.out.println(etext +" : Validation submission Pass :  "+ vtext);
		else
			System.out.println(etext +" : Validation submission Fail :  "+ vtext);

	}

}
