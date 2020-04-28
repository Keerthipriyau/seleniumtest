package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.BasePage;

public class loginpage extends BasePage {
	
	
	@FindBy(xpath = "//input[@name='userName']")
	private WebElement username_textfield;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement Password_textfield;
	
	
	@FindBy(name = "login")
	private WebElement sign_Button;
	
	


	public loginpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void Set_Username(String username) {
		username_textfield.sendKeys(username);
	}
	
	public void Set_Password(String password) {
		Password_textfield.sendKeys(password);
	}
	
	
	public void click_Sign_In_Button()
	
	{
		
		sign_Button.click();
		
	}
	}
	
    
