import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class dataFromExcelHandling {

	public static void main(String[] args) throws Exception {
		
		FileInputStream src=new FileInputStream("C:\\Users\\hisah\\Desktop\\Tejaswini\\Maven\\TestData.xlsx");
		int k=0;
		int col=0;
		ArrayList arr=new ArrayList();
		

		XSSFWorkbook wb= new XSSFWorkbook(src);
		int sheetNumber =wb.getNumberOfSheets();
		for (int i=0;i<sheetNumber;i++)
		{
			if(wb.getSheetName(i).equalsIgnoreCase("Test1"))
			{
				XSSFSheet xs =wb.getSheetAt(i);
				Iterator<Row> rows = xs.iterator();
				Row Firstrow =rows.next();
				Iterator<Cell> cells = Firstrow.cellIterator();
				while(cells.hasNext())
				{
					Cell Value = cells.next();
					if(Value.getStringCellValue().equalsIgnoreCase("TestCases"))
					{
						col=k;
					}
					k++;
				}
				while(rows.hasNext())
				{
					Row r = rows.next();
					if(r.getCell(col).getStringCellValue().equalsIgnoreCase("c"))
					{
						Iterator<Cell> cv = r.cellIterator();
						while(cv.hasNext())
						{
							arr.add(cv.next().getStringCellValue());
						}
					}
					
				}
				
			}
			//return arr;
			
		}
		
	
	}

}
