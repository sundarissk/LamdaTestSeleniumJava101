package TestCases;

import BasePagePackage.BaseDriverPage;
import ModulePagePackage.DragDropSlider;
import ModulePagePackage.InputFormSubmit;
import ModulePagePackage.PageMain;
import ModulePagePackage.SimpleForm;

public class SeleniumJava101TC extends BaseDriverPage {

	public static void TestCasesExecution(String browser) {
		SetUpBrowser(browser);
		SimpleFormPage();
		DragandDropSliderPage();
		InputFormSubmit();
		TearDown();

	}

	public static void SimpleFormPage() {

		// accessing Main page and click Submit-form-Demo
		PageMain sfp = new PageMain(driver);
		sfp.getMainPageUrl();
		sfp.FormDemoClick();

		SimpleForm sf = new SimpleForm(driver);
		sf.SimpleFormURLVerify();
		sf.EnterMessage();
		sf.GetCheckedValueClick();
		sf.MessageValidate();

	}

	public static void DragandDropSliderPage() {
		PageMain ddsp = new PageMain(driver);
		ddsp.getMainPageUrl();
		ddsp.DragAndDropClick();

		DragDropSlider dds = new DragDropSlider(driver);
		dds.draganddropValidate();

	}

	public static void InputFormSubmit() {

		PageMain ifsp = new PageMain(driver);
		ifsp.getMainPageUrl();
		ifsp.InputFormClick();

		InputFormSubmit ifs = new InputFormSubmit(driver);
		ifs.validateErrorMessage();
		ifs.fillingFormdetails();
		ifs.validateSubmissionMessage();

	}

	public static void main(String[] args) {
		TestCasesExecution("chrome");
		TestCasesExecution("FF");
		TestCasesExecution("edge");
		TestCasesExecution("IE");

	}

}