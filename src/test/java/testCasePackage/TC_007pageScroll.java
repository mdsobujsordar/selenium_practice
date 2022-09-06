package testCasePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class TC_007pageScroll extends baseDriver {
	String baseUrl = "https://ultimateqa.com/complicated-page";
	
	@Test
	public void pageScroll () throws InterruptedException {
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// Scroll to bottom
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		
		// Scroll to top
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
		Thread.sleep(2000);
		
		// Scroll to specific element
		WebElement e = driver.findElement(By.xpath("//button[@type='submit']"));
		js.executeScript("arguments[0].scrollIntoView();", e);
		Thread.sleep(2000);
	}
}
