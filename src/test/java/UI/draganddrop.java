package UI;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;


public class draganddrop {

	public static void main(String[] args)
			throws InterruptedException{
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        // WebDriver driver = new EdgeDriver();{
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        WebElement  frame =driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
        
        driver.switchTo().frame(frame);
        
        Actions actions = new Actions(driver); //creating object to call method
        WebElement drop = driver.findElement(By.id("droppable"));
        WebElement drag = driver.findElement(By.id("draggable"));
        actions.dragAndDrop(drag, drop).perform();
        
        
        
	
	
	
	
	}
}// TODO Auto-generated method stub