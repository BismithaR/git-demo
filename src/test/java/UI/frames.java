package UI;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;


public class frames {

	public static void main(String[] args)
			throws InterruptedException{
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        // WebDriver driver = new EdgeDriver();{
        ChromeDriver driver = new ChromeDriver();{
		// TODO Auto-generated method stub
        	driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
        	driver.manage().window().maximize();
        	driver.switchTo().frame("iframeResult");
        	driver.findElement(By.xpath("/html/body/button")).click();
        	
        	driver.switchTo().alert().sendKeys("Bismitha");
        	driver.switchTo().alert().accept();
        	driver.switchTo().parentFrame();
        	System.out.println(driver.getTitle());
	}
}
        	
}
		// TODO Auto-generated method stub





