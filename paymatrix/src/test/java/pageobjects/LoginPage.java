package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
	
	

	WebDriver driver;

	@FindBy(xpath = "//button[@class='Hader_login-btn-desk__DVpTy']")
	WebElement LoginTab;
	
	@FindBy(xpath = "//input[@id='mobileNumber']")
	WebElement email;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement userpassword;
	
	@FindBy(xpath = "//button[@class='verify_by_otp_button next-login']")
	WebElement LoginClick;
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickLoginTab() {
		try {
			LoginTab.click();
		String	Exp_Home_Title = "Paymatrix";
		String	Act_Home_Title = driver.getTitle();
		if(Exp_Home_Title.equals(Act_Home_Title)){
			Assert.assertTrue(true);
			System.out.println("Login click works");
			
		}
		else {
			Assert.assertTrue(false);
		}
				
		} catch (Exception e) {
			e.printStackTrace();
			
		}				
	}
	
	public void setLogin(String userid,String password) {
		
			email.clear();
			email.sendKeys(userid);
			userpassword.sendKeys(password);
			LoginClick.click();	
			System.out.println("User successfully logged in");
	}

}
