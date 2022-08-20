package org.utility;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Alert b;
	public static TakesScreenshot s;
	public static JavascriptExecutor js;
	public static Select s1;
	
	public static void launchchrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public static void WinMax() {
		driver.manage().window().maximize();
	}
	public static void loadUrl(String url) {
		driver.get(url);
	}
	public static void printTitle() {
		System.out.println(driver.getTitle());

	}
	public static void printCurrentUrl(){
		System.out.println(driver.getCurrentUrl());
	}
	public static void fill(WebElement ele,String Value) {
		ele.sendKeys(Value);
	}
	
	public static void btnclick(WebElement ele) {
		ele.click();
	}
	public static void rightclick(WebElement ele) {
		a.contextClick(ele).perform();
	}
	public static void dclick(WebElement ele) {
		a.doubleClick(ele).perform();
	}
	    
	//Actions
	
	      public static  void move(WebElement ele) {
			a.moveToElement(ele).perform();
			}
			public static void dragdrop(WebElement src, WebElement dsc) {
	        a.dragAndDrop(src,dsc).perform();	
	        }
			public static void keyd() {
				a.keyDown(Keys.SHIFT).perform();
				
			}
			public static void keyu() {
				a.keyUp(Keys.SHIFT).perform();
			}
			
			//Robot
			
			public static void down() {
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
			}
			public static void enter() {
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
			}
			public static void a() {
				r.keyPress(KeyEvent.VK_A);
				r.keyRelease(KeyEvent.VK_A);
			}
			public static void C() {
				r.keyPress(KeyEvent.VK_C);
				r.keyRelease(KeyEvent.VK_C);
			}
			
			//Alert
			public static void accept() {
				b =driver.switchTo().alert();
				b.accept();
			}
			public static void dismiss(){
				b =driver.switchTo().alert();
				b.dismiss();;
			}
			public static void con(WebElement confirm) {
				confirm.click();
			}
			public static void pom(WebElement prompt) {
				prompt.click();
			}
			//ScreenShot
			public static void source() {
				s.getScreenshotAs(OutputType.FILE);
			}
			//JavascriptExecutor
			public static void setattribute() {
				js.executeScript("aruument[0].setAttributr('value','greens'), txtuser");
				
			}
			public static void getattribute() {
				Object o =js.executeScript("return argument[0].getAttribute('value'), txtuser");
				
			}
			//select
			public static void selectbyvalue(WebElement ele, String value) {
				Select s= new Select(ele);
				s.selectByValue(value);
			}
			public static void selectbyvisibletext(WebElement ele, String value) {
				Select s= new Select(ele);
				s.selectByVisibleText(value);
			}
			public static void selectbyIndex(WebElement ele, int index) {
				Select s= new Select(ele);
				s.selectByIndex(index);
			}
			public static void ismultiple(WebElement ele) {
				Select s= new Select(ele);
			    boolean multiple = s.isMultiple();
			    
			}
			public static void getoptions(WebElement ele) {
				Select s= new Select(ele);
				List<WebElement> options = s.getOptions();
			for(int i=0;i<options.size();i++) {
				String text = options.get(i).getText();
			}
			}
			public static void getalloptions(WebElement ele) {
				Select s= new Select(ele);
				List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			for(int i=0;i<allSelectedOptions.size();i++) {
				String text = allSelectedOptions.get(i).getText();
			}
			}
			public static void getFirstSelectedOptions(WebElement ele) {
				Select s= new Select(ele);
				WebElement firstSelectedOption = s.getFirstSelectedOption();
			    String text = firstSelectedOption.getText();
			}
			public static void deselectbyIndex(WebElement ele, int index) {
				Select s= new Select(ele);
				s.deselectByIndex(index);
			}
			public static void deselectbyvalue(WebElement ele, String value) {
				Select s= new Select(ele);
				s.deselectByValue(value);
			}
			public static void deselectbyvisibletext(WebElement ele, String value) {
				Select s= new Select(ele);
				s.deselectByVisibleText(value);
			}
			public static void deselectAll(WebElement ele) {
				Select s= new Select(ele);
				s.deselectAll();
				}
			 
			
			

}
