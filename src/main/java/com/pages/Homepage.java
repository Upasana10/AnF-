package com.pages;

import org.openqa.selenium.WebDriver;

import com.utility.WebElements;

public class Homepage  extends WebElements{
public	WebDriver driver;
public Homepage(WebDriver driver) {
	super(driver);
	this.driver=driver;
}
}
