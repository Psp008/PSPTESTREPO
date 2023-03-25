package SeleniumProgram19Mar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import path1.AllPath;

public class GetStatus {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.driver.chrome", "chromepath");
		
		ChromeOptions c = new ChromeOptions();
		
		c.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(c);
		
		driver.manage().window().maximize();
		
		driver.get(AllPath.Paytmrchrge);
		
		WebElement prpd = driver.findElement(By.xpath("//input[@id='radio0']"));
		
		WebElement pspd = driver.findElement(By.xpath("//input[@id='radio1']"));
		
		//System.out.println(prpd.getText());
		
		Boolean prpd1 =  prpd.isSelected();
		
		Boolean prpd3 = prpd.isEnabled();
		
		System.out.println(prpd1);
		
		System.out.println(prpd3);
		
		WebElement prpdtxt = driver.findElement(By.xpath("(//div[@class='MGxf'])[1]"));
		
		WebElement pspdtxt = driver.findElement(By.xpath("(//div[@class='MGxf'])[2]"));
		
		Boolean prtxt = prpdtxt.isDisplayed();
		
		Boolean pstxt = pspdtxt.isDisplayed();
		
		System.out.println(prtxt);
		
		System.out.println(pstxt);
		
		System.out.println(prpdtxt.getText());
		
		System.out.println(pspdtxt.getText());
	}

}
