package SeleniumProgram19Mar;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import path1.AllPath;

public class Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		//System.setProperty("webdriver.chrome.driver", "chromepath");
		
		ChromeOptions c = new ChromeOptions();
		
		c.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(c);
		
		driver.manage().window().maximize();
		
		driver.get(AllPath.fblgn);
		
		WebElement usrem = driver.findElement(By.xpath("//input[@type='text']"));
		
		WebElement pswd = driver.findElement(By.xpath("//input[@type='password']"));

		FileInputStream fi = new FileInputStream("E:\\Study\\TestData1.xlsx");
		
		Sheet sht1 = WorkbookFactory.create(fi).getSheet("UP");
		
		DataFormatter df = new DataFormatter();
		
		String usremid = df.formatCellValue(sht1.getRow(2).getCell(0));
		
		String pswwd = df.formatCellValue(sht1.getRow(2).getCell(1));
		
		usrem.sendKeys(usremid);
		
		pswd.sendKeys(pswwd);

		
		
		
		
		
		
		
	}

}
