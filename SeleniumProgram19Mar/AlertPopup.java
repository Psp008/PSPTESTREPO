package SeleniumProgram19Mar;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import path1.AllPath;

public class AlertPopup {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "chromepath");

		ChromeOptions c = new ChromeOptions();
		
		c.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(c);
		
		//driver.manage().window().maximize();
		
		driver.manage().window().maximize();
		
		driver.get(AllPath.alrt);
		
		WebElement altbx = driver.findElement(By.xpath("//button[@name='alertbox']"));
		
		WebElement cnfaltbx = driver.findElement(By.xpath("//button[@name='confirmalertbox']"));
		
		WebElement prmaltbx = driver.findElement(By.xpath("//button[@name='promptalertbox1234']"));
		
		altbx.click();
		
		Alert alt1 = driver.switchTo().alert();
		
		alt1.accept();
		
		cnfaltbx.click();
		
		Alert alt2 = driver.switchTo().alert();
		
		alt2.accept();
		
		prmaltbx.click();
		
		Alert alt3 = driver.switchTo().alert();
		
		alt3.sendKeys("Yes");
		
		alt3.accept();
	}

}
