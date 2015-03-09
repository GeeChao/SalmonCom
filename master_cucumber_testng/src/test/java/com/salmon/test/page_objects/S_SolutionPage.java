package com.salmon.test.page_objects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.salmon.test.framework.PageObject;
import com.salmon.test.framework.helpers.WebDriverHelper;

public class S_SolutionPage extends PageObject{
	   private By MultichannelButton = By.xpath(".//*[@id='section']/div/div/div/article[1]/div/div[2]/div/div/a");
	   private By PlatformButton = By.xpath(".//*[@id='section']/div/div/div/article[2]/div/div[2]/div/div/a");
	   private By GlobalCommerceButton = By.xpath(".//*[@id='section']/div/div/div/article[3]/div/div[2]/div/div/a");
	   private By MultichannelImage = By.xpath(".//*[@id='section']/div/div/div/article[1]/div/a");
	   private By PlatformImage = By.xpath(".//*[@id='section']/div/div/div/article[2]/div/a");
	   private By GlobalCommerceImage = By.xpath(".//*[@id='section']/div/div/div/article[3]/div/a");  
	   private By Home = By.xpath(".//*[@id='main']/div[1]/nav/ul/li[1]/a");
	    public boolean isBreadcrumbPresent() {
	    	WebElement wb=webDriver.findElement(Home);
	    	if(wb.getText().contains("Home")&&wb.getText().contains("Solutions")){
	    		return true;
	    	}else{
	    		return false;
	    	}
	    }	
	    public void clickHomeBreadcrumb() {
	    	waitForExpectedElement(Home).click();
	    }	
	    public void clickMultichannelButton() {	
	    	if (WebDriverHelper.BROWSER.equalsIgnoreCase("chrome")) {
	    		WebElement wb=webDriver.findElement(MultichannelImage);
	        	scrollDownTo(wb);
            }
	    	waitForExpectedElement(MultichannelButton).click();
	    }
	    public void clickMultichannelImage() {	
	    	if (WebDriverHelper.BROWSER.equalsIgnoreCase("chrome")) {
	    		WebElement wb=webDriver.findElement(MultichannelImage);
	        	scrollDownTo(wb);
            }
	    	waitForExpectedElement(MultichannelImage).click();
	    }
	    public void clickPlatformButton() {	
	    	if (WebDriverHelper.BROWSER.equalsIgnoreCase("chrome")) {
	    		WebElement wb=webDriver.findElement(PlatformImage);
	        	scrollDownTo(wb);
            }
	    	waitForExpectedElement(PlatformButton).click();
	    }
	    public void clickPlatformImage() {	
	    	if (WebDriverHelper.BROWSER.equalsIgnoreCase("chrome")) {
	    		WebElement wb=webDriver.findElement(PlatformImage);
	        	scrollDownTo(wb);
            }
	    	waitForExpectedElement(PlatformImage).click();
	    }
	    public void clickGlobalCommerceButton() {	
	    	if (WebDriverHelper.BROWSER.equalsIgnoreCase("chrome")) {
	    		WebElement wb=webDriver.findElement(GlobalCommerceImage);
	        	scrollDownTo(wb);
            }
	    	waitForExpectedElement(GlobalCommerceButton).click();
	    }
	    public void clickGlobalCommerceImage() {	
	    	if (WebDriverHelper.BROWSER.equalsIgnoreCase("chrome")) {
	    		WebElement wb=webDriver.findElement(GlobalCommerceImage);
	        	scrollDownTo(wb);
            }
	    	waitForExpectedElement(GlobalCommerceImage).click();
	    }
	   
	  
	 

}


