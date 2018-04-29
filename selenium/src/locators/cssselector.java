package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cssselector {
	public static void main (String [] args) throws InterruptedException{ 
	       WebDriver driver = new FirefoxDriver(); 
	       //driver.get("https://www.gmail.com"); 
	       /* CSS=tag#id     
	        * here Tag = input and Id = Email*/
	       
	       //driver.findElement(By.cssSelector("input#identifierId")).sendKeys("Prosenjit"); 
	       
	       driver.get("https://www.facebook.com/"); 
	       /* CSS=tag.class 
	        * here Tag = input and Class = email*/ 
	       driver.findElement(By.cssSelector("input.inputtext")).sendKeys("Prosenjit"); 
	
	} 
	

}
