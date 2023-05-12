package may12th;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {
		
		FileInputStream  f1=	new FileInputStream("D:\\002 Live Tech\\Book1.xlsx");
		 
		 XSSFWorkbook wb=new XSSFWorkbook(f1);
		 
		 XSSFSheet  ws=wb.getSheet("Sheet1");
		 
		 //case 1: modifying an existing cell
		 
		// ws.getRow(1).getCell(2).setCellValue(456);
		 
		 //case 2: creating a cell in existing row
		 
		 //ws.getRow(2).createCell(2).setCellValue("Passed");
		 
		 //case 3: create Row and cell in it
		 
		 ws.createRow(4).createCell(0).setCellValue("Live Tech");
		 
		FileOutputStream fos= new FileOutputStream("D:\\002 Live Tech\\Book1.xlsx");
		
		wb.write(fos);
		
		wb.close();
		

	}

}
