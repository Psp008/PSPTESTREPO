package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import path1.AllPath;

public class BC27Mar {

	protected static WebDriver driver;

	public void m1(String b)
	{
		ChromeOptions c = new ChromeOptions();
		c.addArguments("--remote-allow-origins=*");
		
		if(b.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver(c);
		}
		
		else if(b.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
		}
		
		else if(b.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("Not supported");
		}
		
		driver.manage().window().maximize();
		driver.get(AllPath.instlgn);
	}
	
}
