
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelReader {
	XSSFWorkbook wb = null;
	XSSFSheet sheet1 = null;
	FileInputStream fis = null;

	public excelReader(String excelPath) throws IOException {

		try {
			File src = new File(excelPath);
			fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public String getData(int sheet, int row, int col) {

		sheet1 = wb.getSheetAt(sheet);
		String data = sheet1.getRow(row).getCell(col).getStringCellValue();

		return data;

	}

	public String pickAllValues(int sheet) {
		String B = null;
		sheet1 = wb.getSheetAt(sheet);
		int rowNum = sheet1.getLastRowNum();
		for (int i = 0; 1 <= rowNum; i++) {
			int totalColumns = sheet1.getRow(i).getPhysicalNumberOfCells();
			System.out.println(totalColumns);

			for (int j = 0; j <= totalColumns; j++) {
				if ((sheet1.getRow(i).getCell(j).getStringCellValue()).equals("a")) {
					B = B + sheet1.getRow(i).getCell(j).getStringCellValue();
				}
				
			}
		

		}
		return B;

	}
}
