package com.salmon.test.page_objects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.salmon.test.framework.PageObject;

public class S_HomePage extends PageObject{
	 private By footCareer = By.xpath(".//*[@id='nav']/ul/li[2]/a");

	 private By nextOnBanner = By.xpath(".//*[@id='main']//a[text()='Next']");
	 private By previousOnBanner = By.xpath(".//*[@id='main']//a[text()='Previous']");
	 private By pageButtonsOnBanner = By.xpath(".//*[@id='main']//div[@class='pagination']//a");
	 private By paginationOnBanner = By.xpath(".//*[@id='main']//div[@class='pagination']//li");
	 private By buttonOnBanner = By.xpath(".//*[@id='main']//div[@class ='slide active']//a");
	 private By slideSetOnBanner = By.xpath(".//*[@id='main']//div[@class='slideset']/div");
	 private By largeButtonsOnBanner = By.xpath(".//*[@id='main']//a[@class='btn large']");
	 private By whySalmonImg = By.xpath(".//*[@id='section']/div/div[1]/img");
	 private By howWeDoImg = By.xpath(".//*[@id='section']/div/div[2]/img");
	 private By whatWeDoImg = By.xpath(".//*[@id='section']/div/div[3]/img");
	 private By whySalmon = By.xpath(".//*[@id='section']/div/div[1]/a[2]/div/button");
	 private By howWeDo = By.xpath(".//*[@id='section']/div/div[2]/a[2]/div/button");
	 private By whatWeDo = By.xpath(".//*[@id='section']/div/div[3]/a[2]/div/button");
	 private By viewCaseStudies = By.xpath(".//*[@id='page-content']/div[1]/div/div[1]/a");
	 private By imagesOnHome = By.xpath(".//*[@id='page-content']//img");
	 private By viewAllNews = By.xpath(".//*[@id='page-content']//a[text()='View all News Stories']");
	 private By searchInvokeButton = By.xpath(".//*[@id='header']//form[contains(@class,'search')]//a[@class='opener']");
	 private By searchButton = By.xpath(".//*[@id='header']//form[contains(@class,'search')]//button[@type='submit']");
	 private By searchBox = By.xpath(".//*[@id='f201'][@name='q']");
	 //*[@id='main']//div[@class='slideset']/div[3]

	 private By contactUs = By.xpath(".//*[@id='header']/div/div[2]/div[1]/nav/ul/li[4]/a");


	    public void clickcontactUsLink() {
	        waitForExpectedElement(contactUs).click();
	    }

	    public void clickCareerLink() {
	        waitForExpectedElement(footCareer).click();
	    }

		public void clickNextOnBanner() throws Exception {
			// TODO Auto-generated method stub
			Thread.sleep(1000);
			waitForExpectedElement(nextOnBanner).click();
		}

		public void clickPreviousOnBanner() throws Exception {
			// TODO Auto-generated method stub
			Thread.sleep(1000);
			waitForExpectedElement(previousOnBanner).click();
		}

		public void clickPaginationOnBanner() throws Exception {
			// TODO Auto-generated method stub
			Thread.sleep(1000);
			waitForExpectedElement(pageButtonsOnBanner).click();
		}

		public void clickButtonOnBanner() throws Exception {
			// TODO Auto-generated method stub
			Thread.sleep(1000);
			waitForExpectedElement(buttonOnBanner).click();
		}
		
		/**
		 * get all slides on the banner.
		 * @return
		 */
		public List<WebElement> getBannerSlides(){
			return super.webDriver.findElements(slideSetOnBanner);
		}
		
		/**
		 * get index of the current slide 
		 * @return
		 */
		public int getIndexOfCurrentSlidesOnBanner() {
			// TODO Auto-generated method stub
			int index=0;
			List<WebElement> slidesOnBanner = this.getBannerSlides();
			for (int i=0; i<slidesOnBanner.size(); i++){
				String slideClass = slidesOnBanner.get(i).getAttribute("class");
				if (slidesOnBanner.get(i).getAttribute("class").equals("slide active")){
					index = i+1;
					break;
				}
			}
			return index;
		}
		
		public int getIndexOfNextSlidesOnBanner() {
			// TODO Auto-generated method stub	
			return this.getIndexOfCurrentSlidesOnBanner()%this.getBannerSlides().size()+1;
		}
		
		public int getIndexOfPreviousSlidesOnBanner() {
			// TODO Auto-generated method stub	
			int current = this.getIndexOfCurrentSlidesOnBanner();
			return current>1?current-1:this.getBannerSlides().size();
		}
		
		public List<WebElement> getPaginationBanner(){
			return super.webDriver.findElements(paginationOnBanner);
		}
		
		public int getIndexOfCurrentPage() {
			// TODO Auto-generated method stub
			int index=0;

			List<WebElement> paginations = this.getPaginationBanner();
			int num =paginations.size();
			for (int i=0; i< paginations.size(); i++){
				String str = paginations.get(i).getAttribute("class");
				if (paginations.get(i).getAttribute("class").equals("active") ){
					index = i+1;
					break;
				}
			}
			return index;
		}
		
		
		public List<WebElement> getPageButtons(){
			return super.webDriver.findElements(pageButtonsOnBanner);
		}
		
