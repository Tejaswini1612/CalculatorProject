package com.calculator;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OnlineCalculator {

	public WebDriver driver;

	@BeforeSuite
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar\\git\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@BeforeTest
	public void enterUrl() {
		driver.get("https://www.calculator.net/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@BeforeClass
	public void maximizebrowser() {
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void multiplication() throws Exception {

		driver.findElement(By.xpath("//span[@onclick=\"r(4)\"]")).click();
		driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r(3)\"]")).click();

		driver.findElement(By.xpath("//span[@onclick=\"r('*')\"]")).click();

		driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();

		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//table[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[3]")).click();

	}

	@Test(priority = 2)
	public void division() throws Exception {

		driver.findElement(By.xpath("//span[@onclick=\"r(4)\"]")).click();
		driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();

		driver.findElement(By.xpath("//span[@onclick=\"r('/')\"]")).click();

		driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();

		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//table[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[3]")).click();

	}

	@Test(priority = 3)
	public void addition() throws Exception {
		driver.findElement(By.xpath("//span[@onclick=\"r('-')\"]")).click();
		driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r(3)\"]")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r(4)\"]")).click();
		driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r(3)\"]")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r(4)\"]")).click();

		driver.findElement(By.xpath("//span[@onclick=\"r('+')\"]")).click();

		driver.findElement(By.xpath("//span[@onclick=\"r(3)\"]")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r(4)\"]")).click();
		driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r(3)\"]")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r(4)\"]")).click();
		driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();

		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//table[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[3]")).click();

	}

	@Test(priority = 4)
	public void subtraction() throws Exception {
		driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r(3)\"]")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r(4)\"]")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r(8)\"]")).click();
		driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r(3)\"]")).click();

		driver.findElement(By.xpath("//span[@onclick=\"r('-')\"]")).click();

		driver.findElement(By.xpath("//table[@id=\"sciout\"]/tbody/tr[2]/td[1]/div/div[5]/span[1]")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r('-')\"]")).click();
		driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r(3)\"]")).click();
		driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r(9)\"]")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r(4)\"]")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r(8)\"]")).click();
		driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r(3)\"]")).click();
		driver.findElement(By.xpath("//table[@id=\"sciout\"]/tbody/tr[2]/td[1]/div/div[5]/span[2]")).click();

		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//table[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[3]")).click();

	}

}
