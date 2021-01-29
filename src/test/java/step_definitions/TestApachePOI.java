package step_definitions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestApachePOI {
	
	

	public static void main(String[] args) throws IOException {


		XSSFWorkbook workbook;
		XSSFSheet sheet;
		XSSFRow row;
		XSSFCell cell;
		
		
		FileInputStream excelFile = new FileInputStream("testData.xlsx");
		
		workbook = new XSSFWorkbook(excelFile);
		
		sheet = workbook.getSheet("Sheet1");
		
		row = sheet.getRow(0);
		
		System.out.println(row.getCell(0));
		
		
		

	}

}
