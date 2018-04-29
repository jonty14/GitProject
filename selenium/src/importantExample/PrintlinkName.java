package importantExample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintlinkName {
	//To print all the link name
	
	public static WebDriver dv; //here dv is static varibale
		
		public static void main(String[] args) throws InterruptedException {
			dv=new FirefoxDriver();
			dv.get("https://www.google.com");
			List<WebElement> li=dv.findElements(By.tagName("a"));
			for(int i=0;i<li.size();i++){
			System.out.println(li.get(i).getText());//To find number of element present in the list
		
			}
		}
}
