package Parametarization;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.WorkbookFactory;
///use of numeric value
public class C {
	public static void main(String[] args) throws Throwable {
		FileInputStream file=new FileInputStream("C:\\Users\\CHANDRASHEKHAR\\Desktop\\data.xlsx");
		double data = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(4).getNumericCellValue();
		System.out.println(data);
	}

}
