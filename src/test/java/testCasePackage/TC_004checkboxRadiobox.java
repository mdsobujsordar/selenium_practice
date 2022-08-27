package testCasePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class TC_004checkboxRadiobox extends baseDriver {
	String baseUrl= "https://jqueryui.com/checkboxradio/";
	@Test
	public void checkboxRadiobox() throws InterruptedException {
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("/html/body/div/fieldset[1]/label[3]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div/fieldset[2]/label[4]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div/fieldset[2]/label[2]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div/fieldset[3]/label[2]/span[1]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div/fieldset[3]/label[4]/span[1]")).click();
		
		driver.switchTo().defaultContent();
	}
}
