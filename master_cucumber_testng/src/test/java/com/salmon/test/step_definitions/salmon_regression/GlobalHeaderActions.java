package com.salmon.test.step_definitions.salmon_regression;

import static org.testng.AssertJUnit.assertTrue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.salmon.test.page_objects.S_GlobalHeader;


import cucumber.api.java.en.Given;

public class GlobalHeaderActions {
	private S_GlobalHeader header;
    public GlobalHeaderActions(S_GlobalHeader header){
        this.header = header;
    }
	private static final Logger LOG = LoggerFactory.getLogger(ArriveAtPage.class);
	@Given("^I click \"(.*?)\" on the header$")
	public void i_click_on_the_header(String linkName) throws Throwable {
		if (linkName.equalsIgnoreCase("EVENTS")){
			header.clickeventsLink();
        }else if (linkName.equalsIgnoreCase("CAREERS")){
			header.clickcareersLink();
        }else if (linkName.equalsIgnoreCase("CONTACTUS")){
			header.clickcontactusLink();	
        }else{
        	LOG.error("Invalid link name");
        	assertTrue(false);
        }
		
	}
}