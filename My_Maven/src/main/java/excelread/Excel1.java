package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel1 {
	XSSFSheet sh;
	public Excel1() throws IOException
	{
		FileInputStream f=new FileInputStream("C:\\Users\\USER\\git\\My-Maven\\My_Maven\\src\\main\\java\\my excel.xlsx");
		XSSFWorkbook w=new XSSFWorkbook(f);
		sh=w.getSheet("Sheet1");
				
	}
	public void readData()
	{
		for(Row r:sh)
		{
			for(Cell c:r)
			{
				System.out.println(c);
			}
		}
	}

}
