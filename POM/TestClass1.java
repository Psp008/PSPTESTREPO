package POM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import path1.AllPath;

public class TestClass1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to(AllPath.flipkart);
		
		POM1 n = new POM1(driver);
		
		n.entrmob(Utility1.rdxceldt(4, 0));
		n.entrpwd(Utility1.rdxceldt(4, 1));
		n.lgnbtn();
		Thread.sleep(2000);
		driver.navigate().to(AllPath.flipkart);
		
		n.entrmob(Utility1.rdxceldt(5, 0));
		n.entrpwd(Utility1.rdxceldt(5, 1));
		n.lgnbtn();
	
		Thread.sleep(2000);
		driver.navigate().to(AllPath.flipkart);
		
		n.entrmob(Utility.readexceldata(19, 0));
		n.entrpwd(Utility.readexceldata(19, 1));
		n.lgnbtn();
	
	}
	
	
}
