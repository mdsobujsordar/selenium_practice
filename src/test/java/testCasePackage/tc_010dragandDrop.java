package testCasePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class tc_010dragandDrop extends baseDriver {
	String baseUrl = "http://webdriveruniversity.com/Actions/index.html";
	
	@Test
	public void dragnadDrop() throws InterruptedException {
		
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement e1 = driver.findElement(By.id("draggable"));
		WebElement e2 = driver.findElement(By.id("droppable"));
		
		Actions a = new Actions (driver);
		
		a.dragAndDrop(e1, e2).build().perform();
		Thread.sleep(2000);
	}
}
