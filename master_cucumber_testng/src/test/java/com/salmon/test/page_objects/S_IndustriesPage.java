package com.salmon.test.page_objects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.salmon.test.framework.PageObject;
import com.salmon.test.framework.helpers.WebDriverHelper;

public class S_IndustriesPage extends PageObject{
	   private By Home = By.xpath(".//*[@id='main']/div[1]/nav/ul/li[1]/a");
	   private By RetailButton = By.xpath(".//*[@id='section']/div/div[1]/article/div[3]/div[2]/a");
	   private By GroceryButton = By.xpath(".//*[@id='section']/div/div[2]/article/div[3]/div[2]/a");
	   private By LuxuryButton = By.xpath(".//*[@id='section']/div/div[3]/article/div[3]/div[2]/a");
	   private By BusinessButton = By.xpath(".//*[@id='section']/div/div[4]/article/div[3]/div[2]/a");
	   private By ConsumerButton = By.xpath(".//*[@id='section']/div/div[5]/article/div[3]/div[2]/a");
	   private By RetailImage = By.xpath(".//*[@id='section']/div/div[1]/article/div[1]/a/img");
	   private By GroceryImage = By.xpath(".//*[@id='section']/div/div[2]/article/div[1]/a/img");
	   private By LuxuryImage = By.xpath(".//*[@id='section']/div/div[3]/article/div[1]/a/img");
	   private By BusinessImage = By.xpath(".//*[@id='section']/div/div[4]/article/div[1]/a/img");
	   private By ConsumerImage = By.xpath(".//*[@id='section']/div/div[5]/article/div[1]/a/img");	   
	   private By FirstContentLink= By.xpath(".//*[@id='page-content']/div[2]/div[2]/div/div[1]/article/div[3]/div/strong/a");
	   private By VisitTheResourceHubLink=By.xpath(".//*[@id='page-content']/div[2]/div[1]/div/a");
	   public boolean isBreadcrumbPresent() {
	    	WebElement wb=webDriver.findElement(Home);
	    	if(wb.getText().contains("Home")&&wb.getText().contains("About Us")){
	    		return true;
	    	}else{
	    		return false;
	    	}
	    }	
	    public void clickHomeBreadcrumb() {
	    	waitForExpectedElement(Home).click();
	    }	
	    
	    public void clickFirstContentLink() {	
	    	if (WebDriverHelper.BROWSER.equalsIgnoreCase("chrome")) {
	    		WebElement wb=webDriver.findElement(FirstContentLink);
	        	scrollDownTo(wb);
            }
	    	waitForExpectedElement(FirstContentLink).click();
	    }
	    public void clickVisitTheResourceHubLink() {	
	    	if (WebDriverHelper.BROWSER.equalsIgnoreCase("chrome")) {
	    		WebElement wb=webDriver.findElement(VisitTheResourceHubLink);
	        	scrollDownTo(wb);
            }
	    	waitForExpectedElement( VisitTheResourceHubLink).click();
	    }
	    public void clickRetailImage() {	
	    	if (WebDriverHelper.BROWSER.equalsIgnoreCase("chrome")) {
	    		WebElement wb=webDriver.findElement(RetailImage);
	        	scrollDownTo(wb);
            }
	    	waitForExpectedElement(RetailImage).click();
	    }
	    public void clickRetailButton() {	
	    	if (WebDriverHelper.BROWSER.equalsIgnoreCase("chrome")) {
	    		WebElement wb=webDriver.findElement(RetailImage);
	        	scrollDownTo(wb);
            }
	    	waitForExpectedElement(RetailButton).click();
	    }
	    public void clickGroceryButton() {	
	    	if (WebDriverHelper.BROWSER.equalsIgnoreCase("chrome")) {
	    		WebElement wb=webDriver.findElement(GroceryImage);
	        	scrollDownTo(wb);
            }
	    	waitForExpectedElement(GroceryButton).click();
	    }
	    public void clickGroceryImage() {	
	    	if (WebDriverHelper.BROWSER.equalsIgnoreCase("chrome")) {
	    		WebElement wb=webDriver.findElement(GroceryImage);
	        	scrollDownTo(wb);
            }
	    	waitForExpectedElement(GroceryImage).click();
	    }
	    public void clickLuxuryButton() {	
	    	if (WebDriverHelper.BROWSER.equalsIgnoreCase("chrome")) {
	    		WebElement wb=webDriver.findElement(LuxuryImage);
	        	scrollDownTo(wb);
            }
	    	waitForExpectedElement(LuxuryButton).click();
	    }
	    public void clickLuxuryImage() {	
	    	if (WebDriverHelper.BROWSER.equalsIgnoreCase("chrome")) {
	    		WebElement wb=webDriver.findElement(LuxuryImage);
	        	scrollDownTo(wb);
            }
	    	waitForExpectedElement(LuxuryImage).click();
	    }
	    public void clickBusinessButton() {	
	    	if (WebDriverHelper.BROWSER.equalsIgnoreCase("chrome")) {
	    		WebElement wb=webDriver.findElement(BusinessImage);
	        	scrollDownTo(wb);
            }
	    	waitForExpectedElement(BusinessButton).click();
	    }
	    public void clickBusinessImage() {	
	    	if (WebDriverHelper.BROWSER.equalsIgnoreCase("chrome")) {
	    		WebElement wb=webDriver.findElement(BusinessImage);
	        	scrollDownTo(wb);
            }
	    	waitForExpectedElement(BusinessImage).click();
	    }
	    public void clickConsumerButton() {	
	    	if (WebDriverHelper.BROWSER.equalsIgnoreCase("chrome")) {
	    		WebElement wb=webDriver.findElement(ConsumerImage);
	        	scrollDownTo(wb);
            }
	    	waitForExpectedElement(ConsumerButton).click();
	    }
	    public void clickConsumerImage() {	
	    	if (WebDriverHelper.BROWSER.equalsIgnoreCase("chrome")) {
	    		WebElement wb=webDriver.findElement(ConsumerImage);
	        	scrollDownTo(wb);
            }
	    	waitForExpectedElement(ConsumerImage).click();
	    }

}


