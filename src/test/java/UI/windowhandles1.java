package UI;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandles1 {

	public static void main(String[] args) 
		// TODO Auto-generated method stub

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

driver.findElement(By.xpath("//*[@id=\"video-title\"]")).click();
	}

}
}
