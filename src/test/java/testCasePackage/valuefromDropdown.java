package testCasePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class valuefromDropdown extends baseDriver {
	String baseUrl = "https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html";
	
	@Test
	public void selectfromDropdown() throws InterruptedException {
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		WebElement e = driver.findElement(By.id("course"));
		Select s = new Select (e);
		Thread.sleep(3000);
		
		s.selectByIndex(1);
		Thread.sleep(3000);
		
	}
}
