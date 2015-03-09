package com.salmon.test.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.salmon.test.framework.PageObject;
import com.salmon.test.framework.helpers.WebDriverHelper;

public class S_GlobalFooter extends PageObject{
	 private By Careers = By.xpath(".//*[@id='footer']/div/div/div/div/div[4]/nav/ul[1]/li[1]/a");
	 private By Events = By.xpath(".//*[@id='footer']/div/div/div/div/div[4]/nav/ul[1]/li[2]/a");
	 private By ContactUs = By.xpath(".//*[@id='footer']/div/div/div/div/div[4]/nav/ul[1]/li[3]/a");
	 private By TermsOfUse = By.xpath(".//*[@id='footer']/div/div/div/div/div[4]/nav/ul[2]/li[1]/a");
	 private By PrivacyAndCookies = By.xpath(".//*[@id='footer']/div/div/div/div/div[4]/nav/ul[2]/li[2]/a");
	 private By Accessibility = By.xpath(".//*[@id='footer']/div/div/div/div/div[4]/nav/ul[2]/li[3]/a");
	 private By Sitemap = By.xpath(".//*[@id='footer']/div/div/div/div/div[4]/nav/ul[2]/li[4]/a");
	 
	        public void clickcareerLink() {
                if (WebDriverHelper.BROWSER.equalsIgnoreCase("chrome")) {
                	WebElement wb=webDriver.findElement(Careers);
    	        	scrollDownTo(wb);
                }
	        	waitForExpectedElement(Careers).click();
	        }
	        public void clickeventsLink() {
	        	if (WebDriverHelper.BROWSER.equalsIgnoreCase("chrome")) {
                	WebElement wb=webDriver.findElement(Events);
    	        	scrollDownTo(wb);
                }
		        waitForExpectedElement(Events).click();
		    }
            public void clickcontactusLink() {
            	if (WebDriverHelper.BROWSER.equalsIgnoreCase("chrome")) {
                	WebElement wb=webDriver.findElement(ContactUs);
    	        	scrollDownTo(wb);
                }
            	waitForExpectedElement(ContactUs).click();
	    }
            public void clicktermsofuseLink() {
                if (WebDriverHelper.BROWSER.equalsIgnoreCase("chrome")) {
                	WebElement wb=webDriver.findElement(TermsOfUse);
    	        	scrollDownTo(wb);
                }
	        	waitForExpectedElement(TermsOfUse).click();
	        }
            public void clickprivacyandcookiesLink() {
                if (WebDriverHelper.BROWSER.equalsIgnoreCase("chrome")) {
                	WebElement wb=webDriver.findElement(PrivacyAndCookies);
    	        	scrollDownTo(wb);
                }
	        	waitForExpectedElement(PrivacyAndCookies).click();
	        }
            public void clickaccessibilityLink() {
                if (WebDriverHelper.BROWSER.equalsIgnoreCase("chrome")) {
                	WebElement wb=webDriver.findElement(Accessibility);
    	        	scrollDownTo(wb);
                }
	        	waitForExpectedElement(Accessibility).click();
	        }
            public void clicksitemapLink() {
                if (WebDriverHelper.BROWSER.equalsIgnoreCase("chrome")) {
                	WebElement wb=webDriver.findElement(Sitemap);
    	        	scrollDownTo(wb);
                }
	        	waitForExpectedElement(Sitemap).click();
	        }
	  

}
