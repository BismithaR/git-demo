package UI;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;

public class implicitwait1 {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
    // WebDriver driver = new EdgeDriver();{
    ChromeDriver driver = new ChromeDriver();
    driver.get("https://www.ebay.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    WebElement element = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[4]/a"));
    Actions actions = new Actions(driver);
    actions.moveToElement(element).perform();
    WebElement element1 = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[4]/div[2]/div[1]/nav[1]/ul/li[2]/a"));
	
    element1.click();
	
	
	
	
	
	
	{
		// TODO Auto-generated method stub

	}

}
}