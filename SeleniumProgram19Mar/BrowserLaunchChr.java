package SeleniumProgram19Mar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import path1.AllPath;

public class BrowserLaunchChr {

	public static void main(String[] args) {
		
		browsrlnch();

	}

	
	public static void browsrlnch()
	{
		//System.setProperty("webdriver.chrome.driver", AllPath.chrmpth);
		
		WebDriver driver = new ChromeDriver();
	}
	
}
