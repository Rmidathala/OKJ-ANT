package businesscomponents;

import java.awt.Robot;
import java.awt.event.KeyEvent;
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
import pages.HomePageObjects;
import pages.PartListingPageObjects;

public class HomePageComponents extends ReusableLibrary {



		/**
		 * Constructor to initialize the component library
		 * 
		 * @param scriptHelper
		 *            The {@link ScriptHelper} object passed from the
		 *            {@link DriverScript}
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
				}
				else {
					System.out.println("Element Not Found: "+pageEnum.getObjectname());
					return null;
				}
			} catch (Exception e) {
				report.updateTestLog("Shopping Cart - get page element",
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
				}
				else {
					System.out.println("Element Not Found: "+pageEnum.getObjectname());
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
		public void invokeApplication() {
			try {
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				String applicationURL = dataTable.getData("General_Data", "ApplicationURL");
				driver.get(applicationURL);
				
				report.updateTestLog("Invoke Application", "Invoked the application under test @ " +
						applicationURL, Status.DONE);
				System.out.println("Application is launched....");
			}catch(Exception e) {
				e.printStackTrace();
				report.updateTestLog("Invoke Application",
						"Unable to Launch the Application" + e.toString(), Status.WARNING);
			}
		}
		
		public void verifyHomePageHeroImage() {
			
			try {
				String cursiveVerbiage = dataTable.getData("General_Data", "CursiveVerbiage");
				String heroVerbiage = dataTable.getData("General_Data", "HeroVerbiage");
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.headerLogo),
						HomePageObjects.headerLogo.getObjectname());
				
				commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.txtHeroVerbiage), HomePageObjects.txtHeroVerbiage.getObjectname(), heroVerbiage);
				System.out.println(getPageElement(HomePageObjects.txtHeroVerbiage).getText());
				
				commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.txtCursiveVerbiage), HomePageObjects.txtCursiveVerbiage.getObjectname(), cursiveVerbiage);
				System.out.println(getPageElement(HomePageObjects.txtCursiveVerbiage).getText());
				
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.buttonShopSmokersGrill), HomePageObjects.buttonShopSmokersGrill.getObjectname());
				
			}catch(Exception e) {
				report.updateTestLog("Home Page - Hero Image Validation",
						"Something went wrong!" + e.toString(), Status.FAIL);
			}
			
		}
		
	
		public void verifyHeaderLinkNavigation() {
			try {
				
				commonFunction.verifyIfElementPresent(getPageElement(HomePageObjects.lnkNaviSmokerAndGrills), HomePageObjects.lnkNaviSmokerAndGrills.getObjectname());
				commonFunction.verifyIfElementPresent(getPageElement(HomePageObjects.lnkNaviAccessoriesAndParts), HomePageObjects.lnkNaviAccessoriesAndParts.getObjectname());
				commonFunction.verifyIfElementPresent(getPageElement(HomePageObjects.lnkNaviTheCraft), HomePageObjects.lnkNaviTheCraft.getObjectname());
				commonFunction.verifyIfElementPresent(getPageElement(HomePageObjects.lnkNaviOurStory), HomePageObjects.lnkNaviOurStory.getObjectname());
				
				// Validate Navigation Menu Smokers & Grill
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkNaviSmokerAndGrills), HomePageObjects.lnkNaviSmokerAndGrills.getObjectname());
				if(driver.getCurrentUrl().contains("/smokers-and-grills")) {
					report.updateTestLog("Verify Navigation Menu link - Smokers & Grills", "User is successfully Navigated to Smokers & Grill Page", Status.PASS);
				} else {
					report.updateTestLog("Verify Navigation Menu link - Smokers & Grills", "User is NOT Navigated to Smokers & Grill Page", Status.FAIL);
				}
				
				// Validate Navigation Menu Accessories & Parts
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkNaviAccessoriesAndParts), HomePageObjects.lnkNaviAccessoriesAndParts.getObjectname());
				if(driver.getCurrentUrl().contains("/accessories-and-parts")) {
					report.updateTestLog("Verify Navigation Menu link - Accessories & Parts", "User is successfully Navigated to Accessories & Parts Page", Status.PASS);
				} else {
					report.updateTestLog("Verify Navigation Menu link - Accessories & Parts", "User is NOT Navigated to Accessories & Parts Page", Status.FAIL);
				}
				
				// Validate Navigation Menu The Craft
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkNaviTheCraft), HomePageObjects.lnkNaviTheCraft.getObjectname());
				if(driver.getCurrentUrl().contains("/the-craft")) {
					report.updateTestLog("Verify Navigation Menu link - The Craft", "User is successfully Navigated to The Craft Page", Status.PASS);
				} else {
					report.updateTestLog("Verify Navigation Menu link - The Craft", "User is NOT Navigated to The Craft Page", Status.FAIL);
				}

				// Validate Navigation Menu Our Store
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkNaviOurStory), HomePageObjects.lnkNaviOurStory.getObjectname());
				if(driver.getCurrentUrl().contains("/our-story")) {
					report.updateTestLog("Verify Navigation Menu link - Our Store", "User is successfully Navigated to Our Store Page", Status.PASS);
				} else {
					report.updateTestLog("Verify Navigation Menu link - Our Store", "User is NOT  Navigated to Our Store Page", Status.FAIL);
				}
				
				// Validate Sub Menu Offset Smokers in Smokers & Grills
				commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviSmokerAndGrills), HomePageObjects.lnkNaviSmokerAndGrills.getObjectname());
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuOffsetSmokers), HomePageObjects.lnkSubMenuOffsetSmokers.getObjectname());
				if(driver.getCurrentUrl().contains("/smokers-and-grills/offset-smokers")) {
					report.updateTestLog("Verify Sub-Navigtion Menu - Offset Smokers of Navigation Menu link - Smokers & Grill", "User is successfully Navigated to sub-Navigation Menu - Offset-Smokers", Status.PASS);
				}else {
					report.updateTestLog("Verify Sub-Navigtion Menu  - Offset Smokers of Navigation Menu link - Smokers & Grill", "User is NOT Navigated to sub-Navigation Menu - Offset-Smokers", Status.FAIL);
				}
				
				// Validate Sub Menu Smokers/Grill Combos in Smokers & Grills
				commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviSmokerAndGrills), HomePageObjects.lnkNaviSmokerAndGrills.getObjectname());
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuSmokerGrillCombo), HomePageObjects.lnkSubMenuSmokerGrillCombo.getObjectname());
				if(driver.getCurrentUrl().contains("/smokers-and-grills/smoker-grill-combos")) {
					report.updateTestLog("Verify Sub-Navigtion Menu - Smokers/Grill Combos of Navigation Menu link - Smokers & Grill", "User is successfully Navigated to sub-Navigation Menu - Smokers/Grill Combos", Status.PASS);
				}else {
					report.updateTestLog("Verify Sub-Navigtion Menu- Smokers/Grill Combos of Navigation Menu link - Smokers & Grill", "User is NOT Navigated to sub-Navigation Menu - Smokers/Grill Combos", Status.FAIL);
				}
				
				// Validate Sub Menu Charcoal Grills in Smokers & Grills
				commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviSmokerAndGrills), HomePageObjects.lnkNaviSmokerAndGrills.getObjectname());
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuCharCoalGrill), HomePageObjects.lnkSubMenuCharCoalGrill.getObjectname());
				if(driver.getCurrentUrl().contains("/smokers-and-grills/charcoal-grills")) {
					report.updateTestLog("Verify Sub-Navigtion Menu - Charcoal Grills of Navigation Menu link - Smokers & Grill", "User is successfully Navigated to sub-Navigation Menu - Charcoal Grills", Status.PASS);
				}else {
					report.updateTestLog("Verify Sub-Navigtion Menu - Charcoal Grills of Navigation Menu link - Smokers & Grill", "User is NOT Navigated to sub-Navigation Menu - Charcoal Grills", Status.FAIL);
				}
				
				// Validate Sub Menu Drum Smokers in Smokers & Grills
				commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviSmokerAndGrills), HomePageObjects.lnkNaviSmokerAndGrills.getObjectname());
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuDrumSmokers), HomePageObjects.lnkSubMenuDrumSmokers.getObjectname());
				if(driver.getCurrentUrl().contains("/smokers-and-grills/drum-smokers")) {
					report.updateTestLog("Verify Sub-Navigtion Menu -Drum Smokers of Navigation Menu link - Smokers & Grill", "User is successfully Navigated to sub-Navigation Menu - Drum Smokers", Status.PASS);
				}else {
					report.updateTestLog("Verify Sub-Navigtion Menu- Drum Smokers of Navigation Menu link - Smokers & Grill", "User is NOT Navigated to sub-Navigation Menu - Drum Smokers", Status.FAIL);
				}
				
				
				//Validate Sub Menu Tools in Accessories & Parts
				commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviAccessoriesAndParts), HomePageObjects.lnkNaviAccessoriesAndParts.getObjectname());
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuTools), HomePageObjects.lnkSubMenuTools.getObjectname());
				if(driver.getCurrentUrl().contains("/accessories-and-parts/tools")) {
					report.updateTestLog("Verify Sub-Navigtion Menu - Tools of Navigation Menu link - Accessories & Parts", "User is successfully Navigated to sub-Navigation Menu - Tools", Status.PASS);
				}else {
					report.updateTestLog("Verify Sub-Navigtion Menu - Tools of Navigation Menu link - Accessories & Parts ", "User is NOT Navigated to sub-Navigation Menu - Tools", Status.FAIL);
				}
				
				//Validate Sub Menu Covers in Accessories & Parts
				commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviAccessoriesAndParts), HomePageObjects.lnkNaviAccessoriesAndParts.getObjectname());
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuCovers), HomePageObjects.lnkSubMenuCovers.getObjectname());
				if(driver.getCurrentUrl().contains("/accessories-and-parts/covers")) {
					report.updateTestLog("Verify Sub-Navigtion Menu - Covers of Navigation Menu link - Accessories & Parts", "User is successfully Navigated to sub-Navigation Menu - Covers", Status.PASS);
				}else {
					report.updateTestLog("Verify Sub-Navigtion Menu - Covers of Navigation Menu link - Accessories & Parts ", "User is NOT Navigated to sub-Navigation Menu - Covers", Status.FAIL);
				}
				
				//Validate Sub Menu Wood in Accessories & Parts
				commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviAccessoriesAndParts), HomePageObjects.lnkNaviAccessoriesAndParts.getObjectname());
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuWood), HomePageObjects.lnkSubMenuWood.getObjectname());
				if(driver.getCurrentUrl().contains("/accessories-and-parts/wood")) {
					report.updateTestLog("Verify Sub-Navigtion Menu - Wood of Navigation Menu link - Accessories & Parts", "User is successfully Navigated to sub-Navigation Menu - Wood", Status.PASS);
				}else {
					report.updateTestLog("Verify Sub-Navigtion Menu - Wood of Navigation Menu link - Accessories & Parts ", "User is NOT Navigated to sub-Navigation Menu - Wood", Status.FAIL);
				}
				
				//Validate Sub Menu Apparel in Accessories & Parts
				commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviAccessoriesAndParts), HomePageObjects.lnkNaviAccessoriesAndParts.getObjectname());
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuApparel), HomePageObjects.lnkSubMenuApparel.getObjectname());
				if(driver.getCurrentUrl().contains("/accessories-and-parts/apparel")) {
					report.updateTestLog("Verify Sub-Navigtion Menu - Apparel of Navigation Menu link - Accessories & Parts", "User is successfully Navigated to sub-Navigation Menu - Apparel", Status.PASS);
				}else {
					report.updateTestLog("Verify Sub-Navigtion Menu - Apparel of Navigation Menu link - Accessories & Parts ", "User is NOT Navigated to sub-Navigation Menu - Apparel", Status.FAIL);
				}
				
				//Validate Sub Menu Mods in Accessories & Parts
				commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviAccessoriesAndParts), HomePageObjects.lnkNaviAccessoriesAndParts.getObjectname());
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuMods), HomePageObjects.lnkSubMenuMods.getObjectname());
				if(driver.getCurrentUrl().contains("/accessories-and-parts/mods")) {
					report.updateTestLog("Verify Sub-Navigtion Menu - Mods of Navigation Menu link - Accessories & Parts", "User is successfully Navigated to sub-Navigation Menu - Mods", Status.PASS);
				}else {
					report.updateTestLog("Verify Sub-Navigtion Menu - Mods of Navigation Menu link - Accessories & Parts ", "User is NOT Navigated to sub-Navigation Menu - Mods", Status.FAIL);
				}
				
				//Validate Sub Menu Parts in Accessories & Parts
				commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviAccessoriesAndParts), HomePageObjects.lnkNaviAccessoriesAndParts.getObjectname());
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuParts), HomePageObjects.lnkSubMenuParts.getObjectname());
				if(driver.getCurrentUrl().contains("/accessories-and-parts/parts?layout=grid")) {
					report.updateTestLog("Verify Sub-Navigtion Menu - Parts of Navigation Menu link - Accessories & Parts", "User is successfully Navigated to sub-Navigation Menu - Parts", Status.PASS);
				}else {
					report.updateTestLog("Verify Sub-Navigtion Menu - Parts of Navigation Menu link - Accessories & Parts", "User is NOT Navigated to sub-Navigation Menu - Parts", Status.FAIL);
				}
				
				//Validate Sub Menu Recipes in The Craft
				commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviTheCraft), HomePageObjects.lnkNaviTheCraft.getObjectname());
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.LnkSubMenuRecipes), HomePageObjects.LnkSubMenuRecipes.getObjectname());
				if(driver.getCurrentUrl().contains("/recipes")) {
					report.updateTestLog("Verify Sub-Navigtion Menu - Recipes of Navigation Menu link - The Craft", "User is successfully Navigated to sub-Navigation Menu - Recipes", Status.PASS);
				}else {
					report.updateTestLog("Verify Sub-Navigtion Menu - Recipes of Navigation Menu link - The Craft", "User is NOT Navigated to sub-Navigation Menu - Recipes", Status.FAIL);
				}
				
				//Validate Sub Menu How Tos in The Craft
				commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviTheCraft), HomePageObjects.lnkNaviTheCraft.getObjectname());
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuHowsTo), HomePageObjects.lnkSubMenuHowsTo.getObjectname());
				if(driver.getCurrentUrl().contains("/how-tos")) {
					report.updateTestLog("Verify Sub-Navigtion Menu - How Tos of Navigation Menu link - The Craft", "User is successfully Navigated to sub-Navigation Menu - How Tos", Status.PASS);
				}else {
					report.updateTestLog("Verify Sub-Navigtion Menu - How Tos of Navigation Menu link - The Craft", "User is NOT Navigated to sub-Navigation Menu - How Tos", Status.FAIL);
				}
				
				//Validate user is navigated to Home page on click the logo
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.headerLogo), HomePageObjects.headerLogo.getObjectname());
				if(commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.buttonShopSmokersGrill), HomePageObjects.buttonShopSmokersGrill.getObjectname())) {
					
					report.updateTestLog("Verify user is on the Home Page after clicking on Header logo", "User is successfully navigated to Home page on clicking the logo", Status.PASS);
				}else {
					report.updateTestLog("Verify user is on the Home Page after clicking on Header logo", "User is NOT Navigated to Home Page", Status.FAIL);
				}
			}catch(Exception e) {
				report.updateTestLog("Home Page - Navigation Menu and header logo",
						"Something went wrong!" + e.toString(), Status.FAIL);
			}
		}
		
		public void validateSearch() {
			try {
			String searchText = dataTable.getData("General_Data","SearchText");
			
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnSearch), HomePageObjects.btnSearch.getObjectname());
			commonFunction.clearAndEnterText(getPageElement(HomePageObjects.txtBoxSearch), searchText, HomePageObjects.txtBoxSearch.getObjectname());
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			commonFunction.hitEnterkey(getPageElement(HomePageObjects.txtBoxSearch));
			commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSearchResults), HomePageObjects.txtSearchResults.getObjectname());
			commonFunction.isElementPresentContainsText(getPageElement(HomePageObjects.txtSearchResults), HomePageObjects.txtSearchResults.getObjectname(), "â€œ"+searchText+"â€�");
		
			}catch(Exception e) {
				report.updateTestLog("Home Page - Search Button Validation",
						"Something went wrong!" + e.toString(), Status.FAIL);
			}
		}
		
		public void validateEmptyCart() {
			try {
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.btnCart), HomePageObjects.btnCart.getObjectname());
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnCart), HomePageObjects.btnCart.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.txtShoppingCartTitle), ShoppingCartPageObjects.txtShoppingCartTitle.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.txtNoItems), ShoppingCartPageObjects.txtNoItems.getObjectname());
				commonFunction.isElementPresentContainsText(getPageElement(ShoppingCartPageObjects.txtNoItems), ShoppingCartPageObjects.txtNoItems.getObjectname(), "You have no items in your cart");
			}catch(Exception e) {
				report.updateTestLog("Shopping Cart - Page Validation",
						"Something went wrong!" + e.toString(), Status.FAIL);
			}
		}
		
		public void validateAccountPage() {
			try {
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.headerLogo),
						HomePageObjects.headerLogo.getObjectname());
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnUserAccount), HomePageObjects.btnUserAccount.getObjectname());
				if(commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.btnSignIn), HomePageObjects.btnSignIn.getObjectname())){
					report.updateTestLog("Verify User Account Menu", "User Account Menu is displayed successfully", Status.PASS);
				} else {
					report.updateTestLog("Verify User Account menu ", "User Account Menu is NOT displayed ", Status.FAIL);
				}
			}catch(Exception e) {
				report.updateTestLog("Account Overlay -  Validation",
						"Something went wrong!" + e.toString(), Status.FAIL);
			}
		}
		
	
	
		public void validateFooter() {
			try {
				
				commonFunction.scrollIntoView(getPageElement(HomePageObjects.lblParts));
			
				// Validate Parts in Footer
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lblParts), HomePageObjects.lblParts.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtBoxPartSearch), HomePageObjects.txtBoxPartSearch.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtPartContactService), HomePageObjects.txtPartContactService.getObjectname());
				
				// Validate Support in Footer
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lblSupport), HomePageObjects.lblSupport.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lnkFAQ), HomePageObjects.lnkFAQ.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lnkProductHelp), HomePageObjects.lnkProductHelp.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lnkSupportCenter), HomePageObjects.lnkSupportCenter.getObjectname());
				
				//Validate Contact US in Footer
				
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lblContactUs), HomePageObjects.lblContactUs.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lnkTelePhone), HomePageObjects.lnkTelePhone.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lblMonToFri), HomePageObjects.lblMonToFri.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lnkSendEmail), HomePageObjects.lnkSendEmail.getObjectname());
				if (liveTime.getHour() < 9 & liveTime.getHour() > 21) {
					commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lblChatBusinessHour), HomePageObjects.lblChatBusinessHour.getObjectname());
				} else {
					commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lnkLiveChat), HomePageObjects.lnkLiveChat.getObjectname());
				}
				
			
			}catch(Exception e) {
				report.updateTestLog("Footer - Validation",
						"Something went wrong!" + e.toString(), Status.FAIL);
			}
		}
		
		public void validatePartsSearchInFooter() {
			try {
			String partModel = dataTable.getData("General_Data", "ProductModelNumber");
			commonFunction.clearAndEnterText(getPageElement(HomePageObjects.txtBoxPartSearch), partModel, HomePageObjects.txtBoxPartSearch.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.txtSearchSuggestion), HomePageObjects.txtSearchSuggestion.getObjectname());
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			if(driver.getCurrentUrl().contains("/parts/search/results/?model="+partModel)) {
				report.updateTestLog("Verify Part Listing Page from Footer", "User is successfully navigated to Part Listing page", Status.PASS);
			}else {
				report.updateTestLog("Verify Part Listing Page from Footer", "User is NOT navigated to Part Listing page", Status.FAIL);
			}
			commonFunction.isElementPresentContainsText(getPageElement(PartListingPageObjects.lblProductSummryTitle), PartListingPageObjects.lblProductSummryTitle.getObjectname(), "HELP and PARTS FOR model #"+partModel);
			}catch(Exception e) {
				report.updateTestLog("Part Listing Page - Validation",
						"Something went wrong!" + e.toString(), Status.FAIL);
			}
		}
		
		public void validatelinksInSupportInFooter() {
			try {
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkFAQ), HomePageObjects.lnkFAQ.getObjectname());
				if(driver.getCurrentUrl().contains("/faqs")) {
					report.updateTestLog("Verify User navigated to FAQ Page", "User is successfully navigated to FAQ page", Status.PASS);
				} else {
					report.updateTestLog("Verify User navigated to FAQ Page", "User is NOT navigated to FAQ page", Status.FAIL);
				}
				
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkProductHelp), HomePageObjects.lnkProductHelp.getObjectname());
				if(driver.getCurrentUrl().contains("/contact-us")) {
					report.updateTestLog("Verify User navigated to Contact US Page on Clicking Product Help link", "User is successfully navigated to Contact US page on clicking Product Help link", Status.PASS);
				} else {
					report.updateTestLog("Verify User navigated to Contact US Page on Clicking Product Help link", "User is NOT navigated to Contact US page on clicking Product Help link", Status.FAIL);
				}
				
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSupportCenter), HomePageObjects.lnkSupportCenter.getObjectname());
				if(driver.getCurrentUrl().contains("/support")) {
					report.updateTestLog("Verify User navigated to Support Page", "User is successfully navigated to Support page", Status.PASS);
				} else {
					report.updateTestLog("Verify User navigated to Support Page", "User is NOT navigated to Support page", Status.FAIL);
				}
			}catch(Exception e) {
				report.updateTestLog("FAQ Page - Validation",
						"Something went wrong!" + e.toString(), Status.FAIL);
			}
		}
		
		public void validateLinksInContactUSInFooter() {
			try {
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSendEmail), HomePageObjects.lnkSendEmail.getObjectname());
				if(driver.getCurrentUrl().contains("/contact-us")) {
					report.updateTestLog("Verify User navigated to Contact US Page on Clicking Send Email link", "User is successfully navigated to Contact US page on clicking Send Email link", Status.PASS);
				} else {
					report.updateTestLog("Verify User navigated to Contact US Page on Clicking Send Email link", "User is NOT navigated to Contact US page on clicking Send Email link", Status.FAIL);
				}
			}catch(Exception e) {
				report.updateTestLog("Contact Us in Footer - Validation",
						"Something went wrong!" + e.toString(), Status.FAIL);
			}
		}
		
		
		public void footerFacebookValidation() {
			try {
				String mainWindow = "";

				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.facebookIcon), HomePageObjects.facebookIcon.getObjectname());
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

				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.twitterIcon), HomePageObjects.twitterIcon.getObjectname());
				mainWindow = driver.getWindowHandle();
				driver.switchTo().window(new ArrayList<String>(driver.getWindowHandles()).get(1));
				for (int count = 1; count <= 5; count++) {
					if (driver.getCurrentUrl().contains("https://twitter.com/okjoessmokers/")) {
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

				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.pinterestIcon), HomePageObjects.pinterestIcon.getObjectname());
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

				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.instagramIcon), HomePageObjects.instagramIcon.getObjectname());
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

				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.youtubeIcon), HomePageObjects.youtubeIcon.getObjectname());
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
			}catch(Exception e) {
				report.updateTestLog("Exception in validateSocialMediaLinksFooter", "Exception is " + e.getMessage(),
						Status.FAIL);
			}
		}
		
		public void validateBodyCopyLinks() {
			try {
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkPrivacyPolicy), HomePageObjects.lnkPrivacyPolicy.getObjectname());
				if(driver.getCurrentUrl().contains("/privacy")) {
					report.updateTestLog("Verify User navigated to Privacy Policy Page", "User is successfully navigated to Privacy Policy page", Status.PASS);
				} else {
					report.updateTestLog("Verify User navigated to Privacy Policy Page", "User is NOT navigated to Privacy Policy page", Status.FAIL);
				}
				
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkTermsOfUse), HomePageObjects.lnkTermsOfUse.getObjectname());
				if(driver.getCurrentUrl().contains("/terms-of-use")) {
					report.updateTestLog("Verify User navigated to Terms of Use Page", "User is successfully navigated to Terms of Use  page", Status.PASS);
				} else {
					report.updateTestLog("Verify User navigated to Terms of Use  Page", "User is NOT navigated to Terms of Use  page", Status.FAIL);
				}
				
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkCaTransparency), HomePageObjects.lnkCaTransparency.getObjectname());
				if(driver.getCurrentUrl().contains("/supply-chains-act")) {
					report.updateTestLog("Verify User navigated to CA Transparency Supply Chains Act Page", "User is successfully navigated to CA Transparency Supply Chains Act  page", Status.PASS);
				} else {
					report.updateTestLog("Verify User navigated to CA Transparency Supply Chains Act  Page", "User is NOT navigated to CA Transparency Supply Chains Act  page", Status.FAIL);
				}
				
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkAccessibilityStmt), HomePageObjects.lnkAccessibilityStmt.getObjectname());
				if(driver.getCurrentUrl().contains("/accessibility")) {
					report.updateTestLog("Verify User navigated to Accessibility Statement Page", "User is successfully navigated to Accessibility Statement page", Status.PASS);
				} else {
					report.updateTestLog("Verify User navigated to Accessibility Statement  Page", "User is NOT navigated to Accessibility Statement  page", Status.FAIL);
				}
				
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lblCopyRight), HomePageObjects.lblCopyRight.getObjectname());
			}catch(Exception e) {
				report.updateTestLog("Body and Copy Links -  Validation",
						"Something went wrong!" + e.toString(), Status.FAIL);
			}
		}
		
		public void navigatetoProductListingPage() {
			try {
				commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviSmokerAndGrills), HomePageObjects.lnkNaviSmokerAndGrills.getObjectname());
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuOffsetSmokers), HomePageObjects.lnkSubMenuOffsetSmokers.getObjectname());
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnViewAllSmokersGrills), HomePageObjects.btnViewAllSmokersGrills.getObjectname());
			}catch(Exception e) {
				report.updateTestLog("Navigate to Product Listing Page -  ",
						"Something went wrong!" + e.toString(), Status.FAIL);
			}
		}
		
		public void validateHeaderLinkLandingPagesLoading() {
			try {
				// Validate Navigation Menu Smokers & Grill
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkNaviSmokerAndGrills), HomePageObjects.lnkNaviSmokerAndGrills.getObjectname());
				if(driver.getCurrentUrl().contains("/smokers-and-grills")) {
					report.updateTestLog("Verify Navigation Menu link - Smokers & Grills", "User is successfully Navigated to Smokers & Grill Page", Status.PASS);
				} else {
					report.updateTestLog("Verify Navigation Menu link - Smokers & Grills", "User is NOT Navigated to Smokers & Grill Page", Status.FAIL);
				}
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSmokerAndGrillsPageTitle), HomePageObjects.txtSmokerAndGrillsPageTitle.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSmokerAndGrillsPageTitleDescription), HomePageObjects.txtSmokerAndGrillsPageTitleDescription.getObjectname());
				
				// Validate Navigation Menu Accessories & Parts
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkNaviAccessoriesAndParts), HomePageObjects.lnkNaviAccessoriesAndParts.getObjectname());
				if(driver.getCurrentUrl().contains("/accessories-and-parts")) {
					report.updateTestLog("Verify Navigation Menu link - Accessories & Parts", "User is successfully Navigated to Accessories & Parts Page", Status.PASS);
				} else {
					report.updateTestLog("Verify Navigation Menu link - Accessories & Parts", "User is NOT Navigated to Accessories & Parts Page", Status.FAIL);
				}
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtAccessorisAndPartsPageTitle), HomePageObjects.txtAccessorisAndPartsPageTitle.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtAccessoriesAndPartsPageTitleDescription), HomePageObjects.txtAccessoriesAndPartsPageTitleDescription.getObjectname());
				
				
				// Validate Navigation Menu The Craft
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkNaviTheCraft), HomePageObjects.lnkNaviTheCraft.getObjectname());
				if(driver.getCurrentUrl().contains("/the-craft")) {
					report.updateTestLog("Verify Navigation Menu link - The Craft", "User is successfully Navigated to The Craft Page", Status.PASS);
				} else {
					report.updateTestLog("Verify Navigation Menu link - The Craft", "User is NOT Navigated to The Craft Page", Status.FAIL);
				}
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtTheCraftPageTitle), HomePageObjects.txtTheCraftPageTitle.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtTheCraftPageTitleDescription), HomePageObjects.txtTheCraftPageTitleDescription.getObjectname());
				
				// Validate Navigation Menu Our Store
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkNaviOurStory), HomePageObjects.lnkNaviOurStory.getObjectname());
				if(driver.getCurrentUrl().contains("/our-story")) {
					report.updateTestLog("Verify Navigation Menu link - Our Store", "User is successfully Navigated to Our Store Page", Status.PASS);
				} else {
					report.updateTestLog("Verify Navigation Menu link - Our Store", "User is NOT  Navigated to Our Store Page", Status.FAIL);
				}
				
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtOurStoryPageTitle), HomePageObjects.txtOurStoryPageTitle.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtOurStoryPageTitleDescription), HomePageObjects.txtOurStoryPageTitleDescription.getObjectname());
			}catch(Exception e) {
				report.updateTestLog("Validate the Header navigation Links landing -  ",
						"Something went wrong!" + e.toString(), Status.FAIL);
			}
		}
		
		public void validateHeaderSubLinkLandingPagesLoading() {
			try {
				// Validate Sub Menu Offset Smokers in Smokers & Grills
				commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviSmokerAndGrills), HomePageObjects.lnkNaviSmokerAndGrills.getObjectname());
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuOffsetSmokers), HomePageObjects.lnkSubMenuOffsetSmokers.getObjectname());
				if(driver.getCurrentUrl().contains("/smokers-and-grills/offset-smokers")) {
					report.updateTestLog("Verify Sub-Navigtion Menu - Offset Smokers of Navigation Menu link - Smokers & Grill", "User is successfully Navigated to sub-Navigation Menu - Offset-Smokers", Status.PASS);
				}else {
					report.updateTestLog("Verify Sub-Navigtion Menu  - Offset Smokers of Navigation Menu link - Smokers & Grill", "User is NOT Navigated to sub-Navigation Menu - Offset-Smokers", Status.FAIL);
				}
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuOffsetSmokersPageTitle), HomePageObjects.txtSubMenuOffsetSmokersPageTitle.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuOffsetSmokersPageDescription), HomePageObjects.txtSubMenuOffsetSmokersPageDescription.getObjectname());
				
				// Validate Sub Menu Smokers/Grill Combos in Smokers & Grills
				commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviSmokerAndGrills), HomePageObjects.lnkNaviSmokerAndGrills.getObjectname());
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuSmokerGrillCombo), HomePageObjects.lnkSubMenuSmokerGrillCombo.getObjectname());
				if(driver.getCurrentUrl().contains("/smokers-and-grills/smoker-grill-combos")) {
					report.updateTestLog("Verify Sub-Navigtion Menu - Smokers/Grill Combos of Navigation Menu link - Smokers & Grill", "User is successfully Navigated to sub-Navigation Menu - Smokers/Grill Combos", Status.PASS);
				}else {
					report.updateTestLog("Verify Sub-Navigtion Menu- Smokers/Grill Combos of Navigation Menu link - Smokers & Grill", "User is NOT Navigated to sub-Navigation Menu - Smokers/Grill Combos", Status.FAIL);
				}
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuSmokersGrillComboPageTitle), HomePageObjects.txtSubMenuSmokersGrillComboPageTitle.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuSmokersGrillComboPageDescription), HomePageObjects.txtSubMenuSmokersGrillComboPageDescription.getObjectname());
				
				// Validate Sub Menu Charcoal Grills in Smokers & Grills
				commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviSmokerAndGrills), HomePageObjects.lnkNaviSmokerAndGrills.getObjectname());
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuCharCoalGrill), HomePageObjects.lnkSubMenuCharCoalGrill.getObjectname());
				if(driver.getCurrentUrl().contains("/smokers-and-grills/charcoal-grills")) {
					report.updateTestLog("Verify Sub-Navigtion Menu - Charcoal Grills of Navigation Menu link - Smokers & Grill", "User is successfully Navigated to sub-Navigation Menu - Charcoal Grills", Status.PASS);
				}else {
					report.updateTestLog("Verify Sub-Navigtion Menu - Charcoal Grills of Navigation Menu link - Smokers & Grill", "User is NOT Navigated to sub-Navigation Menu - Charcoal Grills", Status.FAIL);
				}
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuCharCoalGrillPageTitle), HomePageObjects.txtSubMenuCharCoalGrillPageTitle.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuCharCoalGrillPageDescription), HomePageObjects.txtSubMenuCharCoalGrillPageDescription.getObjectname());
				
				// Validate Sub Menu Drum Smokers in Smokers & Grills
				commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviSmokerAndGrills), HomePageObjects.lnkNaviSmokerAndGrills.getObjectname());
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuDrumSmokers), HomePageObjects.lnkSubMenuDrumSmokers.getObjectname());
				if(driver.getCurrentUrl().contains("/smokers-and-grills/drum-smokers")) {
					report.updateTestLog("Verify Sub-Navigtion Menu -Drum Smokers of Navigation Menu link - Smokers & Grill", "User is successfully Navigated to sub-Navigation Menu - Drum Smokers", Status.PASS);
				}else {
					report.updateTestLog("Verify Sub-Navigtion Menu- Drum Smokers of Navigation Menu link - Smokers & Grill", "User is NOT Navigated to sub-Navigation Menu - Drum Smokers", Status.FAIL);
				}
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuDrumSmokersPageTitle), HomePageObjects.txtSubMenuDrumSmokersPageTitle.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuDrumSmokersPageDescription), HomePageObjects.txtSubMenuDrumSmokersPageDescription.getObjectname());
				
				
				//Validate Sub Menu Tools in Accessories & Parts
				commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviAccessoriesAndParts), HomePageObjects.lnkNaviAccessoriesAndParts.getObjectname());
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuTools), HomePageObjects.lnkSubMenuTools.getObjectname());
				if(driver.getCurrentUrl().contains("/accessories-and-parts/tools")) {
					report.updateTestLog("Verify Sub-Navigtion Menu - Tools of Navigation Menu link - Accessories & Parts", "User is successfully Navigated to sub-Navigation Menu - Tools", Status.PASS);
				}else {
					report.updateTestLog("Verify Sub-Navigtion Menu - Tools of Navigation Menu link - Accessories & Parts ", "User is NOT Navigated to sub-Navigation Menu - Tools", Status.FAIL);
				}
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuToolsPageTitle), HomePageObjects.txtSubMenuToolsPageTitle.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuToolsPageDescription), HomePageObjects.txtSubMenuToolsPageDescription.getObjectname());
				
				//Validate Sub Menu Covers in Accessories & Parts
				commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviAccessoriesAndParts), HomePageObjects.lnkNaviAccessoriesAndParts.getObjectname());
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuCovers), HomePageObjects.lnkSubMenuCovers.getObjectname());
				if(driver.getCurrentUrl().contains("/accessories-and-parts/covers")) {
					report.updateTestLog("Verify Sub-Navigtion Menu - Covers of Navigation Menu link - Accessories & Parts", "User is successfully Navigated to sub-Navigation Menu - Covers", Status.PASS);
				}else {
					report.updateTestLog("Verify Sub-Navigtion Menu - Covers of Navigation Menu link - Accessories & Parts ", "User is NOT Navigated to sub-Navigation Menu - Covers", Status.FAIL);
				}
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuCoversPageTitle), HomePageObjects.txtSubMenuCoversPageTitle.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuCoversPageDescription), HomePageObjects.txtSubMenuCoversPageDescription.getObjectname());
				
				//Validate Sub Menu Wood in Accessories & Parts
				commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviAccessoriesAndParts), HomePageObjects.lnkNaviAccessoriesAndParts.getObjectname());
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuWood), HomePageObjects.lnkSubMenuWood.getObjectname());
				if(driver.getCurrentUrl().contains("/accessories-and-parts/wood")) {
					report.updateTestLog("Verify Sub-Navigtion Menu - Wood of Navigation Menu link - Accessories & Parts", "User is successfully Navigated to sub-Navigation Menu - Wood", Status.PASS);
				}else {
					report.updateTestLog("Verify Sub-Navigtion Menu - Wood of Navigation Menu link - Accessories & Parts ", "User is NOT Navigated to sub-Navigation Menu - Wood", Status.FAIL);
				}
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuWoodPageTitle), HomePageObjects.txtSubMenuWoodPageTitle.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuWoodPageDescription), HomePageObjects.txtSubMenuWoodPageDescription.getObjectname());
				
				//Validate Sub Menu Apparel in Accessories & Parts
				commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviAccessoriesAndParts), HomePageObjects.lnkNaviAccessoriesAndParts.getObjectname());
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuApparel), HomePageObjects.lnkSubMenuApparel.getObjectname());
				if(driver.getCurrentUrl().contains("/accessories-and-parts/apparel")) {
					report.updateTestLog("Verify Sub-Navigtion Menu - Apparel of Navigation Menu link - Accessories & Parts", "User is successfully Navigated to sub-Navigation Menu - Apparel", Status.PASS);
				}else {
					report.updateTestLog("Verify Sub-Navigtion Menu - Apparel of Navigation Menu link - Accessories & Parts ", "User is NOT Navigated to sub-Navigation Menu - Apparel", Status.FAIL);
				}
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuApparelPageTitle), HomePageObjects.txtSubMenuApparelPageTitle.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuApparelPageDescription), HomePageObjects.txtSubMenuApparelPageDescription.getObjectname());
				
				//Validate Sub Menu Mods in Accessories & Parts
				commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviAccessoriesAndParts), HomePageObjects.lnkNaviAccessoriesAndParts.getObjectname());
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuMods), HomePageObjects.lnkSubMenuMods.getObjectname());
				if(driver.getCurrentUrl().contains("/accessories-and-parts/mods")) {
					report.updateTestLog("Verify Sub-Navigtion Menu - Mods of Navigation Menu link - Accessories & Parts", "User is successfully Navigated to sub-Navigation Menu - Mods", Status.PASS);
				}else {
					report.updateTestLog("Verify Sub-Navigtion Menu - Mods of Navigation Menu link - Accessories & Parts ", "User is NOT Navigated to sub-Navigation Menu - Mods", Status.FAIL);
				}
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuModsPageTitle), HomePageObjects.txtSubMenuModsPageTitle.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuModsPageDescription), HomePageObjects.txtSubMenuModsPageDescription.getObjectname());
				
				//Validate Sub Menu Parts in Accessories & Parts
				commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviAccessoriesAndParts), HomePageObjects.lnkNaviAccessoriesAndParts.getObjectname());
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuParts), HomePageObjects.lnkSubMenuParts.getObjectname());
				if(driver.getCurrentUrl().contains("/accessories-and-parts/parts?layout=grid")) {
					report.updateTestLog("Verify Sub-Navigtion Menu - Parts of Navigation Menu link - Accessories & Parts", "User is successfully Navigated to sub-Navigation Menu - Parts", Status.PASS);
				}else {
					report.updateTestLog("Verify Sub-Navigtion Menu - Parts of Navigation Menu link - Accessories & Parts", "User is NOT Navigated to sub-Navigation Menu - Parts", Status.FAIL);
				}
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuPartsPageTitle), HomePageObjects.txtSubMenuPartsPageTitle.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuPartsPageDescription), HomePageObjects.txtSubMenuPartsPageDescription.getObjectname());
				
				//Validate Sub Menu Recipes in The Craft
				commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviTheCraft), HomePageObjects.lnkNaviTheCraft.getObjectname());
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.LnkSubMenuRecipes), HomePageObjects.LnkSubMenuRecipes.getObjectname());
				if(driver.getCurrentUrl().contains("/recipes")) {
					report.updateTestLog("Verify Sub-Navigtion Menu - Recipes of Navigation Menu link - The Craft", "User is successfully Navigated to sub-Navigation Menu - Recipes", Status.PASS);
				}else {
					report.updateTestLog("Verify Sub-Navigtion Menu - Recipes of Navigation Menu link - The Craft", "User is NOT Navigated to sub-Navigation Menu - Recipes", Status.FAIL);
				}
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuRecipesPageTitle), HomePageObjects.txtSubMenuRecipesPageTitle.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuRecipesPageDescription), HomePageObjects.txtSubMenuRecipesPageDescription.getObjectname());
				
				
				//Validate Sub Menu How Tos in The Craft
				commonFunction.moveToAnElement(getPageElement(HomePageObjects.lnkNaviTheCraft), HomePageObjects.lnkNaviTheCraft.getObjectname());
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkSubMenuHowsTo), HomePageObjects.lnkSubMenuHowsTo.getObjectname());
				if(driver.getCurrentUrl().contains("/how-tos")) {
					report.updateTestLog("Verify Sub-Navigtion Menu - How Tos of Navigation Menu link - The Craft", "User is successfully Navigated to sub-Navigation Menu - How Tos", Status.PASS);
				}else {
					report.updateTestLog("Verify Sub-Navigtion Menu - How Tos of Navigation Menu link - The Craft", "User is NOT Navigated to sub-Navigation Menu - How Tos", Status.FAIL);
				}
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuHowToPageTitle), HomePageObjects.txtSubMenuHowToPageTitle.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtSubMenuHowToPageDescription), HomePageObjects.txtSubMenuHowToPageDescription.getObjectname());
				
				
				//Validate user is navigated to Home page on click the logo
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.headerLogo), HomePageObjects.headerLogo.getObjectname());
				if(commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.buttonShopSmokersGrill), HomePageObjects.buttonShopSmokersGrill.getObjectname())) {
					
					report.updateTestLog("Verify user is on the Home Page after clicking on Header logo", "User is successfully navigated to Home page on clicking the logo", Status.PASS);
				}else {
					report.updateTestLog("Verify user is on the Home Page after clicking on Header logo", "User is NOT Navigated to Home Page", Status.FAIL);
				}
			}catch(Exception e) {
				report.updateTestLog("Validate the Header- sub Menu navigation Links landing -  ",
						"Something went wrong!" + e.toString(), Status.FAIL);
			}
		}
		
		public void navigateToShoppingCartPage() {
			try {
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnCart), HomePageObjects.btnCart.getObjectname());
				if(commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.txtShoppingCartTitle), ShoppingCartPageObjects.txtShoppingCartTitle.getObjectname())) {
					report.updateTestLog("Verify user is navigated to Shopping Cart Page", "User is successfully navigated to Shopping Cart Page", Status.PASS);
				}else {
					report.updateTestLog("Verify user is navigated to Shopping Cart Page", "User is NOT navigated to Shopping Cart Page", Status.FAIL);
				}
			}catch(Exception e) {
				report.updateTestLog("Navigate to Shopping Cart Pager- -  ",
						"Something went wrong!" + e.toString(), Status.FAIL);
			}
		}
		
		public void validateMyAccountModelAndSignInModel() {
			try {
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnUserAccount), HomePageObjects.btnUserAccount.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.btnSignIn), HomePageObjects.btnSignIn.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.btnSignUp), HomePageObjects.btnSignUp.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lnkOrders), HomePageObjects.lnkOrders.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lnkRegisteredProducts), HomePageObjects.lnkRegisteredProducts.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lnkAccountInfo), HomePageObjects.lnkAccountInfo.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lnkAddressBook), HomePageObjects.lnkAddressBook.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lnkReviews), HomePageObjects.lnkReviews.getObjectname());
				
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnSignIn), HomePageObjects.btnSignIn.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtBoxEmailAddr), HomePageObjects.txtBoxEmailAddr.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtBoxPassword), HomePageObjects.txtBoxPassword.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.btnSignInModelOverlay), HomePageObjects.btnSignInModelOverlay.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lnkForgotPassword), HomePageObjects.lnkForgotPassword.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.txtDontHaveAccount), HomePageObjects.txtDontHaveAccount.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lnkSighUp), HomePageObjects.lnkSighUp.getObjectname());
				
			}catch(Exception e) {
				report.updateTestLog("Validate My Account & Sign In Model ",
						"Something went wrong!" + e.toString(), Status.FAIL);
			}
		}
		
		
		public void logintoAccount() {
			try {
				String emailAddr = dataTable.getData("General_Data", "EmailAddress");
				String password = dataTable.getData("General_Data", "Password");
					
				commonFunction.clearAndEnterText(getPageElement(HomePageObjects.txtBoxEmailAddr), emailAddr, HomePageObjects.txtBoxEmailAddr.getObjectname());
				commonFunction.clearAndEnterText(getPageElement(HomePageObjects.txtBoxPassword), password, HomePageObjects.txtBoxPassword.getObjectname());
			
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnSignInModelOverlay), HomePageObjects.btnSignInModelOverlay.getObjectname());
				//webdriverutil.waitUntilPageLoaded(20);
				//commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnUserAccount), HomePageObjects.btnUserAccount.getObjectname());
				if(commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lnkSignOut), HomePageObjects.lnkSignOut.getObjectname())) {

					report.updateTestLog("Verify user is Logged In", "User is successfully logged In to the application", Status.PASS);
				}else {
					report.updateTestLog("Verify user is Logged In", "User is NOT logged in", Status.FAIL);
				}
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.headerLogo), HomePageObjects.headerLogo.getObjectname());
			}catch(Exception e) {
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
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnUserAccount), HomePageObjects.btnUserAccount.getObjectname());
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnSignIn), HomePageObjects.btnSignIn.getObjectname());
				commonFunction.clearAndEnterText(getPageElement(HomePageObjects.txtBoxEmailAddr), emailAddr, HomePageObjects.txtBoxEmailAddr.getObjectname());
				commonFunction.clearAndEnterText(getPageElement(HomePageObjects.txtBoxPassword), password, HomePageObjects.txtBoxPassword.getObjectname());
			
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnSignInModelOverlay), HomePageObjects.btnSignInModelOverlay.getObjectname());
				if(commonFunction.verifyIfElementIsPresent(getPageElement(HomePageObjects.lnkSignOut), HomePageObjects.lnkSignOut.getObjectname())) {

					report.updateTestLog("Verify user is Logged In", "User is successfully logged In to the application", Status.PASS);
				}else {
					report.updateTestLog("Verify user is Logged In", "User is NOT logged in", Status.FAIL);
				}
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.headerLogo), HomePageObjects.headerLogo.getObjectname());
			}catch(Exception e) {
				report.updateTestLog("Validate Login with Valid Username and password",
						"Something went wrong!" + e.toString(), Status.FAIL);
			}
		}
		public void navigateToAccountInformation() {
			try {
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnUserAccount), HomePageObjects.btnUserAccount.getObjectname());
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.lnkAccountInfoAfterLoggedIn), HomePageObjects.lnkAccountInfoAfterLoggedIn.getObjectname());
			}catch(Exception e) {
				report.updateTestLog("Navigation to Account Information Page ",
						"Something went wrong!" + e.toString(), Status.FAIL);
			}
		}
		
		public void navigateToShippingCartEmptyIfNoOfItemsMoreThanOne() {
			
			try {
				webdriverutil.waitUntilPageReadyStateComplete(30);
				Thread.sleep(5000);
				String count =commonFunction.getTextFromElement(getPageElement(HomePageObjects.countItemsInCart));
				System.out.println(count);
				if(Integer.parseInt(count)>0) {
					commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.btnCart), HomePageObjects.btnCart.getObjectname());
				ShoppingCartPageComponents spc = new ShoppingCartPageComponents(scriptHelper);
				spc.emptycart();
				commonFunction.clickIfElementPresent(getPageElement(HomePageObjects.headerLogo), HomePageObjects.headerLogo.getObjectname());
				}else {
					report.updateTestLog("The Shipping cart is empty",
							"The shipping cart is empty, not navigating to Shipping cart page", Status.DONE);
				}
			}catch(Exception e) {
				report.updateTestLog("Navigation to Account Information Page ",
						"Something went wrong!" + e.toString(), Status.FAIL);
			}
		}
}
