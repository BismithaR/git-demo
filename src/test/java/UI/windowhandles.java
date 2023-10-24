package UI;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;


public class windowhandles {

	public static void main(String[] args) 
	
			throws InterruptedException{
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        // WebDriver driver = new EdgeDriver();{
        ChromeDriver driver = new ChromeDriver();{
		// TODO Auto-generated method stub
        	driver.get("https://www.selenium.dev/downloads/");
        	driver.manage().window().maximize();
        	
        	driver.findElement(By.xpath("//*[@id=\"announcement-banner\"]/div/div/div/h4/a")).click();
        	driver.getWindowHandles();
        	Set<String> WindowHandles=driver.getWindowHandles();
	System.out.println(WindowHandles);
	Iterator<String> iterator = WindowHandles.iterator();
	//iterator.next();
	String parentWindow = iterator.next();
	String childWindow = iterator.next();
	driver.switchTo().window(childWindow);
	
	//driver.findElement(By.xpath("//*[@id=\"search\"]")).click();
	//driver.findElement(By.id("search")).sendKeys("Selenium");
	driver.findElement(By.xpath("//*[@id=\"thumbnail\"]/yt-image/img")).click();
	
	
	
	
	
	{
		// TODO Auto-generated method stub

	}
        }
	}
	}
