package org.utilities;

import java.io.IOException;

import org.utility.BaseClass;
	public class BrowerLaunchMultiple extends BaseClass {
		public static void main(String[] args) throws IOException {
			
			
			launchchrome();
			WinMax();
			loadUrl("https://www.facebook.com");
			printTitle();
			printCurrentUrl();
			
			LoginPojoMultiple l = new LoginPojoMultiple();
			
			fill(l.getTxtUser(), getData(3, 4));
			
			driver.navigate().refresh();
			
			LoginPojoMultiple li = new LoginPojoMultiple();
			
			fill(l.getTxtUser(), "Orange");
			
			

	}
		
		
		
		
		
		
		
		
		
		
		

		private static String getData(int i, int j) {
			// TODO Auto-generated method stub
			return null;
		}


}
