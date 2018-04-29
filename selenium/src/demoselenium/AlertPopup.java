package demoselenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.NoAlertPresentException;	
import org.openqa.selenium.Alert;

public class AlertPopup {


	
		
		public static void main(String[] args) throws NoAlertPresentException,InterruptedException  {									
			
			WebDriver driver = new FirefoxDriver();
		
	        
	        // Alert Message handling
	                    		
	        driver.get("http://demo.guru99.com/selenium/delete_customer.php");			
	                            		
	     	      	
	        driver.findElement(By.name("cusid")).sendKeys("53920");					
	        driver.findElement(By.name("submit")).submit();			
	        		
	        // Switching to Alert        
	        Alert alert = driver.switchTo().alert();		
	        		
	        // Capturing alert message.    
	        String alertMessage= driver.switchTo().alert().getText();		
	        		
	        // Displaying alert message		
	        System.out.println(alertMessage);	
	        Thread.sleep(5000);
	        		
	        // Accepting alert		
	        alert.accept();	
	        Thread.sleep(2000);
	        driver.close();
	    }	

	}


