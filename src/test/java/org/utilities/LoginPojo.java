package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class LoginPojo extends BaseClass {

		//1.non para constructor
		public LoginPojo() {
			PageFactory.initElements(driver, this);
		}
		//Private WebElement
		
		@FindBy(id="email")
		private WebElement txtUser;
		
		@FindBy(id="pass")
		private WebElement txtPass;
		
		@FindBy(xpath="//button[@name='login']")
		private WebElement btnLogin;
		
		public WebElement getTxtUser() {
			return txtUser;
			
		}
		
		public WebElement getTxtPass() {
			return txtPass;
		}
		public WebElement getBtnLogin() {
			return btnLogin;
		
		}
		
	
	

}
