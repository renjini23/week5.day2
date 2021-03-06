package week5.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data{
	public static String[][] readData() throws IOException {
		XSSFWorkbook wb=new XSSFWorkbook("./data/CreateLead.xlsx");
		XSSFSheet ws = wb.getSheet("Sheet1");
		int rowCount=ws.getLastRowNum();
		short cellNum = ws.getRow(0).getLastCellNum();
		String[][] data=new String[rowCount][cellNum];
		for(int i=1;i<=rowCount;i++) {
			for(int j=0;j<cellNum;j++) {
				String text=ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(text);
				data[i-1][j]=text;
			}
		}
		return data;
	}
	
	


}
