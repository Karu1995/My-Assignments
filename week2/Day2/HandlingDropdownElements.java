package week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownElements {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(options);

		driver.get("http://leaftaps.com/opentaps/");

		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.partialLinkText("CRM")).click();

		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Karunya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");

		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sel = new Select(sourceDD);
		sel.selectByIndex(4);
		// industry
		WebElement industryDD = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select sel1 = new Select(industryDD);
		sel1.selectByValue("IND_GEN_SERVICES");

		WebElement automobile = driver.findElement(By.id("createLeadForm_marketingCampaignId"));

		Select sel2 = new Select(automobile);
		sel2.selectByVisibleText("Automobile");

		driver.findElement(By.className("smallSubmit")).click();

		String title = driver.getTitle();
		System.out.println(title);

		// Close the browser
		driver.quit();

	}

}
