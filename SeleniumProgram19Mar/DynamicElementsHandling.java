package SeleniumProgram19Mar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import path1.AllPath;

public class DynamicElementsHandling {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.driver", "chromepath");
		
		ChromeOptions c = new ChromeOptions();
		
		c.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(c);
		
		driver.manage().window().maximize();
		
		driver.get(AllPath.fbsignup);
		
		WebElement em = driver.findElement(By.xpath("(//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']//following-sibling::input)[3]"));

		em.sendKeys("Piyush");
		
		WebElement pswd = driver.findElement(By.xpath("(//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']//following-sibling::input)[5]"));
		
		pswd.sendKeys("Pswd@1234");
		
		
		
	}

}
