package com.DollarDays.pageObjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DollarDays.utilities.ElementUtils;

public class HomePage 																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
{

	public WebDriver driver;
	ElementUtils elementUtils ;
	public static Logger logger =LogManager.getLogger("DollarDays"); 
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);  //(argument driver,this)
		elementUtils = new ElementUtils(driver);
		
	}			
		
	//Signin Icon
	@FindBy(xpath="//span[text()='Sign in']")
	private WebElement wbIconSignin;	
	
	//List of links in UserAccountName/Signin Dropdown 
	@FindBy(xpath="//ul[@class='dropdown-menu logMenu']/li") 
	private List <WebElement> wbSigninUserDDlist;
	
	//List of Signin Dropdown links
	@FindBy(xpath="//ul[@class='dropdown-menu logMenu']/li/a") 
	private List <WebElement> wbSigninUserDDlinks;
	
	//SignIn Link in Signin Dropdown
	@FindBy(linkText="Sign In")
	private WebElement wbSignInLink;
	
	//CreateAccount Link in Signin Dropdown
	@FindBy(linkText="Create account")
	private WebElement wbCreateAccLink;
	
	//Help Link in Signin Dropdown
	@FindBy(linkText="Help")
	private WebElement wbHelpLink;
	
	//UserAccountName
	@FindBy(xpath="//*[@id='aspnetForm']/header/div[2]/div/div/div[3]/div/ul/li[1]/a/span")
	private WebElement wbAccountNameIcon;	
	
	//Accounts Link in UserAccountName Dropdown
	@FindBy(linkText="Accounts")
	private WebElement wbAccountsLink;
	
	//Order History Link in UserAccountName Dropdown
	@FindBy(linkText="Order History")
	WebElement wbOrderHistoryLink;
	
	//My Wishlist Link in UserAccountName Dropdown
	@FindBy(linkText="My Wishlist")
	private WebElement wbWishlistLink;
	
	//Favorites Link in UserAccountName Dropdown
	@FindBy(linkText="Favorites")
	private WebElement wbFavoritesLink;
	
	//Update Profile Link in UserAccountName Dropdown
	@FindBy(linkText="Update Profile")
	private WebElement wbUpdateProfileLink;
	
	//Address Book Link in UserAccountName Dropdown
	@FindBy(linkText="Address Book")
	private WebElement wbAddressBookLink;
	
	//Wallet Link in UserAccountName Dropdown
	@FindBy(linkText="Wallet")
	private WebElement wbWalletLink;
	
	//Tax Exempt Link in UserAccountName Dropdown
	@FindBy(linkText="Tax Exempt")
	private WebElement wbTaxExemptLink;
	
	//Request a Quote Link in UserAccountName Dropdown
	@FindBy(linkText="Request a Quote")
	private WebElement wbRequestQuoteLink;
	
	//Contact Us Link in UserAccountName Dropdown
	@FindBy(linkText="Contact Us")
	private WebElement wbContactUsLink;
		
	//Sign Out Link in UserAccountName Dropdown
	@FindBy(linkText="Sign Out")
	private WebElement wbSignOutLink;
	
	//Get the title of page
	public String getHomePageTitle()
	{
		return elementUtils.getWebPageTitle();
	}	
	
	//Get the current url of page
	public String getHomePageUrl()
	{
		return elementUtils.getWebPageUrl();
	}	

	//Get text of Signin Icon
	public String getTextIconSignin()
	{
		return elementUtils.getElementText(wbIconSignin);    //return wbIconSignin.getText()
	}	
	
	//click Sign in icon
	public void clickIconSignin()
	{
     	elementUtils.performElementClick(wbIconSignin);     //wbIconSignin.click();
	}		
	
	//click SignIn link option
	public void clickSignInLink()
	{
     	elementUtils.performElementClick(wbSignInLink);
	}		
	
	//click create account link option
	public void clickCreateAccLink()
	{
     	elementUtils.performElementClick(wbCreateAccLink);
	}	
	
	//click Help link option
	public void clickHelpLink()
	{
     	elementUtils.performElementClick(wbHelpLink);
	}	
	
	//Get text of user name icon 
	public String getTextAccountNameIcon()
	{
		return elementUtils.getElementText(wbAccountNameIcon); //return wbAccountNameIcon.getText()
	}	
	
	//click username Icon
	public void clickAccountNameIcon()
	{
     	elementUtils.performElementClick(wbAccountNameIcon);
	}	
	
	//click Accounts link option from userdropdown list
	public void clickAccountsLink()
	{
     	elementUtils.performElementClick(wbAccountsLink);
	}	
	
	//click Order History link option from userdropdown list
	public void clickOrderHistoryLink()
	{
     	elementUtils.performElementClick(wbOrderHistoryLink);
	}	
	
	//click WishList link option from userdropdown list
	public void clickWishlistLink()
	{
     	elementUtils.performElementClick(wbWishlistLink);
	}	
	
	//click Favorites link option from userdropdown list
	public void clickFavoritesLink()
	{
     	elementUtils.performElementClick(wbFavoritesLink);
	}	
	
	//click Update Profile link option from userdropdown list
	public void clickUpdateProfileLink()
	{
     	elementUtils.performElementClick(wbUpdateProfileLink);
	}	
	
	//click AddressBook link option from userdropdown list
	public void clickAddressBookLink()
	{
     	elementUtils.performElementClick(wbAddressBookLink);
	}	
	
	//click Wallet link option from userdropdown list
	public void clickWalletLink()
	{
     	elementUtils.performElementClick(wbWalletLink);
	}	
	
	//click Tax Exempt link option from userdropdown list
	public void clickTaxExemptLink()
	{
     	elementUtils.performElementClick(wbTaxExemptLink);
	}	
	
	//click Request a Quote link option from userdropdown list
	public void clickRequestQuoteLink()
	{
     	elementUtils.performElementClick(wbRequestQuoteLink);
	}	
	
	//click Contact us  link option from userdropdown list
	public void clickContactUsLink()
	{
     	elementUtils.performElementClick(wbContactUsLink);
	}	
	
	//click Sign Out link option from userdropdown list
	public void clickSignOutLink()
	{
     	elementUtils.performElementClick(wbSignOutLink);
	}	
	
	//Get list of values from the Sign in  or the User Dropdown list based on the user being logged in or not
	public List<String> getSignInUserDropDownList()
	{

		return elementUtils.getListofText(wbSigninUserDDlist);
	}
	
	//Get the list of links displayed in the Sign in  or the User Dropdown list based on the user being logged in or not
	public List<String> getSignInUserDropDownLinksList()
	{
		return elementUtils.getListofText(wbSigninUserDDlinks);
		
	}	
	
	//Get in String Array format ,the list of links  displayed in the Sign in  or the User Dropdown list based on the user being logged in or not
	public String[] getSignInUserDropDownLinksArray()
	{
		return elementUtils.getArrayofText(wbSigninUserDDlinks);
	}
	
	
	//Selecting the SignOut option from user dropdown list to log out of Web application
	public void signOutOfDD()
	{
		clickAccountNameIcon();
		clickSignOutLink();
		
	}		
	
