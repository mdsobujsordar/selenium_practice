package testCasePackage;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class TC_003websiteSecurity extends baseDriver{
	
	@Test
	public void websiteSecuriy () {
		
		String x = driver.getCurrentUrl();
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		if(x.contains("https")) {
			System.out.println("Website is secured");
		}
		else {
			System.out.println("Website is not secured");
		}
	}
}
