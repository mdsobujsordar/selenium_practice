package testCasePackage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class TC_001LoginPage extends baseDriver {
	String baseURL = "https://practice.automationtesting.in/my-account/";
	@Test(priority=1)
	public void Registration() throws InterruptedException {
		driver.get(baseURL);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("reg_email")).sendKeys("abcd4432@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("reg_password")).sendKeys("Abcd@#4432");
		Thread.sleep(2000);
		
		//Custom Xpath
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		Thread.sleep(2000);
		
		//Copied Xpath
		String text= driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/ul")).getText();
		Thread.sleep(2000);
		
		System.out.println("Registration status: "+ text);
	}
	@Test(priority=2)
	public void login() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("abcd4432@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("password")).sendKeys("Abcd@#4432");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		String text = driver.findElement(By.xpath("//a[@href='https://practice.automationtesting.in/my-account/customer-logout/']")).getText();
		Thread.sleep(2000);
		
		if (text.contains("Logout")) {
			System.out.println("Succesfully Logged in");
		}
		else {
			System.out.println("Login Unsucessful");
		}
	}
}
