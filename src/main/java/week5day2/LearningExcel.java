package week5day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearningExcel {

	/*public static Object[][] getExcelData(String filename) throws IOException {
		XSSFWorkbook wbook=new XSSFWorkbook("./data/"+filename+".xlsx");
		XSSFSheet sheet=wbook.getSheetAt(0);
		int rowLength = sheet.getLastRowNum();
		System.out.println(rowLength);
		short columnLength = sheet.getRow(0).getLastCellNum();
		Object[][] data=new Object[rowLength][columnLength];
		System.out.println(columnLength);
		for (int i = 1; i <= rowLength; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnLength; j++) {
				XSSFCell cell = row.getCell(j);
				String cellValue = cell.getStringCellValue();
				data[i-1][j]=cellValue;
				System.out.println(cellValue);
			}
		}
		wbook.close();
return data;
	}*/

	public static Object[][] getExcelData(String filename) throws IOException {
		XSSFWorkbook wbook=new XSSFWorkbook("./data/"+filename+".xlsx");
		XSSFSheet sheet=wbook.getSheetAt(0);
		int rowLength = sheet.getLastRowNum();
		System.out.println(rowLength);
		short columnLength = sheet.getRow(0).getLastCellNum();
		Object[][] data=new Object[rowLength][columnLength];
		System.out.println(columnLength);
		for (int i = 1; i <= rowLength; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnLength; j++) {
				XSSFCell cell = row.getCell(j);
				String cellValue = cell.getStringCellValue();
				data[i-1][j]=cellValue;
				System.out.println(cellValue);
			}
		}
		wbook.close();
return data;
	}

}
