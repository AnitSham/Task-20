package com.guvi.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class giviTask20 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.guvi.in/register");
		driver.findElement(By.id("name")).sendKeys("AnitSham");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("anithaanandan29@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("AnSh@21");
		driver.findElement(By.className("countrycode-left")).sendKeys("9345363554");
		driver.findElement(By.tagName("a")).click();
		driver.findElement(By.cssSelector("li a[class='nav-link  text-primary text-center px-4']")).click();
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("anithaanandan29@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("AnSh@21");
		driver.findElement(By.cssSelector("a[class='btn login-btn']")).click();
		Thread.sleep(1000);
		String logTitle = driver.getTitle();
		System.out.println(logTitle);
		String ExpTitle = "GUVI | courses";
		if (logTitle.equalsIgnoreCase(ExpTitle)) {
			System.out.println("User Logged in Successfully");
		} else {
			System.out.println("User not logged in");
		}
		driver.quit();
	}
}
