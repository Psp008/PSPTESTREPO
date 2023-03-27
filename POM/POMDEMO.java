package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMDEMO {

	@FindBy(xpath="//*[@id='email']") private WebElement usrid;
	
	@FindBy(xpath="//*[@id='pass']") private WebElement pswd;
	
	@FindBy(xpath="//*[@name='login']") private WebElement lgntbn;
	
	POMDEMO(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//When their is a global variable and local variable with same name in same class then to call that global variable this keyword is used.
	

	public void entrusrid(String id) 
	{
	usrid.sendKeys(id);
	}
	
	public void entrpwd(String pwd)
	{
	pswd.sendKeys(pwd);
	}
	
	public void lgn() {
		lgntbn.click();
	}
	
	
	
	
	
}
