package week2.Day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingTheBrowser {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver chromeBrowser = new ChromeDriver();
		
		chromeBrowser.get("https://www.facebook.com");
		
		chromeBrowser.manage().window().maximize(); //to maximize the window
		
		System.out.println(chromeBrowser.getTitle());
		
		Thread.sleep(2000);
		
		chromeBrowser.close(); //To close the window
		
		
		

	}

}
