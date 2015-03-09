package com.salmon.test.page_objects;

import org.openqa.selenium.By;

import com.salmon.test.framework.PageObject;

public class S_GlobalHeader extends PageObject{
	 private By Events = By.xpath(".//*[@id='header']/div/div[2]/div[1]/nav/ul/li[3]/a");
	 private By Careers = By.xpath(".//*[@id='header']/div/div[2]/div[1]/nav/ul/li[2]/a");
	 private By ContactUs = By.xpath(".//*[@id='header']/div/div[2]/div[1]/nav/ul/li[4]/a");
	 
	    public void clickeventsLink() {
	        waitForExpectedElement(Events).click();
	    }

	    public void clickcareersLink() {
	        waitForExpectedElement(Careers).click();
	    }
	    
	    public void clickcontactusLink() {
	        waitForExpectedElement(ContactUs).click();
	    }
	

}
