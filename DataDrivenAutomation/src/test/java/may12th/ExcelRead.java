package may12th;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	public static void main(String[] args) throws IOException {
		
		
	 FileInputStream  f1=	new FileInputStream("D:\\002 Live Tech\\Book1.xlsx");
	 
	 XSSFWorkbook wb=new XSSFWorkbook(f1);
	 
	 XSSFSheet  ws=wb.getSheet("Sheet1");
	 
	 System.out.println("LastRowNum "+ws.getLastRowNum());
	 
	 System.out.println("PhysicalNumberOfRows "+ws.getPhysicalNumberOfRows());
	 
	 System.out.println("LastCellNum "+ws.getRow(1).getLastCellNum());
	 
	 System.out.println("PhysicalNumberOfCells"+ws.getRow(1).getPhysicalNumberOfCells());
	 
	 Row row=null;
	 Cell cell=null;
	 
	 for(int i=0;i<=ws.getLastRowNum();i++)
	 {
		 row=ws.getRow(i);
		 
		 for(int j=0;j<row.getLastCellNum();j++)
		 {
			cell= row.getCell(j);
			
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
