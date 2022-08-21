package Reading_data_from_excel;

import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.*;


public class Read_data1 {

	public static void main(String[] args) throws IOException {
		
		
		
      // String path = "C:\\Users\\ha890\\eclipse-workspace\\Reading_excel_data\\exceldata\\Reading_test_data.xlsx";
		String path = ".\\datafiles\\Reading_test_data.xlsx";
	   FileInputStream inputstream = new FileInputStream(path);
	   
	   XSSFWorkbook wb = new XSSFWorkbook(inputstream);
	   XSSFSheet sheet = wb.getSheet("Sheet1");
	   //or
	   //XSSFSheet sheet = wb.getSheetAt(0);
	   
	   
	   // USING FOR LOOP
	   int rows = sheet.getLastRowNum();
	   int cols = sheet.getRow(1).getLastCellNum();
	   
	   for(int r=0; r<=rows; r++) {
		   XSSFRow row = sheet.getRow(r);
		   for(int c=0; c<cols; c++) {
			   XSSFCell cell = row.getCell(c);
			   
			   switch(cell.getCellType())
			   {
			   case STRING: System.out.print(cell.getStringCellValue()); 
			   break;
			   case NUMERIC: System.out.print(cell.getNumericCellValue()); 
			   break;
			   case BOOLEAN: System.out.print(cell.getBooleanCellValue()); 
			   break;
			
			 }
			   System.out.print("  |  ");
			   
		   }
		   System.out.println();
	   }
	   
	}

}
