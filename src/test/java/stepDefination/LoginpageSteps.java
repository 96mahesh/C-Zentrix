package stepDefination;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.czentrix.pages.Loginpage;
import com.czentrix.utils.Browser;

import io.cucumber.java.en.*;

public class LoginpageSteps {
	 WebDriver driver;
	 Loginpage login ;
	 public LoginpageSteps(Hooks hooks) {
		 
		 driver = hooks.driver;
	 }
	 
	 @Given("user need to be c-zentrix loginpage")
	 public void user_need_to_be_c_zentrix_loginpage() {
		//driver = Browser.lanchBrowser("chrome");
		Browser.openUrl("https://newui.c-zentrixcloud.com/czagent");
		driver.manage().deleteAllCookies();
	 }

	 @When("user enter as a avlid email {string};")
	 public void user_enter_as_a_avlid_email(String username) {
		 login = new Loginpage(driver);
	    login.username(username);
	 }

	 @Then("user enter as a valid password {string};")
	 public void user_enter_as_a_valid_password(String pass) {
	     login.password(pass);
	 }

	 @Then("user click on login")
	 public void user_click_on_login() throws Exception {
	    login.clickOnlogin();
	 }
    
	 @Then("user click Yes Notification button")
	 public void user_click_yes_notification_button() {
	     login.clickOnYesButton();
	 }
	 @Then("user should able to verify the Hello agent")
	 public void user_should_able_to_verify_the_hello_agent() {
	 String ele =  login.userverifyTheAgetThereOrNot();
	 System.out.println(ele);
	 Assert.assertEquals(ele, "Hello 2171 !");
	 }

	 @When("user click on Resume Button")
	 public void user_click_on_resume_button() {
	     login.clockOnResume();
	 }
	 
	 @Then("user click on C-Z Button")
	 public void user_click_on_c_z_button() {
	    login.clickOnc_zButton();
	 }
	 
	 @Then("user click on callPannel Button")
	 public void user_click_on_call_pannel_button() {
	    login.clickOnCallPannelButton(); 
	 }
	 
	 @Then("user click on BackOnC-Z Button")
	 public void user_click_on_back_on_c_z_button() {
	    login.clickOnBackToC_ZButton();
	 }

	 @When("user click on Preview Button")
	 public void user_click_on_preview_button() throws Exception {
	     login.clickOnPreviewButton();
	 }

	 @Then("user click on Dail Button")
	 public void user_click_on_dail_button() {
	     login.clickOnDailButton();
	 }
	 
	 @Then("user need to enter the ph no {string}")
	 public void user_need_to_enter_the_ph_no(String mbno) throws Exception {
		 Thread.sleep(2000);
	    login.userEnterSendKeys(mbno);
	 }

	 @Then("user click on dailCallBtn")
	 public void user_click_on_dail_call_btn() {
	     login.clickOnDailPadBtn();
	 }
	 
	 @Then("user should able to verify The dail button colour")
	 public void user_should_able_to_verify_the_dail_button_colour() {
	     login.verifyThedailButtonColour();
	 }

	 @When("user should able to Add customer")
	 public void user_should_able_to_add_customer() throws Exception {
	    login.userclickOnAddCustomer();
	 }

	 @Then("user should able to select the one customer")
	 public void user_should_able_to_select_the_one_customer() {
	    login.userSelectCustomer();
	 }

	 @Then("user should able to pic one customer")
	 public void user_should_able_to_pic_one_customer() throws Exception {
	    login.userPicCustomer(); 
	 }
	 
	 @Then("user should able to click on add customer customer btn")
	 public void user_should_able_to_click_on_add_customer_customer_btn() {
	    login.userClickOnAddCustomerBtn();
	 }
	 @Then("user should able to verify The Add customer colour")
	 public void user_should_able_to_verify_the_add_customer_colour() {
	    login.verifyFunctionalityOfAddButtonColour();
	 }
	 @Then("user enter the comment box as {string}")
	 public void user_enter_the_comment_box_as(String comm) throws Exception {
	     login.userEnetrComments(comm);
	 }
	 @Then("user should able to click on disconnect  call Btn")
	 public void user_should_able_to_click_on_disconnect_call_btn() throws Exception {
		 login.clickOnDisconnectCall();
	 }
	 @Then("user should able to verify the disconnect btn bg colour")
	 public void user_should_able_to_verify_the_disconnect_btn_bg_colour() {
	    login.userVeriftTheDisconnectCallBgClour();
	 }
	 @Then("user should able to click on End call Btn")
	 public void user_should_able_to_click_on_end_call_btn() throws Exception {
	    login.clickOnEndCall();
	 }
	 @Then("user should able to verify the End call bg colour")
	 public void user_should_able_to_verify_the_end_call_bg_colour() {
		 login.verifyFunctionalityOfEndCallBcakGroundColor();
	    	 }
	 @Then("user should able to click on icon button")
	 public void user_should_able_to_click_on_icon_button() {
	     login.clickOnIcon();
	 }
	 @Then("user should able to click on logout botton")
	 public void user_should_able_to_click_on_logout_botton() {
	     login.clickOnLogOut();
	 }
	 @Then("user should able to accept the alert msg")
	 public void user_should_able_to_accept_the_alert_msg() {
	     login.userHandleTheAlert();
	 }
	 
	 @Then("user should able to verify the login title")
	 public void user_should_able_to_verify_the_login_title() {
	     login.verfyTheLoginTitle();
	 }
	 @Then("User should able to verify the font alinments")
	 public void user_should_able_to_verify_the_font_alinments() {
	     login.verifythewelcomeBgcolor();
	 }

	

	 
	 
		



}
