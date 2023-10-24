package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class resize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        // WebDriver driver = new EdgeDriver();{
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/resizable/");
        driver.manage().window().maximize();
        WebElement  frame =driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
driver.switchTo().frame(frame);
        
        Actions actions = new Actions(driver); //creating object to call method
        WebElement resize = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
        
        actions.dragAndDropBy(resize, 200, 100).perform();
	}

}
