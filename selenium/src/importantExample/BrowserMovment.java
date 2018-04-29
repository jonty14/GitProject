package importantExample;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserMovment {
	
public static WebDriver dv; //here dv is static varibale
	
	public static void main(String[] args) throws InterruptedException {
		dv=new FirefoxDriver();
		dv.get("https://www.google.com");
		for(int i=1;i<500;i++)
		{
			Point p1=new Point(i,i);
			dv.manage().window().setPosition(p1);
		}
		for(int i=500;i>1;i--){
			
			Point p1=new Point(i,i);
			dv.manage().window().setPosition(p1);
			
			
		}
		
		
	}

}
