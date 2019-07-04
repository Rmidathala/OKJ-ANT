package businesscomponents;

import java.util.List;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import supportlibraries.ReusableLibrary;
import supportlibraries.ScriptHelper;
import com.cognizant.framework.Status;
import com.cognizant.framework.selenium.WebDriverUtil;

import componentgroups.CommonFunctions;
import pages.ShoppingCartPageObjects;
import pages.SupportPageObjects;
import pages.AccountInformationPageObjects;
import pages.HomePageObjects;
import pages.PartListingPageObjects;
import pages.ProTipsPageObjects;
import pages.ProductRegistrationPageObjects;

public class HomePageComponents extends ReusableLibrary {

	/**
	 * Constructor to initialize the component library
	 * 
	 * @param scriptHelper The {@link ScriptHelper} object passed from the
	 *                     {@link DriverScript}
	 */
	public HomePageComponents(ScriptHelper scriptHelper) {
		super(scriptHelper);
	}

	CommonFunctions commonFunction = new CommonFunctions(scriptHelper);
	LocalTime liveTime = LocalTime.now(ZoneId.of("America/New_York"));
	WebDriverUtil webdriverutil = new WebDriverUtil(driver);

	private WebElement getPageElement(PartListingPageObjects pageEnum) {
		WebElement element;
		try {
			element = commonFunction.getElementByProperty(pageEnum.getProperty(), pageEnum.getLocatorType().toString(),
					true);
			if (element != null) {
				System.out.println("Found the element: " + pageEnum.getObjectname());
				return element;
			} else {
				System.out.println("Element Not Found: " + pageEnum.getObjectname());
				return null;
			}
		} catch (Exception e) {
			report.updateTestLog("Parts Listing Page - get page element",
					pageEnum.toString() + " object is not defined or found.", Status.FAIL);
			return null;
		}
	}

	private WebElement getPageElement(ProTipsPageObjects pageEnum) {
		WebElement element;
		try {
			element = commonFunction.getElementByProperty(pageEnum.getProperty(), pageEnum.getLocatorType().toString(),
					true);
			if (element != null) {
				System.out.println("Found the element: " + pageEnum.getObjectname());
				return element;
			} else {
				System.out.println("Element Not Found: " + pageEnum.getObjectname());
				return null;
			}
		} catch (Exception e) {
			report.updateTestLog("Pro Tips Page - get page element",
					pageEnum.toString() + " object is not defined or found.", Status.FAIL);
			return null;
		}
	}

	private WebElement getPageElement(ShoppingCartPageObjects pageEnum) {
		WebElement element;
		try {
			element = commonFunction.getElementByProperty(pageEnum.getProperty(), pageEnum.getLocatorType().toString(),
					true);
			if (element != null) {
				System.out.println("Found the element: " + pageEnum.getObjectname());
				return element;
			} else {
				System.out.println("Element Not Found: " + pageEnum.getObjectname());
				return null;
			}
		} catch (Exception e) {
			report.updateTestLog("Shopping Cart - get page element",
					pageEnum.toString() + " object is not defined or found.", Status.FAIL);
			return null;
		}
	}

	private WebElement getPageElement(HomePageObjects pageEnum) {
		WebElement element;
		try {
			element = commonFunction.getElementByProperty(pageEnum.getProperty(), pageEnum.getLocatorType().toString(),
					true);
			if (element != null) {
				System.out.println("Found the element: " + pageEnum.getObjectname());
				return element;
			} else {
				System.out.println("Element Not Found: " + pageEnum.getObjectname());
				return null;
			}
		} catch (Exception e) {
			report.updateTestLog("Home Page - get page element",
					pageEnum.toString() + " object is not defined or found.", Status.FAIL);
			return null;
		}
	}

	private WebElement getPageElement(ProductRegistrationPageObjects pageEnum) {
		WebElement element;
		try {
			element = commonFunction.getElementByProperty(pageEnum.getProperty(), pageEnum.getLocatorType().toString(),
					true);
			if (element != null) {
				System.out.println("Found the element: " + pageEnum.getObjectname());
				return element;
			} else {
				System.out.println("Element Not Found: " + pageEnum.getObjectname());
				return null;
			}
		} catch (Exception e) {
			report.updateTestLog("Product Registration Page - get page element",
					pageEnum.toString() + " object is not defined or found.", Status.FAIL);
			return null;
		}
	}

	private WebElement getPageElement(AccountInformationPageObjects pageEnum) {
		WebElement element;
		try {
			element = commonFunction.getElementByProperty(pageEnum.getProperty(), pageEnum.getLocatorType().toString(),
					true);
			if (element != null) {
				System.out.println("Found the element: " + pageEnum.getObjectname());
				return element;
			} else {
				System.out.println("Element Not Found: " + pageEnum.getObjectname());
				return null;
			}
		} catch (Exception e) {
			report.updateTestLog("Account Information Page - get page element",
					pageEnum.toString() + " object is not defined or found.", Status.FAIL);
			return null;
		}
	}
	
