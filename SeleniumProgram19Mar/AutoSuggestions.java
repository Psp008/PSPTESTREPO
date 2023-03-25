package SeleniumProgram19Mar;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import path1.AllPath;

public class AutoSuggestions {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "chromepath");

		ChromeOptions c = new ChromeOptions();
		
		c.addArguments("--remote-allow-origins=*");
		
		WebDriver d = new ChromeDriver(c);
		
		d.manage().window().maximize();
		
		d.get(AllPath.amazon);
		
		WebElement srchbr = d.findElement(By.xpath("//input[@type='text']"));
		
		srchbr.sendKeys("iphone");
		
		WebDriverWait e = new WebDriverWait(d, Duration.ofSeconds(5));
		
		e.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='autocomplete-results-container']/div")));
		
		List <WebElement> sgstn = d.findElements(By.xpath("//div[@class='autocomplete-results-container']/div"));
		
		for(int i=0; i<sgstn.size(); i++)
		{
			String s1 = sgstn.get(i).getText();
			
			if(s1.contains("12")) 
			{
				sgstn.get(i).click();
			}
		}
		
		
		
		
	}

}
