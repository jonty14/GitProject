package demoTestNG;

import java.io.IOException;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import demoselenium.utilities;

public class demo {
	static utilities obj ;
	static FirefoxDriver dv;
  @Test
  public void searchGoogle() throws IOException, InterruptedException {
	   
	  		System.out.println("Hi");
			obj = new utilities();
			for(int i=1;i<=obj.getRowCount();i++){
			obj.searchGoogle(obj.readExcel(i, 0));
			//obj.searchGoogle(obj.readExcel(2, 0));
			}
		}
  
}