	private WebElement getPageElement(SupportPageObjects pageEnum) {
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
			report.updateTestLog("Product Support Page - get page element",
					pageEnum.toString() + " object is not defined or found.", Status.FAIL);
			return null;
		}
	}
	public void invokeApplication() {
		try {

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			String applicationURL = dataTable.getData("General_Data", "ApplicationURL");
			driver.get(applicationURL);

			report.updateTestLog("Invoke Application", "Invoked the application under test @ " + applicationURL,
					Status.DONE);
			System.out.println("Application is launched....");
		} catch (Exception e) {
			e.printStackTrace();
			report.updateTestLog("Invoke Application", "Unable to Launch the Application" + e.toString(),
					Status.WARNING);
		}
	}

	public void verifyHomePageHeroImage() {

		try {
			String cursiveVerbiage = dataTable.getData("General_Data", "CursiveVerbiage");
			String heroVerbiage = dataTable.getData("General_Data", "HeroVerbiage");
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.headerLogo),
					HomePageObjects.headerLogo.getObjectname());

			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.txtHeroVerbiage),
					HomePageObjects.txtHeroVerbiage.getObjectname(), heroVerbiage);
			System.out.println(getPageElement(HomePageObjects.txtHeroVerbiage).getText());

			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.txtCursiveVerbiage),
					HomePageObjects.txtCursiveVerbiage.getObjectname(), cursiveVerbiage);
			System.out.println(getPageElement(HomePageObjects.txtCursiveVerbiage).getText());

			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.buttonShopSmokersGrill),
					HomePageObjects.buttonShopSmokersGrill.getObjectname());

		} catch (Exception e) {
			report.updateTestLog("Home Page - Hero Image Validation", "Something went wrong!" + e.toString(),
					Status.FAIL);
		}

	}

	public void verifyHeaderLinkNavigation() {
		try {

			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lnkNaviSmokerAndGrills),
					HomePageObjects.lnkNaviSmokerAndGrills.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lnkNaviAccessoriesAndParts),
					HomePageObjects.lnkNaviAccessoriesAndParts.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lnkNaviTheCraft),
					HomePageObjects.lnkNaviTheCraft.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lnkNaviOurStory),
					HomePageObjects.lnkNaviOurStory.getObjectname());

			// Validate Navigation Menu Smokers & Grill
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkNaviSmokerAndGrills),
					HomePageObjects.lnkNaviSmokerAndGrills.getObjectname());
			if (driver.getCurrentUrl().contains("/smokers-and-grills")) {
				report.updateTestLog("Verify Navigation Menu link - Smokers & Grills",
						"User is successfully Navigated to Smokers & Grill Page", Status.PASS);
			} else {
				report.updateTestLog("Verify Navigation Menu link - Smokers & Grills",
						"User is NOT Navigated to Smokers & Grill Page", Status.FAIL);
			}

			// Validate Navigation Menu Accessories & Parts
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkNaviAccessoriesAndParts),
					HomePageObjects.lnkNaviAccessoriesAndParts.getObjectname());
			if (driver.getCurrentUrl().contains("/accessories-and-parts")) {
				report.updateTestLog("Verify Navigation Menu link - Accessories & Parts",
						"User is successfully Navigated to Accessories & Parts Page", Status.PASS);
			} else {
				report.updateTestLog("Verify Navigation Menu link - Accessories & Parts",
						"User is NOT Navigated to Accessories & Parts Page", Status.FAIL);
			}

			// Validate Navigation Menu The Craft
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkNaviTheCraft),
					HomePageObjects.lnkNaviTheCraft.getObjectname());
			if (driver.getCurrentUrl().contains("/the-craft")) {
				report.updateTestLog("Verify Navigation Menu link - The Craft",
						"User is successfully Navigated to The Craft Page", Status.PASS);
			} else {
				report.updateTestLog("Verify Navigation Menu link - The Craft",
						"User is NOT Navigated to The Craft Page", Status.FAIL);
			}

			// Validate Navigation Menu Our Store
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkNaviOurStory),
					HomePageObjects.lnkNaviOurStory.getObjectname());
			if (driver.getCurrentUrl().contains("/our-story")) {
				report.updateTestLog("Verify Navigation Menu link - Our Store",
						"User is successfully Navigated to Our Store Page", Status.PASS);
			} else {
				report.updateTestLog("Verify Navigation Menu link - Our Store",
						"User is NOT  Navigated to Our Store Page", Status.FAIL);
			}

			// Validate Sub Menu Offset Smokers in Smokers & Grills
			commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviSmokerAndGrills),
					HomePageObjects.lnkNaviSmokerAndGrills.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuOffsetSmokers),
					HomePageObjects.lnkSubMenuOffsetSmokers.getObjectname());
			if (driver.getCurrentUrl().contains("/smokers-and-grills/offset-smokers")) {
				report.updateTestLog(
						"Verify Sub-Navigtion Menu - Offset Smokers of Navigation Menu link - Smokers & Grill",
						"User is successfully Navigated to sub-Navigation Menu - Offset-Smokers", Status.PASS);
			} else {
				report.updateTestLog(
						"Verify Sub-Navigtion Menu  - Offset Smokers of Navigation Menu link - Smokers & Grill",
						"User is NOT Navigated to sub-Navigation Menu - Offset-Smokers", Status.FAIL);
			}

			// Validate Sub Menu Smokers/Grill Combos in Smokers & Grills
			commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviSmokerAndGrills),
					HomePageObjects.lnkNaviSmokerAndGrills.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuSmokerGrillCombo),
					HomePageObjects.lnkSubMenuSmokerGrillCombo.getObjectname());
			if (driver.getCurrentUrl().contains("/smokers-and-grills/smoker-grill-combos")) {
				report.updateTestLog(
						"Verify Sub-Navigtion Menu - Smokers/Grill Combos of Navigation Menu link - Smokers & Grill",
						"User is successfully Navigated to sub-Navigation Menu - Smokers/Grill Combos", Status.PASS);
			} else {
				report.updateTestLog(
						"Verify Sub-Navigtion Menu- Smokers/Grill Combos of Navigation Menu link - Smokers & Grill",
						"User is NOT Navigated to sub-Navigation Menu - Smokers/Grill Combos", Status.FAIL);
			}

			// Validate Sub Menu Charcoal Grills in Smokers & Grills
			commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviSmokerAndGrills),
					HomePageObjects.lnkNaviSmokerAndGrills.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuCharCoalGrill),
					HomePageObjects.lnkSubMenuCharCoalGrill.getObjectname());
			if (driver.getCurrentUrl().contains("/smokers-and-grills/charcoal-grills")) {
				report.updateTestLog(
						"Verify Sub-Navigtion Menu - Charcoal Grills of Navigation Menu link - Smokers & Grill",
						"User is successfully Navigated to sub-Navigation Menu - Charcoal Grills", Status.PASS);
			} else {
				report.updateTestLog(
						"Verify Sub-Navigtion Menu - Charcoal Grills of Navigation Menu link - Smokers & Grill",
						"User is NOT Navigated to sub-Navigation Menu - Charcoal Grills", Status.FAIL);
			}

			// Validate Sub Menu Drum Smokers in Smokers & Grills
			commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviSmokerAndGrills),
					HomePageObjects.lnkNaviSmokerAndGrills.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuDrumSmokers),
					HomePageObjects.lnkSubMenuDrumSmokers.getObjectname());
			if (driver.getCurrentUrl().contains("/smokers-and-grills/drum-smokers")) {
				report.updateTestLog(
						"Verify Sub-Navigtion Menu -Drum Smokers of Navigation Menu link - Smokers & Grill",
						"User is successfully Navigated to sub-Navigation Menu - Drum Smokers", Status.PASS);
			} else {
				report.updateTestLog(
						"Verify Sub-Navigtion Menu- Drum Smokers of Navigation Menu link - Smokers & Grill",
						"User is NOT Navigated to sub-Navigation Menu - Drum Smokers", Status.FAIL);
			}

			// Validate Sub Menu Tools in Accessories & Parts
			commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviAccessoriesAndParts),
					HomePageObjects.lnkNaviAccessoriesAndParts.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuTools),
					HomePageObjects.lnkSubMenuTools.getObjectname());
			if (driver.getCurrentUrl().contains("/accessories-and-parts/tools")) {
				report.updateTestLog("Verify Sub-Navigtion Menu - Tools of Navigation Menu link - Accessories & Parts",
						"User is successfully Navigated to sub-Navigation Menu - Tools", Status.PASS);
			} else {
				report.updateTestLog("Verify Sub-Navigtion Menu - Tools of Navigation Menu link - Accessories & Parts ",
						"User is NOT Navigated to sub-Navigation Menu - Tools", Status.FAIL);
			}

			// Validate Sub Menu Covers in Accessories & Parts
			commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviAccessoriesAndParts),
					HomePageObjects.lnkNaviAccessoriesAndParts.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuCovers),
					HomePageObjects.lnkSubMenuCovers.getObjectname());
			if (driver.getCurrentUrl().contains("/accessories-and-parts/covers")) {
				report.updateTestLog("Verify Sub-Navigtion Menu - Covers of Navigation Menu link - Accessories & Parts",
						"User is successfully Navigated to sub-Navigation Menu - Covers", Status.PASS);
			} else {
				report.updateTestLog(
						"Verify Sub-Navigtion Menu - Covers of Navigation Menu link - Accessories & Parts ",
						"User is NOT Navigated to sub-Navigation Menu - Covers", Status.FAIL);
			}

			// Validate Sub Menu Wood in Accessories & Parts
			commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviAccessoriesAndParts),
					HomePageObjects.lnkNaviAccessoriesAndParts.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuWood),
					HomePageObjects.lnkSubMenuWood.getObjectname());
			if (driver.getCurrentUrl().contains("/accessories-and-parts/wood")) {
				report.updateTestLog("Verify Sub-Navigtion Menu - Wood of Navigation Menu link - Accessories & Parts",
						"User is successfully Navigated to sub-Navigation Menu - Wood", Status.PASS);
			} else {
				report.updateTestLog("Verify Sub-Navigtion Menu - Wood of Navigation Menu link - Accessories & Parts ",
						"User is NOT Navigated to sub-Navigation Menu - Wood", Status.FAIL);
			}

			// Validate Sub Menu Apparel in Accessories & Parts
			commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviAccessoriesAndParts),
					HomePageObjects.lnkNaviAccessoriesAndParts.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuApparel),
					HomePageObjects.lnkSubMenuApparel.getObjectname());
			if (driver.getCurrentUrl().contains("/accessories-and-parts/apparel")) {
				report.updateTestLog(
						"Verify Sub-Navigtion Menu - Apparel of Navigation Menu link - Accessories & Parts",
						"User is successfully Navigated to sub-Navigation Menu - Apparel", Status.PASS);
			} else {
				report.updateTestLog(
						"Verify Sub-Navigtion Menu - Apparel of Navigation Menu link - Accessories & Parts ",
						"User is NOT Navigated to sub-Navigation Menu - Apparel", Status.FAIL);
			}

			// Validate Sub Menu Mods in Accessories & Parts
			commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviAccessoriesAndParts),
					HomePageObjects.lnkNaviAccessoriesAndParts.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuMods),
					HomePageObjects.lnkSubMenuMods.getObjectname());
			if (driver.getCurrentUrl().contains("/accessories-and-parts/mods")) {
				report.updateTestLog("Verify Sub-Navigtion Menu - Mods of Navigation Menu link - Accessories & Parts",
						"User is successfully Navigated to sub-Navigation Menu - Mods", Status.PASS);
			} else {
				report.updateTestLog("Verify Sub-Navigtion Menu - Mods of Navigation Menu link - Accessories & Parts ",
						"User is NOT Navigated to sub-Navigation Menu - Mods", Status.FAIL);
			}

			// Validate Sub Menu Parts in Accessories & Parts
			commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviAccessoriesAndParts),
					HomePageObjects.lnkNaviAccessoriesAndParts.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuParts),
					HomePageObjects.lnkSubMenuParts.getObjectname());
			if (driver.getCurrentUrl().contains("/accessories-and-parts/parts?layout=grid")) {
				report.updateTestLog("Verify Sub-Navigtion Menu - Parts of Navigation Menu link - Accessories & Parts",
						"User is successfully Navigated to sub-Navigation Menu - Parts", Status.PASS);
			} else {
				report.updateTestLog("Verify Sub-Navigtion Menu - Parts of Navigation Menu link - Accessories & Parts",
						"User is NOT Navigated to sub-Navigation Menu - Parts", Status.FAIL);
			}

			// Validate Sub Menu Recipes in The Craft
			commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviTheCraft),
					HomePageObjects.lnkNaviTheCraft.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.LnkSubMenuRecipes),
					HomePageObjects.LnkSubMenuRecipes.getObjectname());
			if (driver.getCurrentUrl().contains("/recipes")) {
				report.updateTestLog("Verify Sub-Navigtion Menu - Recipes of Navigation Menu link - The Craft",
						"User is successfully Navigated to sub-Navigation Menu - Recipes", Status.PASS);
			} else {
				report.updateTestLog("Verify Sub-Navigtion Menu - Recipes of Navigation Menu link - The Craft",
						"User is NOT Navigated to sub-Navigation Menu - Recipes", Status.FAIL);
			}

			// Validate Sub Menu How Tos in The Craft
			commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviTheCraft),
					HomePageObjects.lnkNaviTheCraft.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuHowsTo),
					HomePageObjects.lnkSubMenuHowsTo.getObjectname());
			if (driver.getCurrentUrl().contains("/how-tos")) {
				report.updateTestLog("Verify Sub-Navigtion Menu - How Tos of Navigation Menu link - The Craft",
						"User is successfully Navigated to sub-Navigation Menu - How Tos", Status.PASS);
			} else {
				report.updateTestLog("Verify Sub-Navigtion Menu - How Tos of Navigation Menu link - The Craft",
						"User is NOT Navigated to sub-Navigation Menu - How Tos", Status.FAIL);
			}

			// Validate user is navigated to Home page on click the logo
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.headerLogo),
					HomePageObjects.headerLogo.getObjectname());
			if (commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtHeroVerbiage),
					HomePageObjects.txtHeroVerbiage.getObjectname())) {

				report.updateTestLog("Verify user is on the Home Page after clicking on Header logo",
						"User is successfully navigated to Home page on clicking the logo", Status.PASS);
			} else {
				report.updateTestLog("Verify user is on the Home Page after clicking on Header logo",
						"User is NOT Navigated to Home Page", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Home Page - Navigation Menu and header logo", "Something went wrong!" + e.toString(),
					Status.FAIL);
		}
	}

	public void validateSearch() {
		try {
			String searchText = dataTable.getData("General_Data", "SearchText");

			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnSearch),
					HomePageObjects.btnSearch.getObjectname());
			commonFunction.clearAndEnterText(getPageElement(HomePageObjects.txtBoxSearch), searchText,
					HomePageObjects.txtBoxSearch.getObjectname());
			commonFunction.hitEnterKey(getPageElement(HomePageObjects.txtBoxSearch),
					HomePageObjects.txtBoxSearch.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSearchResults),
					HomePageObjects.txtSearchResults.getObjectname());
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.txtSearchResults),
					HomePageObjects.txtSearchResults.getObjectname(), "â€œ" + searchText + "â€�");
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lblProducts),
					HomePageObjects.lblProducts.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lnkRecipes),
					HomePageObjects.lnkRecipes.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lnkHowTo),
					HomePageObjects.lnkHowTo.getObjectname());
		} catch (Exception e) {
			report.updateTestLog("Home Page - Search Button Validation", "Something went wrong!" + e.toString(),
					Status.FAIL);
		}
	}
	
	public void validateInvalidSearch() {
		try {
			String searchText = dataTable.getData("General_Data", "SearchText");
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnSearch),
					HomePageObjects.btnSearch.getObjectname());
			commonFunction.clearAndEnterText(getPageElement(HomePageObjects.txtBoxSearch), searchText,
					HomePageObjects.txtBoxSearch.getObjectname());
			commonFunction.hitEnterKey(getPageElement(HomePageObjects.txtBoxSearch),
					HomePageObjects.txtBoxSearch.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSearchResults),
					HomePageObjects.txtSearchResults.getObjectname());
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.txtSearchResults),
					HomePageObjects.txtSearchResults.getObjectname(), "â€œ" + searchText + "â€�");
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lblTrySearchAgain),
					HomePageObjects.lblTrySearchAgain.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtBoxImLookingFor),
					HomePageObjects.txtBoxImLookingFor.getObjectname());
		}catch(Exception e) {
			report.updateTestLog("Home Page - Invalid Search Validation", "Something went wrong!" + e.toString(),
					Status.FAIL);
		}
	}

	public void validateEmptyCart() {
		try {
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.btnCart),
					HomePageObjects.btnCart.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnCart),
					HomePageObjects.btnCart.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.txtShoppingCartTitle),
					ShoppingCartPageObjects.txtShoppingCartTitle.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.txtNoItems),
					ShoppingCartPageObjects.txtNoItems.getObjectname());
			commonFunction.isElementPresentContainsText(getPageElement(ShoppingCartPageObjects.txtNoItems),
					ShoppingCartPageObjects.txtNoItems.getObjectname(), "You have no items in your cart");
		} catch (Exception e) {
			report.updateTestLog("Shopping Cart - Page Validation", "Something went wrong!" + e.toString(),
					Status.FAIL);
		}
	}

	public void validateAccountPage() {
		try {
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.headerLogo),
					HomePageObjects.headerLogo.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnUserAccount),
					HomePageObjects.btnUserAccount.getObjectname());
			if (commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.btnSignIn),
					HomePageObjects.btnSignIn.getObjectname())) {
				report.updateTestLog("Verify User Account Menu", "User Account Menu is displayed successfully",
						Status.PASS);
			} else {
				report.updateTestLog("Verify User Account menu ", "User Account Menu is NOT displayed ", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Account Overlay -  Validation", "Something went wrong!" + e.toString(), Status.FAIL);
		}
	}

	public void validateFooter() {
		try {

			commonFunction.scrollIntoView(getPageElement(HomePageObjects.lblParts));

			// Validate Parts in Footer
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lblParts),
					HomePageObjects.lblParts.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtBoxPartSearch),
					HomePageObjects.txtBoxPartSearch.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtPartContactService),
					HomePageObjects.txtPartContactService.getObjectname());

			// Validate Support in Footer
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lblSupport),
					HomePageObjects.lblSupport.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lnkFAQ),
					HomePageObjects.lnkFAQ.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lnkProductHelp),
					HomePageObjects.lnkProductHelp.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lnkSupportCenter),
					HomePageObjects.lnkSupportCenter.getObjectname());

			// Validate Contact US in Footer

			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lblContactUs),
					HomePageObjects.lblContactUs.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lnkTelePhone),
					HomePageObjects.lnkTelePhone.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lblMonToFri),
					HomePageObjects.lblMonToFri.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lnkSendEmail),
					HomePageObjects.lnkSendEmail.getObjectname());
			if (liveTime.getHour() < 9 & liveTime.getHour() > 21) {
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lblChatBusinessHour),
						HomePageObjects.lblChatBusinessHour.getObjectname());
			} else {
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lnkLiveChat),
						HomePageObjects.lnkLiveChat.getObjectname());
			}
			driver.navigate().refresh();
		} catch (Exception e) {
			report.updateTestLog("Footer - Validation", "Something went wrong!" + e.toString(), Status.FAIL);
		}
	}

	public void validatePartsSearchInFooter() {
		try {
			String partModel = dataTable.getData("General_Data", "ProductModelNumber");
			commonFunction.clearAndEnterText(getPageElement(HomePageObjects.txtBoxPartSearch), partModel,
					HomePageObjects.txtBoxPartSearch.getObjectname());
			commonFunction.hitEnterKey(getPageElement(HomePageObjects.txtBoxPartSearch),
					HomePageObjects.txtBoxPartSearch.getObjectname());
			if (driver.getCurrentUrl().contains("/parts/search/results/?model=" + partModel)) {
				report.updateTestLog("Verify Part Listing Page from Footer",
						"User is successfully navigated to Part Listing page", Status.PASS);
			} else {
				report.updateTestLog("Verify Part Listing Page from Footer",
						"User is NOT navigated to Part Listing page", Status.FAIL);
			}
			commonFunction.isElementPresentContainsText(getPageElement(PartListingPageObjects.lblProductSummryTitle),
					PartListingPageObjects.lblProductSummryTitle.getObjectname(),
					"HELP and PARTS FOR model #" + partModel);
		} catch (Exception e) {
			report.updateTestLog("Part Listing Page - Validation", "Something went wrong!" + e.toString(), Status.FAIL);
		}
	}

	public void validateInvalidPartsSearchInFooter() {
		try {
			String partModel = "1234";
			commonFunction.clearAndEnterText(getPageElement(HomePageObjects.txtBoxPartSearch), partModel,
					HomePageObjects.txtBoxPartSearch.getObjectname());
			commonFunction.hitEnterKey(getPageElement(HomePageObjects.txtBoxPartSearch),
					HomePageObjects.txtBoxPartSearch.getObjectname());
			if (commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.msgPartSearchError),
					HomePageObjects.msgPartSearchError.getObjectname(),
					"There are no products matching your search.")) {
				report.updateTestLog("Verify error Message for invalid Part Model #", "Error Message is displayed",
						Status.PASS);
			} else {
				report.updateTestLog("Verify error Message for invalid Part Model #", "Error Message is not displayed",
						Status.FAIL);
			}

		} catch (Exception e) {
			report.updateTestLog("Part Listing Page - Validation", "Something went wrong!" + e.toString(), Status.FAIL);
		}
	}

	public void validatelinksInSupportInFooter() {
		try {
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkFAQ),
					HomePageObjects.lnkFAQ.getObjectname());
			if (driver.getCurrentUrl().contains("/faqs")) {
				report.updateTestLog("Verify User navigated to FAQ Page", "User is successfully navigated to FAQ page",
						Status.PASS);
			} else {
				report.updateTestLog("Verify User navigated to FAQ Page", "User is NOT navigated to FAQ page",
						Status.FAIL);
			}

			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkProductHelp),
					HomePageObjects.lnkProductHelp.getObjectname());
			if (driver.getCurrentUrl().contains("/contact-us")) {
				report.updateTestLog("Verify User navigated to Contact US Page on Clicking Product Help link",
						"User is successfully navigated to Contact US page on clicking Product Help link", Status.PASS);
			} else {
				report.updateTestLog("Verify User navigated to Contact US Page on Clicking Product Help link",
						"User is NOT navigated to Contact US page on clicking Product Help link", Status.FAIL);
			}

			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSupportCenter),
					HomePageObjects.lnkSupportCenter.getObjectname());
			if (driver.getCurrentUrl().contains("/support")) {
				report.updateTestLog("Verify User navigated to Support Page",
						"User is successfully navigated to Support page", Status.PASS);
			} else {
				report.updateTestLog("Verify User navigated to Support Page", "User is NOT navigated to Support page",
						Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("FAQ Page - Validation", "Something went wrong!" + e.toString(), Status.FAIL);
		}
	}

	public void validateLinksInContactUSInFooter() {
		try {
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSendEmail),
					HomePageObjects.lnkSendEmail.getObjectname());
			if (driver.getCurrentUrl().contains("/contact-us")) {
				report.updateTestLog("Verify User navigated to Contact US Page on Clicking Send Email link",
						"User is successfully navigated to Contact US page on clicking Send Email link", Status.PASS);
			} else {
				report.updateTestLog("Verify User navigated to Contact US Page on Clicking Send Email link",
						"User is NOT navigated to Contact US page on clicking Send Email link", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Contact Us in Footer - Validation", "Something went wrong!" + e.toString(),
					Status.FAIL);
		}
	}

	public void footerFacebookValidation() {
		try {
			String mainWindow = "";

			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.facebookIcon),
					HomePageObjects.facebookIcon.getObjectname());
			mainWindow = driver.getWindowHandle();
			driver.switchTo().window(new ArrayList<String>(driver.getWindowHandles()).get(1));
			for (int count = 1; count <= 5; count++) {
				if (driver.getCurrentUrl().contains("https://www.facebook.com/oklahomajoessmokers/")) {
					report.updateTestLog("Home Page screen", "Navigated to facebook link - " + driver.getCurrentUrl(),
							Status.PASS);
					break;
				} else if (count == 5)
					report.updateTestLog("Home Page screen", "Not navigated to facebook link.", Status.FAIL);
				else {
					report.updateTestLog("Home Page screen",
							"Not navigated to Facebook link in 2 seconds. Will retry in another 2 seconds.",
							Status.DONE);
				}
			}
			driver.close();
			driver.switchTo().window(mainWindow);

		} catch (Exception e) {
			e.printStackTrace();
			report.updateTestLog("Exception in navigating to facebook page", "Exception is " + e.getMessage(),
					Status.FAIL);
		}
	}

	public void footerTwitterValidation() {
		try {
			String mainWindow = "";

			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.twitterIcon),
					HomePageObjects.twitterIcon.getObjectname());
			mainWindow = driver.getWindowHandle();
			driver.switchTo().window(new ArrayList<String>(driver.getWindowHandles()).get(1));
			for (int count = 1; count <= 5; count++) {
				if (driver.getCurrentUrl().contains("https://twitter.com/oklahomajoes/")) {
					report.updateTestLog("Home Page screen", "Navigated to Twitter link - " + driver.getCurrentUrl(),
							Status.PASS);
					break;
				} else if (count == 5)
					report.updateTestLog("Home Page screen", "Not navigated to Twitter link.", Status.FAIL);
				else {
					report.updateTestLog("Home Page screen",
							"Not navigated to Twitter link in 2 seconds. Will retry in another 2 seconds.",
							Status.DONE);
				}
			}
			driver.close();
			driver.switchTo().window(mainWindow);

		} catch (Exception e) {
			e.printStackTrace();
			report.updateTestLog("Exception in navigating to Twitter page", "Exception is " + e.getMessage(),
					Status.FAIL);
		}
	}

	public void footerPinterestValidation() {
		try {
			String mainWindow = "";

			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.pinterestIcon),
					HomePageObjects.pinterestIcon.getObjectname());
			mainWindow = driver.getWindowHandle();
			driver.switchTo().window(new ArrayList<String>(driver.getWindowHandles()).get(1));
			for (int count = 1; count <= 5; count++) {
				if (driver.getCurrentUrl().contains("https://www.pinterest.com/oklahomajoessmokers/")) {
					report.updateTestLog("Home Page screen", "Navigated to Pinterest link - " + driver.getCurrentUrl(),
							Status.PASS);
					break;
				} else if (count == 5)
					report.updateTestLog("Home Page screen", "Not navigated to Pinterest link.", Status.FAIL);
				else {
					report.updateTestLog("Home Page screen",
							"Not navigated to Pinterest link in 2 seconds. Will retry in another 2 seconds.",
							Status.DONE);
				}
			}
			driver.close();
			driver.switchTo().window(mainWindow);

		} catch (Exception e) {
			e.printStackTrace();
			report.updateTestLog("Exception in navigating to Pinterest page", "Exception is " + e.getMessage(),
					Status.FAIL);
		}
	}

	public void footerInstagramValidation() {
		try {
			String mainWindow = "";

			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.instagramIcon),
					HomePageObjects.instagramIcon.getObjectname());
			mainWindow = driver.getWindowHandle();
			driver.switchTo().window(new ArrayList<String>(driver.getWindowHandles()).get(1));
			for (int count = 1; count <= 5; count++) {
				if (driver.getCurrentUrl().contains("https://www.instagram.com/oklahomajoes/")) {
					report.updateTestLog("Home Page screen", "Navigated to Instagram link - " + driver.getCurrentUrl(),
							Status.PASS);
					break;
				} else if (count == 5)
					report.updateTestLog("Home Page screen", "Not navigated to Instagram link.", Status.FAIL);
				else {
					report.updateTestLog("Home Page screen",
							"Not navigated to Instagram link in 2 seconds. Will retry in another 2 seconds.",
							Status.DONE);
				}
			}
			driver.close();
			driver.switchTo().window(mainWindow);

		} catch (Exception e) {
			e.printStackTrace();
			report.updateTestLog("Exception in navigating to Instagram page", "Exception is " + e.getMessage(),
					Status.FAIL);
		}
	}

	public void footerYoutubeValidation() {
		try {
			String mainWindow = "";

			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.youtubeIcon),
					HomePageObjects.youtubeIcon.getObjectname());
			mainWindow = driver.getWindowHandle();
			driver.switchTo().window(new ArrayList<String>(driver.getWindowHandles()).get(1));
			for (int count = 1; count <= 5; count++) {
				if (driver.getCurrentUrl().contains("https://www.youtube.com/channel/UCEq3NY2L_oZFOtGBdNb0m4Q/")) {
					report.updateTestLog("Home Page screen", "Navigated to Youtube link - " + driver.getCurrentUrl(),
							Status.PASS);
					break;
				} else if (count == 5)
					report.updateTestLog("Home Page screen", "Not navigated to Youtube link.", Status.FAIL);
				else {
					report.updateTestLog("Home Page screen",
							"Not navigated to Youtube link in 2 seconds. Will retry in another 2 seconds.",
							Status.DONE);
				}
			}
			driver.close();
			driver.switchTo().window(mainWindow);

		} catch (Exception e) {
			e.printStackTrace();
			report.updateTestLog("Exception in navigating to Youtube page", "Exception is " + e.getMessage(),
					Status.FAIL);
		}
	}

	/*
	 * Method for validating social media links at footer
	 */
	public void validateSocialMediaLinksFooter() {
		try {
			footerPinterestValidation();
			footerTwitterValidation();
			footerFacebookValidation();
			footerInstagramValidation();
			footerYoutubeValidation();
		} catch (Exception e) {
			report.updateTestLog("Exception in validateSocialMediaLinksFooter", "Exception is " + e.getMessage(),
					Status.FAIL);
		}
	}

	public void validateBodyCopyLinks() {
		try {
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkPrivacyPolicy),
					HomePageObjects.lnkPrivacyPolicy.getObjectname());
			if (driver.getCurrentUrl().contains("/privacy")) {
				report.updateTestLog("Verify User navigated to Privacy Policy Page",
						"User is successfully navigated to Privacy Policy page", Status.PASS);
			} else {
				report.updateTestLog("Verify User navigated to Privacy Policy Page",
						"User is NOT navigated to Privacy Policy page", Status.FAIL);
			}

			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkTermsOfUse),
					HomePageObjects.lnkTermsOfUse.getObjectname());
			if (driver.getCurrentUrl().contains("/terms-of-use")) {
				report.updateTestLog("Verify User navigated to Terms of Use Page",
						"User is successfully navigated to Terms of Use  page", Status.PASS);
			} else {
				report.updateTestLog("Verify User navigated to Terms of Use  Page",
						"User is NOT navigated to Terms of Use  page", Status.FAIL);
			}

			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkCaTransparency),
					HomePageObjects.lnkCaTransparency.getObjectname());
			if (driver.getCurrentUrl().contains("/supply-chains-act")) {
				report.updateTestLog("Verify User navigated to CA Transparency Supply Chains Act Page",
						"User is successfully navigated to CA Transparency Supply Chains Act  page", Status.PASS);
			} else {
				report.updateTestLog("Verify User navigated to CA Transparency Supply Chains Act  Page",
						"User is NOT navigated to CA Transparency Supply Chains Act  page", Status.FAIL);
			}

			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkAccessibilityStmt),
					HomePageObjects.lnkAccessibilityStmt.getObjectname());
			if (driver.getCurrentUrl().contains("/accessibility")) {
				report.updateTestLog("Verify User navigated to Accessibility Statement Page",
						"User is successfully navigated to Accessibility Statement page", Status.PASS);
			} else {
				report.updateTestLog("Verify User navigated to Accessibility Statement  Page",
						"User is NOT navigated to Accessibility Statement  page", Status.FAIL);
			}

			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lblCopyRight),
					HomePageObjects.lblCopyRight.getObjectname());
		} catch (Exception e) {
			report.updateTestLog("Body and Copy Links -  Validation", "Something went wrong!" + e.toString(),
					Status.FAIL);
		}
	}

	public void navigatetoProductListingPage() {
		try {
			commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviSmokerAndGrills),
					HomePageObjects.lnkNaviSmokerAndGrills.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuOffsetSmokers),
					HomePageObjects.lnkSubMenuOffsetSmokers.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnViewAllSmokersGrills),
					HomePageObjects.btnViewAllSmokersGrills.getObjectname());
		} catch (Exception e) {
			report.updateTestLog("Navigate to Product Listing Page -  ", "Something went wrong!" + e.toString(),
					Status.FAIL);
		}
	}

	public void validateHeaderLinkLandingPagesLoading() {
		try {
			// Validate Navigation Menu Smokers & Grill
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkNaviSmokerAndGrills),
					HomePageObjects.lnkNaviSmokerAndGrills.getObjectname());
			if (driver.getCurrentUrl().contains("/smokers-and-grills")) {
				report.updateTestLog("Verify Navigation Menu link - Smokers & Grills",
						"User is successfully Navigated to Smokers & Grill Page", Status.PASS);
			} else {
				report.updateTestLog("Verify Navigation Menu link - Smokers & Grills",
						"User is NOT Navigated to Smokers & Grill Page", Status.FAIL);
			}
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSmokerAndGrillsPageTitle),
					HomePageObjects.txtSmokerAndGrillsPageTitle.getObjectname());
			commonFunction.verifyIfElementIsPresent(
					getPageElement(HomePageObjects.txtSmokerAndGrillsPageTitleDescription),
					HomePageObjects.txtSmokerAndGrillsPageTitleDescription.getObjectname());

			// Validate Navigation Menu Accessories & Parts
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkNaviAccessoriesAndParts),
					HomePageObjects.lnkNaviAccessoriesAndParts.getObjectname());
			if (driver.getCurrentUrl().contains("/accessories-and-parts")) {
				report.updateTestLog("Verify Navigation Menu link - Accessories & Parts",
						"User is successfully Navigated to Accessories & Parts Page", Status.PASS);
			} else {
				report.updateTestLog("Verify Navigation Menu link - Accessories & Parts",
						"User is NOT Navigated to Accessories & Parts Page", Status.FAIL);
			}
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtAccessorisAndPartsPageTitle),
					HomePageObjects.txtAccessorisAndPartsPageTitle.getObjectname());
			commonFunction.verifyIfElementIsPresent(
					getPageElement(HomePageObjects.txtAccessoriesAndPartsPageTitleDescription),
					HomePageObjects.txtAccessoriesAndPartsPageTitleDescription.getObjectname());

			// Validate Navigation Menu The Craft
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkNaviTheCraft),
					HomePageObjects.lnkNaviTheCraft.getObjectname());
			if (driver.getCurrentUrl().contains("/the-craft")) {
				report.updateTestLog("Verify Navigation Menu link - The Craft",
						"User is successfully Navigated to The Craft Page", Status.PASS);
			} else {
				report.updateTestLog("Verify Navigation Menu link - The Craft",
						"User is NOT Navigated to The Craft Page", Status.FAIL);
			}
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtTheCraftPageTitle),
					HomePageObjects.txtTheCraftPageTitle.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtTheCraftPageTitleDescription),
					HomePageObjects.txtTheCraftPageTitleDescription.getObjectname());

			// Validate Navigation Menu Our Store
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkNaviOurStory),
					HomePageObjects.lnkNaviOurStory.getObjectname());
			if (driver.getCurrentUrl().contains("/our-story")) {
				report.updateTestLog("Verify Navigation Menu link - Our Store",
						"User is successfully Navigated to Our Store Page", Status.PASS);
			} else {
				report.updateTestLog("Verify Navigation Menu link - Our Store",
						"User is NOT  Navigated to Our Store Page", Status.FAIL);
			}

			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtOurStoryPageTitle),
					HomePageObjects.txtOurStoryPageTitle.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtOurStoryPageTitleDescription),
					HomePageObjects.txtOurStoryPageTitleDescription.getObjectname());
		} catch (Exception e) {
			report.updateTestLog("Validate the Header navigation Links landing -  ",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}

	public void validateHeaderSubLinkLandingPagesLoading() {
		try {
			// Validate Sub Menu Offset Smokers in Smokers & Grills
			commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviSmokerAndGrills),
					HomePageObjects.lnkNaviSmokerAndGrills.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuOffsetSmokers),
					HomePageObjects.lnkSubMenuOffsetSmokers.getObjectname());
			if (driver.getCurrentUrl().contains("/smokers-and-grills/offset-smokers")) {
				report.updateTestLog(
						"Verify Sub-Navigtion Menu - Offset Smokers of Navigation Menu link - Smokers & Grill",
						"User is successfully Navigated to sub-Navigation Menu - Offset-Smokers", Status.PASS);
			} else {
				report.updateTestLog(
						"Verify Sub-Navigtion Menu  - Offset Smokers of Navigation Menu link - Smokers & Grill",
						"User is NOT Navigated to sub-Navigation Menu - Offset-Smokers", Status.FAIL);
			}
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuOffsetSmokersPageTitle),
					HomePageObjects.txtSubMenuOffsetSmokersPageTitle.getObjectname());
			commonFunction.verifyIfElementIsPresent(
					getPageElement(HomePageObjects.txtSubMenuOffsetSmokersPageDescription),
					HomePageObjects.txtSubMenuOffsetSmokersPageDescription.getObjectname());

			// Validate Sub Menu Smokers/Grill Combos in Smokers & Grills
			commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviSmokerAndGrills),
					HomePageObjects.lnkNaviSmokerAndGrills.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuSmokerGrillCombo),
					HomePageObjects.lnkSubMenuSmokerGrillCombo.getObjectname());
			if (driver.getCurrentUrl().contains("/smokers-and-grills/smoker-grill-combos")) {
				report.updateTestLog(
						"Verify Sub-Navigtion Menu - Smokers/Grill Combos of Navigation Menu link - Smokers & Grill",
						"User is successfully Navigated to sub-Navigation Menu - Smokers/Grill Combos", Status.PASS);
			} else {
				report.updateTestLog(
						"Verify Sub-Navigtion Menu- Smokers/Grill Combos of Navigation Menu link - Smokers & Grill",
						"User is NOT Navigated to sub-Navigation Menu - Smokers/Grill Combos", Status.FAIL);
			}
			commonFunction.verifyIfElementIsPresent(
					getPageElement(HomePageObjects.txtSubMenuSmokersGrillComboPageTitle),
					HomePageObjects.txtSubMenuSmokersGrillComboPageTitle.getObjectname());
			commonFunction.verifyIfElementIsPresent(
					getPageElement(HomePageObjects.txtSubMenuSmokersGrillComboPageDescription),
					HomePageObjects.txtSubMenuSmokersGrillComboPageDescription.getObjectname());

			// Validate Sub Menu Charcoal Grills in Smokers & Grills
			commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviSmokerAndGrills),
					HomePageObjects.lnkNaviSmokerAndGrills.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuCharCoalGrill),
					HomePageObjects.lnkSubMenuCharCoalGrill.getObjectname());
			if (driver.getCurrentUrl().contains("/smokers-and-grills/charcoal-grills")) {
				report.updateTestLog(
						"Verify Sub-Navigtion Menu - Charcoal Grills of Navigation Menu link - Smokers & Grill",
						"User is successfully Navigated to sub-Navigation Menu - Charcoal Grills", Status.PASS);
			} else {
				report.updateTestLog(
						"Verify Sub-Navigtion Menu - Charcoal Grills of Navigation Menu link - Smokers & Grill",
						"User is NOT Navigated to sub-Navigation Menu - Charcoal Grills", Status.FAIL);
			}
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuCharCoalGrillPageTitle),
					HomePageObjects.txtSubMenuCharCoalGrillPageTitle.getObjectname());
			commonFunction.verifyIfElementIsPresent(
					getPageElement(HomePageObjects.txtSubMenuCharCoalGrillPageDescription),
					HomePageObjects.txtSubMenuCharCoalGrillPageDescription.getObjectname());

			// Validate Sub Menu Drum Smokers in Smokers & Grills
			commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviSmokerAndGrills),
					HomePageObjects.lnkNaviSmokerAndGrills.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuDrumSmokers),
					HomePageObjects.lnkSubMenuDrumSmokers.getObjectname());
			if (driver.getCurrentUrl().contains("/smokers-and-grills/drum-smokers")) {
				report.updateTestLog(
						"Verify Sub-Navigtion Menu -Drum Smokers of Navigation Menu link - Smokers & Grill",
						"User is successfully Navigated to sub-Navigation Menu - Drum Smokers", Status.PASS);
			} else {
				report.updateTestLog(
						"Verify Sub-Navigtion Menu- Drum Smokers of Navigation Menu link - Smokers & Grill",
						"User is NOT Navigated to sub-Navigation Menu - Drum Smokers", Status.FAIL);
			}
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuDrumSmokersPageTitle),
					HomePageObjects.txtSubMenuDrumSmokersPageTitle.getObjectname());
			commonFunction.verifyIfElementIsPresent(
					getPageElement(HomePageObjects.txtSubMenuDrumSmokersPageDescription),
					HomePageObjects.txtSubMenuDrumSmokersPageDescription.getObjectname());

			// Validate Sub Menu Tools in Accessories & Parts
			commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviAccessoriesAndParts),
					HomePageObjects.lnkNaviAccessoriesAndParts.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuTools),
					HomePageObjects.lnkSubMenuTools.getObjectname());
			if (driver.getCurrentUrl().contains("/accessories-and-parts/tools")) {
				report.updateTestLog("Verify Sub-Navigtion Menu - Tools of Navigation Menu link - Accessories & Parts",
						"User is successfully Navigated to sub-Navigation Menu - Tools", Status.PASS);
			} else {
				report.updateTestLog("Verify Sub-Navigtion Menu - Tools of Navigation Menu link - Accessories & Parts ",
						"User is NOT Navigated to sub-Navigation Menu - Tools", Status.FAIL);
			}
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuToolsPageTitle),
					HomePageObjects.txtSubMenuToolsPageTitle.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuToolsPageDescription),
					HomePageObjects.txtSubMenuToolsPageDescription.getObjectname());

			// Validate Sub Menu Covers in Accessories & Parts
			commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviAccessoriesAndParts),
					HomePageObjects.lnkNaviAccessoriesAndParts.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuCovers),
					HomePageObjects.lnkSubMenuCovers.getObjectname());
			if (driver.getCurrentUrl().contains("/accessories-and-parts/covers")) {
				report.updateTestLog("Verify Sub-Navigtion Menu - Covers of Navigation Menu link - Accessories & Parts",
						"User is successfully Navigated to sub-Navigation Menu - Covers", Status.PASS);
			} else {
				report.updateTestLog(
						"Verify Sub-Navigtion Menu - Covers of Navigation Menu link - Accessories & Parts ",
						"User is NOT Navigated to sub-Navigation Menu - Covers", Status.FAIL);
			}
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuCoversPageTitle),
					HomePageObjects.txtSubMenuCoversPageTitle.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuCoversPageDescription),
					HomePageObjects.txtSubMenuCoversPageDescription.getObjectname());

			// Validate Sub Menu Wood in Accessories & Parts
			commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviAccessoriesAndParts),
					HomePageObjects.lnkNaviAccessoriesAndParts.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuWood),
					HomePageObjects.lnkSubMenuWood.getObjectname());
			if (driver.getCurrentUrl().contains("/accessories-and-parts/wood")) {
				report.updateTestLog("Verify Sub-Navigtion Menu - Wood of Navigation Menu link - Accessories & Parts",
						"User is successfully Navigated to sub-Navigation Menu - Wood", Status.PASS);
			} else {
				report.updateTestLog("Verify Sub-Navigtion Menu - Wood of Navigation Menu link - Accessories & Parts ",
						"User is NOT Navigated to sub-Navigation Menu - Wood", Status.FAIL);
			}
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuWoodPageTitle),
					HomePageObjects.txtSubMenuWoodPageTitle.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuWoodPageDescription),
					HomePageObjects.txtSubMenuWoodPageDescription.getObjectname());

			// Validate Sub Menu Apparel in Accessories & Parts
			commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviAccessoriesAndParts),
					HomePageObjects.lnkNaviAccessoriesAndParts.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuApparel),
					HomePageObjects.lnkSubMenuApparel.getObjectname());
			if (driver.getCurrentUrl().contains("/accessories-and-parts/apparel")) {
				report.updateTestLog(
						"Verify Sub-Navigtion Menu - Apparel of Navigation Menu link - Accessories & Parts",
						"User is successfully Navigated to sub-Navigation Menu - Apparel", Status.PASS);
			} else {
				report.updateTestLog(
						"Verify Sub-Navigtion Menu - Apparel of Navigation Menu link - Accessories & Parts ",
						"User is NOT Navigated to sub-Navigation Menu - Apparel", Status.FAIL);
			}
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuApparelPageTitle),
					HomePageObjects.txtSubMenuApparelPageTitle.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuApparelPageDescription),
					HomePageObjects.txtSubMenuApparelPageDescription.getObjectname());

			// Validate Sub Menu Mods in Accessories & Parts
			commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviAccessoriesAndParts),
					HomePageObjects.lnkNaviAccessoriesAndParts.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuMods),
					HomePageObjects.lnkSubMenuMods.getObjectname());
			if (driver.getCurrentUrl().contains("/accessories-and-parts/mods")) {
				report.updateTestLog("Verify Sub-Navigtion Menu - Mods of Navigation Menu link - Accessories & Parts",
						"User is successfully Navigated to sub-Navigation Menu - Mods", Status.PASS);
			} else {
				report.updateTestLog("Verify Sub-Navigtion Menu - Mods of Navigation Menu link - Accessories & Parts ",
						"User is NOT Navigated to sub-Navigation Menu - Mods", Status.FAIL);
			}
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuModsPageTitle),
					HomePageObjects.txtSubMenuModsPageTitle.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuModsPageDescription),
					HomePageObjects.txtSubMenuModsPageDescription.getObjectname());

			// Validate Sub Menu Parts in Accessories & Parts
			commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviAccessoriesAndParts),
					HomePageObjects.lnkNaviAccessoriesAndParts.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuParts),
					HomePageObjects.lnkSubMenuParts.getObjectname());
			if (driver.getCurrentUrl().contains("/accessories-and-parts/parts?layout=grid")) {
				report.updateTestLog("Verify Sub-Navigtion Menu - Parts of Navigation Menu link - Accessories & Parts",
						"User is successfully Navigated to sub-Navigation Menu - Parts", Status.PASS);
			} else {
				report.updateTestLog("Verify Sub-Navigtion Menu - Parts of Navigation Menu link - Accessories & Parts",
						"User is NOT Navigated to sub-Navigation Menu - Parts", Status.FAIL);
			}
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuPartsPageTitle),
					HomePageObjects.txtSubMenuPartsPageTitle.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuPartsPageDescription),
					HomePageObjects.txtSubMenuPartsPageDescription.getObjectname());

			// Validate Sub Menu Recipes in The Craft
			commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviTheCraft),
					HomePageObjects.lnkNaviTheCraft.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.LnkSubMenuRecipes),
					HomePageObjects.LnkSubMenuRecipes.getObjectname());
			if (driver.getCurrentUrl().contains("/recipes")) {
				report.updateTestLog("Verify Sub-Navigtion Menu - Recipes of Navigation Menu link - The Craft",
						"User is successfully Navigated to sub-Navigation Menu - Recipes", Status.PASS);
			} else {
				report.updateTestLog("Verify Sub-Navigtion Menu - Recipes of Navigation Menu link - The Craft",
						"User is NOT Navigated to sub-Navigation Menu - Recipes", Status.FAIL);
			}
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuRecipesPageTitle),
					HomePageObjects.txtSubMenuRecipesPageTitle.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuRecipesPageDescription),
					HomePageObjects.txtSubMenuRecipesPageDescription.getObjectname());

			// Validate Sub Menu How Tos in The Craft
			commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviTheCraft),
					HomePageObjects.lnkNaviTheCraft.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuHowsTo),
					HomePageObjects.lnkSubMenuHowsTo.getObjectname());
			if (driver.getCurrentUrl().contains("/how-tos")) {
				report.updateTestLog("Verify Sub-Navigtion Menu - How Tos of Navigation Menu link - The Craft",
						"User is successfully Navigated to sub-Navigation Menu - How Tos", Status.PASS);
			} else {
				report.updateTestLog("Verify Sub-Navigtion Menu - How Tos of Navigation Menu link - The Craft",
						"User is NOT Navigated to sub-Navigation Menu - How Tos", Status.FAIL);
			}
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuHowToPageTitle),
					HomePageObjects.txtSubMenuHowToPageTitle.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuHowToPageDescription),
					HomePageObjects.txtSubMenuHowToPageDescription.getObjectname());

			// Validate user is navigated to Home page on click the logo
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.headerLogo),
					HomePageObjects.headerLogo.getObjectname());
			if (commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.buttonShopSmokersGrill),
					HomePageObjects.buttonShopSmokersGrill.getObjectname())) {

				report.updateTestLog("Verify user is on the Home Page after clicking on Header logo",
						"User is successfully navigated to Home page on clicking the logo", Status.PASS);
			} else {
				report.updateTestLog("Verify user is on the Home Page after clicking on Header logo",
						"User is NOT Navigated to Home Page", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Validate the Header- sub Menu navigation Links landing -  ",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}

	public void navigateToShoppingCartPage() {
		try {
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnCart),
					HomePageObjects.btnCart.getObjectname());
			if (commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.txtShoppingCartTitle),
					ShoppingCartPageObjects.txtShoppingCartTitle.getObjectname())) {
				report.updateTestLog("Verify user is navigated to Shopping Cart Page",
						"User is successfully navigated to Shopping Cart Page", Status.PASS);
			} else {
				report.updateTestLog("Verify user is navigated to Shopping Cart Page",
						"User is NOT navigated to Shopping Cart Page", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Navigate to Shopping Cart Pager- -  ", "Something went wrong!" + e.toString(),
					Status.FAIL);
		}
	}

	public void validateMyAccountModelAndSignInModel() {
		try {
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnUserAccount),
					HomePageObjects.btnUserAccount.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.btnSignIn),
					HomePageObjects.btnSignIn.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.btnSignUp),
					HomePageObjects.btnSignUp.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lnkOrders),
					HomePageObjects.lnkOrders.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lnkRegisteredProducts),
					HomePageObjects.lnkRegisteredProducts.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lnkAccountInfo),
					HomePageObjects.lnkAccountInfo.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lnkAddressBook),
					HomePageObjects.lnkAddressBook.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lnkReviews),
					HomePageObjects.lnkReviews.getObjectname());

			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnSignIn),
					HomePageObjects.btnSignIn.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtBoxEmailAddr),
					HomePageObjects.txtBoxEmailAddr.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtBoxPassword),
					HomePageObjects.txtBoxPassword.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.btnSignInModelOverlay),
					HomePageObjects.btnSignInModelOverlay.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lnkForgotPassword),
					HomePageObjects.lnkForgotPassword.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtDontHaveAccount),
					HomePageObjects.txtDontHaveAccount.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lnkSighUp),
					HomePageObjects.lnkSighUp.getObjectname());

		} catch (Exception e) {
			report.updateTestLog("Validate My Account & Sign In Model ", "Something went wrong!" + e.toString(),
					Status.FAIL);
		}
	}

	public void logintoAccount() {
		try {
			String emailAddr = dataTable.getData("General_Data", "EmailAddress");
			String password = dataTable.getData("General_Data", "Password");

			commonFunction.clearAndEnterText(getPageElement(HomePageObjects.txtBoxEmailAddr), emailAddr,
					HomePageObjects.txtBoxEmailAddr.getObjectname());
			commonFunction.clearAndEnterText(getPageElement(HomePageObjects.txtBoxPassword), password,
					HomePageObjects.txtBoxPassword.getObjectname());
			commonFunction.hitEnterKey(getPageElement(HomePageObjects.txtBoxPassword),
					HomePageObjects.txtBoxPassword.getObjectname());
			webdriverutil.waitUntilPageLoaded(20);
			if (commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lnkSignOut),
					HomePageObjects.lnkSignOut.getObjectname())) {

				report.updateTestLog("Verify user is Logged In", "User is successfully logged In to the application",
						Status.PASS);
			} else {
				report.updateTestLog("Verify user is Logged In", "User is NOT logged in", Status.FAIL);
			}
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.headerLogo),
					HomePageObjects.headerLogo.getObjectname());
		} catch (Exception e) {
			report.updateTestLog("Validate Login with Valid Username and password",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}

	public void logintoAccountFromHomePage() {
		try {
			String emailAddr = dataTable.getData("General_Data", "EmailAddress");
			String password = dataTable.getData("General_Data", "Password");
			webdriverutil.waitUntilPageReadyStateComplete(30);
			Thread.sleep(3000);
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnUserAccount),
					HomePageObjects.btnUserAccount.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnSignIn),
					HomePageObjects.btnSignIn.getObjectname());
			commonFunction.clearAndEnterText(getPageElement(HomePageObjects.txtBoxEmailAddr), emailAddr,
					HomePageObjects.txtBoxEmailAddr.getObjectname());
			commonFunction.clearAndEnterText(getPageElement(HomePageObjects.txtBoxPassword), password,
					HomePageObjects.txtBoxPassword.getObjectname());

			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnSignInModelOverlay),
					HomePageObjects.btnSignInModelOverlay.getObjectname());
			if (commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lnkSignOut),
					HomePageObjects.lnkSignOut.getObjectname())) {

				report.updateTestLog("Verify user is Logged In", "User is successfully logged In to the application",
						Status.PASS);
			} else {
				report.updateTestLog("Verify user is Logged In", "User is NOT logged in", Status.FAIL);
			}
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.headerLogo),
					HomePageObjects.headerLogo.getObjectname());
		} catch (Exception e) {
			report.updateTestLog("Validate Login with Valid Username and password",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}

	public void loginAndValidateMyAcccountlinks() {
		try {
			String emailAddr = dataTable.getData("General_Data", "EmailAddress");
			String password = dataTable.getData("General_Data", "Password");
			webdriverutil.waitUntilPageReadyStateComplete(30);
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnUserAccount),
					HomePageObjects.btnUserAccount.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnSignIn),
					HomePageObjects.btnSignIn.getObjectname());
			commonFunction.clearAndEnterText(getPageElement(HomePageObjects.txtBoxEmailAddr), emailAddr,
					HomePageObjects.txtBoxEmailAddr.getObjectname());
			commonFunction.clearAndEnterText(getPageElement(HomePageObjects.txtBoxPassword), password,
					HomePageObjects.txtBoxPassword.getObjectname());

			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnSignInModelOverlay),
					HomePageObjects.btnSignInModelOverlay.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lnkOrders),
					HomePageObjects.lnkOrders.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lnkRegisteredProducts),
					HomePageObjects.lnkRegisteredProducts.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lnkAccountInfo),
					HomePageObjects.lnkAccountInfo.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lnkAddressBook),
					HomePageObjects.lnkAddressBook.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lnkReviews),
					HomePageObjects.lnkReviews.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lnkSignOut),
					HomePageObjects.lnkSignOut.getObjectname());
		} catch (Exception e) {
			report.updateTestLog("Validate Login and My account links", "Something went wrong!" + e.toString(),
					Status.FAIL);
		}
	}

	public void navigateToAccountInformation() {
		try {
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnUserAccount),
					HomePageObjects.btnUserAccount.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkAccountInfoAfterLoggedIn),
					HomePageObjects.lnkAccountInfoAfterLoggedIn.getObjectname());
		} catch (Exception e) {
			report.updateTestLog("Navigation to Account Information Page ", "Something went wrong!" + e.toString(),
					Status.FAIL);
		}
	}

	public void navigateToShippingCartEmptyIfNoOfItemsMoreThanOne() {

		try {
			webdriverutil.waitUntilPageReadyStateComplete(30);
			Thread.sleep(5000);
			String count = commonFunction.getTextFromElement(getPageElement(HomePageObjects.countItemsInCart));
			System.out.println(count);
			if (Integer.parseInt(count) > 0) {
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnCart),
						HomePageObjects.btnCart.getObjectname());
				ShoppingCartPageComponents spc = new ShoppingCartPageComponents(scriptHelper);
				spc.emptycart();
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.headerLogo),
						HomePageObjects.headerLogo.getObjectname());
			} else {
				report.updateTestLog("The Shipping cart is empty",
						"The shipping cart is empty, not navigating to Shipping cart page", Status.DONE);
			}
		} catch (Exception e) {
			report.updateTestLog("Navigate to Shopping Cart and empty the cart ",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}

	public void validateCategoryLandingPageSmokersGrills() {
		try {
			// Validate Navigation Menu Smokers & Grill
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkNaviSmokerAndGrills),
					HomePageObjects.lnkNaviSmokerAndGrills.getObjectname());
			if (driver.getCurrentUrl().contains("/smokers-and-grills")) {
				report.updateTestLog("Verify Navigation Menu link - Smokers & Grills",
						"User is successfully Navigated to Smokers & Grill Page", Status.PASS);
			} else {
				report.updateTestLog("Verify Navigation Menu link - Smokers & Grills",
						"User is NOT Navigated to Smokers & Grill Page", Status.FAIL);
			}
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtTitleSmokersGrills),
					HomePageObjects.txtTitleSmokersGrills.getObjectname());
		} catch (Exception e) {
			report.updateTestLog("Category Page Landing Validation", "Something went wrong!" + e.toString(),
					Status.FAIL);
		}
	}

	public void validateSubMenusOfSmokerGrills() {
		try {
			// Validate Sub Menu Offset Smokers in Smokers & Grills
			commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviSmokerAndGrills),
					HomePageObjects.lnkNaviSmokerAndGrills.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuOffsetSmokers),
					HomePageObjects.lnkSubMenuOffsetSmokers.getObjectname());
			if (driver.getCurrentUrl().contains("/smokers-and-grills/offset-smokers")) {
				report.updateTestLog(
						"Verify Sub-Navigtion Menu - Offset Smokers of Navigation Menu link - Smokers & Grill",
						"User is successfully Navigated to sub-Navigation Menu - Offset-Smokers", Status.PASS);
			} else {
				report.updateTestLog(
						"Verify Sub-Navigtion Menu  - Offset Smokers of Navigation Menu link - Smokers & Grill",
						"User is NOT Navigated to sub-Navigation Menu - Offset-Smokers", Status.FAIL);
			}
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuOffsetSmokersPageTitle),
					HomePageObjects.txtSubMenuOffsetSmokersPageTitle.getObjectname());
			commonFunction.verifyIfElementIsPresent(
					getPageElement(HomePageObjects.txtSubMenuOffsetSmokersPageDescription),
					HomePageObjects.txtSubMenuOffsetSmokersPageDescription.getObjectname());

			// Validate Sub Menu Smokers/Grill Combos in Smokers & Grills
			commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviSmokerAndGrills),
					HomePageObjects.lnkNaviSmokerAndGrills.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuSmokerGrillCombo),
					HomePageObjects.lnkSubMenuSmokerGrillCombo.getObjectname());
			if (driver.getCurrentUrl().contains("/smokers-and-grills/smoker-grill-combos")) {
				report.updateTestLog(
						"Verify Sub-Navigtion Menu - Smokers/Grill Combos of Navigation Menu link - Smokers & Grill",
						"User is successfully Navigated to sub-Navigation Menu - Smokers/Grill Combos", Status.PASS);
			} else {
				report.updateTestLog(
						"Verify Sub-Navigtion Menu- Smokers/Grill Combos of Navigation Menu link - Smokers & Grill",
						"User is NOT Navigated to sub-Navigation Menu - Smokers/Grill Combos", Status.FAIL);
			}
			commonFunction.verifyIfElementIsPresent(
					getPageElement(HomePageObjects.txtSubMenuSmokersGrillComboPageTitle),
					HomePageObjects.txtSubMenuSmokersGrillComboPageTitle.getObjectname());
			commonFunction.verifyIfElementIsPresent(
					getPageElement(HomePageObjects.txtSubMenuSmokersGrillComboPageDescription),
					HomePageObjects.txtSubMenuSmokersGrillComboPageDescription.getObjectname());

			// Validate Sub Menu Charcoal Grills in Smokers & Grills
			commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviSmokerAndGrills),
					HomePageObjects.lnkNaviSmokerAndGrills.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuCharCoalGrill),
					HomePageObjects.lnkSubMenuCharCoalGrill.getObjectname());
			if (driver.getCurrentUrl().contains("/smokers-and-grills/charcoal-grills")) {
				report.updateTestLog(
						"Verify Sub-Navigtion Menu - Charcoal Grills of Navigation Menu link - Smokers & Grill",
						"User is successfully Navigated to sub-Navigation Menu - Charcoal Grills", Status.PASS);
			} else {
				report.updateTestLog(
						"Verify Sub-Navigtion Menu - Charcoal Grills of Navigation Menu link - Smokers & Grill",
						"User is NOT Navigated to sub-Navigation Menu - Charcoal Grills", Status.FAIL);
			}
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuCharCoalGrillPageTitle),
					HomePageObjects.txtSubMenuCharCoalGrillPageTitle.getObjectname());
			commonFunction.verifyIfElementIsPresent(
					getPageElement(HomePageObjects.txtSubMenuCharCoalGrillPageDescription),
					HomePageObjects.txtSubMenuCharCoalGrillPageDescription.getObjectname());

			// Validate Sub Menu Drum Smokers in Smokers & Grills
			commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviSmokerAndGrills),
					HomePageObjects.lnkNaviSmokerAndGrills.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuDrumSmokers),
					HomePageObjects.lnkSubMenuDrumSmokers.getObjectname());
			if (driver.getCurrentUrl().contains("/smokers-and-grills/drum-smokers")) {
				report.updateTestLog(
						"Verify Sub-Navigtion Menu -Drum Smokers of Navigation Menu link - Smokers & Grill",
						"User is successfully Navigated to sub-Navigation Menu - Drum Smokers", Status.PASS);
			} else {
				report.updateTestLog(
						"Verify Sub-Navigtion Menu- Drum Smokers of Navigation Menu link - Smokers & Grill",
						"User is NOT Navigated to sub-Navigation Menu - Drum Smokers", Status.FAIL);
			}
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuDrumSmokersPageTitle),
					HomePageObjects.txtSubMenuDrumSmokersPageTitle.getObjectname());
			commonFunction.verifyIfElementIsPresent(
					getPageElement(HomePageObjects.txtSubMenuDrumSmokersPageDescription),
					HomePageObjects.txtSubMenuDrumSmokersPageDescription.getObjectname());

		} catch (Exception e) {
			report.updateTestLog("Validation of Sub Menus of Smokers & Grills ", "Something went wrong!" + e.toString(),
					Status.FAIL);
		}
	}

	public void validateSubMenusOfAccessoriesNparts() {
		try {
			// Validate Sub Menu Tools in Accessories & Parts
			commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviAccessoriesAndParts),
					HomePageObjects.lnkNaviAccessoriesAndParts.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuTools),
					HomePageObjects.lnkSubMenuTools.getObjectname());
			if (driver.getCurrentUrl().contains("/accessories-and-parts/tools")) {
				report.updateTestLog("Verify Sub-Navigtion Menu - Tools of Navigation Menu link - Accessories & Parts",
						"User is successfully Navigated to sub-Navigation Menu - Tools", Status.PASS);
			} else {
				report.updateTestLog("Verify Sub-Navigtion Menu - Tools of Navigation Menu link - Accessories & Parts ",
						"User is NOT Navigated to sub-Navigation Menu - Tools", Status.FAIL);
			}
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuToolsPageTitle),
					HomePageObjects.txtSubMenuToolsPageTitle.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuToolsPageDescription),
					HomePageObjects.txtSubMenuToolsPageDescription.getObjectname());

			// Validate Sub Menu Covers in Accessories & Parts
			commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviAccessoriesAndParts),
					HomePageObjects.lnkNaviAccessoriesAndParts.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuCovers),
					HomePageObjects.lnkSubMenuCovers.getObjectname());
			if (driver.getCurrentUrl().contains("/accessories-and-parts/covers")) {
				report.updateTestLog("Verify Sub-Navigtion Menu - Covers of Navigation Menu link - Accessories & Parts",
						"User is successfully Navigated to sub-Navigation Menu - Covers", Status.PASS);
			} else {
				report.updateTestLog(
						"Verify Sub-Navigtion Menu - Covers of Navigation Menu link - Accessories & Parts ",
						"User is NOT Navigated to sub-Navigation Menu - Covers", Status.FAIL);
			}
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuCoversPageTitle),
					HomePageObjects.txtSubMenuCoversPageTitle.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuCoversPageDescription),
					HomePageObjects.txtSubMenuCoversPageDescription.getObjectname());

			// Validate Sub Menu Wood in Accessories & Parts
			commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviAccessoriesAndParts),
					HomePageObjects.lnkNaviAccessoriesAndParts.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuWood),
					HomePageObjects.lnkSubMenuWood.getObjectname());
			if (driver.getCurrentUrl().contains("/accessories-and-parts/wood")) {
				report.updateTestLog("Verify Sub-Navigtion Menu - Wood of Navigation Menu link - Accessories & Parts",
						"User is successfully Navigated to sub-Navigation Menu - Wood", Status.PASS);
			} else {
				report.updateTestLog("Verify Sub-Navigtion Menu - Wood of Navigation Menu link - Accessories & Parts ",
						"User is NOT Navigated to sub-Navigation Menu - Wood", Status.FAIL);
			}
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuWoodPageTitle),
					HomePageObjects.txtSubMenuWoodPageTitle.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuWoodPageDescription),
					HomePageObjects.txtSubMenuWoodPageDescription.getObjectname());

			// Validate Sub Menu Apparel in Accessories & Parts
			commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviAccessoriesAndParts),
					HomePageObjects.lnkNaviAccessoriesAndParts.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuApparel),
					HomePageObjects.lnkSubMenuApparel.getObjectname());
			if (driver.getCurrentUrl().contains("/accessories-and-parts/apparel")) {
				report.updateTestLog(
						"Verify Sub-Navigtion Menu - Apparel of Navigation Menu link - Accessories & Parts",
						"User is successfully Navigated to sub-Navigation Menu - Apparel", Status.PASS);
			} else {
				report.updateTestLog(
						"Verify Sub-Navigtion Menu - Apparel of Navigation Menu link - Accessories & Parts ",
						"User is NOT Navigated to sub-Navigation Menu - Apparel", Status.FAIL);
			}
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuApparelPageTitle),
					HomePageObjects.txtSubMenuApparelPageTitle.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuApparelPageDescription),
					HomePageObjects.txtSubMenuApparelPageDescription.getObjectname());

			// Validate Sub Menu Mods in Accessories & Parts
			commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviAccessoriesAndParts),
					HomePageObjects.lnkNaviAccessoriesAndParts.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuMods),
					HomePageObjects.lnkSubMenuMods.getObjectname());
			if (driver.getCurrentUrl().contains("/accessories-and-parts/mods")) {
				report.updateTestLog("Verify Sub-Navigtion Menu - Mods of Navigation Menu link - Accessories & Parts",
						"User is successfully Navigated to sub-Navigation Menu - Mods", Status.PASS);
			} else {
				report.updateTestLog("Verify Sub-Navigtion Menu - Mods of Navigation Menu link - Accessories & Parts ",
						"User is NOT Navigated to sub-Navigation Menu - Mods", Status.FAIL);
			}
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuModsPageTitle),
					HomePageObjects.txtSubMenuModsPageTitle.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuModsPageDescription),
					HomePageObjects.txtSubMenuModsPageDescription.getObjectname());

			// Validate Sub Menu Parts in Accessories & Parts
			commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviAccessoriesAndParts),
					HomePageObjects.lnkNaviAccessoriesAndParts.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuParts),
					HomePageObjects.lnkSubMenuParts.getObjectname());
			if (driver.getCurrentUrl().contains("/accessories-and-parts/parts?layout=grid")) {
				report.updateTestLog("Verify Sub-Navigtion Menu - Parts of Navigation Menu link - Accessories & Parts",
						"User is successfully Navigated to sub-Navigation Menu - Parts", Status.PASS);
			} else {
				report.updateTestLog("Verify Sub-Navigtion Menu - Parts of Navigation Menu link - Accessories & Parts",
						"User is NOT Navigated to sub-Navigation Menu - Parts", Status.FAIL);
			}
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuPartsPageTitle),
					HomePageObjects.txtSubMenuPartsPageTitle.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuPartsPageDescription),
					HomePageObjects.txtSubMenuPartsPageDescription.getObjectname());

		} catch (Exception e) {
			report.updateTestLog("Validation of Sub Menus of Accessories & Parts ",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}

	public void validateSubMenusOfTheCraft() {
		try {
			// Validate Sub Menu Recipes in The Craft
			commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviTheCraft),
					HomePageObjects.lnkNaviTheCraft.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.LnkSubMenuRecipes),
					HomePageObjects.LnkSubMenuRecipes.getObjectname());
			if (driver.getCurrentUrl().contains("/recipes")) {
				report.updateTestLog("Verify Sub-Navigtion Menu - Recipes of Navigation Menu link - The Craft",
						"User is successfully Navigated to sub-Navigation Menu - Recipes", Status.PASS);
			} else {
				report.updateTestLog("Verify Sub-Navigtion Menu - Recipes of Navigation Menu link - The Craft",
						"User is NOT Navigated to sub-Navigation Menu - Recipes", Status.FAIL);
			}
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuRecipesPageTitle),
					HomePageObjects.txtSubMenuRecipesPageTitle.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuRecipesPageDescription),
					HomePageObjects.txtSubMenuRecipesPageDescription.getObjectname());

			// Validate Sub Menu How Tos in The Craft
			commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviTheCraft),
					HomePageObjects.lnkNaviTheCraft.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuHowsTo),
					HomePageObjects.lnkSubMenuHowsTo.getObjectname());
			if (driver.getCurrentUrl().contains("/how-tos")) {
				report.updateTestLog("Verify Sub-Navigtion Menu - How Tos of Navigation Menu link - The Craft",
						"User is successfully Navigated to sub-Navigation Menu - How Tos", Status.PASS);
			} else {
				report.updateTestLog("Verify Sub-Navigtion Menu - How Tos of Navigation Menu link - The Craft",
						"User is NOT Navigated to sub-Navigation Menu - How Tos", Status.FAIL);
			}
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuHowToPageTitle),
					HomePageObjects.txtSubMenuHowToPageTitle.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuHowToPageDescription),
					HomePageObjects.txtSubMenuHowToPageDescription.getObjectname());

		} catch (Exception e) {
			report.updateTestLog("Validation of Sub Menus of The Craft ", "Something went wrong!" + e.toString(),
					Status.FAIL);
		}
	}

	public void validateProTipsOnOurStory() {
		try {
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkNaviOurStory),
					HomePageObjects.lnkNaviOurStory.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnProTips),
					HomePageObjects.btnProTips.getObjectname());

			if (driver.getCurrentUrl().contains("/pro-tips")) {
				report.updateTestLog("Verify Navigation to Pro Tips Page - ",
						"User is successfully Navigated to Pro Tips Page", Status.PASS);
			} else {
				report.updateTestLog("Verify Navigation to Pro Tips Page - ", "User is NOT Navigated to Pro Tips Page",
						Status.FAIL);
			}

			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.titleProTips),
					HomePageObjects.titleProTips.getObjectname());
		} catch (Exception e) {
			report.updateTestLog("Validation of Navigation to Pro Tips Page ", "Something went wrong!" + e.toString(),
					Status.FAIL);
		}
	}

	public void validateFooterAccessibilityPageVerbiageSections() {
		try {
			// Validate Accessibility Page
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkAccessibilityStmt),
					HomePageObjects.lnkAccessibilityStmt.getObjectname());
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.accessibilityPageheading1),
					HomePageObjects.accessibilityPageheading1.getObjectname(),
					"Oklahoma Joe's Accessibility Statement");
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.accessibilityPageheading2),
					HomePageObjects.accessibilityPageheading2.getObjectname(), "REASONABLE ACCOMMODATIONS");
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.accessibilityPageheading3),
					HomePageObjects.accessibilityPageheading3.getObjectname(), "ONLINE ACCESSIBILITY");
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.accessibilityPageheading4),
					HomePageObjects.accessibilityPageheading4.getObjectname(), "THIRD-PARTY WEBSITES");
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.accessibilityPageheading5),
					HomePageObjects.accessibilityPageheading5.getObjectname(), "FEEDBACK");
		} catch (Exception e) {
			report.updateTestLog("Validation of Footer - Accessibility Page Verbiage Section ",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}

	public void validateFooterTermsOfUsePageVerbiageSections() {
		try {
			// Validate Terms of Use Page
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkTermsOfUse),
					HomePageObjects.lnkTermsOfUse.getObjectname());
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.termsOfUsePageMainHeading),
					HomePageObjects.termsOfUsePageMainHeading.getObjectname(), "Terms of Use");
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.termsOfUsePageSubHeading),
					HomePageObjects.termsOfUsePageSubHeading.getObjectname(), "TERMS OF USE");
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.termsOfUsePageHeading1),
					HomePageObjects.termsOfUsePageHeading1.getObjectname(), "USE OF SERVICES");
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.termsOfUsePageHeading2),
					HomePageObjects.termsOfUsePageHeading2.getObjectname(), "USER CONTENT AND CONDUCT");
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.termsOfUsePageHeading3),
					HomePageObjects.termsOfUsePageHeading3.getObjectname(), "COMPANY CONTENT");
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.termsOfUsePageHeading4),
					HomePageObjects.termsOfUsePageHeading4.getObjectname(), "PRODUCTS FROM COMPANY");
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.termsOfUsePageHeading5),
					HomePageObjects.termsOfUsePageHeading5.getObjectname(), "PRIVACY AND SECURITY");
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.termsOfUsePageHeading6),
					HomePageObjects.termsOfUsePageHeading6.getObjectname(),
					"NOTICE OF CLAIMS OF COPYRIGHT INFRINGEMENT");
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.termsOfUsePageHeading7),
					HomePageObjects.termsOfUsePageHeading7.getObjectname(), "THIRD-PARTY WEBSITES AND SERVICES");
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.termsOfUsePageHeading8),
					HomePageObjects.termsOfUsePageHeading8.getObjectname(), "INDEMNITY");
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.termsOfUsePageHeading9),
					HomePageObjects.termsOfUsePageHeading9.getObjectname(), "NO WARRANTY");
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.termsOfUsePageHeading10),
					HomePageObjects.termsOfUsePageHeading10.getObjectname(), "LIMITATION OF LIABILITY");
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.termsOfUsePageHeading11),
					HomePageObjects.termsOfUsePageHeading11.getObjectname(), "GENERAL");
		} catch (Exception e) {
			report.updateTestLog("Validate Footer Terms Of Use Verbiage Section",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}

	public void validateFooterSupplyChainPageVerbiageSections() {
		try {
			// Validate Supply chain
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkCaTransparency),
					HomePageObjects.lnkCaTransparency.getObjectname());
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.supplyChainsActPageMainHeading),
					HomePageObjects.supplyChainsActPageMainHeading.getObjectname(), "Supply Chains Act");
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.supplyChainsActPageSubHeading),
					HomePageObjects.supplyChainsActPageSubHeading.getObjectname(),
					"CHAR-BROIL, LLC DISCLOSURE PURSUANT TO CALIFORNIA'S TRANSPARENCY IN SUPPLY CHAINS ACT 2010");

		} catch (Exception e) {
			report.updateTestLog("Validate Footer - Supply Chain Page Verbisage Section ",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}

	public void validateShippingPolicyPageVerbiageSections() {
		try {

			// Validate Shipping Policy
			driver.navigate().to("https://www.oklahomajoes.com/shipping-policy");
			if (driver.getWebDriver().getCurrentUrl().contains("/shipping-policy")) {
				report.updateTestLog("Navigate to Shipping Policy Page- ",
						"User is successfully Navigated to Shipping Policy Page", Status.PASS);
			} else {
				report.updateTestLog("Navigate to Shipping Policy Page",
						"User is NOT Navigated to Shipping Policy Page", Status.FAIL);
			}
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.shippingPolicyPageMainHeading),
					HomePageObjects.shippingPolicyPageMainHeading.getObjectname(), "Shipping Policy");
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.shippingPolicyPageHeading1),
					HomePageObjects.shippingPolicyPageHeading1.getObjectname(),
					"DELIVERY OPTIONS / SHIPPING & HANDLING");
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.shipppingPolicyPageHeading2),
					HomePageObjects.shipppingPolicyPageHeading2.getObjectname(), "DELIVERY OPTIONS");
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.shippingPolicyPageHeading3),
					HomePageObjects.shippingPolicyPageHeading3.getObjectname(), "SHIPPING & HANDLING RATES*");
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.shippingPolicyPageHeading4),
					HomePageObjects.shippingPolicyPageHeading4.getObjectname(), "WARRANTY ORDERS");
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.shippingPolicyPageHeading5),
					HomePageObjects.shippingPolicyPageHeading5.getObjectname(),
					"OVERSIZED SHIPPING & TRUCK/FREIGHT DELIVERY");
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.shippingPolicyPageHeading6),
					HomePageObjects.shippingPolicyPageHeading6.getObjectname(), "APO/FPO SHIPMENTS");
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.shippingPolicyPageHeading7),
					HomePageObjects.shippingPolicyPageHeading7.getObjectname(), "INTERNATIONAL SHIPMENTS");
		} catch (Exception e) {
			report.updateTestLog("Validate Shipping Policy Page Verbiage Sections ",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}

	public void validateAccessoriesPartsPageVerbiageSections() {
		try {
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkNaviAccessoriesAndParts),
					HomePageObjects.lnkNaviAccessoriesAndParts.getObjectname());
			if (driver.getCurrentUrl().contains("/accessories-and-parts")) {
				report.updateTestLog("Verify Navigation Menu link - Accessories & Parts",
						"User is successfully Navigated to Accessories & Parts Page", Status.PASS);
			} else {
				report.updateTestLog("Verify Navigation Menu link - Accessories & Parts",
						"User is NOT Navigated to Accessories & Parts Page", Status.FAIL);
			}
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.txtSubMenuToolsPageTitle),
					HomePageObjects.txtSubMenuToolsPageTitle.getObjectname(), "Accessories & Parts");
			commonFunction.isElementPresentContainsText(
					getPageElement(HomePageObjects.btnaccessoriesPartPageviewAccessories),
					HomePageObjects.btnaccessoriesPartPageviewAccessories.getObjectname(), "View All Accessories");
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.accessoriesPartPageNeedHelp),
					HomePageObjects.accessoriesPartPageNeedHelp.getObjectname(), "Need to find a part?");
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.accessoriesPartsPageMostPopular),
					HomePageObjects.accessoriesPartsPageMostPopular.getObjectname(), "Most Popular");
			List<WebElement> mostPopularItms = commonFunction.getElementsByProperty(
					HomePageObjects.accessoriesPartsPageMostPopularItems.getProperty(),
					HomePageObjects.accessoriesPartsPageMostPopularItems.getLocatorType().toString());
			if (mostPopularItms.size() == 3) {
				report.updateTestLog("Number of Most Popular Items in Accessories & Parts Page",
						"3 Items are displyed in Most Popluar section", Status.PASS);
			} else {
				report.updateTestLog("Number of Most Popular Items in Accessories & Parts Page",
						"3 Items are NOT displyed in Most Popluar section", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Validate Accessories & Parts Page Verbiage Sections ",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}

	public void validatePrivacyPolicyPageVerbiageSections() {
		try {
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkPrivacyPolicy),
					HomePageObjects.lnkPrivacyPolicy.getObjectname());
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.privacyPolicyPageMainHeading),
					HomePageObjects.privacyPolicyPageMainHeading.getObjectname(), "Privacy");
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.privacyPolicyPageHeading1),
					HomePageObjects.privacyPolicyPageHeading1.getObjectname(), "OUR COMMITMENT TO PRIVACY");
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.privacyPolicyPageHeading2),
					HomePageObjects.privacyPolicyPageHeading2.getObjectname(), "YOUR PERSONAL INFORMATION");
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.privacyPolicyPageHeading3),
					HomePageObjects.privacyPolicyPageHeading3.getObjectname(), "INFORMATION YOU PROVIDE");
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.privacyPolicyPageHeading4),
					HomePageObjects.privacyPolicyPageHeading4.getObjectname(), "INFORMATION WE COLLECT");
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.privacyPolicyPageHeading5),
					HomePageObjects.privacyPolicyPageHeading5.getObjectname(), "Cookies:");
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.privacyPolicyPageHeading6),
					HomePageObjects.privacyPolicyPageHeading6.getObjectname(), "Web Beacons:");
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.privacyPolicyPageHeading7),
					HomePageObjects.privacyPolicyPageHeading7.getObjectname(), "Disabling Cookies and Beacons:");
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.privacyPolicyPageHeading8),
					HomePageObjects.privacyPolicyPageHeading8.getObjectname(), "IP Address:");
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.privacyPolicyPageHeading9),
					HomePageObjects.privacyPolicyPageHeading9.getObjectname(), "Using Your Information");
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.privacyPolicyPageHeading10),
					HomePageObjects.privacyPolicyPageHeading10.getObjectname(), "SHARING YOUR INFORMATION");
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.privacyPolicyPageHeading11),
					HomePageObjects.privacyPolicyPageHeading11.getObjectname(), "PROTECTING YOUR INFORMATION");
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.privacyPolicyPageHeading12),
					HomePageObjects.privacyPolicyPageHeading12.getObjectname(), "COMMUNITIES");
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.privacyPolicyPageHeading13),
					HomePageObjects.privacyPolicyPageHeading13.getObjectname(), "CHILDREN'S PRIVACY");
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.privacyPolicyPageHeading14),
					HomePageObjects.privacyPolicyPageHeading14.getObjectname(), "OUTSIDE LINKS");
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.privacyPolicyPageHeading15),
					HomePageObjects.privacyPolicyPageHeading15.getObjectname(), "KEEPING YOUR INFORMATION ACCURATE");
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.privacyPolicyPageHeading16),
					HomePageObjects.privacyPolicyPageHeading16.getObjectname(), "HOW TO REACH US");
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.privacyPolicyPageHeading17),
					HomePageObjects.privacyPolicyPageHeading17.getObjectname(), "CHANGES TO THIS PRIVACY NOTICE");
		} catch (Exception e) {
			report.updateTestLog("Validate Privacy Policy Page Verbiage Sections ",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}

	public void navigateToProductRegitrationPage() {
		try {
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnUserAccount),
					HomePageObjects.btnUserAccount.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkRegisteredProducts),
					HomePageObjects.lnkRegisteredProducts.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(ProductRegistrationPageObjects.lnkRegisterProduct),
					ProductRegistrationPageObjects.lnkRegisterProduct.getObjectname());
			if (commonFunction.verifyIfElementIsPresent(
					getPageElement(ProductRegistrationPageObjects.lblProductRegistrationHeading),
					ProductRegistrationPageObjects.lblProductRegistrationHeading.getObjectname())) {
				report.updateTestLog("Verify Navigation to Product Registration",
						"User is successfully Navigated to Product Registration Page", Status.PASS);
			} else {
				report.updateTestLog("Verify Navigation to Product Registration",
						"User is Not navigated to Product Registration Page", Status.FAIL);
			}

		} catch (Exception e) {
			report.updateTestLog("Navigate to Product Registration Page ", "Something went wrong!" + e.toString(),
					Status.FAIL);
		}
	}

	public void validateSignInModel() {
		try {
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnUserAccount),
					HomePageObjects.btnUserAccount.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnSignIn),
					HomePageObjects.btnSignIn.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtBoxEmailAddr),
					HomePageObjects.txtBoxEmailAddr.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtBoxPassword),
					HomePageObjects.txtBoxPassword.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.btnSignInModelOverlay),
					HomePageObjects.btnSignInModelOverlay.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lnkForgotPassword),
					HomePageObjects.lnkForgotPassword.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtDontHaveAccount),
					HomePageObjects.txtDontHaveAccount.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lnkSighUp),
					HomePageObjects.lnkSighUp.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnClose),
					HomePageObjects.btnClose.getObjectname());
			driver.navigate().refresh();
		} catch (Exception e) {
			report.updateTestLog("Validate Sign In Model  ", "Something went wrong!" + e.toString(), Status.FAIL);
		}
	}

	public void validateSignUpPage() {
		try {
			Actions action = new Actions(driver.getWebDriver());
			action.sendKeys(Keys.ESCAPE).build().perform();
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnUserAccount),
					HomePageObjects.btnUserAccount.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnSignUp),
					HomePageObjects.btnSignUp.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.headingCreateNewAc),
					HomePageObjects.headingCreateNewAc.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lblPersonalInfo),
					HomePageObjects.lblPersonalInfo.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtBoxFirstName),
					HomePageObjects.txtBoxFirstName.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtBoxLastName),
					HomePageObjects.txtBoxLastName.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lblSignUpMailingList),
					HomePageObjects.lblSignUpMailingList.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.chkBoxGetRecipes),
					HomePageObjects.chkBoxGetRecipes.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lblSignInInformation),
					HomePageObjects.lblSignInInformation.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtBoxSignUpEmail),
					HomePageObjects.txtBoxSignUpEmail.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtBoxSignUPPassword),
					HomePageObjects.txtBoxSignUPPassword.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lblPwdStrenthMeter),
					HomePageObjects.lblPwdStrenthMeter.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.btnCreateAccount),
					HomePageObjects.btnCreateAccount.getObjectname());
		} catch (Exception e) {
			report.updateTestLog("Validate Sign Up Page ", "Something went wrong!" + e.toString(), Status.FAIL);
		}
	}

	public void validateSuccessfulSignUp() {
		try {

			String firstName = dataTable.getData("General_Data", "FirstName");
			String lastName = dataTable.getData("General_Data", "LastName");
			String emailAddr = "Automation" + commonFunction.randomAlphaNumeric(5) + "@gmail.com";
			String password = dataTable.getData("General_Data", "Password");

			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnUserAccount),
					HomePageObjects.btnUserAccount.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnSignUp),
					HomePageObjects.btnSignUp.getObjectname());
			if (commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.headingCreateNewAc),
					HomePageObjects.headingCreateNewAc.getObjectname())) {
				report.updateTestLog("Verify user navigated to Create New Account Page",
						"User is successfully Navigated to Creae New Acccount Page", Status.PASS);
			} else {
				report.updateTestLog("Verify user navigated to Create New Account Page",
						"User is NOT Navigated to Creae New Acccount Page", Status.FAIL);
			}
			commonFunction.clearAndEnterText(getPageElement(HomePageObjects.txtBoxFirstName), firstName,
					HomePageObjects.txtBoxFirstName.getObjectname());
			commonFunction.clearAndEnterText(getPageElement(HomePageObjects.txtBoxLastName), lastName,
					HomePageObjects.txtBoxLastName.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.chkBoxGetRecipes),
					HomePageObjects.chkBoxGetRecipes.getObjectname());
			commonFunction.clearAndEnterText(getPageElement(HomePageObjects.txtBoxSignUpEmail), emailAddr,
					HomePageObjects.txtBoxSignUpEmail.getObjectname());
			commonFunction.clearAndEnterText(getPageElement(HomePageObjects.txtBoxSignUPPassword), password,
					HomePageObjects.txtBoxSignUPPassword.getObjectname());
			commonFunction.clearAndEnterText(getPageElement(HomePageObjects.txtBoxSignUpConfirmPassword), password,
					HomePageObjects.txtBoxSignUpConfirmPassword.getObjectname());

			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnCreateAccount),
					HomePageObjects.btnCreateAccount.getObjectname());
			Thread.sleep(2000);
			if (commonFunction.isElementPresentContainsText(
					getPageElement(AccountInformationPageObjects.msgSuccessfulSignUP),
					AccountInformationPageObjects.msgSuccessfulSignUP.getObjectname(),
					"Thank you for registering with Oklahoma Joe's.")) {
				report.updateTestLog("Verify user is successfully sign up and new account created",
						"User is successfully signed up and account is created", Status.PASS);
			} else {
				report.updateTestLog("Verify user is successfully sign up and new account created",
						"User sign up is failed", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Validate successful sign up", "Something went wrong!" + e.toString(), Status.FAIL);
		}
	}

	public void validateInvalidSignInError() {
		try {
			String emailAddr = dataTable.getData("General_Data", "EmailAddress");
			String password = dataTable.getData("General_Data", "Password");
			webdriverutil.waitUntilPageReadyStateComplete(30);
			Thread.sleep(3000);
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnUserAccount),
					HomePageObjects.btnUserAccount.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnSignIn),
					HomePageObjects.btnSignIn.getObjectname());
			commonFunction.clearAndEnterText(getPageElement(HomePageObjects.txtBoxEmailAddr), emailAddr,
					HomePageObjects.txtBoxEmailAddr.getObjectname());
			commonFunction.clearAndEnterText(getPageElement(HomePageObjects.txtBoxPassword), password,
					HomePageObjects.txtBoxPassword.getObjectname());

			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnSignInModelOverlay),
					HomePageObjects.btnSignInModelOverlay.getObjectname());
			if (commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.msgInvalidLoginError),
					HomePageObjects.msgInvalidLoginError.getObjectname(), "Invalid login or password.")) {
				report.updateTestLog("Verify error message for invalid login", "Correct Error message is displayed",
						Status.PASS);
			} else {
				report.updateTestLog("Verify error message for invalid login", "Correct error message is NOT displayed",
						Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Validate invalid sign in error message", "Something went wrong!" + e.toString(),
					Status.FAIL);
		}
	}

	public void navigateToForgotPasswordPage() {
		try {
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnUserAccount),
					HomePageObjects.btnUserAccount.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnSignIn),
					HomePageObjects.btnSignIn.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkForgotPassword),
					HomePageObjects.lnkForgotPassword.getObjectname());
			if (commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.headingForgotPassword),
					HomePageObjects.headingForgotPassword.getObjectname())) {
				report.updateTestLog("Verify Navigation to Forgot Password Page",
						"User is successfully Navigated to Forgot Password Page", Status.PASS);
			} else {
				report.updateTestLog("Verify Navigation to Forgot Password page",
						"User is Not navigated to  Forgot password page", Status.FAIL);
			}

		} catch (Exception e) {
			report.updateTestLog("Navigate to Forgot Password page", "Something went wrong!" + e.toString(),
					Status.FAIL);
		}
	}

	public void validateForgotPasswordPage() {
		try {
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.headingForgotPassword),
					HomePageObjects.headingForgotPassword.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtEnterEmailaddrs),
					HomePageObjects.txtEnterEmailaddrs.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtBoxForgotPwdEmail),
					HomePageObjects.txtBoxForgotPwdEmail.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtBoxCaptcha),
					HomePageObjects.txtBoxCaptcha.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.imgCaptcha),
					HomePageObjects.imgCaptcha.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.btnReloadCaptcha),
					HomePageObjects.btnReloadCaptcha.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.btnResetMyPassword),
					HomePageObjects.btnResetMyPassword.getObjectname());
		} catch (Exception e) {
			report.updateTestLog("Validate Forgot Password page", "Something went wrong!" + e.toString(), Status.FAIL);
		}
	}

	public void validateNavigationToSignUpPageFromSignInModel() {
		try {
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnUserAccount),
					HomePageObjects.btnUserAccount.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnSignIn),
					HomePageObjects.btnSignIn.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSighUp),
					HomePageObjects.lnkSighUp.getObjectname());
			if (commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.headingCreateNewAc),
					HomePageObjects.headingCreateNewAc.getObjectname())) {
				report.updateTestLog("Verify user navigated to Create New Account Page",
						"User is successfully Navigated to Creae New Acccount Page", Status.PASS);
			} else {
				report.updateTestLog("Verify user navigated to Create New Account Page",
						"User is NOT Navigated to Creae New Acccount Page", Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Validate navigateion to Sign up Page from Sign In Model",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}

	public void navigateToAddressBook() {
		try {
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnUserAccount),
					HomePageObjects.btnUserAccount.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkAddressBook),
					HomePageObjects.lnkAddressBook.getObjectname());
			if (commonFunction.verifyIfElementIsPresent(getPageElement(AccountInformationPageObjects.lnkAddNewAddress),
					AccountInformationPageObjects.lnkAddNewAddress.getObjectname())) {
				report.updateTestLog("Verify user navigated to Address Book Page",
						"User is successfully Navigated to Address Book Page", Status.PASS);
			} else {
				report.updateTestLog("Verify user navigated to Address Book Page",
						"User is NOT Navigated to Address Book Page", Status.FAIL);
			}
		} catch (Exception e) {

			report.updateTestLog("Validate navigateion  to Address Book", "Something went wrong!" + e.toString(),
					Status.FAIL);
		}
	}

	public void navigateToProTipsPage() {
		try {
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkNaviAccessoriesAndParts),
					HomePageObjects.lnkNaviAccessoriesAndParts.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkProTips),
					HomePageObjects.lnkProTips.getObjectname());
			if (commonFunction.verifyIfElementIsPresent(getPageElement(ProTipsPageObjects.titleProTips),
					ProTipsPageObjects.titleProTips.getObjectname())) {
				report.updateTestLog("Verify user navigated to Pro Tips Page",
						"User is successfully Navigated to Pro Tips Page", Status.PASS);
			} else {
				report.updateTestLog("Verify user navigated to Pro Tips Page", "User is NOT Navigated to Pro Tips Page",
						Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Validate navigateion  to Pro Tips Page", "Something went wrong!" + e.toString(),
					Status.FAIL);
		}
	}

	public void navigatetoFAQPage() {
		try {
			commonFunction.scrollIntoView(getPageElement(HomePageObjects.lnkFAQ));
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkFAQ),
					HomePageObjects.lnkFAQ.getObjectname());
			if (commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.lblFAQ),
					HomePageObjects.lblFAQ.getObjectname(), "FAQs")) {
				report.updateTestLog("Verify user navigated to FAQ Page", "User is successfully Navigated to FAQ Page",
						Status.PASS);
			} else {
				report.updateTestLog("Verify user navigated to FAQ Page", "User is NOT Navigated to FAQ Page",
						Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Validate navigateion  to FAQ Page", "Something went wrong!" + e.toString(),
					Status.FAIL);
		}
	}

	public void navigateToSupportPage() {
		try {
			commonFunction.scrollIntoView(getPageElement(HomePageObjects.lnkSupportCenter));
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSupportCenter),
					HomePageObjects.lnkSupportCenter.getObjectname());
			if (commonFunction.isElementPresentContainsText(getPageElement(SupportPageObjects.headingProductSupport),
					SupportPageObjects.headingProductSupport.getObjectname(), "FAQs")) {
				report.updateTestLog("Verify user navigated to Product Support Page", "User is successfully Navigated to Product Support Page",
						Status.PASS);
			} else {
				report.updateTestLog("Verify user navigated to Product Support Page", "User is NOT Navigated to Product Support Page",
						Status.FAIL);
			}
			
		} catch (Exception e) {
			report.updateTestLog("Validate navigateion  to Product Support Page", "Something went wrong!" + e.toString(),
					Status.FAIL);
		}
	}
	
	public void navigateToURL() {
		try {
			String url = dataTable.getData("General_Data","URL");
			driver.navigate().to(url);
			if(driver.getCurrentUrl().contains(url)) {
				report.updateTestLog("Verify user navigated to the Product URL:"+url, "User is successfully Navigated to the URL:"+url,
						Status.PASS);
			} else {
				report.updateTestLog("Verify user navigated to the Product URL:"+url, "User is NOT Navigated to the URL:"+url,
						Status.FAIL);
			}
		}catch(Exception e) {
			report.updateTestLog("Validate navigateion  to the URL", "Something went wrong!" + e.toString(),
					Status.FAIL);
		}
	}
	
	public void validateRecipeListingPage() {
		try {
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lblRecipes),
					HomePageObjects.lblRecipes.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.paraRecipesPage),
					HomePageObjects.paraRecipesPage.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.btnFilter),
					HomePageObjects.btnFilter.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.drpDownRecommended),
					HomePageObjects.drpDownRecommended.getObjectname());
			List<WebElement> recipes = commonFunction.getElementsByProperty(HomePageObjects.RecipesList.getProperty(),HomePageObjects.RecipesList.getLocatorType().toString());
			List<WebElement> recipeNames = commonFunction.getElementsByProperty(HomePageObjects.RecipesListNames.getProperty(),HomePageObjects.RecipesListNames.getLocatorType().toString());
			for(int i=0;i<recipes.size();i++) {
				recipes = commonFunction.getElementsByProperty(HomePageObjects.RecipesList.getProperty(),HomePageObjects.RecipesList.getLocatorType().toString());
				recipeNames = commonFunction.getElementsByProperty(HomePageObjects.RecipesListNames.getProperty(),HomePageObjects.RecipesListNames.getLocatorType().toString());
				List<WebElement> addtionalIcon = commonFunction.getElementsByProperty(HomePageObjects.iconAdditonal.getProperty(),HomePageObjects.iconAdditonal.getLocatorType().toString());
				String recipeName = recipeNames.get(i).getText();
				commonFunction.verifyIfElementIsPresent(addtionalIcon.get(i),
						"Additional Icon for Recipe:"+recipeName);
				commonFunction.clickIfElementPresent(recipes.get(i),
						"Recipe #"+(i+1));
				if(commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.labelRecipeName), HomePageObjects.labelRecipeName.getObjectname(), recipeName)) {
					report.updateTestLog("Verify user navigated to Recipe", "User is successfully navigated to the Recipe:"+recipeName,
							Status.PASS);
				} else {
					report.updateTestLog("Verify user navigated to Recipe", "User is NOT Navigated to the Recipe: "+recipeName,
							Status.FAIL);
				}
				driver.navigate().back();
			}
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.btnLoadMore),
					HomePageObjects.btnLoadMore.getObjectname());
		}catch(Exception e) {
			report.updateTestLog("Validate navigation to the recipes pages", "Something went wrong!" + e.toString(),
					Status.FAIL);
		}
	}
	
	public void validateRecipePageMoreFromCraftSection() {
		try {
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lblMoreFromCraft),
					HomePageObjects.lblMoreFromCraft.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.imgHowToCleanAndMaintainSmoker),
					HomePageObjects.imgHowToCleanAndMaintainSmoker.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.imgHowToCleanSmallicon),
					HomePageObjects.imgHowToCleanSmallicon.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lblHowtoCleanAndMaintainSmoker),
					HomePageObjects.lblHowtoCleanAndMaintainSmoker.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.videMoreFromCraft),
					HomePageObjects.videMoreFromCraft.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lblHowToBuildAndManagePerfectFire),
					HomePageObjects.lblHowToBuildAndManagePerfectFire.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.btnViewHow_To),
					HomePageObjects.btnViewHow_To.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.imgHowToCleanAndMaintainSmoker),
					HomePageObjects.imgHowToCleanAndMaintainSmoker.getObjectname());
			if (driver.getCurrentUrl().contains("/how-tos/maintain-your-smoker")) {
				report.updateTestLog("Verify Navigation to How to Clean and Maintain Your Smoker- ",
						"User is successfully Navigated to How to Clean and Maintain Your Smoker", Status.PASS);
			} else {
				report.updateTestLog("Verify Navigation to How to Clean and Maintain Your Smoker - ", "User is NOT Navigated to How to Clean and Maintain Your Smoker",
						Status.FAIL);
			}
			driver.navigate().back();	
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnViewHow_To),
					HomePageObjects.btnViewHow_To.getObjectname());
			if (driver.getCurrentUrl().contains("/how-tos/build-and-manage-the-perfect-fire")) {
				report.updateTestLog("Verify Navigation to How to Build and Manage the Perfect Fire- ",
						"User is successfully Navigated to How to Build and Manage the Perfect Fire", Status.PASS);
			} else {
				report.updateTestLog("Verify Navigation to How to Build and Manage the Perfect Fire - ", "User is NOT Navigated to How to Build and Manage the Perfect Fire",
						Status.FAIL);
			}
		}catch(Exception e) {
			report.updateTestLog("Validate the More from Craft Section", "Something went wrong!" + e.toString(),
					Status.FAIL);
		}
	}
	
	public void validateRecipePageGetRecipesTipsDeliveredSection() {
		try {
			String email = dataTable.getData("General_Data","EmailAddress");
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lblGetRecipesTipsDeliveredToInbox),
					HomePageObjects.lblGetRecipesTipsDeliveredToInbox.getObjectname());
			commonFunction.clearAndEnterText(getPageElement(HomePageObjects.txtBoxemail), email, HomePageObjects.txtBoxemail.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnSignMeUp),
					HomePageObjects.btnSignMeUp.getObjectname());
			if(commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.sucessSignUp), HomePageObjects.sucessSignUp.getObjectname(), "You're all signed up!")) {
				report.updateTestLog("Verify user is Signed up", "User is successfully signed up",
						Status.PASS);
			} else {
				report.updateTestLog("Verify user is Signed up", "User is NOT signed up",
						Status.FAIL);
			}
		}catch(Exception e) {
			report.updateTestLog("Validate the Get Recipes Tips Delivered Section", "Something went wrong!" + e.toString(),
					Status.FAIL);
		}
	}
	
	public void validateRecipeListingPageLoadMore() {
		try {
			List<WebElement> recipes1 = commonFunction.getElementsByProperty(HomePageObjects.RecipesList.getProperty(),HomePageObjects.RecipesList.getLocatorType().toString());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnLoadMore),
					HomePageObjects.btnLoadMore.getObjectname());
			Thread.sleep(3000);
			List<WebElement> recipes2 = commonFunction.getElementsByProperty(HomePageObjects.RecipesList.getProperty(),HomePageObjects.RecipesList.getLocatorType().toString());
			if(recipes1.size()<recipes2.size()) {
				report.updateTestLog("Verify user Recipe Listing Page - Load More Button", "Load More Button is working fine",
						Status.PASS);
			} else {
				report.updateTestLog("Verify user Recipe Listing Page - Load More Button", "Load More Button is NOT working fine",
						Status.FAIL);
			}
		}catch(Exception e) {
			report.updateTestLog("Validate the Load More Section", "Something went wrong!" + e.toString(),
					Status.FAIL);
		}
	}
	
	public void navigateToRecipesListingPage() {
		try {
			commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviTheCraft),
					HomePageObjects.lnkNaviTheCraft.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.LnkSubMenuRecipes),
					HomePageObjects.LnkSubMenuRecipes.getObjectname());
			if (driver.getCurrentUrl().contains("/recipes")) {
				report.updateTestLog("Verify Sub-Navigtion Menu - Recipes of Navigation Menu link - The Craft",
						"User is successfully Navigated to sub-Navigation Menu - Recipes", Status.PASS);
			} else {
				report.updateTestLog("Verify Sub-Navigtion Menu - Recipes of Navigation Menu link - The Craft",
						"User is NOT Navigated to sub-Navigation Menu - Recipes", Status.FAIL);
			}
		}catch(Exception e) {
			report.updateTestLog("Validate navigation to Recipes Page", "Something went wrong!" + e.toString(),
					Status.FAIL);
		}
	}
	
	public void navigateToRecipeDetailPage() {
		try {
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.RecipesList),
					HomePageObjects.RecipesList.getObjectname());
			if(commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.labelRecipeName),
					HomePageObjects.labelRecipeName.getObjectname())) {
				report.updateTestLog("Verify user navigated to Recipe Details Page", "User successfully navigated to Recipe details Page",
						Status.PASS);
			} else {
				report.updateTestLog("Verify user navigated to Recipe Details Page", "User NOT navigated to Recipe details Page",
						Status.FAIL);
			}
		}catch(Exception e) {
			report.updateTestLog("Navigate to Recipe Details Page", "Something went wrong!" + e.toString(),
					Status.FAIL);
		}
	}
	
	public void validateRecipeDetailpage() {
		try {
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.labelRecipeName),
					HomePageObjects.labelRecipeName.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.video),
					HomePageObjects.video.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.ingridientsSection),
					HomePageObjects.ingridientsSection.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.preparationSection),
					HomePageObjects.preparationSection.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.btnSendListEmail),
					HomePageObjects.btnSendListEmail.getObjectname());
		}catch(Exception e) {
			report.updateTestLog("Validate Recipe Details Page", "Something went wrong!" + e.toString(),
					Status.FAIL);
		}
	}
	
	public void validateSendEmailList() {
		try {
			String email = dataTable.getData("General_Data","EmailAddress");
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnSendListEmail),
					HomePageObjects.btnSendListEmail.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.popUpTextHeader),
					HomePageObjects.popUpTextHeader.getObjectname());
			commonFunction.clearAndEnterText(getPageElement(HomePageObjects.txtBoxEmail), email, HomePageObjects.txtBoxEmail.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnSubmit),
					HomePageObjects.btnSubmit.getObjectname());
			if(commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.msgEmailSent),
					HomePageObjects.msgEmailSent.getObjectname())) {
				report.updateTestLog("Verify email is sent", "Email is sent to the user successfully",
						Status.PASS);
			} else {
				report.updateTestLog("Verify email is sent", "Email is NOT Sent",
						Status.FAIL);
			}
		}catch(Exception e) {
			report.updateTestLog("Validate Send Email List", "Something went wrong!" + e.toString(),
					Status.FAIL);
		}
	}
	
	
	public void validateTheCraftPage() {
		try {
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lblRecipesCraftPage),
					HomePageObjects.lblRecipesCraftPage.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtAbtRecipesCraftPage),
					HomePageObjects.txtAbtRecipesCraftPage.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.btnViewAllRecipesCraftPage),
					HomePageObjects.btnViewAllRecipesCraftPage.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.videoRecipeCraftPage),
					HomePageObjects.videoRecipeCraftPage.getObjectname());
			
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lblHowToCraftPage),
					HomePageObjects.lblHowToCraftPage.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtAbtHowToCraftPage),
					HomePageObjects.txtAbtHowToCraftPage.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.btnViewAllHowToCraftPage),
					HomePageObjects.btnViewAllHowToCraftPage.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.videoHowToCraftPage),
					HomePageObjects.videoHowToCraftPage.getObjectname());
		}catch(Exception e) {
			report.updateTestLog("Validate The Craft Page", "Something went wrong!" + e.toString(),
					Status.FAIL);
		}
	}
	
	public void navigatetoTheCraftPage() {
		try {
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkNaviTheCraft),
					HomePageObjects.lnkNaviTheCraft.getObjectname());
			if (driver.getCurrentUrl().contains("/the-craft")) {
				report.updateTestLog("Verify Navigation Menu link - The Craft",
						"User is successfully Navigated to The Craft Page", Status.PASS);
			} else {
				report.updateTestLog("Verify Navigation Menu link - The Craft",
						"User is NOT Navigated to The Craft Page", Status.FAIL);
			}
		}catch(Exception e) {
			report.updateTestLog("Navigate to The Craft Page", "Something went wrong!" + e.toString(),
					Status.FAIL);
		}
	}
	
	public void validateHowToPage() {
		try {
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lbHowTo),
					HomePageObjects.lbHowTo.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.paraHowToPage),
					HomePageObjects.paraHowToPage.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.btnFilterHowToPage),
					HomePageObjects.btnFilterHowToPage.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.drpDownRecommendedHowToPage),
					HomePageObjects.drpDownRecommendedHowToPage.getObjectname());
			List<WebElement> recipes = commonFunction.getElementsByProperty(HomePageObjects.HowtoList.getProperty(),HomePageObjects.HowtoList.getLocatorType().toString());
			List<WebElement> recipeNames = commonFunction.getElementsByProperty(HomePageObjects.HowToListNames.getProperty(),HomePageObjects.HowToListNames.getLocatorType().toString());
			for(int i=0;i<recipes.size();i++) {
				recipes = commonFunction.getElementsByProperty(HomePageObjects.HowtoList.getProperty(),HomePageObjects.HowtoList.getLocatorType().toString());
				recipeNames = commonFunction.getElementsByProperty(HomePageObjects.HowToListNames.getProperty(),HomePageObjects.HowToListNames.getLocatorType().toString());
				List<WebElement> addtionalIcon = commonFunction.getElementsByProperty(HomePageObjects.iconAdditonalHowToPage.getProperty(),HomePageObjects.iconAdditonalHowToPage.getLocatorType().toString());
				String recipeName = recipeNames.get(i).getText();
				commonFunction.verifyIfElementIsPresent(addtionalIcon.get(i),
						"Additional Icon for Recipe:"+recipeName);
				commonFunction.clickIfElementPresent(recipes.get(i),
						"Recipe #"+(i+1));
				if(commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.labelHowToName), HomePageObjects.labelHowToName.getObjectname(), recipeName)) {
					report.updateTestLog("Verify user navigated to Recipe", "User is successfully navigated to the Recipe:"+recipeName,
							Status.PASS);
				} else {
					report.updateTestLog("Verify user navigated to Recipe", "User is NOT Navigated to the Recipe: "+recipeName,
							Status.FAIL);
				}
				driver.navigate().back();
			}
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.btnLoadMoreHowToPage),
					HomePageObjects.btnLoadMoreHowToPage.getObjectname());
		}catch(Exception e) {
			report.updateTestLog("Validate navigation to the How to pages", "Something went wrong!" + e.toString(),
					Status.FAIL);
		}
	}
	
	public void validateHowToPageMoreFromCraftSection() {
		try {
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lblMoreFromCraftHowToPage),
					HomePageObjects.lblMoreFromCraftHowToPage.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.imgBoldAndSpicy),
					HomePageObjects.imgBoldAndSpicy.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.imgBoldAndSpicyicon),
					HomePageObjects.imgBoldAndSpicyicon.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lblBoldAndSpicy),
					HomePageObjects.lblBoldAndSpicy.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.videoMoreFromCraftHowToPage),
					HomePageObjects.videoMoreFromCraftHowToPage.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lblWholeSmokedChicken),
					HomePageObjects.lblWholeSmokedChicken.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.btnViewRecipe),
					HomePageObjects.btnViewRecipe.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.imgBoldAndSpicy),
					HomePageObjects.imgBoldAndSpicy.getObjectname());
			if (driver.getCurrentUrl().contains("/recipes/bold-and-spicy-pulled-pork-nachos")) {
				report.updateTestLog("Verify Navigation to Recipe - Bold and Spicy pulled pork nachos- ",
						"User is successfully navigated to Recipe - Bold and Spicy pulled pork nachos", Status.PASS);
			} else {
				report.updateTestLog("Verify Navigation to Recipe - Bold and Spicy pulled pork nachos- ", "User is NOT Navigated to Recipe - Bold and Spicy pulled pork nachos",
						Status.FAIL);
			}
			driver.navigate().back();	
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnViewRecipe),
					HomePageObjects.btnViewRecipe.getObjectname());
			if (driver.getCurrentUrl().contains("/recipes/whole-smoked-chicken")) {
				report.updateTestLog("Verify Navigation to Recipe page - Whole Smoked Chicken- ",
						"User is successfully Navigated to Recipe page - Whole Smoked Chicken", Status.PASS);
			} else {
				report.updateTestLog("Verify Navigation to Recipe page - Whole Smoked Chicken - ", "User is NOT Navigated to Recipe page - Whole Smoked Chicken",
						Status.FAIL);
			}
		}catch(Exception e) {
			report.updateTestLog("Validate the More from Craft Section", "Something went wrong!" + e.toString(),
					Status.FAIL);
		}
	}
	
	public void validateHowToPageGetRecipesTipsDeliveredSection() {
		try {
			String email = dataTable.getData("General_Data","EmailAddress");
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lblGetRecipesTipsDeliveredToInboxHowToPage),
					HomePageObjects.lblGetRecipesTipsDeliveredToInboxHowToPage.getObjectname());
			commonFunction.clearAndEnterText(getPageElement(HomePageObjects.txtBoxemailHowtoPage), email, HomePageObjects.txtBoxemailHowtoPage.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnSignMeUpHowToPage),
					HomePageObjects.btnSignMeUpHowToPage.getObjectname());
			if(commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.sucessSignUpHowToPage), HomePageObjects.sucessSignUpHowToPage.getObjectname(), "You're all signed up!")) {
				report.updateTestLog("Verify user is Signed up", "User is successfully signed up",
						Status.PASS);
			} else {
				report.updateTestLog("Verify user is Signed up", "User is NOT signed up",
						Status.FAIL);
			}
		}catch(Exception e) {
			report.updateTestLog("Validate the Get Recipes Tips Delivered Section", "Something went wrong!" + e.toString(),
					Status.FAIL);
		}
	}
	
	public void validateHowToPageLoadMore() {
		try {
			List<WebElement> recipes1 = commonFunction.getElementsByProperty(HomePageObjects.HowtoList.getProperty(),HomePageObjects.HowtoList.getLocatorType().toString());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnLoadMoreHowToPage),
					HomePageObjects.btnLoadMoreHowToPage.getObjectname());
			Thread.sleep(3000);
			List<WebElement> recipes2 = commonFunction.getElementsByProperty(HomePageObjects.HowtoList.getProperty(),HomePageObjects.HowtoList.getLocatorType().toString());
			if(recipes1.size()<recipes2.size()) {
				report.updateTestLog("Verify user How To Page - Load More Button", "Load More Button is working fine",
						Status.PASS);
			} else {
				report.updateTestLog("Verify user How To Page - Load More Button", "Load More Button is NOT working fine",
						Status.FAIL);
			}
		}catch(Exception e) {
			report.updateTestLog("Validate the Load More Section", "Something went wrong!" + e.toString(),
					Status.FAIL);
		}
	}
	
	public void navigateToHowToPage() {
		try {
			commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviTheCraft),
					HomePageObjects.lnkNaviTheCraft.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuHowsTo),
					HomePageObjects.lnkSubMenuHowsTo.getObjectname());
			if (driver.getCurrentUrl().contains("/how-tos")) {
				report.updateTestLog("Verify Sub-Navigtion Menu - How Tos of Navigation Menu link - The Craft",
						"User is successfully Navigated to sub-Navigation Menu - How Tos", Status.PASS);
			} else {
				report.updateTestLog("Verify Sub-Navigtion Menu - How Tos of Navigation Menu link - The Craft",
						"User is NOT Navigated to sub-Navigation Menu - How Tos", Status.FAIL);
			}
		}catch(Exception e) {
			report.updateTestLog("Navigate to How To Page", "Something went wrong!" + e.toString(),
					Status.FAIL);
		}
	}
	
}
