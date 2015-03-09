package com.salmon.test.page_objects;

import org.openqa.selenium.By;

import com.salmon.test.framework.PageObject;

public class S_TopMenu extends PageObject{
	 private By HOME = By.xpath(".//*[@id='nav']/ul/li[1]/a");
	 private By SOLUTIONS = By.xpath(".//*[@id='nav']/ul/li[2]/a");
	 private By SERVICES = By.xpath(".//*[@id='nav']/ul/li[3]/a");
	 private By INDUSTRIES = By.xpath(".//*[@id='nav']/ul/li[4]/a");
	 private By OURWORK = By.xpath(".//*[@id='nav']/ul/li[5]/a");
	 private By RESOURCES = By.xpath(".//*[@id='nav']/ul/li[6]/a");
	 private By ABOUTUS = By.xpath(".//*[@id='nav']/ul/li[7]/a");
	 
	    public void clickhomeLink() {
	        waitForExpectedElement(HOME).click();
	    }

	    public void clicksolutionsLink() {
	        waitForExpectedElement(SOLUTIONS).click();
	    }
	    
	    public void clickservicesLink() {
	        waitForExpectedElement(SERVICES).click();
	    }
	    public void clickindustriesLink() {
	        waitForExpectedElement(INDUSTRIES).click();
	    }
	    public void clickourworkLink() {
	        waitForExpectedElement(OURWORK).click();
	    }
	    public void clickresourcesLink() {
	        waitForExpectedElement(RESOURCES).click();
	    }
	    public void clickaboutusLink() {
	        waitForExpectedElement(ABOUTUS).click();
	    }
	

}