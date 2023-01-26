package Parametarization;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//add boolean type data
public class D {
	public static void main(String[] args) throws Throwable {
		FileInputStream file=new FileInputStream("C:\\Users\\CHANDRASHEKHAR\\Desktop\\data.xlsx");
		boolean data = WorkbookFactory.create(file).getSheet("sheet1").getRow(13).getCell(8).getBooleanCellValue();
		System.out.println(data);
	}

}
////for string type data we use getStringCellValue() its return type string
///for numeric data we use getNumericCellValue() its return type is double
///for boolean data we use getBooleanCellValue() its return type is boolean