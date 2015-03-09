package com.salmon.test.step_definitions.salmon_regression;
import static org.testng.AssertJUnit.assertTrue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.salmon.test.page_objects.S_IndustriesPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class IndustriesPageActions {
	private S_IndustriesPage page;
    public IndustriesPageActions(S_IndustriesPage page){
        this.page = page;
    }
	private static final Logger LOG = LoggerFactory.getLogger(HomePageContent.class);

	@Then("^\"(.*?)\" breadcrumb is present on Industries Page$")
	public void breadcrumb_is_present_on_Industries_Page(String arg1) throws Throwable {
		if(arg1.equalsIgnoreCase("Home > Industries")){
	    	assertTrue(page.isBreadcrumbPresent());
	    }else{
	    	LOG.error("Ivalid breadcrumb");
	    	assertTrue(false);
	    }

	}
	@Then("^I click \"(.*?)\" link on Industries Page$")
	public void i_click_link_on_Industries_Page(String arg1) throws Throwable {
		if(arg1.equalsIgnoreCase("Home")){
	    	page.clickHomeBreadcrumb();
	    }else{
	    	
	    }
		switch(arg1.toLowerCase()){
		case "home":
			page.clickHomeBreadcrumb();
		case "visit the resource hub":
			page.clickVisitTheResourceHubLink();
		default:
			LOG.error("Ivalid link name on AboutUs Page");
	    	assertTrue(false);	
		}
	}

	@Given("^I click the first content on Industries Page$")
	public void i_click_the_first_content_on_Industries_Page() throws Throwable {
	    page.clickFirstContentLink();
	}
	@And("^I click \"(.*?)\" subcategory on Industries Page$")
	public void i_click_subcategory_on_Industries_Page(String arg1) throws Throwable {
		switch (arg1.toLowerCase()){
		case "retail":
			page.clickRetailButton();
			break;
		case "grocery":
			page.clickGroceryButton();
			break;
		case "luxury":
			page.clickLuxuryButton();		
			break;
		case "b2b":
			page.clickBusinessButton();	
			break;
		case "consumer":
			page.clickConsumerButton();	
			break;
		default:
			LOG.error("Ivalid link name on Industries Page");
	    	assertTrue(false);
		}
	}
	@And("^I click \"(.*?)\" subcategory image on Industries Page$")
	public void i_click_subcategory_image_on_Industries_Page(String arg1) throws Throwable {
		switch (arg1.toLowerCase()){
		case "retail":
			page.clickRetailImage();
			break;
		case "grocery":
			page.clickGroceryImage();
			break;
		case "luxury":
			page.clickLuxuryImage();	
			break;
		case "b2b":
			page.clickBusinessImage();
			break;
		case "consumer":
			page.clickConsumerImage();
			break;
		default:
			LOG.error("Ivalid image name on Industries Page");
	    	assertTrue(false);
		}
	}
}
