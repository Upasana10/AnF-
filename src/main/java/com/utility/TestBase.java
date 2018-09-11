package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase implements Setup{
	public WebDriver driver;
public void launchBrowser(String sBrowser) {
	if(sBrowser.equalsIgnoreCase("chrome")) {
		System.setProperty(C_key,C_Val);
	driver = new ChromeDriver();
	}
	else if(sBrowser.equalsIgnoreCase("firefox")) {
				System.setProperty(F_key,F_Val);
				 driver = new FirefoxDriver();
	}
	}
public void enterUrl(String sUrl) {
	driver.get(s_url);
}
}



