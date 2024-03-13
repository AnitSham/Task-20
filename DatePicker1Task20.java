package com.guvi.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker1Task20 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://jqueryui.com/datepicker/");
		// driver.switchTo().frame("demo-frame");
		WebElement Frame = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(Frame);
		WebElement Date = driver.findElement(By.id("datepicker"));
		Date.click();
		Date.sendKeys(Keys.DOWN);
		driver.findElement(By.linkText("Next")).click();
		WebElement Datee = driver.findElement(By.linkText("22"));
		Date.click();
		System.out.println("Selected Date is: " + Datee);
		driver.quit();

	}

}
