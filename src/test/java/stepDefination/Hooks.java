package stepDefination;

import org.openqa.selenium.WebDriver;


import com.czentrix.utils.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	
	 WebDriver driver;
	@Before
	public void setup() {
		driver = Browser.lanchBrowser("edge");
	}
	@After
	public void tearDown() {
		
	}
}