//Selecting Sign in option in Signin dropdown list to navigate to login page
	public void goToLoginPage()
	{
		clickAccountNameIcon();
		clickSignInLink();
	}	


//Get the title of page
	public String getWebPageTitleURL()
	{
		return elementUtils.getWebPageTitle();
	}	
	

//Get the MenuBar Icon
	@FindBy(id = "sm_menu_ham")
	private WebElement HomePageMenuBarIcon;
	
	public void getMenuBarIcon() 
	{
		 elementUtils.performElementClick(HomePageMenuBarIcon);
	 
	}
	
	
//Get the MenuBar List under 'Now Trending'
	@FindBy(xpath= "//div[@class='sm_menu_outer active']/ul/li[1]/ul/child::li/a")
	private List <WebElement>  MenuBarDropdownChild1;
	
	 public List<String> getMenuBarDropDownChildList1()
	 {
		 //getMenuBarIcon();
		 return elementUtils.getListofText(MenuBarDropdownChild1);
	 }
	 
	 
//Get the MenuBar List under 'Categories'
	 @FindBy(xpath= "//div[@class='sm_menu_outer active']/ul/child::li/a")
	 private List <WebElement>  MenuBarDropdownChild2;
			
		public List<String> getMenuBarDropDownChildList2()
		{
			return elementUtils.getListofText(MenuBarDropdownChild2);
		}
		
//Get the MenuBar List under 'Programs'
		@FindBy(xpath= "//div[@class='sm_menu_outer active']/ul/li[19]/ul/child::li/a")
		private List <WebElement>  MenuBarDropdownChild3;
				
		public List<String> getMenuBarDropDownChildList3()
		{
			 return elementUtils.getListofText(MenuBarDropdownChild3);
		}
			
//Get the MenuBar List under 'Help & Settings'	 
		@FindBy(xpath= "//div[@class='sm_menu_outer active']/ul/li[20]/ul/child::li/a")
		private List <WebElement>  MenuBarDropdownChild4;
				
		public List<String> getMenuBarDropDownChildList4()
		{
			 return elementUtils.getListofText(MenuBarDropdownChild4);
		}
	 
