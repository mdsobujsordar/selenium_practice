package testCasePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class tc_011mouseHover extends baseDriver {
	String baseUrl = "http://webdriveruniversity.com/Actions/index.html";
	
	@Test
	public void  mouseHover () throws InterruptedException {
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement e = driver.findElement(By.xpath("//button[@class = 'dropbtn']"));
		Actions a = new Actions (driver);
		
		a.moveToElement(e).build().perform();
		Thread.sleep(2000);
	}
}
