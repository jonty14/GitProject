package importantExample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//Copy and paste text from any field

public class CopynPaste {
	
	public static WebDriver dv; //here dv is static varibale
	
	public static void main(String[] args) throws InterruptedException {
		dv=new FirefoxDriver();
		dv.get("https://www.gmail.com");
		WebElement e=dv.findElement(By.id("Email"));
		e.sendKeys("jonty.bose");
		e.sendKeys(Keys.CONTROL,"a");//we can use any of this commands
		e.sendKeys(Keys.CONTROL,"c");
		/*dv.findElement(By.id("Email")).sendKeys("jonty.bose");
		dv.findElement(By.id("Email")).sendKeys(Keys.CONTROL,"a");
		dv.findElement(By.id("Email")).sendKeys(Keys.CONTROL,"c");*/
		Thread.sleep(2000);
		dv.findElement(By.id("next")).click();
		Thread.sleep(2000);
		dv.findElement(By.id("Passwd")).sendKeys(Keys.CONTROL,"v");
		
		
		
		

	}

}
