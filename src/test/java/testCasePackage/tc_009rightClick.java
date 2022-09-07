package testCasePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class tc_009rightClick extends baseDriver {
	String baseUrl = "http://webdriveruniversity.com/Actions/index.html";
	
	@Test
	public void rightClick() throws InterruptedException {
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		Actions a = new Actions (driver);
		WebElement rightClick = driver.findElement(By.id("main-header"));
		a.contextClick(rightClick).build().perform();
		Thread.sleep(2000);
	}
}
