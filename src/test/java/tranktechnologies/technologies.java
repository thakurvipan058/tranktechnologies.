package tranktechnologies;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class technologies {
	
	
	String driverPath = "/Users/vipandhalaria/Downloads/chromedriver-mac-arm64/chromedriver";
	WebDriver driver = new ChromeDriver();
	@BeforeTest 
	void navigate() {
		 driver.manage().window().maximize();
		 driver.get("https://www.tranktechnologies.com/"); 
	   
	}
	@Test(priority=2)
	void tech() {
		
		WebElement tech =driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		 Actions t1= new Actions(driver);
		 t1.moveToElement(tech).perform();
		 
		 WebElement ecom =driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']"));
		 t1.moveToElement(ecom).perform();
		 
		 WebElement  magento = driver.findElement(By.xpath("//a[normalize-space()='Magento Development']"));
		 magento.click();
		
	}
	
	@Test(priority=3)
	void tech1() {
		
		WebElement tech1 =driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		 Actions t1= new Actions(driver);
		 t1.moveToElement(tech1).perform();
		 
		 WebElement ecom =driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']"));
		 t1.moveToElement(ecom).perform();
		 
		 WebElement  code = driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Codeigniter Development']"));
		 code.click();
		
	}
	@Test (priority=4)
	void tech2() {
		
		WebElement tech2 =driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		 Actions t1= new Actions(driver);
		 t1.moveToElement(tech2).perform();
		 
		 WebElement ecom =driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']"));
		 t1.moveToElement(ecom).perform();
		 
		 WebElement big = driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='Big Commerce']"));
		 big.click();
		
	}
	@Test(priority=5)
	void tech3() {
		
		WebElement tech3 =driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		 Actions t1= new Actions(driver);
		 t1.moveToElement(tech3).perform();
		 
		 WebElement ecom =driver.findElement(By.xpath("//strong[normalize-space()='eCommerce Development']"));
		 t1.moveToElement(ecom).perform();
		 
		 WebElement  react = driver.findElement(By.xpath("//ul[@class='cm-flex cm-flex-wrap']//a[normalize-space()='React JS Development']"));
		 react.click();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test (priority=6)
	void mobile() {
		
		
		WebElement mobile =driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		 Actions t1= new Actions(driver);
		 t1.moveToElement(mobile).perform();
		 
		 WebElement ecom =driver.findElement(By.xpath("//strong[normalize-space()='Mobile App Development']"));
		 t1.moveToElement(ecom).perform();
		 
		 WebElement  react= driver.findElement(By.xpath("//a[contains(text(),'React Native Mobile App Development')]"));
		 react.click();
		
	}
	@Test (priority=7)
	void app() {
		
		WebElement app =driver.findElement(By.xpath("//li[@class='drop_down']//a[@href='#'][normalize-space()='Technologies']"));
		 Actions t1= new Actions(driver);
		 t1.moveToElement(app).perform();
		 
		 WebElement ecom =driver.findElement(By.xpath("/strong[normalize-space()='Mobile App Development']"));
		 t1.moveToElement(ecom).perform();
		 
		 WebElement  flutter= driver.findElement(By.xpath("//a[contains(text(),'Flutter Mobile App Development')]"));
		 flutter.click();
		
	}
	@AfterTest
	void quit() {
		driver.quit();
	}
	
	

}
