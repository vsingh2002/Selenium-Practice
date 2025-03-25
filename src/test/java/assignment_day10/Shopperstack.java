package assignment_day10;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Shopperstack {

	public static void main(String[] args) throws IOException {
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.xpath("//span[text()='ROADSTER']/../..//button[@name='addToCart']")).click();
		List<WebElement> allImages = driver.findElements(By.tagName("img"));
		System.out.println(allImages.size());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File perma = new File("./screenshots/" + timestamp + ".png");
		FileHandler.copy(temp, perma);
	}
}
