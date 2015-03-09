package com.salmon.test.step_definitions.salmon_regression;

import static org.testng.AssertJUnit.assertTrue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.salmon.test.page_objects.S_TopMenu;


import cucumber.api.java.en.Given;

public class TopMenuActions {
	private S_TopMenu topmenu;
    public TopMenuActions(S_TopMenu topmenu){
        this.topmenu = topmenu;
    }
	private static final Logger LOG = LoggerFactory.getLogger(ArriveAtPage.class);
	@Given("^I click \"(.*?)\" on the Top Menu$")
	public void i_click_on_the_header(String linkName) throws Throwable {
		if (linkName.equalsIgnoreCase("HOME")){
			topmenu.clickhomeLink();
        }else if (linkName.equalsIgnoreCase("SOLUTIONS")){
			topmenu.clicksolutionsLink();
        }else if (linkName.equalsIgnoreCase("SERVICES")){
			topmenu.clickservicesLink();
        }else if (linkName.equalsIgnoreCase("INDUSTRIES")){
			topmenu.clickindustriesLink();
        }else if (linkName.equalsIgnoreCase("OURWORK")){
			topmenu.clickourworkLink();
        }else if (linkName.equalsIgnoreCase("RESOURCES")){
			topmenu.clickresourcesLink();
        }else if (linkName.equalsIgnoreCase("ABOUTUS")){
			topmenu.clickaboutusLink();
        }else{
        	LOG.error("Invalid topmenu name");
        	assertTrue(false);
        }
		
	}
}