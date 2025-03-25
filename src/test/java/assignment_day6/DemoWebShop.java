package assignment_day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text() ='Log in']")).click();
		// driver.findElement(By.cssSelector("input[name='Email']")).sendKeys("vishal@123gmail.com");
		// driver.findElement(By.cssSelector("input[type='password']")).sendKeys("vishal");
		// driver.findElement(By.cssSelector("input[value='Log in']")).click();
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("vishal@123gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("vishal");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

}
