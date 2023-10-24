package UI;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class explicitwait1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        // WebDriver driver = new EdgeDriver();{
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[5]/a"));
        WebElement element2 = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[5]/div[2]/div[1]/nav[2]/ul/li[4]/a"));
        Actions action = new Actions(driver);
        action.moveToElement(element1).perform();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element2));
        element2.click();
}
		// TODO Auto-generated method stub

	}


