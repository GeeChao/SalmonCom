package com.salmon.test.step_definitions.salmon_regression;

import static org.testng.AssertJUnit.assertTrue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.salmon.test.page_objects.S_HomePage;
import com.salmon.test.page_objects.S_OurWorkPage;
import com.salmon.test.page_objects.S_SearchPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class SearchActions {
	private S_SearchPage searchPage;
	private S_HomePage homePage;

	public SearchActions(S_SearchPage searchPage, S_HomePage homePage) {
		this.searchPage = searchPage;
		this.homePage = homePage;
	}

	private static final Logger LOG = LoggerFactory
			.getLogger(HomePageActions.class);

	@And("^I invoke search on Homepage$")
	public void i_invoke_search_on_Homepage() throws Throwable {
		homePage.invokeSearch();
	}
	
	@And("^I input \"(.*?)\" in searchbox$")
	public void i_input_in_searchbox(String keyword) throws Throwable {
		
		homePage.inputSearchKeywords(keyword);
	}
	
	@And("^I click search on Homepage$")
	public void i_click_search_on_Homepage() throws Throwable {
		homePage.clickSearchbutton();
	}
	
	@And("^I can see showing results for \"(.*?)\" on search result page$")
	public void i_can_see_showing_results_for_on_search_result_page(String searchResultText) throws Throwable {
		
		assertTrue(searchPage.getSearchText().contains(searchResultText));
	}
	       	
	@And("^I can see zero result found on search result page$")
	public void i_can_see_zero_result_found_on_search_result_page() throws Throwable {		
		assertTrue(searchPage.getSearchCountFromSummary().equals("0"));
	}
	
	@And("^I can see one result found on search result page$")
	public void i_can_see_one_result_found_on_search_result_page() throws Throwable {		
		assertTrue(searchPage.getSearchCountFromSummary().equals("1"));
	}
	
	@And("^I can see no result text \"(.*?)\" on search result page$")
	public void i_can_see_no_result_text_on_search_result_page(String noMatchingText ) throws Throwable {		
		assertTrue(searchPage.getSorryNoResultText().equals(noMatchingText));
	}
	
	@And("^I can see one result \"(.*?)\" on search result page$")
	public void i_can_see_one_result_on_search_result_page(String oneResultTitle ) throws Throwable {		
		assertTrue(searchPage.getSearchResultTitles().size() ==1);
		assertTrue(searchPage.getSearchResultTitles().contains(oneResultTitle));
	}

	@And("^I can see count of search result from summary and content are the same$")
	public void i_can_see_count_of_search_result_from_summary_and_content_are_the_same() throws Throwable {		
		assertTrue(searchPage.getSearchResultTitles().size() == Integer.valueOf(searchPage.getSearchCountFromSummary()));

	}
	
	
	
}
