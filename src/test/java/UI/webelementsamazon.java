package UI;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class webelementsamazon {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        // WebDriver driver = new EdgeDriver();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.ca/");
        driver.manage().window().maximize();
        driver.findElement(By.name("ap_email")).sendKeys("shamnadshaffi@hotmail.com");
        driver.findElement(By.name("ap_email")).click();
        System.out.println(driver.findElement(By.name("ap_email")).getAttribute("class"));
        System.out.println(driver.findElement(By.xpath("//*[@id=\"continue")).getCssValue("text-transform"));
        System.out.println(driver.findElement(By.xpath("//*[@id=\"continue")).getSize());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"continue")).getLocation());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"continue")).getText());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"continue")).getTagName());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"continue")).isSelected());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"continue")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"continue")).isEnabled());
       
}
		// TODO Auto-generated method stub

	}


