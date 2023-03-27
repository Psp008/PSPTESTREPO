package POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import Configurations.Path;
public class Utility1 {

	public static String rdxceldt(int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream f2 = new FileInputStream(Path.excel);
		 
		//DataFormatter d1 = new DataFormatter();
		
		DataFormatter d1 = new DataFormatter();
		
		Sheet sht1 = WorkbookFactory.create(f2).getSheet("UP");
		
		//String data1 = d1.formatCellValue(sht1.getRow(row).getCell(cell));
		
		//String data1 = sht1.getRow(row).getCell(cell).getStringCellValue();
		
		String data1 = d1.formatCellValue(sht1.getRow(row).getCell(cell));
		
		return data1;
	}
	
	
}
