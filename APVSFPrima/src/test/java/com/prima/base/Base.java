package com.prima.base;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Base {

	
	public static WebDriver driver;
	
	
	
	 Wait<WebDriver> wait;
	
	public Base (String url) {		
		if(driver==null) {
			Base.driver=setDriver(url);
		}
		/*
		 * this.wait = new
		 * FluentWait<WebDriver>(driver).withTimeout(50,TimeUnit.SECONDS)
		 * .pollingEvery(2,TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		 */
	
		  this.wait = new
		  FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(50))
		  .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		
	}
	
public WebDriver setDriver(String url) {
		
		if(url.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		return driver;
	}
	
	
	
	public WebElement findElement(final By locator) {
		/*
		 * ExpectedCondition<WebElement> condition = webDriver ->
		 * webDriver.findElement(locator); WebElement elemento=wait.until(condition);
		 */
				
		WebElement elemento=wait.until(new Function<WebDriver,WebElement>(){ public WebElement
		 apply(WebDriver driver) { 			 
			 return (WebElement)ExpectedConditions.visibilityOfElementLocated(locator).apply(driver); } } );
	
		return elemento!=null && elemento.isEnabled() ? elemento:null;
	}
	
	public List<WebElement> findElements (By locator){
		return driver.findElements(locator);
	}
	
	public String getText(WebElement element) {
		return element.getText();
	}
	
	public String getText(By locator) {
		return this.findElement(locator).getText();
	}
	
	public void sendKeys(String inputText, By locator) {
		this.findElement(locator).sendKeys(inputText);
		
	}
	
	public void clear(By locator) {
		this.findElement(locator).clear();
	}
	
	public void click(By locator) {
		//this.findElement(locator).click();
		Actions actions = new Actions(driver);
		actions.moveToElement(this.findElement(locator)).click().perform();
	}
	
	public void click(WebElement element) {
		element.click();
	}
	
	public Boolean isDisplayed(By locator) {
		try {
			return this.findElement(locator).isDisplayed();
		}catch(org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	public void get (String url) throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	
	public void close() {
		//driver=null;
		driver.close();
		//driver.quit();
		
		
	}
	
	public void quit() {
		driver=null;
		//driver.quit();
		
	}
	
}
