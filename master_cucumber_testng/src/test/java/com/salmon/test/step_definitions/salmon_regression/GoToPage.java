package com.salmon.test.step_definitions.salmon_regression;

import static org.testng.AssertJUnit.assertTrue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.salmon.test.framework.PageObject;
import com.salmon.test.framework.helpers.LoadProperties;
import com.salmon.test.framework.helpers.UrlBuilder;
import com.salmon.test.framework.helpers.WebDriverHelper;

import cucumber.api.java.en.Given;

public class GoToPage {
	
	private static final Logger LOG = LoggerFactory.getLogger(ArriveAtPage.class);
	@Given("^I navigate to the Salmon \"(.*?)\" page$")
	public void i_navigate_to_the_Salmon_page(String pageName) throws Throwable {
	    // Navigating to relevant page depending on the arg1 parameter.
		UrlBuilder.loadURLProps();
		String UpperPageName=pageName.toUpperCase();
		if(LoadProperties.getURLProps().containsKey(UpperPageName)){	
			UrlBuilder.startAtPage(UpperPageName);
		}else{
			LOG.error("Invalid page name");
			assertTrue(false);
		}
		/*if (pageName.equalsIgnoreCase("Home")){
            UrlBuilder.startAtHomePage();
        }else if(pageName.equalsIgnoreCase("Industries")){
        	UrlBuilder.startAtPage(pageName);
		}else if(pageName.equalsIgnoreCase("Events")){
			UrlBuilder.startAtPage(pageName);
		}else if(pageName.equalsIgnoreCase("AboutUs")){
			UrlBuilder.startAtPage(pageName);
		}else{
        	LOG.error("invalid page name");
        }*/
	}
	@Given("^I navigate back to the Salmon \"(.*?)\" page$")
	public void i_navigate_back_to_the_Salmon_page(String pageName) throws Throwable {
	    // Navigating to relevant page depending on the arg1 parameter.
		UrlBuilder.loadURLProps();
		String UpperPageName=pageName.toUpperCase();
		if(LoadProperties.getURLProps().containsKey(UpperPageName)){	
			UrlBuilder.startAtPage(UpperPageName);
		}else{
			LOG.error("Invalid page name");
			assertTrue(false);
		}
	}
}
