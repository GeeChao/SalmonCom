package com.salmon.test.step_definitions.salmon_regression;
import static org.testng.AssertJUnit.assertTrue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.salmon.test.page_objects.S_OurWorkPage;
import cucumber.api.java.en.Then;

public class OurWorkPage {
	private S_OurWorkPage page;
    public OurWorkPage(S_OurWorkPage page){
        this.page = page;
    }
	private static final Logger LOG = LoggerFactory.getLogger(HomePageActions.class);

	@Then("^\"(.*?)\" breadcrumb is present on OurWork Page$")
	public void breadcrumb_is_present_on_OurWork_Page(String arg1) throws Throwable {
		if(arg1.equalsIgnoreCase("Home > Our Work")){
	    	assertTrue(page.isBreadcrumbPresent());
	    }else{
	    	LOG.error("Ivalid breadcrumb name");
	    	assertTrue(false);
	    }

	}
	@Then("^I click \"(.*?)\" link on OurWork Page$")
	public void i_click_link_on_OurWork_Page(String arg1) throws Throwable {
		if(arg1.equalsIgnoreCase("Home")){
	    	page.clickHomeBreadcrumb();
	    }else{
	    	LOG.error("Ivalid link name on AboutUs Page");
	    	assertTrue(false);
	    }
	}
	
}
