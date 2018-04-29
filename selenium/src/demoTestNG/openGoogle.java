package demoTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class openGoogle {
	public WebDriver dv;
	
	@BeforeClass
	@Parameters("browser")
    
  public void google(String browser) throws InterruptedException {
		if(browser.equalsIgnoreCase("CHROME")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\abc\\Desktop\\Selenium\\selenium\\Drivers\\chromedriver.exe");
			dv =new ChromeDriver();
		}
		
		if(browser.equalsIgnoreCase("FF")){
			dv =new FirefoxDriver();
		}
		dv.get("http://www.google.com");
		 Thread.sleep(3000);
		 dv.quit();
	   }
	
	 
}
