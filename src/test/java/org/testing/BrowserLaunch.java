package org.testing;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.utility.BaseClass;

public class BrowserLaunch extends BaseClass  {

		public static void main(String[] args) {
			launchchrome();
			WinMax();
			loadUrl("https://www.facebook.com");
			printTitle();
			printCurrentUrl();
			
			
			WebElement txtUser = driver.findElement(By.id("email"));
			fill(txtUser,"greens");
			
			WebElement txtpass = driver.findElement(By.id("pass"));
			fill(txtpass,"greens@123");
			
			WebElement btnLogin = driver.findElement(By.name("login"));
			btnclick(btnLogin);
			
			//Actions
					WebElement src = driver.findElement(By.xpath("//li[@id='fourth'])[2]"));
					WebElement dsc = driver.findElement(By.xpath("//li[@ol='amt7']"));
				
			//Alert
					driver.get("http://demo.automationtesting.in/Alert.html");
			        driver.findElement(By.xpath("//button[@class='btn btn -danger']")).click();
			        WebElement confirm = driver.findElement(By.xpath("//a[contains(text(),'Alert with ok &')]"));
			        driver.findElement(By.xpath("//button[@class='btn btn -primary']")).click();
			        WebElement prompt = driver.findElement(By.xpath("//a[contains(text(),'Alert with T')]"));
			        //Screenshot
			       TakesScreenshot tk =(TakesScreenshot)driver;
			       File src1 = tk.getScreenshotAs(OutputType.FILE);
			       File dsc1 = new File("C:\\Users\\Ramesh\\eclipse-workspace\\Selenium\\Screenshots\\home.jpg");
			       	
			

	}

}
