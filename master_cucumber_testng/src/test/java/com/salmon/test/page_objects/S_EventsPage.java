package com.salmon.test.page_objects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.salmon.test.framework.PageObject;

public class S_EventsPage extends PageObject{
	    public boolean isBreadcrumbPresent() {
	    	WebElement wb=super.webDriver.findElement(By.xpath(".//*[@id='main']/div[1]/nav/ul"));
	    	if(wb.getText().contains("Home")&&wb.getText().contains("Events")){
	    		return true;
	    	}else{
	    		return false;
	    	}
	    }		
}


