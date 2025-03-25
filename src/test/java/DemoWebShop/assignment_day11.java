package DemoWebShop;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assignment_day11 {
	public static void main(String[] args) throws IOException, InterruptedException {
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']/../..//input[@type='button']")).click();
		WebElement msg = driver.findElement(By.xpath("//p[@class='content']")); // Add to cart message
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(msg));

		// TakesScreenshot ts = (TakesScreenshot) driver;
		Thread.sleep(2000);
		File temp = msg.getScreenshotAs(OutputType.FILE);
		File perman = new File("./screenshots/" + timestamp + ".png");
		FileHandler.copy(temp, perman);

	}

}
