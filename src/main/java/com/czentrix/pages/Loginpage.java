
package com.czentrix.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Loginpage {

WebDriver driver;
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='email']")WebElement userid;
	@FindBy(xpath="//input[@id='password']")WebElement pass;
	@FindBy(xpath="//span[text()='Login']")WebElement loginButton;
	@FindBy(xpath="//span[text()='Yes']") WebElement yesButton;
	@FindBy(xpath="//p[text()='Please pick the Web RTC call!']") WebElement popmsg;
	@FindBy(xpath="//h3[text()='Hello ']") WebElement verifyAgent;
	@FindBy(xpath="//span[text()='Resume']") WebElement Resume;
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiIconButton-root jss142 jss143 MuiIconButton-colorInherit']") WebElement c_zButton;
	@FindBy(xpath="//span[text()='Call Panel']")WebElement callPannelButton;
	@FindBy(xpath="//input[@type='checkbox']/../parent::span")WebElement PreviewButton;
	@FindBy(xpath="(//div[@class='col-6']//button)[1]")WebElement dailButton;
	@FindBy(xpath="//input[@id='outlined-basic']") WebElement seach_KeyPad;
	@FindBy(xpath="//li[@class='position digits pad-action']/p") WebElement dailKeyBtn;
	@FindBy(xpath="(//input[@value='Mute']/following::iframe/following::div/descendant::button)[1]") WebElement Addcustomer;
	@FindBy(xpath="//div[@id='demo-simple-select-outlined']") WebElement selectCustomer;
	@FindBy(xpath="//ul[@role='listbox']/li[text()='Test_CZ_INBOUND']")WebElement ddvalue_Test_CZ_INBOUND;
	@FindBy(xpath="//span[text()='Add Customer']")WebElement addCustomer_btn_dd;
	@FindBy(xpath="//textarea[@id='outlined-textarea']")WebElement commentbox;
	@FindBy(xpath="(//*[local-name()='svg' and @class='MuiSvgIcon-root MuiSvgIcon-colorSecondary'])[1]") WebElement disconnectCall;
	@FindBy(xpath="//*[local-name()='svg' and @class='MuiSvgIcon-root MuiSvgIcon-colorSecondary']")WebElement endCall;
	@FindBy(xpath="//*[local-name()='svg' and @style='color: rgb(12, 130, 218);']") WebElement icon;
	@FindBy(xpath="//*[local-name()='svg' and @width='20']/..")WebElement logout;
	@FindBy(xpath="//h1[text()='Welcome, User']") WebElement welcome;
	
	

	public void username(String user) {
		userid.sendKeys(user);
		System.out.println(userid);
	}
	
	public void password(String passord) {
		pass.sendKeys(passord);
	}
	
	public void clickOnlogin() throws Exception {
		loginButton.click();
		Thread.sleep(6000);

	}
	
	public void clickOnYesButton() {
		try {
		if(yesButton.isDisplayed()==true) {
			Thread.sleep(4000);
			yesButton.click();
		}
		
		else {
			String actual_msg = popmsg.getText();
			System.out.println(actual_msg);
			Assert.assertEquals(actual_msg, "Please pick the Web RTC call!.","Test Script failed Because could not contain the Element");
		}
		
		}
		catch(Exception e) {
		System.out.println(e);
		}
	}	
	
	public void clockOnResume() {
		try {
		Resume.click();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public String userverifyTheAgetThereOrNot() {
		return verifyAgent.getText();
	}
	public void clickOnc_zButton() {
		c_zButton.click();
	}
	
	public void clickOnCallPannelButton() {
		callPannelButton.click();
	}
	
	public void clickOnBackToC_ZButton() {
		c_zButton.click();
	}
	
	public void clickOnPreviewButton() throws Exception {
		String class_value = PreviewButton.getAttribute("class");

		System.out.println(class_value);

		System.out.println("length of the string is :" + class_value.length());

		Thread.sleep(3000);

		if (class_value.contains("Mui-checked")) {

			System.out.println("pass");

			PreviewButton.click();
			}
	}
	
	public void clickOnDailButton() {
		dailButton.click();
	}
	
	public void userEnterSendKeys(String phno)
	{
		seach_KeyPad.sendKeys(phno);
		
	}
	
	public void clickOnDailPadBtn() {
		dailKeyBtn.click();
	}
	
	public void verifyThedailButtonColour() {
		String dailBtnBgcolor = dailKeyBtn.getCssValue("background-color");
		System.out.println(dailBtnBgcolor);
		String actual_Colour = Color.fromString(dailBtnBgcolor).asHex();
		System.out.println(actual_Colour);
		Assert.assertEquals(actual_Colour, "#69d891");
	}
	
	public void  userclickOnAddCustomer() throws InterruptedException {
		Thread.sleep(3000);
		Addcustomer.click();
	}
	
	public void userSelectCustomer() {
		selectCustomer.click();
	}
	
	public void userPicCustomer() throws InterruptedException {
		Thread.sleep(5000);
		ddvalue_Test_CZ_INBOUND.click();
	}
	
	public void userClickOnAddCustomerBtn() {
		addCustomer_btn_dd.click();
	}
	
	public void verifyFunctionalityOfAddButtonColour() {
		String lettercolor = addCustomer_btn_dd.getCssValue("color");
		System.out.println(lettercolor);
		String actual_color = Color.fromString(lettercolor).asHex();
		System.out.println("Actual Colour : "+actual_color);
		Assert.assertEquals(actual_color, "#536dfe");
	}
	
     public void userEnetrComments(String comment) throws InterruptedException {
    	 Thread.sleep(2000);
    	 commentbox.sendKeys(comment);
     }
     
     public void clickOnDisconnectCall() throws Exception {
    	 Thread.sleep(3000);
    	 disconnectCall.click();
     }
     
     public void userVeriftTheDisconnectCallBgClour() {
    	 String actualBgColor = disconnectCall.getCssValue("background-color");
    	 System.out.println(actualBgColor);
    	 String actual_color = Color.fromString(actualBgColor).asHex();
    	 System.out.println(actual_color);
    	 Assert.assertEquals(actual_color, "#000000","Test case pass");
     }
     
     public void clickOnEndCall() throws Exception {
    	 Thread.sleep(2000);
    	 endCall.click();
     }
     
     public void verifyFunctionalityOfEndCallBcakGroundColor() {
    	 String actualBgColor = endCall.getCssValue("background-color");
    	 System.out.println(actualBgColor);
    	 String actual_color = Color.fromString(actualBgColor).asHex();
    	 System.out.println(actual_color);
    	 Assert.assertEquals(actual_color, "#000000","Test case pass");
     }
     
     public void clickOnIcon() {
    	 icon.click();
     }
     
     public void clickOnLogOut() {
    	 logout.click();
    	 Alert alert = driver.switchTo().alert();
    	 System.out.println(alert.getText());
    	 alert.accept();
     }
     
     public void userHandleTheAlert() {
    	 Alert alert = driver.switchTo().alert();
    	 System.out.println(alert.getText());
    	 alert.accept();
     }
     
     public String verfyTheLoginTitle() {
    	return welcome.getTagName();
     }
     
     public void verifythewelcomeBgcolor() {
    	String actualcolor =  welcome.getCssValue("color");
    	System.out.println(actualcolor);
    	String fontType = welcome.getCssValue("font-type");
    	System.out.println(fontType);
    	String fontcolour = welcome.getCssValue("font-colour");
    	System.out.println(fontcolour);
    	String fontsize = welcome.getCssValue("font-size");
    	System.out.println(fontsize);
     }
	
	
	
	
	
	
}
