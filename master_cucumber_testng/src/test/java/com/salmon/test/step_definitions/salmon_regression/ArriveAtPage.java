package com.salmon.test.step_definitions.salmon_regression;

import static org.testng.AssertJUnit.assertTrue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.salmon.test.framework.PageObject;
import com.salmon.test.framework.helpers.LoadProperties;

import cucumber.api.java.en.Then;

public class ArriveAtPage {
	private PageObject pageObject;
    public ArriveAtPage(PageObject pageObject){
        this.pageObject = pageObject;
    }
	private static final Logger LOG = LoggerFactory.getLogger(ArriveAtPage.class);
	@Then("^I arrive at \"(.*?)\" page$")
	public void i_arrive_at_page(String landingPage) throws Throwable {
		String UpperlandingPage=landingPage.replace(" ","").toUpperCase();
		if(LoadProperties.getURLProps().containsKey(UpperlandingPage)){	
			String URL=pageObject.getWebDriver().getCurrentUrl();
			assertTrue(URL.equalsIgnoreCase(LoadProperties.getURLProps().getProperty(UpperlandingPage)));	
		}else{
			LOG.error("Invalid landing page name");
			assertTrue(false);
		}
	}
		@Then("^I arrive at \"(.*?)\" resource page$")
		public void i_arrive_at_resource_page(String expectedTitle) throws Throwable {
				String currentTitle=pageObject.getWebDriver().getTitle();				
				assertTrue(currentTitle.contains(expectedTitle));	
		}
		
		@Then("^I arrive at search result page \"(.*?)\"$")
		public void i_arrive_at_search_result_page(String keyWord) throws Throwable {
			String currentTitle=pageObject.getWebDriver().getTitle();			
			assertTrue(currentTitle.contains(keyWord));	
		}		
		
	   /*   
	    * if(landingPage.equalsIgnoreCase("Events")){
	    	assertTrue(pageObject.getWebDriver().getTitle().equalsIgnoreCase(" Events  - Salmon"));
	    }else if(landingPage.equalsIgnoreCase("Home")){
	    	String URL=pageObject.getWebDriver().getCurrentUrl();	
	    	assertTrue(URL.equalsIgnoreCase(LoadProperties.getURLProps().getProperty(landingPage)));
	    }else if(landingPage.equalsIgnoreCase("RedefiningOnlineGrocery")){
	    	String URL=pageObject.getWebDriver().getCurrentUrl();	
	    	assertTrue(URL.equalsIgnoreCase(LoadProperties.getURLProps().getProperty(landingPage)));
	    }else if(landingPage.equalsIgnoreCase("audiUK")){
	    	String URL=pageObject.getWebDriver().getCurrentUrl();	
	    	assertTrue(URL.equalsIgnoreCase(LoadProperties.getURLProps().getProperty(landingPage)));
	    }
	    else if(landingPage.equalsIgnoreCase("AboutUs")){
	    	String URL=pageObject.getWebDriver().getCurrentUrl();	
	    	String str = LoadProperties.getURLProps().getProperty(landingPage);
	    	
	    	assertTrue(URL.equalsIgnoreCase(LoadProperties.getURLProps().getProperty(landingPage)));
	    }
	    else if(landingPage.equalsIgnoreCase("Solutions")){
	    	String URL=pageObject.getWebDriver().getCurrentUrl();	
	    	assertTrue(URL.equalsIgnoreCase(LoadProperties.getURLProps().getProperty(landingPage)));
	    }
	    else if(landingPage.equalsIgnoreCase("Services")){
	    	String URL=pageObject.getWebDriver().getCurrentUrl();	
	    	assertTrue(URL.equalsIgnoreCase(LoadProperties.getURLProps().getProperty(landingPage)));
	    }
	    else{
	    	LOG.error("Ivalid landing page name");
	    }*/

	}

