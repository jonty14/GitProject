package demoselenium;

import java.awt.AWTException;
import java.awt.Robot;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.glass.events.KeyEvent;

public class Popup {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		  FirefoxDriver dv=new FirefoxDriver();
		  dv.manage().window().maximize();
		  dv.get("https://www.facebook.com/");
		  Robot rb = new Robot();
		  rb.keyPress(KeyEvent.VK_CONTROL);
		  rb.keyPress(KeyEvent.VK_P);
		  rb.keyRelease(KeyEvent.VK_CONTROL);
		  rb.keyRelease(KeyEvent.VK_P);
		  
		  Thread.sleep(3000);
		  for(int i=1;i<=1;i++){

			  	  
			  rb.keyPress(KeyEvent.VK_TAB);
			  rb.keyRelease(KeyEvent.VK_TAB);
			  rb.keyPress(KeyEvent.VK_3);
			  rb.keyRelease(KeyEvent.VK_3);
			  Thread.sleep(1000);
			  
		  }
		  rb.keyPress(KeyEvent.VK_2);
		  rb.keyRelease(KeyEvent.VK_2);
		  Thread.sleep(1000);
		  for(int i=1;i<=2;i++){
			  rb.keyPress(KeyEvent.VK_TAB);
			  rb.keyRelease(KeyEvent.VK_TAB);
			  Thread.sleep(1000);
			  
		  }
		  
		  rb.keyPress(KeyEvent.VK_ENTER);
		  rb.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(1000);
		  
		 
		  
		 
	}

}
