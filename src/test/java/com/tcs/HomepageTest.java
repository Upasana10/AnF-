package com.tcs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.utility.TestBase;

public class HomepageTest  extends TestBase{
	@Test
public void test() {
	launchBrowser(sBrowser);
	enterUrl(s_url);
	
	
}
}
