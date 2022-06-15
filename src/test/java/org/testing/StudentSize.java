package org.testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class StudentSize {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\praba\\Testing\\target\\Testdata\\STUDENT.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet s = w.getSheet("student");
		
		Row r = s.getRow(0);
		Cell c = r.getCell(2);
	
		int a = s.getPhysicalNumberOfRows();
		int b = r.getPhysicalNumberOfCells();
		System.out.println(c);//
		
		System.out.println("physical no of rows is "+a);
		System.out.println("physical no of cells is "+b);
	
}}
