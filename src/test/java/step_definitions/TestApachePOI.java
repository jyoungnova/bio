package step_definitions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import utilities.ExcelUtils;

public class TestApachePOI {
	
	

	public static void main(String[] args) throws IOException {

    //  HSSFWorkbook ->  HSSF -> Excel files from 95-2003, files with extension .xls
		
        XSSFWorkbook workbook; 
		XSSFSheet sheet;
		XSSFRow row;
		XSSFCell cell;
		
		
		FileInputStream excelFile = new FileInputStream("testData.xlsx");
		
		workbook = new XSSFWorkbook(excelFile);
		
		sheet = workbook.getSheet("Sheet1");
		
		row = sheet.getRow(0);
		
		cell = row.getCell(0);
		
		System.out.println(cell);
		
		int noOfRows = sheet.getPhysicalNumberOfRows();
		
		System.out.println(noOfRows);
		
		int noOfColumns = sheet.getRow(0).getLastCellNum();
		
		System.out.println(noOfColumns);
		
		
		for (int i = 0; i < noOfRows; i++) {
			
			
			for (int j = 0; j < noOfColumns; j++) {
				
				System.out.print(sheet.getRow(i).getCell(j) + "\t");
				
			}
			System.out.println();
			
		}
		
		
		XSSFCell product = sheet.getRow(0).getCell(1);
		System.out.println(product);
		
		product.setCellValue("Dresses");
		
		FileOutputStream fos = new FileOutputStream("testData.xlsx");
		workbook.write(fos);
		
		fos.close();
		
		excelFile.close();
		
		
		ExcelUtils excel = new ExcelUtils("testData.xlsx", "Sheet1");
		
		System.out.println(excel.getCellData(2, 1));
		
		System.out.println(Arrays.deepToString(excel.getDataAs2DArray()));
		
		
		List<Map<String, String>> dataAsMap = excel.getDataAsMap();
		
		for (Map<String, String> map : dataAsMap) {
			System.out.println(map);
			
		}
		
		System.out.println(excel.getColumnNames());
		
		excel.setCellData("Product", 0, 1);
		
		excel.setCellData("Blouses", "Product", 1);

	}

}
