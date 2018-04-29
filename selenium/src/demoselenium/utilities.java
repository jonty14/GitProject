package demoselenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
import java.util.Properties;

//import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Action;
//import org.openqa.selenium.interactions.Actions;



public class utilities {
	public static WebDriver dv;
	
	public void searchGoogle(String loc) throws InterruptedException, IOException{
		 demo.dv =new FirefoxDriver();
		 demo.dv.manage().window().maximize();
		 demo.dv.get("http://www.google.com");
		 demo.dv.findElement(By.id(utilities.getORval("google_serchbox_ID")));
		 //demo.obj.tkScreenshot();
		 Thread.sleep(5000);
		 demo.dv.findElement(By.id(utilities.getORval("google_serchbox_ID"))).sendKeys(loc);
		 Thread.sleep(5000);
		 try{
			 demo.dv.findElement(By.xpath(".//*[@id='sbse0']/div[2]")).click();
		 }catch(Exception e){
			 System.out.println("Element not found");
		 }
		 Thread.sleep(5000);
		 //demo.dv.findElement(By.name(utilities.getORval("google_searchbtn_NAME"))).click();
         //Thread.sleep(2000);
         //demo.obj.tkScreenshot();
         
         //try{
        	 demo.dv.findElement(By.linkText(loc+" - Wikipedia")).click();
         //}catch(Exception e){
        	 //demo.obj.tkScreenshot(); 
         //}
         Thread.sleep(3000);
         
         demo.dv.quit();
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

public static String getORval(String key) throws IOException{
	File fl = new File("C:\\Users\\abc\\Desktop\\Selenium\\selenium\\OR\\google.properties");
	FileInputStream fis = new FileInputStream(fl);
	Properties prop = new Properties();
	prop.load(fis);
	String data = prop.getProperty(key);
	return data;
	
}

/*public void tkScreenshot() throws IOException{
	
	String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
	File scrFile = ((TakesScreenshot)demo.dv).getScreenshotAs(OutputType.FILE);
	// Now you can do whatever you need to do with it, for example copy somewhere
	FileUtils.copyFile(scrFile, new File("C:\\Users\\abc\\Desktop\\Selenium\\selenium\\Screenshot\\screenshot_"+timeStamp+".png"));
	
	
}*/


}
