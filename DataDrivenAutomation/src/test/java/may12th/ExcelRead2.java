package may12th;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead2 {
	
	public static void main(String[] args) throws IOException {
		
		
	 FileInputStream  f1=	new FileInputStream("D:\\002 Live Tech\\Book1.xlsx");
	 
	 XSSFWorkbook wb=new XSSFWorkbook(f1);
	 
	 XSSFSheet  ws=wb.getSheet("Sheet1");
	 
	 Iterator<Row> rows=ws.rowIterator();
	 
	 Row row=null;
	 Cell cell=null;
	 
	 while(rows.hasNext())
	 {
		 row=rows.next();
		 
		 Iterator<Cell> cells=row.cellIterator();
		 
		 while(cells.hasNext())
		 {
			 cell=cells.next();
			 
			 if(cell.getCellType()==CellType.STRING)
				{
					 System.out.println(cell.getStringCellValue()+" is String ");
				}
				else if(cell.getCellType()==CellType.NUMERIC)
				{
					 System.out.println(cell.getNumericCellValue()+" is a Number");
				}
				else if(cell.getCellType()==CellType.BOOLEAN)
				{
					 System.out.println(cell.getBooleanCellValue()+" is boolean");
				}
				
		 }
		 
	 }
	 
	 
	}
	
	

}
