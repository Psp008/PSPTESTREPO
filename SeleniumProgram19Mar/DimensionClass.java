package SeleniumProgram19Mar;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import path1.AllPath;

public class DimensionClass {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "chromepath");

		ChromeOptions c = new ChromeOptions();
		
		c.addArguments("--remote-allow-origins=*");
		
		WebDriver d = new ChromeDriver(c);
		
		d.manage().window().maximize();
		
		d.get(AllPath.amazon);
		
		Dimension dm = new Dimension(100, 200);
		
		d.manage().window().setSize(dm);
		
		Point p = new Point(150, 200);
		
		d.manage().window().setPosition(p);
		
		
		
		
		
	}

}
