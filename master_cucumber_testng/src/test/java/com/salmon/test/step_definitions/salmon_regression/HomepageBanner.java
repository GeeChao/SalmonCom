package com.salmon.test.step_definitions.salmon_regression;

import static org.testng.AssertJUnit.assertTrue;

import com.salmon.test.framework.PageObject;
import com.salmon.test.page_objects.S_HomePage;
import cucumber.api.java.en.*;
public class HomepageBanner extends PageObject{
	private S_HomePage homePage;
	private int indexOfNextBanner;
	private int indexOfPreviousBanner;
    public HomepageBanner(S_HomePage homePage){
        this.homePage = homePage;
    }

	@And("^I click \"(.*?)\" on bannner$")
	public void i_click_on_bannner(String bannerElement) throws Throwable {
		
		switch (bannerElement.toLowerCase()) {
			case "next": {
				indexOfNextBanner = homePage.getIndexOfNextSlidesOnBanner();
				homePage.clickNextOnBanner();
				break;
			}
			case "previous": {
				indexOfPreviousBanner = homePage.getIndexOfPreviousSlidesOnBanner();
				homePage.clickPreviousOnBanner();
				break;
			}
		}
	}
   
    @Then("^I can see banner goes to \"(.*?)\"$")
    public void i_can_see_bannner_goes_to(String bannerElement) throws Throwable {
    	
    	switch (bannerElement.toLowerCase()){
    	
    	case "next" :		{
    		assertTrue(homePage.getIndexOfCurrentSlidesOnBanner()==indexOfNextBanner);
    		break;
    	}
    	case "previous" : 	{
    		assertTrue(homePage.getIndexOfCurrentSlidesOnBanner()==indexOfPreviousBanner);
    		break;
    	}
    	
    	}
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }
    
    @And("^I click page \"(.*?)\" on bannner$")
    public void i_click_page_on_bannner(String pageNumber) throws Throwable {
    	int pageNum = Integer.valueOf(pageNumber).intValue();
    	homePage.clickPageButton(pageNum);    	
    }
    
    @Then("^I can see banner goes to page \"(.*?)\"$")
    public void i_can_see_banner_goes_to_page(String pageNumber) throws Throwable {
    	int pageNum = Integer.valueOf(pageNumber).intValue();
    	assertTrue(homePage.getIndexOfCurrentPage()==pageNum);
    }
    
    @And("^I click button \"(.*?)\" on bannner$")
    public void i_click_button_on_bannner(String buttonName) throws Throwable {
    	homePage.clickButtonOnBanner(buttonName); 
    }
    
}
