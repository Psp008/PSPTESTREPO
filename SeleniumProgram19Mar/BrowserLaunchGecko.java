package SeleniumProgram19Mar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import path1.AllPath;

public class BrowserLaunchGecko {

	public static void main(String[] args) {
		
		brwsrlnch();
		
	}

	public static void brwsrlnch()
	{
		
	  //System.setProperty("webdriver.gecko.driver", AllPath.chrmpth);
		
		WebDriver driver = new FirefoxDriver();
		
	}
	
}
