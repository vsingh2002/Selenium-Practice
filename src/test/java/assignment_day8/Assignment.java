package assignment_day8;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.manage().window().maximize();
		Rectangle rect = driver.findElement(By.xpath("//button[@class='button buttonBlue']")).getRect();
		System.out.println("Height:" + rect.getHeight());
		System.out.println("Width:" + rect.getWidth());
		System.out.println("X Coordinate:" + rect.getX());
		System.out.println("Y Coordinate:" + rect.getY());
		String color = driver.findElement(By.xpath("//span[@id='validationMessage']")).getCssValue("color");
		System.out.println("Color:" + color);
		WebElement clear = driver.findElement(By.xpath("//input[@id='username']"));
		clear.clear();
		clear.sendKeys("Vishal");
		Thread.sleep(2000);
		String signInColor = driver.findElement(By.xpath("//button[text()='Sign in']")).getCssValue("color");
		System.out.println("Sign In color:" + signInColor);
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		String errorMsg = driver.findElement(By.xpath("//span[@id='validationMessage']")).getText();
		System.out.println(errorMsg);

	}

}
