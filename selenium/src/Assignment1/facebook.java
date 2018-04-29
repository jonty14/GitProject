package Assignment1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;


public class facebook {
	public void facebook1(String Location) throws IOException, InterruptedException {
		  facebooklogin.dv=new FirefoxDriver();
		  facebooklogin.dv.get("https://www.facebook.com/");
		  facebooklogin.dv.findElement(By.id(facebook.getORval("facebook_userID"))).sendKeys("jonty.bose@gmail.com");
		  facebooklogin.dv.findElement(By.id(facebook.getORval("facebook_Password"))).sendKeys("Patka@1415");
		  facebooklogin.dv.findElement(By.id(facebook.getORval("facebook_Login"))).click();
		  Thread.sleep(3000);
		  facebooklogin.dv.findElement(By.name(facebook.getORval("facebook_Search"))).sendKeys(Location);
		  //Dimension result=facebooklogin.dv.findElement(By.name(facebook.getORval("facebook_Search"))).getSize();
		  //System.out.println(result);
		  Thread.sleep(3000);
		  facebooklogin.dv.findElement(By.xpath(facebook.getORval("facebook_search_submitButton"))).click();
		  Thread.sleep(15000);
		  int a=facebooklogin.dv.findElements(By.xpath("//div[@class='_3-qq']/div")).size();
		  System.out.println(a);
		  for(int i=1;i<=a;i++){
			 
		  String name=facebooklogin.dv.findElement(By.xpath("//div[@class='_3-qq']/div["+i+"]/div/div/div/div/div/div[1]/div[2]/div/div/div/a/div")).getText();
		  System.out.println(name);
			 }
		 }
		
	  
	  public String readExcel(int row,int col) throws IOException{
		  File fl=new File("C:\\Users\\abc\\Desktop\\Selenium\\selenium\\TestData\\FacebookSearch.xls");
		  FileInputStream fis=new FileInputStream(fl);
		  HSSFWorkbook wb=new HSSFWorkbook(fis);
		  HSSFSheet st=wb.getSheetAt(0);
		  HSSFRow rw=st.getRow(row);
		  HSSFCell cl=rw.getCell(col);
		  String data=cl.getStringCellValue();
		  wb.close();
		  return data;
		  }
	  
	  public int getRowCount() throws IOException{
		  File fl=new File("C:\\Users\\abc\\Desktop\\Selenium\\selenium\\TestData\\FacebookSearch.xls");
		  FileInputStream fis=new FileInputStream(fl);
		  HSSFWorkbook wb=new HSSFWorkbook(fis);
		  HSSFSheet st=wb.getSheetAt(0);
		  int rowCount=st.getLastRowNum()-st.getFirstRowNum();
		  wb.close();
		  return rowCount;
		  
		  
	  }
	  public static String getORval(String key) throws IOException{
			File fl = new File("C:\\Users\\abc\\Desktop\\Selenium\\selenium\\OR\\facebooklogin.properties");
			FileInputStream fis = new FileInputStream(fl);
			Properties prop = new Properties();
			prop.load(fis);
			String data = prop.getProperty(key);
			return data;
			
		}

	  
}
