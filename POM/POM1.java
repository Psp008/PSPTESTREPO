package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM1 {

	@FindBy(xpath="(//*[@type='text'])[2]") private WebElement mob;
	
	@FindBy(xpath="//*[@type='password']") private WebElement pwd;
	
	@FindBy(xpath="(//button[@type='submit'])[2]") private WebElement btn;
	
	public POM1(WebDriver driver) {
	PageFactory.initElements(driver, this);	
	}

	public void entrmob(String mb)
	{
		mob.sendKeys(mb);
	}
	
	public void entrpwd(String pd)
	{
		pwd.sendKeys(pd);
	}
	
	public void lgnbtn()
	{
		btn.click();
	}
	
	
}
