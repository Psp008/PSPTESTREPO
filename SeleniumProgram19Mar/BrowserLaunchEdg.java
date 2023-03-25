package SeleniumProgram19Mar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import path1.AllPath;

public class BrowserLaunchEdg {

	public static void main(String[] args) {
		
		brwsrlnch();
		
	}

	public static void brwsrlnch()
	{
		
		//System.setProperty("webdriver.edge.driver", AllPath.chrmpth);
		
		WebDriver driver = new EdgeDriver();
		
		
	}
	
}