		public void clickPageButton(int pageNumber) throws Exception {
			// TODO Auto-generated method stub
			Thread.sleep(1000);
			List<WebElement> pageButtonsOnBanner = this.getPageButtons();
			pageButtonsOnBanner.get(pageNumber-1).click();
		}
		
		
		public List<WebElement> getlargeButtons(){
			return super.webDriver.findElements(largeButtonsOnBanner);
		}
		
		public void clickButtonOnBanner(String buttonName) throws Exception {
			// TODO Auto-generated method stub
			Thread.sleep(1000);
			List<WebElement> pageButtonsOnBanner = this.getPageButtons();
			for (int i=0; i< pageButtonsOnBanner.size(); i++){
				if (pageButtonsOnBanner.get(i).getText().equalsIgnoreCase(buttonName) ){
					pageButtonsOnBanner.get(i).click();
					break;
				}
			}			
		}
		
		public void clickWhySalmonImg() {		
		Actions mouseOver = new Actions(super.webDriver);
		mouseOver.moveToElement(waitForExpectedElement(whySalmonImg)).perform();
		waitForExpectedElement(whySalmon).click();	
		}
		
		public void clickHowWeHelpImg() {
			Actions mouseOver = new Actions(super.webDriver);
			
			mouseOver.moveToElement(waitForExpectedElement(howWeDoImg)).perform();
			waitForExpectedElement(howWeDo).click();				
		}
		
		public void clickWhatWeDoImg() {			
			Actions mouseOver = new Actions(super.webDriver);
			mouseOver.moveToElement(waitForExpectedElement(whatWeDoImg)).perform();
			waitForExpectedElement(whatWeDo).click();	
		}

		public void clickViewCaseStudies() {
			Actions mouseOver = new Actions(super.webDriver);
			mouseOver.moveToElement(waitForExpectedElement(viewCaseStudies)).perform();
			waitForExpectedElement(viewCaseStudies).click();	
		}
		
		public void mouseOverAndClickCaseStudyByName(String imageName) throws Exception {

			Thread.sleep(1000);
			imageName = removeUnicodeChars(imageName);
			String imageXpath = ".//*[@id='page-content']//img[contains(@alt,'"+imageName+"')]";
			WebElement image= waitForExpectedElement(By.xpath(imageXpath));
			mouseOver(image);
			
			String readCaseStudy = ".//*[@id='page-content']//h3[text()='"+imageName+"']/parent::*/a";
			WebElement caseStudy = waitForExpectedElement(By.xpath(readCaseStudy));			
			caseStudy.click();
			
//			List<WebElement> images = this.getImagesOnHome();
//			for (int i=0; i< images.size(); i++){
//				if (images.get(i).getAttribute("alt").equalsIgnoreCase(imageName) ){
//					Actions mouseOver = new Actions(super.webDriver);
//					mouseOver.moveToElement(images.get(i)).perform();
//					break;
//				}
//			}

		}

		public List<WebElement> getImagesOnHome() {
			// TODO Auto-generated method stub
			return super.webDriver.findElements(imagesOnHome);
		}
		
		public By getImageByName(String imageName) {
			// TODO Auto-generated method stub
			imageName=removeUnicodeChars(imageName);
			String imgElementXpath = ".//*[@id='page-content']//img[contains(@alt,'"+imageName+"')]";
			return By.xpath(imgElementXpath);
		}

		public void clickViewAllNews() {
			
			waitForExpectedElement(viewAllNews).click();

			// TODO Auto-generated method stub
			
		}

		public void mouseOverAndClickLinkByName(String linkName) {
			// TODO Auto-generated method stub
			linkName = removeUnicodeChars(linkName);
			String linkXpath = ".//*[@id='page-content']//a[text()='"+linkName+"']";
			WebElement link= waitForExpectedElement(By.xpath(linkXpath));
			mouseOverAndClick(link);
			
//			Actions mouseOver = new Actions(super.webDriver);
//			WebElement link= waitForExpectedElement(By.xpath(linkXpath));
//			mouseOver.moveToElement(link).perform();
//			link.click();
		}

		public void mouseOverAndClickImageByName(String imageName) {
			// TODO Auto-generated method stub
			imageName = removeUnicodeChars(imageName);
			String imageXpath = ".//*[@id='page-content']//img[@alt='"+imageName+"']";
			//Actions mouseOver = new Actions(super.webDriver);
			WebElement image= waitForExpectedElement(By.xpath(imageXpath));
			mouseOverAndClick(image);
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

		public void invokeSearch() {
			// TODO Auto-generated method stub
			WebElement searchInvokeElement = waitForExpectedElement(searchInvokeButton);
			mouseOverAndClick(searchInvokeElement);
			
		}

		public void inputSearchKeywords(String keyword) {
			// TODO Auto-generated method stub
			WebElement searchBoxElement = waitForExpectedElement(searchBox);
			searchBoxElement.sendKeys(keyword);;
		}
		
		public void clickSearchbutton() {
			// TODO Auto-generated method stub
			WebElement searchButtonElement = waitForExpectedElement(searchButton);
			mouseOverAndClick(searchButtonElement);
			
		}
		
}
