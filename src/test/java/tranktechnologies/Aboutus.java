package tranktechnologies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Aboutus {
	
	
	String driverPath = "/Users/vipandhalaria/Downloads/chromedriver-mac-arm64/chromedriver";
	WebDriver driver = new ChromeDriver();
	
	@Test (priority=1)
	void navigate() {
		driver.manage().window().maximize();
		
		driver.get("https://www.tranktechnologies.com/");
	}
	
	@Test(priority=2)
	void about() {
		WebElement about =driver.findElement(By.xpath("//ul[@class='cm-flex-type-2']//a[normalize-space()='About us']"));
		about.click();
	}

}
