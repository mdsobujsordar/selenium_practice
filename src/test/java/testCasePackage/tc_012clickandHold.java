package testCasePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class tc_012clickandHold extends baseDriver {
	String baseUrl = "http://webdriveruniversity.com/Actions/index.html";
	
	@Test
	public void clickandHold () throws InterruptedException {
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement e = driver.findElement(By.id("click-box"));
		Actions a = new Actions (driver);
		
		a.clickAndHold(e).build().perform();
		Thread.sleep(2000);
	}
}
