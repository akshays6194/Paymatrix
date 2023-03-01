package testcases;

import org.testng.annotations.Test;

import pageobjects.LoginPage;
import testbase.TestBase;

public class verifyLoginFunctionality extends TestBase {

	

	@Test(priority=1)

	public void TC01() {
		
		LoginPage lp = new LoginPage(driver);
		lp.clickLoginTab();		

	}
	
	@Test(priority=2)

	public void TC02() {

		LoginPage lp = new LoginPage(driver);
		lp.setLogin(configdataprovider.getuserid(), configdataprovider.getpassword());

	}

}