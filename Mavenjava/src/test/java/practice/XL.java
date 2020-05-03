package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class XL {

	@Test
	public void xcel() throws IOException {
		int a = 0;
		int b = 0;
		FileInputStream fis = new FileInputStream("C:\\Users\\91782\\Desktop\\Data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		for (int i = 0; i < wb.getNumberOfSheets(); i++) {

			if (wb.getSheetName(i).equalsIgnoreCase("Credentials")) {

				XSSFSheet sheet = wb.getSheetAt(i);

				Iterator<Row> rows = sheet.iterator();

				Iterator<Cell> cells = rows.next().cellIterator();

			while(cells.hasNext()) {
				b=a;
				
				if(cells.next().getStringCellValue().equalsIgnoreCase("Password")) {
					System.out.println("Hello");
					
				}
				a++;
			}

			
			while(rows.hasNext()) {
				
				Row r=rows.next();
				
				if(r.getCell(b).getStringCellValue().equalsIgnoreCase("Password")) {
					
					Iterator<Cell>ce=rows.next().cellIterator();
					
				System.out.println(ce.next().getStringCellValue());
				
			}
			}

}
}
		
	System.out.println(b);
	}}