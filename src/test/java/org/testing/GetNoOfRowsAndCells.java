package org.testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class GetNoOfRowsAndCells {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\praba\\Testing\\target\\Testdata\\FindSize.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet s = w.getSheet("number");
		
		Row r = s.getRow(2);
		Cell c = r.getCell(2);
	
		int a = s.getPhysicalNumberOfRows();
		int b = r.getPhysicalNumberOfCells();
		
		System.out.println("physical no of rows is "+a);
		System.out.println("physical no of cells is "+b);
	    System.out.println(c);
	
	}

}
