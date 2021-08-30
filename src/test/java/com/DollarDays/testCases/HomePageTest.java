package com.DollarDays.testCases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.DollarDays.pageObjects.HomePage;
import com.DollarDays.utilities.BaseClass;
import com.DollarDays.utilities.ConstantsUtils;
import com.DollarDays.utilities.XLUtils;


// HomePage Tests before sign in

public class HomePageTest extends BaseClass
{
	public WebDriver driver;
	public static Logger logger =LogManager.getLogger("DollarDays"); 
	HomePage hp;
	
	@BeforeClass
	public void initialize() throws IOException
	{
		driver =initializeDriver();
		hp= new HomePage(driver);
	}
@AfterClass
	public void teardown()
	{
			driver.close();
			logger.info("WebPage is closed.");
			System.out.println("WebPage is closed.");
	}
	

// Fetching the expected values for all test case can be done in one of the following: either from ConstantUtils.java or Excel file or data.properties using ReadPropertiesUtils.java
	
	
@Test(priority=0, description="This testcase verifies the HomePage Title is correct.")
		public void TC_VerifyHomePageTitle()
		{   
			logger.debug("Fetching Home Page Title ");
			String actualTitle  = hp.getWebPageTitleURL();
			Assert.assertEquals(actualTitle, ConstantsUtils.HOMEPAGETITLE,"HomePage Title Verification failed.");
			logger.info("Verified HomePage Title successfully.");
		}
		
		
		
@Test(priority=1,description="This testcase verifies the HomePage URL is correct.")
		public void TC_VerifyHomePageUrl()
		{
			logger.debug("Fetching Home Page URL");
			String actuaUrl = hp.getHomePageUrl();
			//System.out.println(actuaUrl);
			Assert.assertEquals(actuaUrl, ConstantsUtils.BASEURL,"HomePage URL does not match");
			logger.info("Home Page URL Verified Successfully");
			
			
		}
	

@Test(priority=2,description="This testcase verifies the Menu Bar List under 'Now Trending' in Homepage is correct.")
		public void TC_VerifyMenuBarDropdownList()
		{
			logger.debug("Fetching MenuBar Icon. ");
			hp.getMenuBarIcon();
			logger.debug("MenuBar Icon is Clicked.");
			List<String> actualchid1 = hp.getMenuBarDropDownChildList1();
			logger.debug("Fetching Menu Bar List under 'Now Trending' from Constant File");
			String[] s1 = ConstantsUtils.NOWTRENDING.split(":");
			List <String> exptmenulist1 = Arrays.asList(s1);
			logger.debug("Validation of the Menu Bar List under 'Now Trending' is starting.");		
			Assert.assertEquals(actualchid1, exptmenulist1,"Menu Bar List under 'Now Trending' does not match");
			logger.info("Menu Bar List under 'Now Trending' matches with the expected list and is Verified Successfully");
			
		}

		
@Test(priority=3,description="This testcase verifies the Menu Bar List under 'Categories' in Homepage is correct.")
		public void TC_VerifyMenuBarDropdownList2()
		{		
			List<String> actualchid2 = hp.getMenuBarDropDownChildList2();
			logger.debug("Fetching Menu Bar List under 'Categories' from Constant File");
			String[] s2 = ConstantsUtils.CATEGORIES.split(":");
			List <String> exptmenulist2 = Arrays.asList(s2);
			logger.debug("Validation of the Menu Bar List under 'Categories' is starting.");	
			Assert.assertEquals(actualchid2, exptmenulist2,"Menu Bar List under 'Categories' does not match");
			logger.info("Menu Bar List under 'Categories' matches with the expected list and is Verified Successfully");
			
		}

		
@Test(priority=4,description="This testcase verifies the Menu Bar List under 'Programs' in Homepage is correct.")
		public void TC_VerifyMenuBarDropdownList3()
		{
			List<String> actualchid3 = hp.getMenuBarDropDownChildList3();
			logger.debug("Fetching Menu Bar List under 'Programs' from Constant File");
			String[] s3 = ConstantsUtils.PROGRAMS.split(",");
			List <String> exptmenulist3 = Arrays.asList(s3);
			logger.debug("Validation of the Menu Bar List under 'Programs' is starting.");
			Assert.assertEquals(actualchid3, exptmenulist3,"Menu Bar List under 'Programs' does not match");
			logger.info("Menu Bar List under 'Programs' matches with the expected list and is Verified Successfully");
			
		}
		
		
		
@Test(priority=5,description="This testcase verifies the Menu Bar List under 'Help & Settings' in Homepage is correct.")
		public void TC_VerifyMenuBarDropdownList4() throws IOException
		{
			//Option 1 - Comparing actual list with expected list from Constant File
			/*
			logger.debug("Fetching Menu Bar List under 'Help & Settings' from Constant File");
			List<String> actualchid4 = hp.getMenuBarDropDownChildList4();
			logger.debug("Actual Menu List under 'Help & Settings' are: ");
			String[] s4 = ConstantsUtils.HELPSETTINGS.split(",");
			List <String> exptmenulist4 = Arrays.asList(s4);
			logger.debug("Validation of the Menu Bar List under 'Help & Settings' is starting.");
			
			*/
			//Option 2 - Comparing actual list with expected list from Excel File
			List<String> actualchid4 = hp.getMenuBarDropDownChildList4();
			String[] s4 = ConstantsUtils.HELPSETTINGS.split(",");
			logger.debug("Fetching Menu Bar List under 'Help & Settings' from Excel File.");
		    String xlFileName="Data.xlsx";
		    String strDataXlsArr[]=XLUtils.getColumnData(xlFileName, "Sheet2", 0);
		    List <String> exptmenulist4 = new ArrayList<String>();
		    Collections.addAll(exptmenulist4, strDataXlsArr);
		    logger.debug("Validation of the Menu Bar List under 'Help & Settings' is starting.");
			Assert.assertEquals(actualchid4, exptmenulist4,"Menu Bar List under 'Help & Settings' does not match");
			logger.info("Menu Bar List under 'Help & Settings' matches with the expected list and is Verified Successfully");
			hp.ClickMenuBarDropDownCloseButton();
			
		}
		
		
		
@Test(priority=6,description="This testcase verifies the display of Phone number in the Homepage header.")
		public void TC_VerifyHomePageHeaderdisplayPhoneNumber()
		{
			logger.debug("Fetching the Web Element display of Phone number in the Homepage header");
			String actual = hp.getHomePageHeaderPhoneNumberText();
			String expected = ConstantsUtils.PHONENUMBERMESSAGE;
			logger.debug("Verification of the display of Phone number in the Homepage header is starting.");
			Assert.assertEquals(actual, expected,"Phone number displayed in the Homepage header does not match");
			logger.info("Phone number displayed in the Homepage header matches with the expected value and is Verified Successfully");
			
		}
		
		
@Test(priority=7,description="This testcase verifies the HomePage Icon's(Sigin,Wishlist,Cart) in Right Side Header are correct.")
		public void TC_VerifyHomePageHeaderRightIconList()
		{
			List<String> actualist = hp.getHomePageHeaderRightListText();
			logger.debug("Fetching the List of HomePage Icons in Right side Header from Constant File");
			String[] s1 = ConstantsUtils.HEADERRIGHT.split(",");
			List <String> exptmenulist = Arrays.asList(s1);
			logger.debug("Validation of the List of HomePage Icon's(Sigin,Wishlist,Cart) in Right side Header is starting.");
			Assert.assertEquals(actualist, exptmenulist,"List of HomePage Icons in Header Right side does not match");
			logger.info("List of HomePage Icons(Sigin,Wishlist,Cart) in Header Right side matches with the expected list and is Verified Successfully");
			
		}
		
@Test(priority=8,description="This testcase verifies the presence of Placeholder in Search Bar Field.")
		public void TC_VerifySearchBarFieldPresence()
		{
			logger.debug("Fetching Search Bar Field in HomePage");
			String actual = hp.getSearchBarPlaceholder();
			String expected = ConstantsUtils.SEARCHBARFIELD;
			logger.debug("Validation of the presence of Placeholder in Search Bar Field is starting.");
			Assert.assertEquals(actual,expected, "Search Bar Icon Presence verification failed");
			logger.info("Search Bar Icon Presence is verified Successfully");
		}
		
		
@Test(priority=9, description="This testcase verifies the Sign in Dropdown list content.")
		public void TC_verifySignInDropDownList() throws IOException
		{
		 	logger.debug("Clicking  SigninIcon to view and fetch the DropDown List. ");
			hp.ClickSigninIcon(); 
			List<String> actList= hp.getSignInDropDownList();		
			//Option1-Fetching expected value of Sign in DropDown List from Excel
		    logger.debug("Fetching Expected Values for Signin dropdown list from Excel File.");
		    String strDataXlsArr[]=XLUtils.getColumnData("Data.xlsx", "Sheet3", 0);
		    List <String> expList = new ArrayList<String>();
			Collections.addAll(expList, strDataXlsArr);
			Assert.assertEquals(actList, expList,"Verification of  Sign in DropDown List failed. ");
		    logger.info("Verified Signin Dropdown List successfully.");
		}

		
@Test(dataProvider="getSigninlinks" , priority=10, description="This testcase verifies the the navigation of links displayed in Sign in Dropdown list.")
		public void TC_verifySigninDropDownUrl(String linkText) throws InterruptedException
		{ 	
			navigateToHomePage();	
			driver.manage().deleteAllCookies();
		    String actualUrl=null;
		    logger.debug("clicking  SigninIcon in  the home page to view the DropDown List. ");
		    hp.clickIconSignin();	

	switch(linkText)
	{ 
      case "Sign In":  		
    	  logger.debug("Clicking SignIn optionfrom the DropDown List in the HomePage.");
    	  hp.clickSignInLink();	
    	  actualUrl=getPageUrl();
    	  Assert.assertEquals(actualUrl, ConstantsUtils.SIGNINURL,"Sign In link url verification failed.");
    	  logger.info("Sign In link url verified successfully.");
      break;
    		
      case "Create account":
    	   logger.debug("Clicking Create account option from the DropDown List in the HomePage.");
    	   hp.clickCreateAccLink();	
		   actualUrl=getPageUrl();
	       Assert.assertEquals(actualUrl, ConstantsUtils.CREATEACCOUNTURL,"Create account link url verification failed.");
	       logger.info("Create account link url verified successfully.");
      break;
    	  
      case "Help":
    	     logger.debug("Clicking Help option from the DropDown List in the HomePage.");
    	     hp.clickHelpLink();	
	    	 actualUrl=getPageUrl();
	    	 Assert.assertEquals(actualUrl, ConstantsUtils.HELPURL,"Help link url verification failed.");
	    	 logger.info("Help link url verified successfully.");
	    	 navigateToHomePage();
		break;
		
        case "":
			 Assert.assertTrue(false,"SigninDropDownList Values were not fetched correctly.");
		break;			
	}

}    	 	
		
