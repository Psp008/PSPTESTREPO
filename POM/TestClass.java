package POM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	
		
		driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		POMDEMO d = new POMDEMO(driver);
		
		//d.entrusrid("Hitashreedeore1999@gmail.com");
		//d.entrpwd("Hd@12345");
		//d.lgn();
		
		//Thread.sleep(2000);
		
		//driver.navigate().to("https://www.facebook.com/");
		//d.entrusrid("piyushpohare15@gmail.com");
		//d.entrpwd("Pp@12345");
		//d.lgn();
		
		
		d.entrusrid(Utility.readexceldata(1, 0));
		d.entrpwd(Utility.readexceldata(1, 1));
		d.lgn();
		
		Thread.sleep(2000);
		
		
		driver.navigate().to("https://www.facebook.com/");
		d.entrusrid(Utility.readexceldata(2, 0));
		d.entrpwd(Utility.readexceldata(2, 1));
		d.lgn();
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.facebook.com/");
		d.entrusrid(Utility.readexceldata(3, 0));
		d.entrpwd(Utility.readexceldata(3, 1));
		d.lgn();
		
		
		
			}
	
		
	
	

}
