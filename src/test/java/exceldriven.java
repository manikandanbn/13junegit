import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceldriven {

	public static void main(String[] args) throws IOException  {
		
		File f = new File("E:\\New folder\\Framework\\excel\\workbbok1112.xlsx");
		FileInputStream stream = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(stream);
		Sheet sheet = wb.getSheet("sheet1");
	 
		Row row = sheet.getRow(2);
		
		Cell cell = row.getCell(2);
		
		System.out.println(cell);
				 
				
				
				
			}
	
	
	
	
}
		
		
		
	

