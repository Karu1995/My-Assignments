package week2.Day1;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("karunyarajan95@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Karu@1995");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Find you account and login In")).click();
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		driver.close();

	}

}