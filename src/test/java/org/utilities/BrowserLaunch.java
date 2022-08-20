package org.utilities;

import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.utility.BaseClass;

public class BrowserLaunch extends BaseClass{

	public static void main(String[] args) throws IOException {
		
		
		launchchrome();
		WinMax();
		loadUrl("https://www.facebook.com");
		printTitle();
		printCurrentUrl();
		
		
		LoginPojo l = new LoginPojo();
		WebElement txtUser = l.getTxtUser();
		fill(txtUser,getData(3,4));
		
		WebElement txtPass = l.getTxtUser();
		fill(txtPass,getData(5,4));
		
		WebElement btnlogin = l.getBtnLogin();
		btnclick(btnlogin);
		

}

	
	
	
	
	
	
	
	
	
	private static String getData(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}
	

			
			
		
			       	
			

}
