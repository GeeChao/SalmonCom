package com.salmon.test.step_definitions.salmon_regression;
import static org.testng.AssertJUnit.assertTrue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.salmon.test.page_objects.S_ServicesPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class ServicesPage {
	private S_ServicesPage page;
    public ServicesPage(S_ServicesPage page){
        this.page = page;
    }
	private static final Logger LOG = LoggerFactory.getLogger(HomePageActions.class);

	@Then("^\"(.*?)\" breadcrumb is present on Services Page$")
	public void breadcrumb_is_present_on_Services_Page(String arg1) throws Throwable {
		if(arg1.equalsIgnoreCase("Home > Services")){
	    	assertTrue(page.isBreadcrumbPresent());
	    }else{
	    	LOG.error("Ivalid breadcrumb name");
	    	assertTrue(false);
	    }

	}
	@Then("^I click \"(.*?)\" link on Services Page$")
	public void i_click_link_on_Services_Page(String arg1) throws Throwable {
		if(arg1.equalsIgnoreCase("Home")){
	    	page.clickHomeBreadcrumb();
	    }else{
	    	LOG.error("Ivalid link name on Services Page");
	    	assertTrue(false);
	    }
	}
	@And("^I click \"(.*?)\" subcategory on Services Page$")
	public void i_click_subcategory_on_Services_Page(String arg1) throws Throwable {
		switch (arg1.toLowerCase()){
		case "strategy":
			page.clickStrategyButton();
			break;
		case "design":
			page.clickDesignButton();
			break;
		case "delivery":
			page.clickDeliveryButton();		
			break;
		case "operations":
			page.clickOperationsButton();
			break;
		case "optimisation":
			page.clickOptimisationButton();
			break;
		default:
			LOG.error("Ivalid subcategory name on Services Page");
	    	assertTrue(false);
		}
	}
	@And("^I click \"(.*?)\" subcategory image on Services Page$")
	public void i_click_subcategory_image_on_Services_Page(String arg1) throws Throwable {
		switch (arg1.toLowerCase()){
		case "strategy":
			page.clickStrategyImage();
			break;
		case "design":
			page.clickDesignImage();
			break;
		case "delivery":
			page.clickDeliveryImage();		
			break;
		case "operations":
			page.clickOperationsImage();
			break;
		case "optimisation":
			page.clickOptimisationImage();
			break;
		default:
			LOG.error("Ivalid subcategory name on Services Page");
	    	assertTrue(false);
		}
	}
	
}
