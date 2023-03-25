package SeleniumProgram19Mar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import path1.AllPath;

public class HiddenDivision {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "chromepath");
		
		ChromeOptions c = new ChromeOptions();
		
		c.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(c);

		driver.manage().window().maximize();
		
		driver.get(AllPath.flipkart);
		
		WebElement cls = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		
		cls.click();
			
	}

}
