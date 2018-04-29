package demoTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class openYahoo {
  @Test
  public void yahoo() throws InterruptedException {
	  
	  	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abc\\Desktop\\Selenium\\selenium\\Drivers\\chromedriver.exe");
	     WebDriver dv =new ChromeDriver();
		 dv.get("http://www.yahoo.com");
		 Thread.sleep(3000);
		 dv.quit();
  }
}
