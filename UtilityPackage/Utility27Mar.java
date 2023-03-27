package UtilityPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility27Mar {

	static String excel1;
	
	public static String readxclsht(int row, int cell) throws EncryptedDocumentException, IOException
	{
		
		FileInputStream fi = new FileInputStream("E:\\Study\\TestData1.xlsx");
		
		Sheet sht1 = WorkbookFactory.create(fi).getSheet("UP");
		
		DataFormatter df = new DataFormatter();
		
		String excel1 = df.formatCellValue(sht1.getRow(row).getCell(cell));
	
		return excel1;
		
	}
	
}
