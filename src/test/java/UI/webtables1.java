package UI;
import java.time.Duration;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.FluentWait;

public class webtables1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        // WebDriver driver = new EdgeDriver();{
        ChromeDriver driver = new ChromeDriver();
        
         
         
        driver.get("https://datatables.net/examples/basic_init/zero_configuration.html");
        List <WebElement> rowelement = driver.findElements(By.xpath("//*[@id=\"example\"]/tbody/tr"));
        int rsize = rowelement.size();
        System.out.println(rsize);
        List <WebElement> columnelement = driver.findElements(By.xpath("//*[@id=\"example\"]/tbody/tr[2]/td"));
        int rcolumn = columnelement.size();
        System.out.println(rcolumn);
         
        for(int i=0;i<=rsize;i++) {
        
         for (int j=0;j<=rcolumn;j++)	{	
        	 
        	 System.out.print(driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[" + i + "]/td[" + j + "]")).getText() + " ");
         
        
         
         System.out.println();
     	   
	}

	}
}
}