package ModulePagePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageMain {
	WebDriver driver;
	// 1. Defining Page Element --> OR Object Repository
	static final By formdemo = By.xpath("//a[contains(text(),'Simple Form Demo')]");
	static final By DragAndDrop = By.xpath("//a[contains(text(),'Drag & Drop Sliders')]");
	static final By inputForm = By.xpath("//a[contains(text(),'Input Form Submit')]");

	// 2. Initializing Page Object
	public PageMain(WebDriver driver) {
		this.driver = driver;
	}

	// 3.Actions

	public void getMainPageUrl() {
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://www.lambdatest.com/selenium-playground/");
	}

	public SimpleForm FormDemoClick() {
		driver.findElement(formdemo).click();
		return new SimpleForm(driver);
	}

	public DragDropSlider DragAndDropClick() {
		driver.findElement(DragAndDrop).click();
		return new DragDropSlider(driver);
	}

	public InputFormSubmit InputFormClick() {
		driver.findElement(inputForm).click();
		return new InputFormSubmit(driver);
	}

}
