package org.testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;

public class FbClass extends BaseClass{
	public static void main(String[] args) throws IOException {
		launchChrome();
		loadUrl("https://www.facebook.com/");
		fullWindow();
		
		File fi =new File("C:\\Users\\praba\\Testing\\target\\Testdata\\Fb.xlsx");
		FileInputStream fn=new FileInputStream(fi);
		Workbook w=new XSSFWorkbook(fn);
		Sheet s=w.getSheet("facebook");
		LoginPojoClass l =new LoginPojoClass();
		fill(l.getTxtusr(),"sangeetha ramasamy");
		fill(l.getTxtPass(),"Password");
		btnClick(l.getBtnLogin());
		WebElement d = l.getTxtusr();
		System.out.println(d.getAttribute("value"));
		System.out.println(s);//
		
		System.out.println("success");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//LoginPojoClass l =new LoginPojoClass();
		//fill(l.getTxtusr(),"greens");
		//fill(l.getTxtPass(),"Greens@123");
		//btnClick(l.getBtnLogin());
		
		
		//driver.findElement(By.id("email"))
	}

}
