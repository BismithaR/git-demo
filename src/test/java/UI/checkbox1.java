package UI;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;


public class checkbox1 {

	public static void main(String[] args) 
			throws InterruptedException{
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        // WebDriver driver = new EdgeDriver();{
        ChromeDriver driver = new ChromeDriver();{
		// TODO Auto-generated method stub
driver.get("https://www.ironspider.ca/forms/checkradio.htm");
driver.manage().window().maximize();
driver.findElement(By.name("color")).click();
driver.findElement(By.name("color")).click();
driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[1]/form/input[4]")).click();

System.out.println(driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[1]/form/input[4]")).isSelected());

//radiobutton
driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[2]/form/input[3]")).click();
System.out.println(driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[1]/form/input[4]")).isSelected());
		// TODO Auto-generated method stub;
System.out.println(driver.findElement(By.xpath("//*[@id=\"Content\"]")).isSelected());
	
}
	}
}
