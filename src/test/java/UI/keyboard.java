package UI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class keyboard {

	public static void main(String[] args) 
			throws InterruptedException{
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        // WebDriver driver = new EdgeDriver();{
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://extendsclass.com/text-compare.html");
        driver.manage().window().maximize();
        WebElement Boxa = driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]"));
        WebElement Boxb = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]/div[1]"));
        Actions actions = new Actions(driver);
        actions.keyDown(Boxa,Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
        actions.keyDown(Boxb,Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
	
	
	
	
	
	
	
	
	
	
	
		// TODO Auto-generated method stub

	}

}
