package Assignment1;


import java.io.IOException;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.Test;




public class facebooklogin {
	static facebook fb;
	static FirefoxDriver dv;
	@Test
	
	public void facebook1() throws IOException, InterruptedException{
		fb= new facebook();
		for(int i=1;i<=fb.getRowCount();i++){
		fb.facebook1(fb.readExcel(i, 0));
		//obj.searchGoogle(obj.readExcel(2, 0));
		}
		
	}
	
	
	@AfterClass
	public void close(){
	dv.quit();
}

}
