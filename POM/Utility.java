package POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import Configurations.Path;

public class Utility {

	public static String readexceldata(int row, int cell) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream f1 = new FileInputStream(Path.excel);
		
		DataFormatter k = new DataFormatter();
		
		Sheet sht = WorkbookFactory.create(f1).getSheet("UP");
		
		//String usrid = k.formatCellValue(sht.getRow(1).getCell(0));
		//System.out.println(usrid);
		//String pswd = k.formatCellValue(sht.getRow(1).getCell(1));
		//System.out.println(pswd);

		String data = k.formatCellValue(sht.getRow(row).getCell(cell));
	
		return data;
	
	
	}

	
}