// Close the Menu Bar dropdown by clicking "X" web element
		@FindBy(xpath= "//i[@class='nav-close']")
		private WebElement  MenuBarDropdownClose;
				
		public void ClickMenuBarDropDownCloseButton()
		{
			elementUtils.performElementClick(MenuBarDropdownClose);
		}
		
//Check the display of Phone number in HomePage Header Field
		@FindBy(xpath= "//span[@class='call']")
		private WebElement  PhoneNumberAtHomePageHeader;

		public String getHomePageHeaderPhoneNumberText()
		{
			return elementUtils.getElementText(PhoneNumberAtHomePageHeader);
		}
		
//Get the  List of HomePage Icons in Right side Header'	
		@FindBy(xpath= "//div[@class='header-right']/ul/child::li")
		private List <WebElement>  HeaderRightIconsList;

		public List<String> getHomePageHeaderRightListText()
		{
			return elementUtils.getListofText(HeaderRightIconsList);
		}
		
//Get the SearchBar Element Field'	
		@FindBy(name ="terms")
		private WebElement SearchBar;

		public String getSearchBarPlaceholder()
		{
			return elementUtils.getElementAttribute(SearchBar, "placeholder");
		}
	
//Get SignIn Icon
		@FindBy(xpath="//span[text()='Sign in']")
		private WebElement SigninIcon; 
	 
		public void ClickSigninIcon()
		{
	     	elementUtils.performElementClick(SigninIcon);     //wbIconSignin.click();
		}
		
//List of Signin Dropdown list before login
		@FindBy(xpath="//ul[@class='dropdown-menu logMenu']/child::li/a") 
		private List <WebElement> SigninDropDownList;
		
		public List<String> getSignInDropDownList()
		{

			return elementUtils.getListofText(SigninDropDownList);
		}
		
//Get the Sign In Dropdown Links in an Array		
		public String[] getSignInDropDownLinksArray()
		{

			return elementUtils.getArrayofText(SigninDropDownList);
		}
		
//Get the WishList Icon	
	//	@FindBy(xpath = "//img[@class='header-wishlist']")
		@FindBy(xpath = "//span[text()='Wishlist']")
		private WebElement WishListIcon;
		
		public void getWishListIcon() 
		{
			elementUtils.performElementClick(WishListIcon);
		}
		
//Get the DropDown List under WishList Icon before login
		@FindBy(xpath= "//ul[@class='dropdown-menu']/child::li/a")
		private List <WebElement>  WishListDropDownList;
		
		public List<String> getWishListDropDownText()
		{
			return elementUtils.getListofText(WishListDropDownList);
		}
		
//Get the URL in "LearnMore" under WishList drop down List
		@FindBy(linkText= "Learn More")
		private WebElement LearnMoreLink;

		public String getLearnMoreURL()
		{
			return elementUtils.getElementAttribute(LearnMoreLink, "href");
		}
		
//Get the URL in "Create a Wishlist" under WishList drop down List
		@FindBy(linkText= "Create a Wishlist")
		private WebElement CreateWishlistURL;

		public String getCreateWishlistURL()
		{
			return elementUtils.getElementAttribute(CreateWishlistURL, "href");
		}
		
//Get the URL in "Donate Today" under WishList drop down List
		@FindBy(linkText= "Donate Today")
		private WebElement DonateTodayURL;

		public String getDonateTodayURL()
		{
			return elementUtils.getElementAttribute(DonateTodayURL, "href");
		}
		
//Cart Icon in homepage before Signin
		@FindBy(xpath="//div[@class='cart dropdown divcart']")
		private WebElement CartIcon;
		
		public void HoverMouseOnCartIcon()
		{
			Actions action = new Actions(driver);
			action.moveToElement(CartIcon).perform();
		}
		
//Cart Icon ToolTip(text by hovering the mouse over Cart Icon) in homepage before Signin
		@FindBy(xpath="//div[@class='snapshotitem']//li")
		private WebElement CartIconToolTip;

		public String getCartIconToolTip()
		{
			return elementUtils.getElementText(CartIconToolTip);
		}
		
//In HomePage Mid Section, there is a 'Shop by Category'.Getting the text of all the available icon under it.  
		@FindBy (xpath = "//div[@class='row']/div[@class='col-sm-3 col-md-3 col-lg-2 col-xs-6']")
		private List<WebElement> ShopByCatogerySection;
		
		public List<String> getTextListinShopByCategory() 
		{
			return elementUtils.getListofText(ShopByCatogerySection);
		}
		
