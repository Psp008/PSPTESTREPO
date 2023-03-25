package SeleniumProgram19Mar;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import path1.AllPath;

public class Screenshot {

	public static void main(String[] args) throws IOException {

		ChromeOptions c = new ChromeOptions();
		
		c.addArguments("--remote-allow-origins=*");
		
		//System.setProperty("webdriver.chrome.driver", "chromepath");
		
		WebDriver driver = new ChromeDriver(c);
		
		driver.manage().window().maximize();
		
		driver.get(AllPath.amazon);
		
		Date crndte = new Date();
		
		String scrnshtnm = crndte.toString().replace(":", "-").replace(" ", "-");
		
		TakesScreenshot scrnsht = (TakesScreenshot)driver;
		
		File Source = scrnsht.getScreenshotAs(OutputType.FILE);
		
		String path = "E:\\Study\\SS\\" + scrnshtnm + ".png";
		
		File dest = new File(path);
		
		FileHandler.copy(Source, dest);
		
	}

}
