package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class classname {

	public static void main(String[] args) {
		WebDriver dv=new FirefoxDriver();
		dv.manage().window().maximize();
		dv.get("https://www.google.com");
		//dv.findElement(By.className("gsfi")).sendKeys("Delhi");
		dv.findElement(By.id("lst-ib")).sendKeys("Kolkata");

	}

}
