package testCasePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class tc_008doubleClick extends baseDriver{
	String baseUrl = "http://webdriveruniversity.com/Actions/index.html";
	
	@Test
	public void doubleClick() throws InterruptedException {
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		Actions a = new Actions (driver);
		WebElement doubleClick = driver.findElement(By.id("double-click"));
		a.doubleClick(doubleClick).build().perform();
		Thread.sleep(2000);
	}
}
