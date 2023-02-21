package org.Arul;

import org.openqa.selenium.WebDriver;

public class POM {
	
	public  WebDriver driver;
	
	public  Loginpage Lp ;

	public POM(WebDriver driver2) {
		
		this.driver=driver2;

	}

	public  Loginpage getinstancegetLp() {
		if (Lp==null) {
			
			Lp= new Loginpage(driver);
			
		}
		return Lp;
	}

}
