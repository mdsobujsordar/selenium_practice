package testCasePackage;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class TC_006pageReload extends baseDriver {
	String baseUrl = "https://www.facebook.com";
	
	@Test
	public void pageReload () throws InterruptedException {
		
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.google.com");
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
}
