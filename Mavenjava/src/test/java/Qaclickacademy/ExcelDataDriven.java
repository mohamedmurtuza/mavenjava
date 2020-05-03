package Qaclickacademy;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelDataDriven {
	
	@Test
			public void excel () throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\91782\\Desktop\\Classes\\Test1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int coloumn = 0;
	int sheets = workbook.getNumberOfSheets();
			
			
			for(int i=0; i<sheets;i++) {

				
				if(workbook.getSheetName(i).equalsIgnoreCase("Testcases1")) {
					
					
					XSSFSheet sheet =workbook.getSheetAt(i);
					
					Iterator<Row> rows= sheet.iterator();
					
					Row firstrow= rows.next();
					
					Iterator <Cell> ce = firstrow.cellIterator();
					
					int k=0;
					
					while(ce.hasNext()) {
						
						Cell value= ce.next();
						if(value.getStringCellValue().equalsIgnoreCase("Testcases")) {
							
							coloumn=k;	
							
						}
						k++;
					}
					
					
					
					
				}}
			
			System.out.println("Column Size " +coloumn);
	
			System.out.println("Hello");
			
	
	}}
