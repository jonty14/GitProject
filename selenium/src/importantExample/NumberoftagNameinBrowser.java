package importantExample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NumberoftagNameinBrowser {
	
	
//To find how many tagName is present in the browser.	
	
public static WebDriver dv; //here dv is static varibale
	
	public static void main(String[] args) throws InterruptedException {
		dv=new FirefoxDriver();
		dv.get("https://www.google.com");
		List<WebElement> li=dv.findElements(By.tagName("a"));
		System.out.println(li.size());//To find number of element present in the list
	}

}



