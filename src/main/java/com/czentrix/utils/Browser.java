package com.czentrix.utils;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Browser {
	
	public static WebDriver driver;
	public static ChromeOptions chromeopt;
	public static EdgeOptions edgeopt;
	public static FirefoxOptions fireOpt;

	public static WebDriver lanchBrowser(String browsername) {

		if (browsername.contains("chrome")) {
			chromeopt = new ChromeOptions();
			chromeopt.addArguments("--remote-allow-origins=*");
			chromeopt.addArguments("--disable-notifications");
			chromeopt.addArguments("--use-fake-ui-for-media-stream");
			driver = new ChromeDriver(chromeopt);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		}

		else if (browsername.contains("edge")) {
			edgeopt = new EdgeOptions();
			edgeopt.addArguments("--remote-allow-origins=*");
			edgeopt.addArguments("--disable-notifications");
			edgeopt.addArguments("--use-fake-ui-for-media-stream");
			driver = new EdgeDriver(edgeopt);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}

		else if (browsername.contains("firefox")) {
			fireOpt = new FirefoxOptions();
			fireOpt.addArguments("--remote-allow-origins=*");
			fireOpt.addArguments("--disable-notifications");
			fireOpt.addArguments("--use-fake-ui-for-media-stream");
			driver = new FirefoxDriver(fireOpt);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}

		return driver;

	}

	public static void openUrl(String url) {
		driver.get(url);
	}

	public static void closeBrowser() {
		driver.close();
	}

	public static void tackScreenShot(String imegename) throws Exception, Exception {
		TakesScreenshot ts = (TakesScreenshot) driver;
		FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE), new File(".//screnshot//" + imegename + ".png"));
	}
}
