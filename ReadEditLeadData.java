package week5.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadEditLeadData {
	public static String[][] readData() throws IOException
	{
		
		XSSFWorkbook wb=new XSSFWorkbook("./data/Edit_Lead_Details.xlsx");
		XSSFSheet ws = wb.getSheet("Sheet1");
		int rowNum = ws.getLastRowNum();
		short colNum = ws.getRow(0).getLastCellNum();
		String[][] data=new String[rowNum][colNum];
		for(int i=1;i<=rowNum;i++) {
			for(int j=0;j<colNum;j++) {
				String dataValue = ws.getRow(i).getCell(j).getStringCellValue();
				data[i-1][j]=dataValue;
			}
		}
		return data;
		
	}
	

}
