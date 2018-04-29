package demoTestNG;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DummyTC {
	
	FirefoxDriver dv ;
	
  @Test(priority=1)
  public void f1() throws InterruptedException {
	  		
		 dv.get("http://www.google.com");
		 Thread.sleep(3000);
		 
  }
  
  @Test(priority=0)
  public void f2() throws InterruptedException {
	  
		 dv.get("http://www.yahoo.com");
		 Thread.sleep(3000);
		 
  }
  
  
  @BeforeMethod
  public void f3() {
	  dv =new FirefoxDriver();
  }
  
  @AfterMethod
  public void f4() {
	  dv.quit();
  }
}
