package SeleniumProgram19Mar;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import path1.AllPath;

public class ChildBrowserPopup {

	public static void main(String[] args) {

		// System.setProperty("webdriver.chrome.driver", "chromepath");

		ChromeOptions c = new ChromeOptions();

		c.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(c);

		driver.manage().window().maximize();

		driver.get(AllPath.flipkart);

		WebElement cls = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));

		cls.click();

		WebElement srchbr = driver.findElement(By.xpath("//input[@type='text']"));

		WebElement srch = driver.findElement(By.xpath("//button[@type='submit']"));

		srchbr.sendKeys("mobiles of 256GB");

		srch.click();

		WebDriverWait i = new WebDriverWait(driver, Duration.ofSeconds(10));

		i.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='REDMI Note 12 Pro 5G (Stardust Purple, 256 GB)']")));
		
		WebElement rdmi12pro = driver
				.findElement(By.xpath("//div[text()='REDMI Note 12 Pro 5G (Stardust Purple, 256 GB)']"));

		rdmi12pro.click();

		Set<String> ids = driver.getWindowHandles();

		Iterator<String> rdids = ids.iterator();

		String id1 = rdids.next();

		String id2 = rdids.next();

		driver.switchTo().window(id2);

		WebElement blckclr = driver.findElement(By.xpath("(//div[@class='_2C41yO'])[2]"));

		blckclr.click();

	}

}
