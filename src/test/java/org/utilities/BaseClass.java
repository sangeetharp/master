package org.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Action a;
	public static Select s;
	public static Long l;
	public static Alert al;
	public static Long TimeoutSeconds;
//1
	public static void launchChrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
//2
	public static void winMax() {
		driver.manage().window().maximize();
	}
//3	
	public static void loadUrl(String value) {
		driver.get(value);
	}
//4
	public static void printTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
//5
	public static void printCurrentUrl() {
		System.out.println(driver.getCurrentUrl());
	}
//6
	public static void fill(WebElement ele,String s) {
ele.sendKeys(s);
		
	}
//7

	
	public static void btnClick(WebElement m) {
		m.click();
	}
//8	
	public static void rightClick(WebElement ele) {
		Actions a=new Actions(driver);
		a.contextClick(ele);
	}
//9	
	public static void contextC(WebElement ele) {
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
	}
//10	
	public static void copyAndPaste(WebElement src,WebElement tar) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src, tar).perform();
	}
//11	
	public static void selectByText(WebElement ele,String value) {
	Select s=new Select(ele);
	s.selectByVisibleText(value);
	}
//12	
	public static void selectByIn(WebElement ele,int i) {
		Select s=new Select(ele);
		s.selectByIndex(i);
	}
//13	
	public static void selectByVal(WebElement ele,String value) {
		Select s=new Select(ele);
		s.selectByValue(value);

	}
//14	
	public static void unSelectAll(WebElement ele) {
		Select s=new Select(ele);
		s.deselectAll();

	}
//15	
	public static void unselectByIndex(WebElement ele,int i) {
		Select s=new Select(ele);
		s.deselectByIndex(i);
	}
//16	
	public static void unselectByValue(WebElement ele,String value) {
	
		Select s=new Select(ele);
		s.deselectByValue(value);

	}
//17	
	public static void getAllSelectedOpt(WebElement ele) {
		Select s=new Select(ele);
		s.getAllSelectedOptions();

	}
//18	
	public static void moveTheMouse(WebElement ele) {
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();

	}
//19	
	public static void toCaps(String str) {
	str.toUpperCase();


	}
//20	
	public static void toSmall(String str){
		str.toLowerCase();
	}
//21	
	public static void cutShort(String str) {
		str.trim();
	}
//22	
	public static void longClickHold() {
		Actions a=new Actions(driver);
		a.clickAndHold().perform();

	}
//23	
	public static void longClickholdAtElement (WebElement ele) {
		Actions a=new Actions(driver);
		a.clickAndHold(ele).perform();;

	}
//24	
	public static void clickAElement (WebElement ele) {
		Actions a=new Actions(driver);
		a.click(ele).perform();;

	}
//25	
	public static void closeATab() {
		driver.close();
	}
//26	
	public static void closeABrowser() {
		driver.quit();
	}
//27	
	public static void fullWindow() {
		driver.manage().window().fullscreen();
	}
//28
	public static void launchFirefox() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	

	}
//29
	public static void launchEdgeDriver() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	

	}
//30
	public static void toReplace(String str,int val) {
	str.charAt(val);

	}
//31
	public static void compareTwoString(String str,String str1) {
	str.compareTo(str1);
	}
//32
	public static void addTwoString(String str,String str1) {

	str.concat(str1);
	}
//33
	public static void compareTwoStringsIgnoringSpace(String str,String str1) {
str.compareToIgnoreCase(str1);
	}
//34	
	public static void isStringEndsWith(String str,String value) {
boolean endsWith = str.endsWith(value);
System.out.println(" The string ends with is ?"+endsWith  );
	}
//35	
	public static void containsChar(String str,String value) {
boolean contains = str.contains(value);
System.out.println("The string contains the character is "+contains);
}
//36	
	public static void isEqualsTo(String str,String str1) {
boolean equals = str.equals(str1);
System.out.println("The string is equals to another is " +equals );
	}
//37	
	public static void toGetHashCode(String str) {
		str.hashCode();

	}
//38
	public static void toGetClass() {
		driver.getClass();

	}
//39	
	public static void toWaitLong(int value)throws InterruptedException {
    driver.wait(value);
	}
