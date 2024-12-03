package tranktechnologies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class contactus {

	String driverPath = "/Users/vipandhalaria/Downloads/chromedriver-mac-arm64/chromedriver";
	WebDriver driver = new ChromeDriver();

	@Test(priority = 1)
	void navigate() {
		driver.manage().window().maximize();
		driver.get("https://www.tranktechnologies.com/");
	}

	@Test(priority = 2)
	void blogs() {
		WebElement blog = driver.findElement(By.xpath("//ul[@class='cm-flex-type-2']//a[normalize-space()='Contact us']"));
		blog.click();
	}
	
	@Test (priority=3)
	void name () {
		WebElement name =driver.findElement(By.xpath("//form[@id='contact_form']//input[@placeholder='Your Name']"));
		name.sendKeys("Rakesh");
	}
	@Test(priority=4)
	void mail() {
	
		WebElement email =driver.findElement(By.xpath("//form[@id='contact_form']//input[@placeholder='Your Mail']"));
		email.sendKeys("rakesh@mailinator.com");
		
	
	}
	@Test(priority=5)
	void company() {
		WebElement company =driver.findElement(By.xpath("//form[@id='contact_form']//input[@placeholder='Your Company']"));
		company.sendKeys("rak pvt ltd");
		
	}
	@Test(priority=6)
	void other() {
		
		WebElement other =driver.findElement(By.xpath("//div[@class='cm-form-field']//select[@name='service']"));
		Select dropdown=new Select(other);
		dropdown.selectByVisibleText("Others");
	}
	
	@Test(priority=7)
	void phone() {
		WebElement phone =driver.findElement(By.xpath("//form[@id='contact_form']//input[@placeholder='Your Phone']"));
		phone.sendKeys("1234567890");
		
	}
	@Test (priority=8)
	void message() {
		WebElement message =driver.findElement(By.xpath("//form[@id='contact_form']//textarea[@placeholder='Message']"));
		message.sendKeys("rak pvt ltd for testing purpose");
		
	}
	@AfterTest
	void quit () {
		driver.quit();
	}
	
	

}
