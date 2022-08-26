package testCasePackage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class TC_001LoginPage extends baseDriver {
	String baseURL = "https://practice.automationtesting.in/my-account/";
	@Test
	public void locatorLearing() throws InterruptedException {
		driver.get(baseURL);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("sobuz");
		Thread.sleep(2000);
		
		driver.findElement(By.id("password")).sendKeys("sobuz");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-36']/div[1]/div[1]/div[1]/div[1]/form[1]/p[3]/input[3]")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.xpath("//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-36']/div[1]/div[1]/ul[1]/li[1]")).getText());
		Thread.sleep(2000);
	}
}
