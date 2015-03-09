package com.salmon.test.step_definitions.salmon_regression;

import static org.testng.AssertJUnit.assertTrue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.salmon.test.page_objects.S_GlobalFooter;

import cucumber.api.java.en.Given;

public class GlobalFooterActions {
	private S_GlobalFooter footer;
    public GlobalFooterActions(S_GlobalFooter footer){
        this.footer = footer;
    }
	private static final Logger LOG = LoggerFactory.getLogger(ArriveAtPage.class);
	@Given("^I click \"(.*?)\" on the footer$")
	public void i_click_on_the_footer(String linkName) throws Throwable {
		String afterTrimlinkName =linkName.replace(" ","");
		if (afterTrimlinkName.equalsIgnoreCase("CAREERS")){
			footer.clickcareerLink();	
        } 
		else if (afterTrimlinkName.equalsIgnoreCase("EVENTS")){
			footer.clickeventsLink();	
        }
		else if (afterTrimlinkName.equalsIgnoreCase("CONTACTUS")){			
			footer.clickcontactusLink();		
        }
		else if (afterTrimlinkName.equalsIgnoreCase("TERMSOFUSE")){
			footer.clicktermsofuseLink();	
        }
		else if (afterTrimlinkName.equalsIgnoreCase("PRIVACYANDCOOKIES")){
			footer.clickprivacyandcookiesLink();	
        }
		else if (afterTrimlinkName.equalsIgnoreCase("SITEMAP")){
			footer.clicksitemapLink();	
        }
		else if (afterTrimlinkName.equalsIgnoreCase("ACCESSIBILITY")){
			footer.clickaccessibilityLink();	
        }
		else{
        	LOG.error("Invalid link name");
        	assertTrue(false);
        }
		
	}
}
