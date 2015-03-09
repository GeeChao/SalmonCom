package com.salmon.test.step_definitions.salmon_regression;
import static org.testng.AssertJUnit.assertTrue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.salmon.test.page_objects.S_AboutUsPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class AboutUsPageActions {
	private S_AboutUsPage page;
    public AboutUsPageActions(S_AboutUsPage page){
        this.page = page;
    }
	private static final Logger LOG = LoggerFactory.getLogger(HomePageContent.class);

	@Then("^\"(.*?)\" breadcrumb is present on AboutUs Page$")
	public void breadcrumb_is_present_on_Industries_Page(String arg1) throws Throwable {
		if(arg1.equalsIgnoreCase("Home > AboutUs")){
	    	assertTrue(page.isBreadcrumbPresent());
	    }else{
	    	LOG.error("Ivalid landing page name");
	    	assertTrue(false);
	    }

	}
	@Then("^I click \"(.*?)\" link on AboutUs Page$")
	public void i_click_link_on_AboutUs_Page(String arg1) throws Throwable {
		if(arg1.equalsIgnoreCase("Home")){
	    	page.clickHomeBreadcrumb();
	    }else{
	    	LOG.error("Ivalid link name on AboutUs Page");
	    	assertTrue(false);
	    }
	}
	@And("^I click \"(.*?)\" subcategory on AboutUs Page$")
	public void i_click_subcategory_on_AboutUs_Page(String arg1) throws Throwable {
		switch (arg1.toLowerCase()){
		case "people":
			page.clickPeopleButton();
			break;
		case "awards":
			page.clickAwardsButton();
			break;
		case "partners":
			page.clickPartnersButton();		
			break;
		default:
			LOG.error("Ivalid link name on AboutUs Page");
	    	assertTrue(false);
		}
	}
	
}
