package Parametarization;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class A {
	public static void main(String[] args) throws Throwable {
		FileInputStream file=new FileInputStream("E:\\software testing\\data.xlsx");
		String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
		System.out.println(data);
	}
	

}
//it is used to fetch the data from excel sheet

///if data is in text then we use getStringCellValue()...return type string
//if data is in numeric then we use getNumericCellValue()....return type double
//if data is boolean like true or false then we use getBooleanCellValue()...return type boolean