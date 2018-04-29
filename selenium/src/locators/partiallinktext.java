package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class partiallinktext {

	public static void main(String[] args) {
		
		WebDriver dv=new FirefoxDriver();
		dv.get("https://www.google.com");
		dv.findElement(By.partialLinkText("Gma")).click();
	}

}
