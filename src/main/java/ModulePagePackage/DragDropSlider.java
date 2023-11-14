package ModulePagePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragDropSlider {
	WebDriver driver;
	// 1. Defining Page Element --> OR Object Repository

	static final By defaultvalue = By.xpath("//input[@value='15']");
	static final By rangesuccess = By.xpath("//output[@id='rangeSuccess']");

	// 2. Initializing Page Object
	public DragDropSlider(WebDriver driver) {
		this.driver = driver;
	}

	// 3. Actions

	public void draganddropValidate() {
		WebElement ele = driver.findElement(defaultvalue);
		Actions action = new Actions(driver);
		action.dragAndDropBy(ele, 215, 0).build().perform();

		String val = driver.findElement(rangesuccess).getText();

		String val2 = "95";

		if (val.equals(val2))
			System.out.println(val2 + "  : Assetion Pass :  " + val);
		else

			System.out.println(val2 + "  : Assetion Fail :  " + val);

	}

}
