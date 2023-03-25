package SeleniumProgram19Mar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import path1.AllPath;

public class DragAndDrop19Mar {

	
		
	public static void main(String[] args) {
	
			//System.setProperty("webdriver.chrome.driver", "chromepath");
			
			ChromeOptions c = new ChromeOptions();
			
			c.addArguments("--remote-allow-origins=*");		
		
			WebDriver driver = new ChromeDriver(c);
			
			driver.manage().window().maximize();
			
			driver.get(AllPath.drgdrop);
			
			WebElement ifrm = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
			
			driver.switchTo().frame(ifrm);	
			
			WebElement drg = driver.findElement(By.xpath("//div[@id='draggable']"));
		
			WebElement drp = driver.findElement(By.xpath("//div[@id='droppable']"));
			
			Actions a = new Actions(driver);
			
			//with method
			
			//a.clickAndHold(drg).moveToElement(drp).release().perform();
					
			//without method
			
			a.dragAndDrop(drg, drp).perform();
		
		
		}
	
	
	
}
