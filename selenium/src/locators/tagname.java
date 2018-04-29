package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tagname {

		/*Tag Name locator is used to find the elements matching the specified Tag Name.
	    *It is very helpful when we want to extract the content within a Tag.*/
	
	/* How do we get the number of link from a webpage--CTS interview question*/ 
	
	public static void main(String[] args) {
		
		
			WebDriver dv=new FirefoxDriver();
			dv.manage().window().maximize();
			dv.get("https://www.google.com");
			List <WebElement> list = dv.findElements(By.tagName("a"));
			System.out.println("Number of links: "+list.size());
			for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i).getText());
			} 

		

	}

}
