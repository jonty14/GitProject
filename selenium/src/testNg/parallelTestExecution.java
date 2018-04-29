package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parallelTestExecution {
	public WebDriver dv;
	@Parameters("browser")
	@BeforeTest
	public void launchBrowser(String browser){
		if(browser.equalsIgnoreCase("firefox")){
			dv=new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\abc\\Desktop\\Selenium\\selenium\\Drivers\\chromedriver.exe");
			dv=new ChromeDriver();
		}
		
	}
  @Test(priority=1)//to set the priority of the test cases
  public void tc_1() {
	  dv.get("https://www.facebook.com");
	  System.out.println("My first test case");
  }
  @Test(priority=0)//to set the priority of the test cases
  public void tc_2() {
	  dv.get("https://www.gmail.com");
	  System.out.println("My second test case");
  }
  /*@Test
  public void tc_2() {
	  System.out.println("My Second test case");
  }
  @Test
  public void tc_3() {
	  System.out.println("My Third test case");
  }*/
}
