package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PageObjectModel.facebook_login;

public class LoginToFB {
	public WebDriver dv;
	@Parameters("browser")
	@BeforeTest
	public void launchBrowser(String browser){
		if(browser.equalsIgnoreCase("firefox")){
			dv=new FirefoxDriver();
			dv.get("https://www.facebook.com");
		}else if(browser.equalsIgnoreCase("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\abc\\Desktop\\Selenium\\selenium\\Drivers\\chromedriver.exe");
			dv=new ChromeDriver();
			dv.get("https://www.facebook.com");
		}
		
	}
  @Test
  public void loginFB() throws InterruptedException {
	 facebook_login.Email(dv).sendKeys("jonty.bose@gmail.com");
	 facebook_login.Password(dv).sendKeys("Patka@1415");
	 Thread.sleep(2000);
	 facebook_login.Login(dv).click();
	 dv.quit();
	  
	
  }
  
}
