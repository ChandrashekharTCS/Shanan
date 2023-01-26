package Parametarization;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//here we use string type data
public class B {
	public static void main(String[] args) throws Throwable {
		FileInputStream file=new FileInputStream("C:\\Users\\CHANDRASHEKHAR\\Desktop\\data.xlsx");
		String data = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
	}

}
