package importantExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

import org.openqa.selenium.firefox.FirefoxDriver;

//To find the number of link present in the Browser

public class NumofLinkpresentinBrowser {
	
public static WebDriver dv; //here dv is static varibale
	
	public static void main(String[] args) throws InterruptedException {
		dv=new FirefoxDriver();
		dv.get("https://www.google.com");
		List<WebElement> li=dv.findElements(By.xpath("//a"));
		System.out.println(li.size());//To find the number of element present in the list
	}

}
