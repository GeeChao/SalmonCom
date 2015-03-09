package com.salmon.test.page_objects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.salmon.test.framework.PageObject;
import com.salmon.test.framework.helpers.WebDriverHelper;

public class S_AboutUsPage extends PageObject{
	   private By PeopleBlock = By.xpath(".//*[@id='page-content']/section/div/div[1]/a[2]");
	   private By AwardsBlock = By.xpath(".//*[@id='page-content']/section/div/div[2]/a[2]");
	   private By PartnersBlock = By.xpath(".//*[@id='page-content']/section/div/div[3]/a[2]");
	   private By PeopleButton = By.xpath(".//*[@id='page-content']/section/div/div[1]/a[2]/div/button");
	   private By AwardsButton = By.xpath(".//*[@id='page-content']/section/div/div[2]/a[2]/div/button");
	   private By PartnersButton = By.xpath(".//*[@id='page-content']/section/div/div[3]/a[2]/div/button");
	   private By Home = By.xpath(".//*[@id='main']/div[1]/nav/ul/li[1]/a");
	    public boolean isBreadcrumbPresent() {
	    	WebElement wb=super.webDriver.findElement(By.xpath(".//*[@id='main']/div[1]/nav/ul"));
	    	if(wb.getText().contains("Home")&&wb.getText().contains("About Us")){
	    		return true;
	    	}else{
	    		return false;
	    	}
	    }	
	    public void clickHomeBreadcrumb() {
	    	waitForExpectedElement(Home).click();
	    }	
	    public void clickAwardsButton() {	
	    	if (WebDriverHelper.BROWSER.equalsIgnoreCase("chrome")) {
	    		WebElement wb=webDriver.findElement(AwardsButton);
	        	scrollDownTo(wb);
            }
	    	mouseOver(webDriver.findElement(AwardsBlock));
	    	waitForExpectedElement(AwardsButton).click();
	    }
	    public void clickPartnersButton() {	
	    	if (WebDriverHelper.BROWSER.equalsIgnoreCase("chrome")) {
	    		WebElement wb=webDriver.findElement(PartnersBlock);
	        	scrollDownTo(wb);
            }
	    	mouseOver(webDriver.findElement(PartnersBlock));
	    	waitForExpectedElement(PartnersButton).click();
	    }
	    public void clickPeopleButton() {	
	    	if (WebDriverHelper.BROWSER.equalsIgnoreCase("chrome")) {
	    		WebElement wb=webDriver.findElement(PeopleBlock);
	        	scrollDownTo(wb);
            }
	    	mouseOver(webDriver.findElement(PeopleBlock));
	    	waitForExpectedElement(PeopleButton).click();
	    }
}


