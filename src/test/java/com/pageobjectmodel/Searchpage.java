package com.pageobjectmodel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Searchpage {
	public WebDriver driver;
	public Searchpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(xpath="//input[@id='twotabsearchtextbox'] ")
	WebElement searchfield;
	public void getSearchField(String s) {
		searchfield.sendKeys(s);}
	
		@FindBy(xpath="//input[@id='nav-search-submit-button'] ")
		WebElement searchIcon;
		public void getsearchIcon() {
			searchIcon.click();
		}
		@FindBy(xpath="//span[contains(text(),'Qa testing')]")
		public WebElement SearchItempage;
		public void getSearchItemPage() {
			SearchItempage.getText();
			
	}}
	
	


