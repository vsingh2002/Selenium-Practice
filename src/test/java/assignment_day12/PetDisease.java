package assignment_day12;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class PetDisease {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://petdiseasealerts.org/");
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,600)");
		driver.findElement(By.linkText("Go to maps")).click();

		WebElement area = driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]"));
		driver.switchTo().frame(area);
		WebElement view = driver.findElement(By.name("North Dakota"));
		view.click();
		driver.switchTo().parentFrame();

		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		driver.findElement(By.id("user")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123456789");
		driver.findElement(By.id("cpass")).sendKeys("123456789");
		driver.findElement(By.id("firstName")).sendKeys("Vishal");
		driver.findElement(By.id("lastName")).sendKeys("Singh");
		driver.findElement(By.id("phone")).sendKeys("7894561236");
		WebElement typeDrop = driver.findElement(By.xpath("//select[@id='user-type']"));
		Select userType = new Select(typeDrop);
		userType.selectByVisibleText("Academic");

		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File perma = new File("./screenshots/" + timestamp + ".png");
		FileHandler.copy(temp, perma);

	}

}
// driver.findElement(By.id("user-type")).click();
//boolean enable = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
//System.out.println(enable);
// driver.findElement(By.xpath("//label[text()='I have read and agree to the
// ']/..")).click();

// WebElement view = driver.findElement(By.name("Montana"));

//driver.findElement(By.xpath("//a[text()='Sign up']")).click();
