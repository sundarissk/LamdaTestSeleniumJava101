package TestCases;

import BasePagePackage.BaseDriverPage;
import ModulePagePackage.DragDropSlider;
import ModulePagePackage.InputFormSubmit;
import ModulePagePackage.PageMain;
import ModulePagePackage.SimpleForm;

public class SeleniumJava101TC extends BaseDriverPage {

	public static void TestCasesExecution(String browser) {
		// SetUpBrowser(browser);
		try {
			SimpleFormPage(browser);
			DragandDropSliderPage(browser);
			InputFormSubmit(browser);
		} catch (Exception e) {
			System.out.println("Error in running :  " + e);
		}
		System.out.println("End of TestCase");
		// TearDown();

	}

	public static void SimpleFormPage(String browser) {

		SetUpBrowser(browser);

		// accessing Main page and click Submit-form-Demo
		PageMain sfp = new PageMain(driver);
		sfp.getMainPageUrl();
		sfp.FormDemoClick();

		SimpleForm sf = new SimpleForm(driver);
		sf.SimpleFormURLVerify();
		sf.EnterMessage();
		sf.GetCheckedValueClick();
		sf.MessageValidate();
		TearDown();

	}

	public static void DragandDropSliderPage(String browser) {
		SetUpBrowser(browser);

		// accessing Main page and click Drag-&-Drop-slider
		PageMain ddsp = new PageMain(driver);
		ddsp.getMainPageUrl();
		ddsp.DragAndDropClick();

		DragDropSlider dds = new DragDropSlider(driver);
		dds.draganddropValidate();
		TearDown();

	}

	public static void InputFormSubmit(String browser) {
		SetUpBrowser(browser);

		// accessing Main page and click InputForm
		PageMain ifsp = new PageMain(driver);
		ifsp.getMainPageUrl();
		ifsp.InputFormClick();

		InputFormSubmit ifs = new InputFormSubmit(driver);
		ifs.validateErrorMessage();
		ifs.fillingFormdetails();
		ifs.validateSubmissionMessage();
		TearDown();

	}

	public static void main(String[] args) {
		TestCasesExecution("chrome");
		TestCasesExecution("FF");
		TestCasesExecution("edge");
		TestCasesExecution("IE");

	}

}