//In HomePage Mid Section, there is 'Shop by Category'.Getting the title of first five icons  under it.  
		@FindBy (xpath = "//div[@class='col-sm-3 col-md-3 col-lg-2 col-xs-6'][6]/preceding::div[@class='col-sm-3 col-md-3 col-lg-2 col-xs-6']/a")
		private List<WebElement> ShopByCatogerySectionTitle;
				
		public List<String> getTextListShopByCatogerySection()
		{	
			return elementUtils.getListofText(ShopByCatogerySectionTitle);
		}
				
		public List<String> getWebPageTitleShopByCatogery()
		{
				
		String originalHandle = driver.getWindowHandle();// It fetches the handle of the web page which is in focus. It gets the address of the active browser and it has a return type of String.
	    Set<String> AllWindowHandle = null;//It stores the set of handles for all the pages opened simultaneously.
	    String tabcount = Keys.chord(Keys.CONTROL,Keys.ENTER);//right click and select ‘open link in new tab
	    List<String> titlelist = new ArrayList<String>();
				    
		    for(WebElement welement :ShopByCatogerySectionTitle )
				{
		    	 	welement.sendKeys(tabcount);// opens the links in new tab simultaneously or in other words opens multiple child window
					AllWindowHandle = driver.getWindowHandles();// catching string opened in each browser
				}
					Iterator<String> It=AllWindowHandle.iterator(); //iterator through the child window
					
					for(String child: AllWindowHandle)	
					{
						if(!originalHandle.equals(child))
						{
							 driver.switchTo().window(child);// Switch to child window
							// System.out.println(driver.getTitle());
							 titlelist.add((driver.getTitle())) ;	
							 driver.close();
						}
						driver.switchTo().window(originalHandle);
					}
			   return titlelist;
		}
		
//In HomePage Footer Section, there is a 'Customer Service' part under that there are many links. Getting the text of the Links.
		
		    @FindBy (xpath = "//div[@class='col-lg-4 col-md-4 col-sm-4 col-xs-12'][2]")
		    private WebElement footerSection_CustomerService;
		
		    public List<WebElement> getChildElementLinks() 
		    {
		        return footerSection_CustomerService.findElements(By.tagName("a"));
		    }
		
		
		public List<String> getTextListCustomerServiceFooter()
		{
			List<WebElement> links = getChildElementLinks();
			return elementUtils.getListofText(links);
		}
		
		
		public List<String> getWebPageTitleCustomerServiceFooter()
		{
			 String originalHandle = driver.getWindowHandle();// It fetches the handle of the web page which is in focus. It gets the address of the active browser and it has a return type of String.
			// Set<String> AllWindowHandle = driver.getWindowHandles();
			 Set<String> AllWindowHandle = null;//It stores the set of handles for all the pages opened simultaneously.
			 String tabcount = Keys.chord(Keys.CONTROL,Keys.ENTER);//right click and select ‘open link in new tab
			 List<String> titlelist = new ArrayList<String>();
			 List<WebElement> links = getChildElementLinks();
			    for(WebElement welement :links )
				{
					welement.getText();
					logger.debug("Clicking of "+welement.getText()+" link is starting and opening it in a new tab.");
					welement.sendKeys(tabcount);// opens the links in new tab simultaneously or in other words opens multiple child window
					AllWindowHandle = driver.getWindowHandles();// catching string opened in each browser
				}
					Iterator<String> It=AllWindowHandle.iterator(); //iterator through the child window
					logger.debug("Fetching its webpage title for verification.");
					for(String child: AllWindowHandle)	
					{
						if(!originalHandle.equals(child))
						{
							 driver.switchTo().window(child);// Switch to child window
							// System.out.println(driver.getTitle());
							 
							 titlelist.add((driver.getTitle())) ;	
							 driver.close();
						}
						driver.switchTo().window(originalHandle);
					}
				 return titlelist;
			}
	
//Check the display of CopyRight Information in HomePage Footer
		@FindBy(xpath= "//div[@class='footer-bottom']/div[@class='row']/div[@class='col-sm-6'][2]")
		private WebElement  copyrightInfo;
		public String getCopyRightInfoText()
		{
			return elementUtils.getElementText(copyrightInfo);
		}		
		
	
//	//CloseBarPopup
//	@FindBy(xpath="//*[@id='aspnetForm']/header/div[1]/h5")
//	private WebElement wbCloseBarPopup;
	
	//Action on Webelements	
//	public void clickCloseBarPopup()
//	{
//		elementUtils.performElementClick(wbCloseBarPopup);  
//	}	
	
	
}
