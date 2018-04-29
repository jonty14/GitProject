package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class facebook_login {
	private static WebElement element=null;
	public static WebElement Email(WebDriver driver){
		element=driver.findElement(By.xpath (".//*[@id='email']"));
		return element;
		}

	public static WebElement Password(WebDriver driver){
		element=driver.findElement(By.xpath (".//*[@id='pass']"));
		return element;
		}
	public static WebElement Login(WebDriver driver){
		element=driver.findElement(By.id ("u_0_2"));
		return element;
		}
	
	public static WebElement Forgotten_account(WebDriver driver){
		element=driver.findElement(By.linkText("Forgotten account?"));
		return element;
		}
	
	

}

