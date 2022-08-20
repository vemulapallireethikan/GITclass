package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class LoginPojoMultiple {
	public class LoginPojo extends BaseClass {

		//1.non para constructor
		public LoginPojo() {
			PageFactory.initElements(driver, this);
		}
		//Private WebElement
		
		@CacheLookup
		//AND
		@FindBys({
                @FindBy(id="email"),
                @FindBy(xpath="//input[@type='text']")

			})
		private WebElement txtUser;
		@CacheLookup
		//OR
		@FindBys({
			@FindBy(id="pass"),
			@FindBy(xpath="//input[@='password']")
		})
		private WebElement txtPass;
		@CacheLookup
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

	public WebElement getTxtUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
