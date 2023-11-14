package BasePagePackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseDriverPage {

	public static String username = "sundariksen";
	public static String accesskey = "hC8ef7bSe7tUTJ32lZYF8Xdk1np7iHbaLOmZDFO4Hx14SnVwrK";
	public static RemoteWebDriver driver = null;
	public static String gridURL = "@hub.lambdatest.com/wd/hub";
	public static DesiredCapabilities browserOptions = new DesiredCapabilities();

	public static void SetUpBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {

			HashMap<String, Object> ltOptions = new HashMap<String, Object>();
			ltOptions.put("browserName", "chrome");
			ltOptions.put("version", "88.0");
			ltOptions.put("platform", "Windows 10");
			ltOptions.put("selenium_version", "4.0.0");
			//ltOptions.put("idleTimeout", "20");

			ltOptions.put("build", "ParallelExceution_SeleniumJava");
			ltOptions.put("project", "DemoSleniumJava101");
			ltOptions.put("name", "ParallelLambdaExceution_SeleniumJava_101");

			ltOptions.put("visual", true);
			ltOptions.put("video", true);
			ltOptions.put("network", true);
			ltOptions.put("w3c", true);

			browserOptions.setCapability("LT:Options", ltOptions);

		} else if (browser.equalsIgnoreCase("FF")) {

			HashMap<String, Object> ltOptions = new HashMap<String, Object>();
			ltOptions.put("browserName", "Firefox");
			ltOptions.put("version", "82.0");
			ltOptions.put("platform", "Windows 7");
			ltOptions.put("selenium_version", "4.0.0");
			//ltOptions.put("idleTimeout", "20");

			ltOptions.put("build", "ParallelExceution_SeleniumJava");
			ltOptions.put("project", "DemoSleniumJava101");
			ltOptions.put("name", "ParallelLambdaExceution_SeleniumJava_101");

			ltOptions.put("visual", true);
			ltOptions.put("video", true);
			ltOptions.put("network", true);
			ltOptions.put("w3c", true);

			browserOptions.setCapability("LT:Options", ltOptions);

		} else if (browser.equalsIgnoreCase("edge")) {

			HashMap<String, Object> ltOptions = new HashMap<String, Object>();
			ltOptions.put("browserName", "MicrosoftEdge");
			ltOptions.put("version", "87.0");
			ltOptions.put("platform", "macOS High Sierra");
			ltOptions.put("selenium_version", "4.0.0");
			//ltOptions.put("idleTimeout", "20");

			ltOptions.put("build", "ParallelExceution_SeleniumJava");
			ltOptions.put("project", "DemoSleniumJava101");
			ltOptions.put("name", "ParallelLambdaExceution_SeleniumJava_101");

			ltOptions.put("visual", true);
			ltOptions.put("video", true);
			ltOptions.put("network", true);
			ltOptions.put("w3c", true);

			browserOptions.setCapability("LT:Options", ltOptions);
		} else {

			HashMap<String, Object> ltOptions = new HashMap<String, Object>();
			ltOptions.put("browserName", "Internet Explorer");
			ltOptions.put("version", "11.0");
			ltOptions.put("platform", "Windows 10");
			ltOptions.put("selenium_version", "4.0.0");
			//ltOptions.put("idleTimeout", "20");

			ltOptions.put("build", "ParallelExceution_SeleniumJava");
			ltOptions.put("project", "DemoSleniumJava101");
			ltOptions.put("name", "ParallelLambdaExceution_SeleniumJava_101");

			ltOptions.put("visual", true);
			ltOptions.put("video", true);
			ltOptions.put("network", true);
			ltOptions.put("w3c", true);

			browserOptions.setCapability("LT:Options", ltOptions);
		}
		try {
			driver = new RemoteWebDriver(new URL("https://" + username + ":" + accesskey + gridURL), browserOptions);

		} catch (MalformedURLException e) {
			System.out.println("Invalid grid URL");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void TearDown() {

		if (driver != null) {
			// driver.close();
			driver.quit();

		}
	}
}