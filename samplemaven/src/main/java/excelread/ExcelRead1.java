package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead1 {
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet s;

	public static String getStringdData(int a, int b) throws IOException
	{
		f=new FileInputStream("C:\\Users\\usre\\Desktop\\Book1.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet("Sheet1");
		XSSFRow r=s.getRow(a);//get row
		XSSFCell c=r.getCell(b);//get column
		return c.getStringCellValue(); //get string value
		
		
	}
	public static int getIntegerData(int a,int b) throws IOException  
	{
		f=new FileInputStream("C:\\Users\\usre\\Desktop\\Book1.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet("Sheet1");
		XSSFRow r=s.getRow(a);//get row
		XSSFCell c=r.getCell(b);//get column
		
		int x=(int)c.getNumericCellValue();//add cast to integer (type casting(convert double to integer by default double value))
		return x;
		
	}


	public static void main(String[] args) throws IOException {
		
		System.out.println(ExcelRead1.getStringdData(1, 0));// we give row index 1,0 for name 
		System.out.println(ExcelRead1.getIntegerData(1, 1));//index of column of salary 1,1
		System.out.println(ExcelRead1.getStringdData(2, 0));
		System.out.println(ExcelRead1.getIntegerData(2, 1));
		System.out.println(ExcelRead1.getStringdData(3, 0));
		System.out.println(ExcelRead1.getIntegerData(3, 1));

	

	}

}
