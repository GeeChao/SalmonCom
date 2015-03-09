package com.salmon.test.step_definitions.salmon_regression;

import static org.testng.AssertJUnit.assertTrue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.salmon.test.framework.helpers.UrlBuilder;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import com.salmon.test.page_objects.S_GlobalHeader;
import com.salmon.test.page_objects.S_HomePage;

public class HomePageActions {
	private S_HomePage homepage;
    public HomePageActions(S_HomePage globalHeader){
        this.homepage = globalHeader;
    }
	private static final Logger LOG = LoggerFactory.getLogger(HomePageActions.class);

	@And("^I click \"(.*?)\" on HomePage$")
	public void i_click_on_HomePage(String elementName) throws Throwable {
		if(elementName.equalsIgnoreCase("Why Salmon")){
			homepage.clickWhySalmonImg();//  .//*[@id='section']//img[@alt='Why Salmon?']
		}
		else if(elementName.equalsIgnoreCase("How We Help")){
			homepage.clickHowWeHelpImg(); // .//*[@id='section']//img[@alt='How We Help']
		}
		else if(elementName.equalsIgnoreCase("What We Do")){
			homepage.clickWhatWeDoImg(); // .//*[@id='section']//img[@alt='What We Do']
		}
		else{
			LOG.error("invalid element name");
		}
	   
	}

	
	
}
