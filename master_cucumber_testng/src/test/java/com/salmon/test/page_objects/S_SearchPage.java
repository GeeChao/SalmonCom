package com.salmon.test.page_objects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.salmon.test.framework.PageObject;

public class S_SearchPage extends PageObject{

	private By searchedText = By.xpath(".//*[@id='banner']/div/div[1]/div/div/h1/span/span[1]/strong"); 
	private By searchedCount = By.xpath(".//*[@id='resultsCount']"); 
	private By sorryNoResultText = By.xpath(".//*[@id='section']/div/p"); 
	private By expandFilterButton = By.xpath(".//*[@id='search-results']//i[@class='icon-plus']"); 
	private By collapseFilterButton = By.xpath(".//*[@id='search-results']//i[@class='icon-minus']"); 
	private List<WebElement> searchResultElements = webDriver.findElements(By.xpath(".//*[@id='resources']//strong[@class='title']/a"));
	
	public String getSearchText() {

		return waitForExpectedElement(searchedText).getText();
	}

	public String getSearchCountFromSummary() {

		return waitForExpectedElement(searchedCount).getText();
	}
	
	public int getSearchCountFromContent() {

		return searchResultElements.size();
	}
	
	public String getSorryNoResultText() {
		
		return waitForExpectedElement(sorryNoResultText).getText();
	}
	
	public void expandFilter() {		
		waitForExpectedElement(expandFilterButton).click();
	}
	
	public void collapseFilter() {		
		waitForExpectedElement(collapseFilterButton).click();
	}
	
	public void selectIndustry(String industryName) {
		industryName = removeUnicodeChars(industryName);
		String industryXpath =".//*[@id='industry-filters']//a[text()='"+industryName+"']";
		waitForExpectedElement(By.xpath(industryXpath)).click();
	}
	
	public void selectType(String typeName) {		
		typeName = removeUnicodeChars(typeName);
		String typeXpath =".//*[@id='type-filters']//a[text()='"+typeName+"']";
		waitForExpectedElement(By.xpath(typeXpath)).click();
	}
		
	private String removeUnicodeChars(String str) {
		if (null == str) {
			return null;
		}
		List<Character> chars = new ArrayList<Character>();
		char[] strChars = str.toCharArray();
		for (int i=0; i<strChars.length; i++) {
			//32: smallest ascii char, 126: largest ascii char
			if (strChars[i] >= 32 && strChars[i] <= 126) {
				chars.add(strChars[i]);
			}
		}
		StringBuffer buffer = new StringBuffer();
		for (char c : chars) {
			buffer.append(c);
		}
		return buffer.toString();
	}

	public List<WebElement> getsearchResultElements(){
		return this.searchResultElements;
	}
	public List<String> getSearchResultTitles() {
		List<String> searchResultTitles = new ArrayList<String>();
		int countOfSearchResults =this.getsearchResultElements().size() ;
		for (int i =0; i<countOfSearchResults;i++){
			searchResultTitles.add(this.getsearchResultElements().get(i).getText());
		}
		return searchResultTitles;
	}
	
	
}
