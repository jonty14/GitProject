import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class gridtest {
	WebDriver dv;
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities capa = DesiredCapabilities.firefox();
		RemoteWebDriver dv = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capa);
		dv = new FirefoxDriver();
		dv.get("http://www.google.com");

	}

}

