package businesscomponents;

import java.time.LocalTime;
import java.time.ZoneId;

import org.openqa.selenium.WebElement;

import supportlibraries.ReusableLibrary;
import supportlibraries.ScriptHelper;
import com.cognizant.framework.Status;
import com.cognizant.framework.selenium.WebDriverUtil;

import componentgroups.CommonFunctions;
import pages.FAQPageObjects;

public class FAQPageComponents extends ReusableLibrary {



	/**
	 * Constructor to initialize the component library
	 * 
	 * @param scriptHelper
	 *            The {@link ScriptHelper} object passed from the
	 *            {@link DriverScript}
	 */
	public FAQPageComponents(ScriptHelper scriptHelper) {
		super(scriptHelper);
	}

	CommonFunctions commonFunction = new CommonFunctions(scriptHelper);
	LocalTime liveTime = LocalTime.now(ZoneId.of("America/New_York"));
	WebDriverUtil webdriverutil = new WebDriverUtil(driver);
	
	private WebElement getPageElement(FAQPageObjects pageEnum) {
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
			report.updateTestLog("FAQ Page - get page element",
					pageEnum.toString() + " object is not defined or found.", Status.FAIL);
			return null;
		}
	}
	
	public void validateFAQsJumpToCategory() {
		try {
			commonFunction.verifyIfElementIsPresent(getPageElement(FAQPageObjects.lblJumpToCategory), FAQPageObjects.lblJumpToCategory.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(FAQPageObjects.lnkMostPopular), FAQPageObjects.lnkMostPopular.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(FAQPageObjects.lnkProduct), FAQPageObjects.lnkProduct.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(FAQPageObjects.lnkSmokingTechnique), FAQPageObjects.lnkSmokingTechnique.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(FAQPageObjects.lnkMostPopular), FAQPageObjects.lnkMostPopular.getObjectname());
			if(driver.getCurrentUrl().contains("/faqs#accordion__most_popular")) {
				report.updateTestLog("Verify user navigated to The Most Popular Section", "User is successfully Navigated to The Most Popular Section", Status.PASS);
			} else {
				report.updateTestLog("Verify user navigated to The Most Popular Section", "User is NOT Navigated to The Most Popular Section", Status.FAIL);
			}
			
			commonFunction.clickIfElementPresent(getPageElement(FAQPageObjects.lnkProduct), FAQPageObjects.lnkProduct.getObjectname());
			if(driver.getCurrentUrl().contains("/faqs#accordion__product")) {
				report.updateTestLog("Verify user navigated to The Product Section", "User is successfully Navigated to The Product Section", Status.PASS);
			} else {
				report.updateTestLog("Verify user navigated to The Product Section", "User is NOT Navigated to The Product Section", Status.FAIL);
			}
			
			commonFunction.clickIfElementPresent(getPageElement(FAQPageObjects.lnkSmokingTechnique), FAQPageObjects.lnkSmokingTechnique.getObjectname());
			if(driver.getCurrentUrl().contains("/faqs#accordion__smoking_technique")) {
				report.updateTestLog("Verify user navigated to The Smoking Technique Section", "User is successfully Navigated to The Smoking Technique Section", Status.PASS);
			} else {
				report.updateTestLog("Verify user navigated to The Smoking Technique Section", "User is NOT Navigated to The Smoking Technique Section", Status.FAIL);
			}
		}catch(Exception e) {
			report.updateTestLog("Validate FAQ Page - Jump to Category",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void validateFAQPageSubCategories() {
		try {
			// Validate The Most Popular Section
			commonFunction.clickIfElementPresent(getPageElement(FAQPageObjects.lnkMostPopular), FAQPageObjects.lnkMostPopular.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(FAQPageObjects.subTitleMostPopular), FAQPageObjects.subTitleMostPopular.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(FAQPageObjects.lblHowDoISeasonMySmoker), FAQPageObjects.lblHowDoISeasonMySmoker.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(FAQPageObjects.txtHowDoISeasonMySmoker), FAQPageObjects.txtHowDoISeasonMySmoker.getObjectname());
			
			// Validate The Product Section
			commonFunction.clickIfElementPresent(getPageElement(FAQPageObjects.lnkProduct), FAQPageObjects.lnkProduct.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(FAQPageObjects.subTitleProduct), FAQPageObjects.subTitleProduct.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(FAQPageObjects.lblHowDoICleanGrates), FAQPageObjects.lblHowDoICleanGrates.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(FAQPageObjects.txtHowDoICleanGrates), FAQPageObjects.txtHowDoICleanGrates.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(FAQPageObjects.lblHowDoIMaintainMySmoker), FAQPageObjects.lblHowDoIMaintainMySmoker.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(FAQPageObjects.txtHowDoIMaintainMySmoker), FAQPageObjects.txtHowDoIMaintainMySmoker.getObjectname());
			
			//Validate Smoking Technique
			commonFunction.clickIfElementPresent(getPageElement(FAQPageObjects.lnkSmokingTechnique), FAQPageObjects.lnkSmokingTechnique.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(FAQPageObjects.subTitleProduct), FAQPageObjects.subTitleProduct.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(FAQPageObjects.lblHowDoIBuildAFireInTheFirefox), FAQPageObjects.lblHowDoIBuildAFireInTheFirefox.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(FAQPageObjects.txtHowDoIBuildAFireInTheFirefox), FAQPageObjects.txtHowDoIBuildAFireInTheFirefox.getObjectname());
			
		}catch(Exception e) {
			report.updateTestLog("Validate FAQ Page - Subcategories",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}

	public void validateFAQPageMoreFromCraftSection() {
		try{
			String craftLink1Title = dataTable.getData("General_Data","MoreFromCraftLink1");
			String craftLink2Title = dataTable.getData("General_Data","MoreFromCraftLink2");
			String craftLink3Title = dataTable.getData("General_Data","MoreFromCraftLink3");
			commonFunction.verifyIfElementIsPresent(getPageElement(FAQPageObjects.titleMoreFromCraft), FAQPageObjects.titleMoreFromCraft.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(FAQPageObjects.lnkSubCategoryLink1), FAQPageObjects.lnkSubCategoryLink1.getObjectname());
			if(commonFunction.isElementPresentContainsText(getPageElement(FAQPageObjects.headingMoreFromCartLink1Page), FAQPageObjects.headingMoreFromCartLink1Page.getObjectname(), craftLink1Title)) {
				report.updateTestLog("Verify user is navigated to More from Craft section Link 1 "+craftLink1Title, "User is successfully Navigated to More From the Craft -  section Link 1 -"+craftLink1Title, Status.PASS);
			} else {
				report.updateTestLog("Verify user is navigated to More from Craft section Link 1 -"+craftLink1Title, "User is NOT Navigated to  More From the Craft -  section Link 1 -"+craftLink1Title, Status.FAIL);
			}
			driver.navigate().back();
			
			commonFunction.clickIfElementPresent(getPageElement(FAQPageObjects.lnkSubCategoryLink2), FAQPageObjects.lnkSubCategoryLink2.getObjectname());
			if(commonFunction.isElementPresentContainsText(getPageElement(FAQPageObjects.headingMoreFromCartLink2Page), FAQPageObjects.headingMoreFromCartLink2Page.getObjectname(), craftLink2Title)) {
				report.updateTestLog("Verify user is navigated to More from Craft section Link 2 "+craftLink2Title, "User is successfully Navigated to More From the Craft -  section Link 1 -"+craftLink2Title, Status.PASS);
			} else {
				report.updateTestLog("Verify user is navigated to More from Craft section Link 2 -"+craftLink2Title, "User is NOT Navigated to  More From the Craft -  section Link 1 -"+craftLink2Title, Status.FAIL);
			}
			driver.navigate().back();
			
			commonFunction.clickIfElementPresent(getPageElement(FAQPageObjects.lnkSubCategoryLink3), FAQPageObjects.lnkSubCategoryLink3.getObjectname());
			if(commonFunction.isElementPresentContainsText(getPageElement(FAQPageObjects.headingMoreFromCartLink3Page), FAQPageObjects.headingMoreFromCartLink3Page.getObjectname(), craftLink3Title)) {
				report.updateTestLog("Verify user is navigated to More from Craft section Link 3 "+craftLink3Title, "User is successfully Navigated to More From the Craft -  section Link 1 -"+craftLink3Title, Status.PASS);
			} else {
				report.updateTestLog("Verify user is navigated to More from Craft section Link 3 -"+craftLink3Title, "User is NOT Navigated to  More From the Craft -  section Link 1 -"+craftLink3Title, Status.FAIL);
			}
			driver.navigate().back();
			commonFunction.clickIfElementPresent(getPageElement(FAQPageObjects.btnViewAllFromTheCraft), FAQPageObjects.btnViewAllFromTheCraft.getObjectname());
			if(driver.getCurrentUrl().contains("/the-craft")) {
				report.updateTestLog("Verify user navigated to The Craft Page", "User is successfully Navigated to The Craft Page", Status.PASS);
			} else {
				report.updateTestLog("Verify user navigated to The Craft Page", "User is NOT Navigated to The Craft Page", Status.FAIL);
			}
		}catch(Exception e) {
			report.updateTestLog("Validate FAQ More From Craft Section",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void validateFAQPageHelpSection() {
		try {
			commonFunction.scrollIntoView(getPageElement(FAQPageObjects.titleCantFindwhatyouLooking));
			commonFunction.verifyIfElementIsPresent(getPageElement(FAQPageObjects.titleCantFindwhatyouLooking), FAQPageObjects.titleCantFindwhatyouLooking.getObjectname());
			//Call Section
			commonFunction.verifyIfElementIsPresent(getPageElement(FAQPageObjects.labelCall), FAQPageObjects.labelCall.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(FAQPageObjects.callTimings), FAQPageObjects.callTimings.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(FAQPageObjects.lnkPhoneNumber), FAQPageObjects.lnkPhoneNumber.getObjectname());
			//Email section
			commonFunction.verifyIfElementIsPresent(getPageElement(FAQPageObjects.labelEmail), FAQPageObjects.labelEmail.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(FAQPageObjects.txtEmailinfo), FAQPageObjects.txtEmailinfo.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(FAQPageObjects.lnkSendAnEmail), FAQPageObjects.lnkSendAnEmail.getObjectname());
			//Chat Section
			commonFunction.verifyIfElementIsPresent(getPageElement(FAQPageObjects.labelChat), FAQPageObjects.labelChat.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(FAQPageObjects.chatTimings), FAQPageObjects.chatTimings.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(FAQPageObjects.lnkStartChat), FAQPageObjects.lnkStartChat.getObjectname());
			
		}catch(Exception e) {
			report.updateTestLog("Validate FAQ Help - Cant find what you're looking ? Section",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
}
