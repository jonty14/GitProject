package demoselenium;




import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dv =new FirefoxDriver();
		//dv.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		dv.get("http://www.google.com");
		JavascriptExecutor js = (JavascriptExecutor)dv;
		String script = "document.getElementById('lst-ib').value='Kolkata';";
		WebElement exampleDiv = (WebElement) js.executeScript(script);
		//dv.findElement(By.id("lst-ib")).sendKeys("Kolkata");
		WebDriverWait wait=new WebDriverWait(dv, 30);
		
		
		dv.findElement(By.name("btnK")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Kolkata - Wikipedia")));
		dv.findElement(By.linkText("Kolkata - Wikipedia")).click();
		
		//Actions ac = new Actions(dv);
       // ac.moveToElement();
      //  ac.moveToElement(dv.findElement(By.name("btnK"))).build().perform();
        Thread.sleep(2000);

	}

}
