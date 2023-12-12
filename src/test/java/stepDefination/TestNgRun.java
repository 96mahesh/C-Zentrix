package stepDefination;


import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgRun {

@Test(invocationCount = 2,enabled = true)

	public  void main() throws Exception {
	    
	
			EdgeOptions options = new EdgeOptions();
			options.addArguments("remote-allow-origin=*");
			options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		    Map<String, Object> prefs = new HashMap<String, Object>();
		    prefs.put("credentials_enable_service", false);
			prefs.put("profile.password_manager_enabled", false);
			options.setExperimentalOption("prefs", prefs);
			options.addArguments("--disable-notifications");
			options.addArguments("--use-fake-ui-for-media-stream");
			WebDriver driver = new EdgeDriver(options);

			driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

			driver.manage().window().maximize();

			driver.manage().deleteAllCookies();

			driver.get("https://newui.c-zentrixcloud.com/czagent");

			// enter AgentID/Email Address

			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("2171");

			// enter Password

			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("9812567342");

			// click on Login button

			WebElement login_btn = driver.findElement(By.xpath("//button[contains(@class,'MuiButtonBase-root')]"));

			login_btn.click();

			//Thread.sleep(5000);

			try {

				if (driver.findElement(By.xpath("//span[text()='Yes']")).isDisplayed() == true) {

					// click on Yes button if application is opened in other system

					driver.findElement(By.xpath("//span[text()='Yes']")).click();

					System.out.println("Agent is already login. Do you want to create new session?");

				} else {

					WebElement e = driver.findElement(By.xpath("//p[text()='Please pick the Web RTC call!']"));

					String actual_text = e.getText();

					System.out.println(actual_text);

					String expected_text = "Please pick the Web RTC call!";

					Assert.assertEquals(actual_text, expected_text);

					System.out.println("login is successful");

				}

			} catch (Exception e) {

				System.out.println(e);

			}

			// handling resume

			try {

				if (driver.findElement(By.xpath("//span[text()='Resume']")).isDisplayed() == true) {

					driver.findElement(By.xpath("//span[text()='Resume']")).click();

					System.out.println("reume button is present");

				}

			} catch (Exception e) {

			}

			// preview code

			WebElement preview_chkbox = driver.findElement(By.xpath("//input[@type='checkbox']/../parent::span"));

			String class_value = preview_chkbox.getAttribute("class");

			System.out.println(class_value);

			System.out.println("length of the string is :" + class_value.length());

			//Thread.sleep(3000);

			if (class_value.contains("Mui-checked")) {

				System.out.println("pass");

				driver.findElement(By.xpath("//input[@type='checkbox']")).click();

			}

			// click on c-z icon on top left corner

			WebElement c_z_icon = driver.findElement(By.xpath(

					"//button[@class='MuiButtonBase-root MuiIconButton-root jss142 jss143 MuiIconButton-colorInherit']"));

			c_z_icon.click();

			// click on call panel

			Thread.sleep(1000);

			driver.findElement(By.xpath("//span[text()='Call Panel']")).click();

			Thread.sleep(1000);

			c_z_icon.click();

			// click on Dail button

			WebElement dail_btn = driver.findElement(By.xpath("(//div[@class='col-6']//button)[1]"));

			dail_btn.click();

			// send number to keypad search box

			WebElement search_keypad = driver.findElement(By.xpath("//input[@id='outlined-basic']"));

			Thread.sleep(2000);

			search_keypad.sendKeys("8328536848");

			// click on dail button

			WebElement dail_keypad_btn = driver.findElement(By.xpath("//li[@class='position digits pad-action']/p"));

			Thread.sleep(2000);

			dail_keypad_btn.click();

			Thread.sleep(15000);

			// click on Add Customer

			WebElement addCustomer_btn = driver.findElement(

					By.xpath("(//input[@value='Mute']/following::iframe/following::div/descendant::button)[1]"));

			addCustomer_btn.click();

			// click on select list drop down

			WebElement select_list_dd = driver.findElement(By.xpath("//div[@id='demo-simple-select-outlined']"));

			select_list_dd.click();

			// click on option from select list dropdown

			WebElement ddvalue_Test_CZ_INBOUND = driver

					.findElement(By.xpath("//ul[@role='listbox']/li[text()='Test_CZ_INBOUND']"));

			ddvalue_Test_CZ_INBOUND.click();

			// click on Add Customer button in dropdown

			WebElement addCustomer_btn_dd = driver.findElement(By.xpath("//span[text()='Add Customer']"));

			addCustomer_btn_dd.click();

			//Thread.sleep(5000);

			WebElement comment_txtbox = driver.findElement(By.xpath("//textarea[@id='outlined-textarea']"));

			comment_txtbox.sendKeys("The customer is busy");

			//Thread.sleep(5000);

			// click on END CALL button

			WebElement endCall_btn = driver.findElement(By.xpath("//*[local-name()='svg' and @class='MuiSvgIcon-root MuiSvgIcon-colorSecondary']"));

			endCall_btn.click();


			//Thread.sleep(3000);


			//Thread.sleep(3000);

			try {

				WebElement icon = driver.findElement(By.xpath("//*[local-name()='svg' and @style='color: rgb(12, 130, 218);']"));

				icon.click();

				Thread.sleep(3000);

			} catch (Exception e)

			{

				WebElement icon = driver.findElement(By.xpath("//*[local-name()='svg' and @style='color: rgb(12, 130, 218);']"));

				JavascriptExecutor j = (JavascriptExecutor) driver;

				j.executeScript("arguments[0].click();", icon);
				
				icon.click();

			}

			Thread.sleep(3000);

			try

			{

				WebElement logout = driver.findElement(By.xpath("//*[local-name()='svg' and @width='20']/.."));

				logout.click();

				Thread.sleep(5000);

				Alert alert = driver.switchTo().alert();
				System.out.println(alert.getText());
				alert.accept();

				System.out.println("try");

			} catch (Exception e)

			{

				Actions a = new Actions(driver);
	
				WebElement logout = driver.findElement(By.xpath("//*[local-name()='svg' and @width='20']/.."));
	
				a.click(logout).build().perform();
	
				//Thread.sleep(5000);


	        
				System.out.println("catch");

			}

			By loginPage = By.xpath("//h1[text()='Welcome, User']");
			WebElement ele = driver.findElement(loginPage);
			String actual = ele.getText();
            System.out.println(actual);
            Assert.assertEquals(actual,"Welcome, User","Test Script fail");

			Thread.sleep(5000);

			System.out.println("closing the driver");

			driver.close();

			System.out.println("done");
			
			
	}


		@Test(enabled = true)
	   public void tearDown()  throws Exception{
		   EdgeOptions options = new EdgeOptions();
			options.addArguments("remote-allow-origin=*");

			options.addArguments("--disable-notifications");

			options.addArguments("--use-fake-ui-for-media-stream");
			WebDriver driver = new EdgeDriver(options);

			driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

			driver.manage().window().maximize();

			driver.manage().deleteAllCookies();

			driver.get("https://newui.c-zentrixcloud.com/czagent");

			// enter AgentID/Email Address

			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("2171");

			// enter Password

			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("9812567342");

			// click on Login button

			WebElement login_btn = driver.findElement(By.xpath("//button[contains(@class,'MuiButtonBase-root')]"));

			login_btn.click();

			Thread.sleep(5000);

			try {

				if (driver.findElement(By.xpath("//span[text()='Yes']")).isDisplayed() == true) {

					// click on Yes button if application is opened in other system

					driver.findElement(By.xpath("//span[text()='Yes']")).click();

					System.out.println("Agent is already login. Do you want to create new session?");

				} else {

					WebElement e = driver.findElement(By.xpath("//p[text()='Please pick the Web RTC call!']"));

					String actual_text = e.getText();

					System.out.println(actual_text);

					String expected_text = "Please pick the Web RTC call!";

					Assert.assertEquals(actual_text, expected_text);

					System.out.println("login is successful");

				}

			} catch (Exception e) {

				System.out.println(e);

			}

			// handling resume

			try {

				if (driver.findElement(By.xpath("//span[text()='Resume']")).isDisplayed() == true) {

					driver.findElement(By.xpath("//span[text()='Resume']")).click();

					System.out.println("reume button is present");

				}

			} catch (Exception e) {

			}

			// preview code

			WebElement preview_chkbox = driver.findElement(By.xpath("//input[@type='checkbox']/../parent::span"));

			String class_value = preview_chkbox.getAttribute("class");

			System.out.println(class_value);

			System.out.println("length of the string is :" + class_value.length());

			Thread.sleep(3000);

			if (class_value.contains("Mui-checked")) {

				System.out.println("pass");

				driver.findElement(By.xpath("//input[@type='checkbox']")).click();

			}

			// click on c-z icon on top left corner

			WebElement c_z_icon = driver.findElement(By.xpath(

					"//button[@class='MuiButtonBase-root MuiIconButton-root jss142 jss143 MuiIconButton-colorInherit']"));

			c_z_icon.click();

			// click on call panel

			Thread.sleep(3000);

			driver.findElement(By.xpath("//span[text()='Call Panel']")).click();

			Thread.sleep(3000);

			c_z_icon.click();

			// click on Dail button

			WebElement dail_btn = driver.findElement(By.xpath("(//div[@class='col-6']//button)[1]"));

			dail_btn.click();

			// send number to keypad search box

			WebElement search_keypad = driver.findElement(By.xpath("//input[@id='outlined-basic']"));

			Thread.sleep(3000);

			search_keypad.sendKeys("7842358565");

			// click on dail button

			WebElement dail_keypad_btn = driver.findElement(By.xpath("//li[@class='position digits pad-action']/p"));

			Thread.sleep(3000);

			dail_keypad_btn.click();
			
			//Dail btn color assertion
			String dailBc = dail_keypad_btn.getCssValue("background-color");
			System.out.println(dailBc);
			String actualColour = Color.fromString(dailBc).asHex();
			System.out.println(actualColour);

			Thread.sleep(20000);

			// click on Add Customer

			WebElement addCustomer_btn = driver.findElement(

					By.xpath("(//input[@value='Mute']/following::iframe/following::div/descendant::button)[1]"));

			addCustomer_btn.click();

			// click on select list drop down

			WebElement select_list_dd = driver.findElement(By.xpath("//div[@id='demo-simple-select-outlined']"));

			select_list_dd.click();

			// click on option from select list dropdown

			WebElement ddvalue_Test_CZ_INBOUND = driver

					.findElement(By.xpath("//ul[@role='listbox']/li[text()='Test_CZ_INBOUND']"));

			ddvalue_Test_CZ_INBOUND.click();

			// click on Add Customer button in dropdown

			WebElement addCustomer_btn_dd = driver.findElement(By.xpath("//span[text()='Add Customer']"));

			addCustomer_btn_dd.click();

			Thread.sleep(5000);

			WebElement comment_txtbox = driver.findElement(By.xpath("//textarea[@id='outlined-textarea']"));

			comment_txtbox.sendKeys("The customer is busy");

			Thread.sleep(5000);
            //Discounnected callS
			WebElement disL = driver.findElement(By.xpath("(//*[local-name()='svg' and @class='MuiSvgIcon-root MuiSvgIcon-colorSecondary'])[1]"));
			disL.click();
			//	//Disconnect btn color assertion
			String backgroundC = disL.getCssValue("background-color");
			System.out.println(backgroundC);
			String asHexColor = Color.fromString(backgroundC).asHex();
			System.out.println(asHexColor);
			Assert.assertEquals(asHexColor, "#000000","Test case pass");
			Thread.sleep(5000);
			// click on END CALL button

			WebElement endCall_btn = driver.findElement(By.xpath("//*[local-name()='svg' and @class='MuiSvgIcon-root MuiSvgIcon-colorSecondary']"));

			endCall_btn.click();
			 
			//End btn color assertion
			String EndBtnbackgroundC = endCall_btn.getCssValue("background-color");
			System.out.println(EndBtnbackgroundC);
			String EndasHexColor = Color.fromString(backgroundC).asHex();
			System.out.println(EndasHexColor);
			Assert.assertEquals(EndasHexColor, "#000000","Test case pass");

			Thread.sleep(3000);


			Thread.sleep(3000);

			try {

				WebElement icon = driver.findElement(By.xpath("//*[local-name()='svg' and @style='color: rgb(12, 130, 218);']"));

				icon.click();

				Thread.sleep(3000);

			} catch (Exception e)

			{

				WebElement icon = driver.findElement(By.xpath("//*[local-name()='svg' and @style='color: rgb(12, 130, 218);']"));

				JavascriptExecutor j = (JavascriptExecutor) driver;

				j.executeScript("arguments[0].click();", icon);
				
				icon.click();

			}

			Thread.sleep(3000);

			try

			{

				WebElement logout = driver.findElement(By.xpath("//*[local-name()='svg' and @width='20']/.."));

				logout.click();

				Thread.sleep(5000);

				Alert alert = driver.switchTo().alert();
				System.out.println(alert.getText());
				alert.accept();

				System.out.println("try");

			} catch (Exception e)

			{

				Actions a = new Actions(driver);
	
				WebElement logout = driver.findElement(By.xpath("//*[local-name()='svg' and @width='20']/.."));
	
				a.click(logout).build().perform();
	
				Thread.sleep(5000);


	        
				System.out.println("catch");

			}

			By loginPage = By.xpath("//h1[text()='Welcome, User']");
			WebElement ele = driver.findElement(loginPage);
			String actual = ele.getText();
           System.out.println(actual);
           Assert.assertEquals(actual,"Welcome, User","Test Script fail");

			Thread.sleep(5000);

			System.out.println("closing the driver");

			driver.close();

			System.out.println("done");
	   }
}
