package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM27Mar {

	
	@FindBy(xpath="//input[@name='username']") private WebElement usrid;
	
	@FindBy(xpath="//input[@name='password']") private WebElement pswd;
	
	@FindBy(xpath="//button[@type='submit']") private WebElement lgnbtn;
	
	public POM27Mar(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void entrusrid(String id)
	{
		usrid.sendKeys(id);
	}
	
	public void entrpswd(String psd)
	{
		pswd.sendKeys(psd);
	}
	
	public void clckbtn()
	{
		lgnbtn.click();
	}
	
}
