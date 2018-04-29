package demoselenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo {

	public static FirefoxDriver dv;

	public static void main(String[] args) throws InterruptedException, IOException {
		
		demo obj = new demo();
		for(int i=1;i<=obj.getRowCount();i++){
		obj.searchGoogle(obj.readExcel(i, 0));
		//obj.searchGoogle(obj.readExcel(2, 0));
		}
	}
	
	public void searchGoogle(String loc) throws InterruptedException{
		 FirefoxDriver dv=new FirefoxDriver();
		 dv.get("http://www.google.com");
         dv.findElement(By.id("lst-ib")).sendKeys(loc);
         Thread.sleep(3000);
         dv.findElement(By.xpath(".//*[@id='sbtc']/div[2]/div[2]/div[1]/div/ul/li[11]/div/span[1]/span/input")).click();
         Thread.sleep(4000);
         dv.findElement(By.linkText(loc+" - Wikipedia")).click();
         Thread.sleep(4000);
         dv.quit();
	}
	
	public String readExcel(int row, int col) throws IOException{
		
		File fl = new File("C:\\Users\\abc\\Desktop\\Selenium\\selenium\\TestData\\GoogleTestData.xls");
		FileInputStream fis = new FileInputStream(fl);
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet st = wb.getSheetAt(0);
		HSSFRow rw = st.getRow(row);
		HSSFCell cl = rw.getCell(col);
		String data = cl.getStringCellValue();
		wb.close();
		return data;
		
	}

public int getRowCount() throws IOException{
		
		File fl = new File("C:\\Users\\abc\\Desktop\\Selenium\\selenium\\TestData\\GoogleTestData.xls");
		FileInputStream fis = new FileInputStream(fl);
		
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet st = wb.getSheetAt(0);
		int rowCount = st.getLastRowNum()-st.getFirstRowNum();
		wb.close();
		return rowCount;
		
	}
}