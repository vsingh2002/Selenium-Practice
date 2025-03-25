package assignment_day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAppSkill {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("LOGIN")).click();
		String title = driver.getTitle();
//	String url=	driver.getCurrentUrl();
//	System.out.println(url);
		System.out.println(title);
		if (title.equals("SkillRary Courses")) {
			System.out.println("Login Page is displayed");
		} else {
			System.out.println("Login page is not displayed");
		}
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.name("login")).click();
		driver.quit();
	}

}
