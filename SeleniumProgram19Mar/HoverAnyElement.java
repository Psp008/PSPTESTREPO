package SeleniumProgram19Mar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import path1.AllPath;

public class HoverAnyElement {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.driver.chrome", "chromepath");
		
		ChromeOptions c = new ChromeOptions();
		
		c.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(c);
		
		driver.manage().window().maximize();
		
		driver.get(AllPath.amazon);
		
		WebElement aclst = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		
		WebElement uracc = driver.findElement(By.xpath("//span[text()='Your Account']"));

		Actions a = new Actions(driver);
		
		a.moveToElement(aclst).perform();
		
		uracc.click();

	}

}
