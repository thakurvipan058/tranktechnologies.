package tranktechnologies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class home1 {

	String driverPath = "/Users/vipandhalaria/Downloads/chromedriver-mac-arm64/chromedriver";
	WebDriver driver = new ChromeDriver();

	@Test(priority = 1)
	void navigate() {
		driver.get("https://www.tranktechnologies.com/");
	}

	@Test(priority = 2)
	void button() {

		WebElement button = driver.findElement(By.xpath("//div[@class='cm-home-slide slick-slide slick-current slick-active']//a[@class='cm-slider-btn cm-prim-bg'][normalize-space()='Explore More']"));
		button.click();
	}

}
