package com.salmon.test.step_definitions.salmon_regression;
import static org.testng.AssertJUnit.assertTrue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.salmon.test.page_objects.S_ServicesPage;
import com.salmon.test.page_objects.S_SolutionPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class SolutionPage {
	private S_SolutionPage page;
    public SolutionPage(S_SolutionPage page){
        this.page = page;
    }
	private static final Logger LOG = LoggerFactory.getLogger(HomePageActions.class);

	@Then("^\"(.*?)\" breadcrumb is present on solutions Page$")
	public void breadcrumb_is_present_on_Services_Page(String arg1) throws Throwable {
		if(arg1.equalsIgnoreCase("Home > Solution")){
	    	assertTrue(page.isBreadcrumbPresent());
	    }else{
	    	LOG.error("Ivalid breadcrumb name");
	    	assertTrue(false);
	    }

	}
	@Then("^I click \"(.*?)\" link on solutions Page$")
	public void i_click_link_on_Services_Page(String arg1) throws Throwable {
		if(arg1.equalsIgnoreCase("Home")){
	    	page.clickHomeBreadcrumb();
	    }else{
	    	LOG.error("Ivalid link name on solutions Page");
	    	assertTrue(false);
	    }
	}
	@And("^I click \"(.*?)\" subcategory on solutions Page$")
	public void i_click_subcategory_on_Services_Page(String arg1) throws Throwable {
		switch (arg1.toLowerCase()){
		case "multichannel":
			page.clickMultichannelButton();
			break;
		case "platform":
			page.clickPlatformButton();
			break;
		case "globalcommerce":
			page.clickGlobalCommerceButton();	
			break;
		default:
			LOG.error("Ivalid subcategory name on solutions Page");
	    	assertTrue(false);
		}
	}
	@And("^I click \"(.*?)\" subcategory image on solutions Page$")
	public void i_click_subcategory_image_on_Services_Page(String arg1) throws Throwable {
		switch (arg1.toLowerCase()){
		case "multichannel":
			page.clickMultichannelImage();
			break;
		case "platform":
			page.clickPlatformImage();
			break;
		case "globalcommerce":
			page.clickGlobalCommerceImage();	
			break;
		default:
			LOG.error("Ivalid subcategory name on solutions Page");
	    	assertTrue(false);
		}
	}
	
}
