package tranktechnologies;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Verticalaction {
	
	String driverPath = "/Users/vipandhalaria/Downloads/chromedriver-mac-arm64/chromedriver";
	WebDriver driver = new ChromeDriver();


	@BeforeTest
	void navigate() {
		driver.get("https://www.tranktechnologies.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	@Test (priority=1)
	void V1 () {
		WebElement  n1=driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
		Actions a =new Actions(driver);
		a.moveToElement(n1).perform();
		
		
		
		WebElement n2 = driver.findElement(By.xpath("//strong[normalize-space()='Trading']")); 
		a.moveToElement(n2).perform();
		
		WebElement n3 =driver .findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[@class='mm-active'][normalize-space()='Stock Trading']"));
		n3.click();		
	}
	
	@Test (priority=2)
	void retail () {
		WebElement retail =driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Verticals']"));
		Actions b= new Actions(driver);
		b.moveToElement(retail).perform();
		
		
		WebElement  ecommerace=driver.findElement(By.xpath("//strong[normalize-space()='Retail and Ecommerce']"));
		b.moveToElement(ecommerace).perform();
		
		WebElement web =driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='eCommerce Website Development']"));
		web.click();		
		
	}	
}
