package ModulePagePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SimpleForm {
	WebDriver driver;
	// 1. Defining Page Element --> OR Object Repository

	static final By inputtextbox = By.id("user-message");
	static final By ButtonshowInput = By.xpath("//button[@id='showInput']");
	static final By messageverify = By.xpath("//p[@id='message']");

	static String textm = "Welcome to LambdaTest";
	static String titlev = "simple-form-demo";

	// 2. Initializing Page Object
	public SimpleForm(WebDriver driver) {
		this.driver = driver;
	}

	// 3.Actions

	public void SimpleFormURLVerify() {
		String title = driver.getCurrentUrl();
		if (title.contains(titlev))
			System.out.println(titlev + ":  Simpleform URL Matches:  " + title);
		else
			System.out.println(titlev + ":  Simpleform URL Not Matches:  " + title);

	}

	public void EnterMessage() {
		driver.findElement(inputtextbox).sendKeys(textm);

	}

	public void GetCheckedValueClick() {
		driver.findElement(ButtonshowInput).click();
	}

	public void MessageValidate() {
		String messagedisplay = driver.findElement(messageverify).getText();

		if (textm.equals(messagedisplay))
			System.out.println(textm + " : Message Same : " + messagedisplay);
		else
			System.out.println(textm + " : Message Not Same : " + messagedisplay);

	}

}