		@DataProvider(name="getSigninlinks")
		public String[] getSigninlinks() 
		{	
			logger.debug("In the dataprovider to fetch list of Sign in dropdown links. ");
			navigateToHomePage();
			//HomePage hp = new HomePage(driver);
			driver.manage().deleteAllCookies();
			logger.debug("clicking  SigninIcon to view the DropDown List and fetching the list of links. ");
			hp.clickIconSignin();
			String arr[] = hp.getSignInUserDropDownLinksArray();
			logger.debug("clicking  SigninIcon to hide the DropDown List. ");
			hp.clickIconSignin();
			return arr;
		}
		
			
@Test(priority=11,description="This testcase verifies the DropDown list under 'Wishlist' Icon in HomePage.")
		public void TC_VerifyWishListDropdownList() throws InterruptedException
		{
			hp.getWishListIcon();
			List<String> actual = hp.getWishListDropDownText();
			logger.debug("Fetching WishList DropDown from Constant File");
			String[] s1 = ConstantsUtils.WISHLISTDROPDOWN.split(",");
			List <String> expected = Arrays.asList(s1);
			logger.debug("Validation of the DropDown list under 'Wishlist' Icon in HomePage is starting.");
			Assert.assertEquals(actual, expected,"WishList dropdown items does not match");
			logger.info("WishList dropdown items matches with the expected list and is Verified Successfully");
			hp.getWishListIcon();
		}
		
		
		
@Test(priority=12,description="This testcase verifies the URL under 'Wishlist' Icon in HomePage without navigating through the link.")
		public void TC_WishlistDropDownURLVerification() throws InterruptedException
		{
			hp.getWishListIcon();
			List<String> actualtext = hp.getWishListDropDownText();
			logger.debug("Fetching WishList DropDown Text and URL of each text");
			for(String text: actualtext)
			{
				SoftAssert softAssert = new SoftAssert();
				String  actualUrl = "";
				switch(text)
				{ 
			      case "Learn More":  		
			    	 
			    	  actualUrl = hp.getLearnMoreURL();
			    	  logger.debug("Validation of 'Learn More' url is starting.");
			    	  softAssert.assertEquals(actualUrl, "https://www.dollardays.com/wishlist/","Learn More url verification failed.");
			    	  logger.debug("Learn More URL Verified successfully");
			      break;
			    		
			      case "Create a Wishlist":
			    	  
			    	  actualUrl = hp.getCreateWishlistURL();
			    	  logger.debug("Validation of 'Create a Wishlist' url is starting.");
			    	  softAssert.assertEquals(actualUrl, "https://www.dollardays.com/wishlist/create.aspx","Create a Wishlist url verification failed.");
				      logger.debug("Create a Wishlist URL Verified successfully");
			      break;
			    	  
			      case "Donate Today":
			    	  	    	  
			    	  actualUrl = hp.getDonateTodayURL();
			    	 // System.out.println(actualUrl);
			    	  logger.debug("Validation of 'Donate Today' url is starting.");
			    	  softAssert.assertEquals(actualUrl,"https://www.dollardays.com/wishlist","Donate Today url verification failed.");
				   	 logger.info("Donate Today URL Verified successfully");
				   	navigateToHomePage();
					break;
			  	}
				softAssert.assertAll();
								
		}logger.debug("SoftAssert Test Passed");
		
		}

	
		
@Test(priority=13,description="This testcase verifies the Cart Icon Tooltip before signin, when we hover the mouse over it.")
		public void TC_VerifyCartIconToolTip() throws InterruptedException
		{
			hp.HoverMouseOnCartIcon();
			logger.debug("Hover the Mouse over Cart Icon in homepage before Signin");
			String actual = hp.getCartIconToolTip();
			String expected = ConstantsUtils.CARTICONTOOLTIP;
			logger.debug("Fetching the ToolTip referring to a message which appears when a cursor is positioned over Cart Icon");
			Assert.assertEquals(actual, expected, "ToolTip message does not match with the expected");
			logger.info("ToolTip message matches with the expected and is Verified Successfully");
		}
		

@Test(priority=14,description="This testcase verifies the texts of all the available ICONs under 'Shop By Category' in HomePage.")
		public void TC_VerifyShopByCategorySectionText() throws InterruptedException
		{
			List<String> actualTextlist= hp.getTextListinShopByCategory();
			String[] textlist = ConstantsUtils.SHOPBYCATEGORYTEXT.split(":");
			List<String>  expectedTextlist=  Arrays.asList(textlist);
			logger.debug("Fetching the texts of all the available ICONs under 'Shop By Category' in HomePage.");
			Assert.assertEquals(actualTextlist, expectedTextlist, "The text list of all the available ICONs under 'Shop By Category' in HomePage does not match with the expected");
			logger.info("The text of all the available ICONs under 'Shop By Category' in HomePage is verified succcessfully");
		}



@Test(priority=15,description="This testcase verifies the title of all the available ICONs under 'Shop By Category' in HomePage.")
		public void TC_VerifyShopByCategoryNavigation() throws InterruptedException
		{
			List<String> actualTitleList= hp.getWebPageTitleShopByCatogery();
			String[] TitleList = ConstantsUtils.SHOPBYCATEGORYTITLE.split(":");
			List<String>  expectedTitleList=  Arrays.asList(TitleList);
			logger.debug("Fetching the title of first five ICONs under 'Shop By Category' in HomePage by navigating through the link.");
			logger.debug("Opening of the first five links, all in new tab and fetching the webpage title for verification.");
			Assert.assertEquals(actualTitleList, expectedTitleList, "The title of first five ICONs under 'Shop By Category' in HomePage does not match with the expected title list");
			logger.info("The title of first five ICONs under 'Shop By Category' in HomePage verified and navigation is succcessfully");
		}
		
		
@Test(priority=16,description="This testcase verifies the text list in footer section under 'Customer Service' in HomePage.")
	public void TC_VerifyFooterSectionCustomerServiceText() throws InterruptedException
	{
			List<String> actualTextlist= hp.getTextListCustomerServiceFooter();
			String[] textlist = ConstantsUtils.CUSTOMERSERVICEFOOTER.split(",");
			List<String>  expectedTextlist=  Arrays.asList(textlist);
			logger.debug("Fetching the text list in footer section under 'Customer Service' in HomePage");
			Assert.assertEquals(actualTextlist, expectedTextlist, "The text list in footer section under 'Customer Service' in HomePage does not match with the expected");
			logger.info("The text list in footer section under 'Customer Service' in HomePage is verified succcessfully");
	}



@Test(priority=17,description="This testcase verifies the title of all the available links in footer section under 'Customer Service' by navigating through the link.")
	public void TC_VerifyFooterSectionCustomerServiceNavigation() throws InterruptedException
	{
			List<String> actualTitleList= hp.getWebPageTitleCustomerServiceFooter();
			String[] TitleList = ConstantsUtils.CUSTOMERSERVICEFOOTERTITLES.split(",");
			List<String>  expectedTitleList=  Arrays.asList(TitleList);
			logger.debug("Fetching the title of all the available links in footer section under 'Customer Service' by navigating through the link.");
			Assert.assertEquals(actualTitleList, expectedTitleList, "The title of all the available links in footer section under 'Customer Service' in HomePage does not match with the expected title list");
			logger.info("The title of all the available links in footer section under 'Customer Service' are verified and navigation is succcessfully");
	
	}

		
//@Test(priority=18,description="This testcase verifies the Copyright informaion of the webpage in footer.")
public void TC_VerifyCopyRightInfo() throws InterruptedException
{
	String actual = hp.getCopyRightInfoText();
	String expected = ConstantsUtils.COPYRIGHTINFO;
	logger.debug("Fetching the Copyright informaion of the webpage in footer.");
	Assert.assertEquals(actual, expected, "The Copyright informaion of the webpage in footer does not match with the expected");
	logger.info("the Copyright informaion of the webpage in footer matches with the expected and is Verified Successfully");
}



}

