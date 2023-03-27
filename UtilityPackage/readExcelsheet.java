package UtilityPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import path1.AllPath;

public class readExcelsheet {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", AllPath.chrmpth);
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement drg = driver.findElement(By.xpath("(//img[@width='96'])[3]"));
		
		WebElement drp = driver.findElement(By.xpath("//div[@id='trash']"));		
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		
		a.clickAndHold(drg).moveToElement(drp).release().perform();
	
	}

}
