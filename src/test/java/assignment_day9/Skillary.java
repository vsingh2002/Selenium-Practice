package assignment_day9;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Skillary {
	public static void main(String[] args) throws IOException {
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		String title = driver.getTitle();
		System.out.println(title);

		if (title.equals("SkillRary Ecommerce")) {
			System.out.println("Home page is displayed");
		} else {
			System.out.println("Home page is not displayed");
		}
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);

//		File dest = new File("./screenshots/images.jpg");
		File dest = new File("./screenshots/"+timestamp+".png");
		FileHandler.copy(temp, dest);
	}

}
