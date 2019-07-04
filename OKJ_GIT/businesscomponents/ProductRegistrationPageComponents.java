package businesscomponents;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;

import org.openqa.selenium.WebElement;

import supportlibraries.ReusableLibrary;
import supportlibraries.ScriptHelper;
import com.cognizant.framework.Status;
import com.cognizant.framework.selenium.WebDriverUtil;

import componentgroups.CommonFunctions;
import pages.ProductRegistrationPageObjects;

public class ProductRegistrationPageComponents extends ReusableLibrary {



	/**
	 * Constructor to initialize the component library
	 * 
	 * @param scriptHelper
	 *            The {@link ScriptHelper} object passed from the
	 *            {@link DriverScript}
	 */
	public ProductRegistrationPageComponents(ScriptHelper scriptHelper) {
		super(scriptHelper);
	}

	CommonFunctions commonFunction = new CommonFunctions(scriptHelper);
	LocalTime liveTime = LocalTime.now(ZoneId.of("America/New_York"));
	WebDriverUtil webdriverutil = new WebDriverUtil(driver);
	
	private WebElement getPageElement(ProductRegistrationPageObjects pageEnum) {
		WebElement element;
		try {
			element = commonFunction.getElementByProperty(pageEnum.getProperty(), pageEnum.getLocatorType().toString(),
					true);
			if (element != null) {
				System.out.println("Found the element: " + pageEnum.getObjectname());
			return element;
			}
			else {
				System.out.println("Element Not Found: "+pageEnum.getObjectname());
				return null;
			}
		} catch (Exception e) {
			report.updateTestLog("Home Page - get page element",
					pageEnum.toString() + " object is not defined or found.", Status.FAIL);
			return null;
		}
	}
	public void validateProductRegistrationPage() {
		try {
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductRegistrationPageObjects.txtBoxFirstName), ProductRegistrationPageObjects.txtBoxFirstName.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductRegistrationPageObjects.txtBoxLastName), ProductRegistrationPageObjects.txtBoxLastName.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductRegistrationPageObjects.txtBoxEmailAddr), ProductRegistrationPageObjects.txtBoxEmailAddr.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductRegistrationPageObjects.txtBoxStreetAddr), ProductRegistrationPageObjects.txtBoxStreetAddr.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductRegistrationPageObjects.txtBoxAparment), ProductRegistrationPageObjects.txtBoxAparment.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductRegistrationPageObjects.txtBoxPostalCode), ProductRegistrationPageObjects.txtBoxPostalCode.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductRegistrationPageObjects.txtBoxCity), ProductRegistrationPageObjects.txtBoxCity.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductRegistrationPageObjects.lnkState), ProductRegistrationPageObjects.lnkState.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductRegistrationPageObjects.lnkCountry), ProductRegistrationPageObjects.lnkCountry.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductRegistrationPageObjects.txtBoxPhoneNumber), ProductRegistrationPageObjects.txtBoxPhoneNumber.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductRegistrationPageObjects.txtBoxModelNumber), ProductRegistrationPageObjects.txtBoxModelNumber.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductRegistrationPageObjects.lnkHelpIdentifyModel), ProductRegistrationPageObjects.lnkHelpIdentifyModel.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductRegistrationPageObjects.txtBoxPurchaseAmt), ProductRegistrationPageObjects.txtBoxPurchaseAmt.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductRegistrationPageObjects.txtBoxPurchaseDate), ProductRegistrationPageObjects.txtBoxPurchaseDate.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductRegistrationPageObjects.txtBoxSerialNumber), ProductRegistrationPageObjects.txtBoxSerialNumber.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductRegistrationPageObjects.txtSerialNumberLocation), ProductRegistrationPageObjects.txtSerialNumberLocation.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductRegistrationPageObjects.lnkPurchaseLocation), ProductRegistrationPageObjects.lnkPurchaseLocation.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductRegistrationPageObjects.checkBoxGetRecipes), ProductRegistrationPageObjects.checkBoxGetRecipes.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductRegistrationPageObjects.lnkViewPrivacyPolicy), ProductRegistrationPageObjects.lnkViewPrivacyPolicy.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductRegistrationPageObjects.btnRegisterProduct), ProductRegistrationPageObjects.btnRegisterProduct.getObjectname());
		}catch(Exception e) {
			report.updateTestLog("Validate Product Registration Page",
					"Something really went worng! :" + e.toString(), Status.FAIL);
		}
	}
	
	
	public void validateProductRegitration() {
		try {
			String firstName = dataTable.getData("General_Data", "FirstName");
			String lastName = dataTable.getData("General_Data","LastName");
			String email = dataTable.getData("General_Data","Email");
			String streetAddr = dataTable.getData("General_Data","StreetAddressLine1");
			String zip = dataTable.getData("General_Data", "ZipCode");
			String city = dataTable.getData("General_Data","City");
			String state = dataTable.getData("General_Data","State");
			String phoneNumber = dataTable.getData("General_Data","PhoneNumber");
			String modelNumber = dataTable.getData("General_Data","ModelNumber");
			String purchaseAmt = dataTable.getData("General_Data","PurchaseAmount");
			String purchaseDte = dataTable.getData("General_Data","PurchaseDate");
			String serialNbr = dataTable.getData("General_Data","SerialNumber");
			String purchaseLocation = dataTable.getData("General_Data","PurchaseLocation");
			commonFunction.clearAndEnterText(getPageElement(ProductRegistrationPageObjects.txtBoxFirstName), firstName,ProductRegistrationPageObjects.txtBoxFirstName.getObjectname());
			commonFunction.clearAndEnterText(getPageElement(ProductRegistrationPageObjects.txtBoxLastName), lastName,ProductRegistrationPageObjects.txtBoxLastName.getObjectname());
			commonFunction.clearAndEnterText(getPageElement(ProductRegistrationPageObjects.txtBoxEmailAddr), email,ProductRegistrationPageObjects.txtBoxEmailAddr.getObjectname());
			commonFunction.clearAndEnterText(getPageElement(ProductRegistrationPageObjects.txtBoxStreetAddr), streetAddr,ProductRegistrationPageObjects.txtBoxStreetAddr.getObjectname());
			commonFunction.clearAndEnterText(getPageElement(ProductRegistrationPageObjects.txtBoxPostalCode), zip,ProductRegistrationPageObjects.txtBoxPostalCode.getObjectname());
			commonFunction.clearAndEnterText(getPageElement(ProductRegistrationPageObjects.txtBoxCity), city,ProductRegistrationPageObjects.txtBoxCity.getObjectname());
			commonFunction.selectDropDownvalue(getPageElement(ProductRegistrationPageObjects.lnkState),ProductRegistrationPageObjects.drpDownState.getProperty(),ProductRegistrationPageObjects.drpDownState.getObjectname(),state);
			commonFunction.clearAndEnterText(getPageElement(ProductRegistrationPageObjects.txtBoxPhoneNumber), phoneNumber,ProductRegistrationPageObjects.txtBoxPhoneNumber.getObjectname());
			commonFunction.clearAndEnterText(getPageElement(ProductRegistrationPageObjects.txtBoxModelNumber), modelNumber,ProductRegistrationPageObjects.txtBoxModelNumber.getObjectname());
			commonFunction.clearAndEnterText(getPageElement(ProductRegistrationPageObjects.txtBoxPurchaseAmt), purchaseAmt,ProductRegistrationPageObjects.txtBoxPurchaseAmt.getObjectname());
			commonFunction.clearAndEnterText(getPageElement(ProductRegistrationPageObjects.txtBoxPurchaseDate), purchaseDte,ProductRegistrationPageObjects.txtBoxPurchaseDate.getObjectname());
			commonFunction.clearAndEnterText(getPageElement(ProductRegistrationPageObjects.txtBoxSerialNumber), serialNbr,ProductRegistrationPageObjects.txtBoxSerialNumber.getObjectname());
			commonFunction.selectDropDownvalue(getPageElement(ProductRegistrationPageObjects.lnkPurchaseLocation),ProductRegistrationPageObjects.drpDownPurchaseLocation.getProperty(),ProductRegistrationPageObjects.drpDownPurchaseLocation.getObjectname(),purchaseLocation);
			commonFunction.clickIfElementPresent(getPageElement(ProductRegistrationPageObjects.checkBoxGetRecipes), ProductRegistrationPageObjects.checkBoxGetRecipes.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(ProductRegistrationPageObjects.btnRegisterProduct), ProductRegistrationPageObjects.btnRegisterProduct.getObjectname());
			Thread.sleep(5000);
			if(commonFunction.isElementPresentContainsText(getPageElement(ProductRegistrationPageObjects.msgThankYou), ProductRegistrationPageObjects.msgThankYou.getObjectname(), "Thank You. Your product has been registered.")){
				report.updateTestLog("Product Registration",
						"Product is successfully Registered", Status.PASS);
			}else {
				report.updateTestLog("Product Registration",
						"Product is NOT Registered", Status.FAIL);
			}
		}catch(Exception e) {
			report.updateTestLog("Validate Product Registration",
					"Something really went worng! :" + e.toString(), Status.FAIL);
		}
	}
	
	public void validateProductRegistrationPrivacyPolicy() {
		try {
			String mainWindow = "";
			commonFunction.clickIfElementPresent(getPageElement(ProductRegistrationPageObjects.lnkViewPrivacyPolicy), ProductRegistrationPageObjects.lnkViewPrivacyPolicy.getObjectname());
			mainWindow = driver.getWindowHandle();
			driver.switchTo().window(new ArrayList<String>(driver.getWindowHandles()).get(1));
			for (int count = 1; count <= 5; count++) {
				if (driver.getCurrentUrl().contains("/privacy")) {
					report.updateTestLog("Validate Privacy policy link in Product Registraion", "Navigated to Privacy Policy Page" + driver.getCurrentUrl(),
							Status.PASS);
					break;
				} else if (count == 5)
					report.updateTestLog("Validate Privacy policy link in Product Registraion", "Not navigated Privacy Policy Page", Status.FAIL);
				else {
					report.updateTestLog("Validate Privacy policy link in Product Registraion",
							"Not navigated to Privacy link in 2 seconds. Will retry in another 2 seconds.",
							Status.DONE);
				}
			}
			driver.close();
			driver.switchTo().window(mainWindow);
		}catch(Exception e) {
			report.updateTestLog("Validate Product Registration - Privacy Policy",
					"Something really went worng! :" + e.toString(), Status.FAIL);
		}
	}
	
	public void verifyErrorMsgProductRegistration() {
		try {
			commonFunction.clickIfElementPresent(getPageElement(ProductRegistrationPageObjects.btnRegisterProduct), ProductRegistrationPageObjects.btnRegisterProduct.getObjectname());
			commonFunction.isElementPresentContainsText(getPageElement(ProductRegistrationPageObjects.errorMsgFirstName), ProductRegistrationPageObjects.errorMsgFirstName.getObjectname(), "This is a required field.");
			commonFunction.isElementPresentContainsText(getPageElement(ProductRegistrationPageObjects.errorMsgLastName), ProductRegistrationPageObjects.errorMsgLastName.getObjectname(), "This is a required field.");
			commonFunction.isElementPresentContainsText(getPageElement(ProductRegistrationPageObjects.errorMsgEmail), ProductRegistrationPageObjects.errorMsgEmail.getObjectname(), "This is a required field.");
			commonFunction.isElementPresentContainsText(getPageElement(ProductRegistrationPageObjects.errorMsgStreetAddr), ProductRegistrationPageObjects.errorMsgStreetAddr.getObjectname(), "This is a required field.");
			commonFunction.isElementPresentContainsText(getPageElement(ProductRegistrationPageObjects.errorMsgzip), ProductRegistrationPageObjects.errorMsgzip.getObjectname(), "This is a required field.");
			commonFunction.isElementPresentContainsText(getPageElement(ProductRegistrationPageObjects.errorMsgCity), ProductRegistrationPageObjects.errorMsgCity.getObjectname(), "This is a required field.");
			commonFunction.isElementPresentContainsText(getPageElement(ProductRegistrationPageObjects.errorMsgPhone), ProductRegistrationPageObjects.errorMsgPhone.getObjectname(), "This is a required field.");
			commonFunction.isElementPresentContainsText(getPageElement(ProductRegistrationPageObjects.errorMsgModel), ProductRegistrationPageObjects.errorMsgModel.getObjectname(), "This is a required field.");
			commonFunction.isElementPresentContainsText(getPageElement(ProductRegistrationPageObjects.errorMsgSerialNbr), ProductRegistrationPageObjects.errorMsgSerialNbr.getObjectname(), "This is a required field.");
			commonFunction.isElementPresentContainsText(getPageElement(ProductRegistrationPageObjects.errorMsgPurchaseAmt), ProductRegistrationPageObjects.errorMsgPurchaseAmt.getObjectname(), "This is a required field.");
		}catch(Exception e) {
			report.updateTestLog("Validate Product Registration - Error Messages",
					"Something really went worng! :" + e.toString(), Status.FAIL);
		}
	}
	
	public void validateProductRegitrationWithMandatoryFields() {
		try {
			String firstName = dataTable.getData("General_Data", "FirstName");
			String lastName = dataTable.getData("General_Data","LastName");
			String email = dataTable.getData("General_Data","Email");
			String streetAddr = dataTable.getData("General_Data","StreetAddressLine1");
			String zip = dataTable.getData("General_Data", "ZipCode");
			String city = dataTable.getData("General_Data","City");
			String state = dataTable.getData("General_Data","State");
			String phoneNumber = dataTable.getData("General_Data","PhoneNumber");
			String modelNumber = dataTable.getData("General_Data","ModelNumber");
			String purchaseAmt = dataTable.getData("General_Data","PurchaseAmount");
			String purchaseDte = dataTable.getData("General_Data","PurchaseDate");
			String serialNbr = dataTable.getData("General_Data","SerialNumber");
			String purchaseLocation = dataTable.getData("General_Data","PurchaseLocation");
			commonFunction.clearAndEnterText(getPageElement(ProductRegistrationPageObjects.txtBoxFirstName), firstName,ProductRegistrationPageObjects.txtBoxFirstName.getObjectname());
			commonFunction.clearAndEnterText(getPageElement(ProductRegistrationPageObjects.txtBoxLastName), lastName,ProductRegistrationPageObjects.txtBoxLastName.getObjectname());
			commonFunction.clearAndEnterText(getPageElement(ProductRegistrationPageObjects.txtBoxEmailAddr), email,ProductRegistrationPageObjects.txtBoxEmailAddr.getObjectname());
			commonFunction.clearAndEnterText(getPageElement(ProductRegistrationPageObjects.txtBoxStreetAddr), streetAddr,ProductRegistrationPageObjects.txtBoxStreetAddr.getObjectname());
			commonFunction.clearAndEnterText(getPageElement(ProductRegistrationPageObjects.txtBoxPostalCode), zip,ProductRegistrationPageObjects.txtBoxPostalCode.getObjectname());
			commonFunction.clearAndEnterText(getPageElement(ProductRegistrationPageObjects.txtBoxCity), city,ProductRegistrationPageObjects.txtBoxCity.getObjectname());
			commonFunction.selectDropDownvalue(getPageElement(ProductRegistrationPageObjects.lnkState),ProductRegistrationPageObjects.drpDownState.getProperty(),ProductRegistrationPageObjects.drpDownState.getObjectname(),state);
			commonFunction.clearAndEnterText(getPageElement(ProductRegistrationPageObjects.txtBoxPhoneNumber), phoneNumber,ProductRegistrationPageObjects.txtBoxPhoneNumber.getObjectname());
			commonFunction.clearAndEnterText(getPageElement(ProductRegistrationPageObjects.txtBoxModelNumber), modelNumber,ProductRegistrationPageObjects.txtBoxModelNumber.getObjectname());
			commonFunction.clearAndEnterText(getPageElement(ProductRegistrationPageObjects.txtBoxPurchaseAmt), purchaseAmt,ProductRegistrationPageObjects.txtBoxPurchaseAmt.getObjectname());
			commonFunction.clearAndEnterText(getPageElement(ProductRegistrationPageObjects.txtBoxPurchaseDate), purchaseDte,ProductRegistrationPageObjects.txtBoxPurchaseDate.getObjectname());
			commonFunction.clearAndEnterText(getPageElement(ProductRegistrationPageObjects.txtBoxSerialNumber), serialNbr,ProductRegistrationPageObjects.txtBoxSerialNumber.getObjectname());
			commonFunction.selectDropDownvalue(getPageElement(ProductRegistrationPageObjects.lnkPurchaseLocation),ProductRegistrationPageObjects.drpDownPurchaseLocation.getProperty(),ProductRegistrationPageObjects.drpDownPurchaseLocation.getObjectname(),purchaseLocation);
			commonFunction.clickIfElementPresent(getPageElement(ProductRegistrationPageObjects.checkBoxGetRecipes), ProductRegistrationPageObjects.checkBoxGetRecipes.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(ProductRegistrationPageObjects.btnRegisterProduct), ProductRegistrationPageObjects.btnRegisterProduct.getObjectname());
			if(commonFunction.isElementPresentContainsText(getPageElement(ProductRegistrationPageObjects.msgThankYou), ProductRegistrationPageObjects.msgThankYou.getObjectname(), "Thank You. Your product has been registered.")){
				report.updateTestLog("Product Registration",
						"Product is successfully Registered", Status.PASS);
			}else {
				report.updateTestLog("Product Registration",
						"Product is NOT Registered", Status.FAIL);
			}
		}catch(Exception e) {
			report.updateTestLog("Validate Product Registration",
					"Something really went wrong! :" + e.toString(), Status.FAIL);
		}
	}
	
	
}