//40
	public static void toGetWindowHandle() {
		driver.getWindowHandle();
		
	}
//41
	public static void toGetWindowhandles()
	{
		driver.getWindowHandles();
	}
//42
	public static void toGetPageSource(){
		driver.getPageSource();
	}
//43
	public static void toManage(){
		driver.manage();
		
	}
//44	
	public static void toNotify(){
		driver.notify(); 
	}
//45	
	public static void toNotifyAll(){
		driver.notifyAll();
	
	}
//46	
	public static void toSwitch(){
	driver.switchTo();
	}
//47	
	public static void toClear(WebElement ele){
	ele.clear();
	}
//48
	public static void toClick(WebElement ele){
	ele.click();
	}
//49
	public static void  toGetSize(WebElement ele) {
	ele.getSize();
	}
//50
	public static void  toGetLocation(WebElement ele) {
		ele.getLocation();
	}
//51
	public static void toGetAttribute(WebElement ele,String str) {
	ele.getAttribute("value");
	}
//52
	public static void toGetTagName(WebElement ele) {
	ele.getTagName();
	}
//53
	public static void toGetText(WebElement ele) {
     String b =ele.getText();
    System.out.println("The Text is " +b);
	}
//54
	public static void toGetRenderedElement(WebElement ele) {
		ele.getRect();
	}
//55
	public static void toCodeBeforeIndex (String str,int indval) {
		str.codePointBefore( indval);
		
	}
//56
	public static void toFindSuffixEnd(String str ,String str1) {
	boolean endsWith = str.endsWith(str1);
	System.out.println("The suffix ends with the given value is " +endsWith);
}
//57
	public static void itIsEmpty(String str) {
		str.isEmpty();
	}
//58
	public static void toTick() {
		Actions a=new Actions(driver);
	   a.tick().perform();
	}
//59
	public static void toDownKey(String str) {
		Actions a=new Actions(driver);
		a.keyDown(str).perform();
	}
//60
	public static void toDoubleclick(WebElement ele) {
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
	
//61
	public static void itIsBlank(String str) {
    str.isBlank();
	}
//62 
	public static void toAcceptAl() {
		Alert al=driver.switchTo().alert();
		al.accept();
	}
//63
	public static void toDismissAl() {
		Alert al=driver.switchTo().alert();
		al.dismiss();
	}
//64
	public static void toSendKeysAl(String str) {
		Alert al=driver.switchTo().alert();
	    al.sendKeys(str);	
	}
//65
	public static void toSwitchTo() {
		driver.switchTo();
	}
	
	
	
	
	
	public static String getData(int rowNumber,int cellNumber) throws IOException {
		File f=new File("C:\\Users\\praba\\Testing\\target\\Testdata\\hotel.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet s = w.getSheet("adactin");
		Row row = s.getRow(rowNumber);
		Cell cell = row.getCell(cellNumber);
		int cellType = cell.getCellType();
		String value="";
		
		if(cellType==1) {
			
			value=cell.getStringCellValue();
		}
		else if (DateUtil.isCellDateFormatted(cell)) {
			 Date d= (Date) cell.getDateCellValue();
			 SimpleDateFormat sim = new SimpleDateFormat("dd-mm-yyyy");
			 value=sim.format(d);
			
		}
		else {
			double d=cell.getNumericCellValue();
			long l=(long)d;
			value=String.valueOf(l);
		}
		return value;
		
	}
	
	public static void addVAlueToExcelSheet(int rowNo,int cellNo,String ghi) throws IOException {
		File f=new File("C:\\Users\\praba\\Testing\\target\\Testdata\\hotel.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet s = w.getSheet("adactin");
		//Row r = s.getRow(rowNo);
	//Cell c = r.getCell(cellNo);
		Cell cc = s.getRow(rowNo).createCell(cellNo);
		cc.setCellValue(ghi);
		
		 FileOutputStream fil =new FileOutputStream(f);
		    w.write(fil);
		
	}
	
	
	
   
	public static void implicitWaits(int i) {
driver.manage().timeouts().implicitlyWait(i,TimeUnit.SECONDS);
}
	

					
	
	
	public static void slowTo(long i) throws InterruptedException {
		driver.wait(i);
			}

}


