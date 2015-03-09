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

public class HomePageContent {
	private S_HomePage homepage;
    public HomePageContent(S_HomePage globalHeader){
        this.homepage = globalHeader;
    }
	private static final Logger LOG = LoggerFactory.getLogger(HomePageContent.class);

	@And("^I click \"(.*?)\" on Homepage$")
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
		else if(elementName.equalsIgnoreCase("View Case Studies")){
			homepage.clickViewCaseStudies(); // .//*[@id='section']//img[@alt='What We Do']
		}
		//
		else if(elementName.equalsIgnoreCase("View all News Stories")){
			homepage.clickViewAllNews(); // .//*[@id='page-content']//a[text()='View all News Stories']
		}
		else{
			LOG.error("invalid element name");
		}
	   
	}

	@And("^I mouse over and click case study \"(.*?)\" on Homepage$")
	public void i_mouse_over_and_click_case_study_on_HomePage(String imageName) throws Exception  {
	   
	   	homepage.mouseOverAndClickCaseStudyByName(imageName);   
	}
	@And("^I mouse over and click link \"(.*?)\" on Homepage$")
	public void i_mouse_over_and_click_link_on_HomePage(String linkName) throws Exception  {
	   
	   	homepage.mouseOverAndClickLinkByName(linkName);   
	}

	@And("^I mouse over and click image \"(.*?)\" on Homepage$")
	public void i_mouse_over_and_click_image_on_HomePage(String imageName) throws Exception  {
	
	   	homepage.mouseOverAndClickImageByName(imageName);   
	}
		
    	
	
}
