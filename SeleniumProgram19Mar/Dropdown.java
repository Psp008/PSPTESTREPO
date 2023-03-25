package SeleniumProgram19Mar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import path1.AllPath;

public class Dropdown {

	public static void main(String[] args) {
		
		ChromeOptions c = new ChromeOptions();
		
		c.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(c);
		
		driver.manage().window().maximize();
		
		driver.get(AllPath.fbsignup);
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		
		WebElement mnth = driver.findElement(By.xpath("//select[@id='month']"));
		
		WebElement yr = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select s = new Select(day);
		
		s.selectByVisibleText("4");
		
		Select s1 = new Select(mnth);
		
		s1.selectByVisibleText("Mar");
		
		Select s2 = new Select(yr);
		
		s2.selectByVisibleText("1997");
	}

}
