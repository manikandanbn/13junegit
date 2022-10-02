import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 

public class testing {

	public static void main(String[] args) throws IOException {
	
		File f = new File("E:\\New folder\\Framework\\excel\\workbbok1112.xlsx");
	
		FileInputStream stream = new FileInputStream(f);
		
        Workbook wb = new XSSFWorkbook(stream);	 
	
        Sheet sheet = wb.getSheetAt(0);        

        int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
        System.out.println("physical row :  "+physicalNumberOfRows);
        

        Row row = sheet.getRow(0);
        
        
        int physicalNumberOfCells = row.getPhysicalNumberOfCells();
        System.out.println("physical rcells :  "+physicalNumberOfCells);
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row2 = sheet.getRow(i);
			System.out.println(row2);
			
			for (int j = 0; j <row2.getPhysicalNumberOfCells(); j++) {
			    Cell cell = row2.getCell(j);
			    System.out.println(cell);
				
			}
		}
	 
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
