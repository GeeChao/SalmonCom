package com.salmon.test.page_objects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.salmon.test.framework.PageObject;
import com.salmon.test.framework.helpers.WebDriverHelper;

public class S_ServicesPage extends PageObject{
	   private By StrategyButton = By.xpath(".//*[@id='section']/div/div/div/article[1]/div/div[2]/div/div/a");
	   private By DesignButton = By.xpath(".//*[@id='section']/div/div/div/article[2]/div/div[2]/div/div/a");
	   private By DeliveryButton = By.xpath(".//*[@id='section']/div/div/div/article[3]/div/div[2]/div/div/a");
	   private By OperationsButton = By.xpath(".//*[@id='section']/div/div/div/article[4]/div/div[2]/div/div/a");
	   private By OptimisationButton = By.xpath(".//*[@id='section']/div/div/div/article[5]/div/div[2]/div/div/a");
	   private By StrategyImage = By.xpath(".//*[@id='section']/div/div/div/article[1]/div/a");
	   private By DesignImage = By.xpath(".//*[@id='section']/div/div/div/article[2]/div/a");
	   private By DeliveryImage = By.xpath(".//*[@id='section']/div/div/div/article[3]/div/a");
	   private By OperationsImage = By.xpath(".//*[@id='section']/div/div/div/article[4]/div/a");
	   private By OptimisationImage = By.xpath(".//*[@id='section']/div/div/div/article[5]/div/a");	   
	   private By Home = By.xpath(".//*[@id='main']/div[1]/nav/ul/li[1]/a");
	    public boolean isBreadcrumbPresent() {
	    	WebElement wb=webDriver.findElement(Home);
	    	if(wb.getText().contains("Home")&&wb.getText().contains("Services")){
	    		return true;
	    	}else{
	    		return false;
	    	}
	    }	
	    public void clickHomeBreadcrumb() {
	    	waitForExpectedElement(Home).click();
	    }	
	    public void clickStrategyButton() {	
	    	if (WebDriverHelper.BROWSER.equalsIgnoreCase("chrome")) {
	    		WebElement wb=webDriver.findElement(StrategyImage);
	        	scrollDownTo(wb);
            }
	    	waitForExpectedElement(StrategyButton).click();
	    }
	    public void clickStrategyImage() {	
	    	if (WebDriverHelper.BROWSER.equalsIgnoreCase("chrome")) {
	    		WebElement wb=webDriver.findElement(StrategyImage);
	        	scrollDownTo(wb);
            }
	    	waitForExpectedElement(StrategyImage).click();
	    }
	    public void clickDesignButton() {	
	    	if (WebDriverHelper.BROWSER.equalsIgnoreCase("chrome")) {
	    		WebElement wb=webDriver.findElement(DesignImage);
	        	scrollDownTo(wb);
            }
	    	waitForExpectedElement(DesignButton).click();
	    }
	    public void clickDesignImage() {	
	    	if (WebDriverHelper.BROWSER.equalsIgnoreCase("chrome")) {
	    		WebElement wb=webDriver.findElement(DesignImage);
	        	scrollDownTo(wb);
            }
	    	waitForExpectedElement(DesignImage).click();
	    }
	    public void clickDeliveryButton() {	
	    	if (WebDriverHelper.BROWSER.equalsIgnoreCase("chrome")) {
	    		WebElement wb=webDriver.findElement(DeliveryImage);
	        	scrollDownTo(wb);
            }
	    	waitForExpectedElement(DeliveryButton).click();
	    }
	    public void clickDeliveryImage() {	
	    	if (WebDriverHelper.BROWSER.equalsIgnoreCase("chrome")) {
	    		WebElement wb=webDriver.findElement(DeliveryImage);
	        	scrollDownTo(wb);
            }
	    	waitForExpectedElement(DeliveryImage).click();
	    }
	    public void clickOperationsButton() {	
	    	if (WebDriverHelper.BROWSER.equalsIgnoreCase("chrome")) {
	    		WebElement wb=webDriver.findElement(OperationsImage);
	        	scrollDownTo(wb);
            }
	    	waitForExpectedElement(OperationsButton).click();
	    }
	    public void clickOperationsImage() {	
	    	if (WebDriverHelper.BROWSER.equalsIgnoreCase("chrome")) {
	    		WebElement wb=webDriver.findElement(OperationsImage);
	        	scrollDownTo(wb);
            }
	    	waitForExpectedElement(OperationsImage).click();
	    }
	    public void clickOptimisationButton() {	
	    	if (WebDriverHelper.BROWSER.equalsIgnoreCase("chrome")) {
	    		WebElement wb=webDriver.findElement(OptimisationImage);
	        	scrollDownTo(wb);
            }
	    	waitForExpectedElement(OptimisationButton).click();
	    }
	    public void clickOptimisationImage() {	
	    	if (WebDriverHelper.BROWSER.equalsIgnoreCase("chrome")) {
	    		WebElement wb=webDriver.findElement(OptimisationImage);
	        	scrollDownTo(wb);
            }
	    	waitForExpectedElement(OptimisationImage).click();
	    }

}


