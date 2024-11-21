package GenericUtility;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public String getDtaFromExcel(String SheetName,int rownum,int cellnum) throws Exception {
		FileInputStream fis=new FileInputStream(IpathConstant.Excelpath);
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(SheetName);
		Row r=sh.getRow(rownum);
		Cell c=r.getCell(cellnum);
		DataFormatter df=new DataFormatter();
		String value=df.formatCellValue(c);
		System.out.println(value);
		return value;
}
}
