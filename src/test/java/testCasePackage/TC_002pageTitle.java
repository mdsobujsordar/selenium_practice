package testCasePackage;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class TC_002pageTitle extends baseDriver {
	public static String baseUrl = "https://practice.automationtesting.in/";
	
	@Test
	public void pageTitle () {
		
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println("The title is: "+ title);
	}
}
