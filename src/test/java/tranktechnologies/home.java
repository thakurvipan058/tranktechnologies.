package tranktechnologies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class home {

	String driverPath = "/Users/vipandhalaria/Downloads/chromedriver-mac-arm64/chromedriver";
	WebDriver driver = new ChromeDriver();

	@Test(priority = 1)

	void naviagate() {
		driver.get("https://www.tranktechnologies.com/");
	}

	@Test(priority = 2)
	void quote() {
		WebElement quote = driver.findElement(By.xpath("//a[@class='scroll']"));
		quote.click();
	}

	@Test(priority = 3)
	void name() {
		WebElement name = driver.findElement(By.xpath("//input[@placeholder='Your Name']"));
		name.sendKeys("rahul");
	}

	@Test(priority = 4)
	void email() {
		WebElement email = driver.findElement(By.xpath("//input[@placeholder='Your Mail']"));
		email.sendKeys("rahul@mailinator.com");
	}

	@Test(priority = 5)
	void company() {
		WebElement company = driver.findElement(By.xpath("//input[@placeholder='Your Company']"));
		company.sendKeys("open pvt ltd");
	}

	@Test(priority = 6)
	void service() {
		WebElement service = driver.findElement(By.xpath("//select[@name='service']"));
		Select dropdown = new Select(service);
		dropdown.selectByVisibleText("App Development");
		dropdown.selectByValue("value2");

	}

	@Test(priority = 7)
	void mobile() {
		WebElement mobile = driver.findElement(By.xpath("//textarea[@placeholder='Message']"));
		mobile.sendKeys("9888988888");
	}

	@Test(priority = 8)
	void message() {
		WebElement message = driver.findElement(By.xpath("//input[@placeholder='Your Phone']"));
		message.sendKeys("adslkssklsdslk lksklnskllnk");
	}
}
