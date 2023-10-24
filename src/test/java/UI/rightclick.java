package UI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rightclick {

	public static void main(String[] args) 
			throws InterruptedException{
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        // WebDriver driver = new EdgeDriver();{
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/slider/#colorpicker");
        driver.manage().window().maximize();
        WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
        driver.switchTo().frame(frame);
        Actions actions = new Actions(driver);
        
        WebElement rectangle = driver.findElement(By.xpath("//*[@id=\"swatch\"]"));
        actions.contextClick(rectangle).perform();
        
        
	
	
	
	
	

}
}