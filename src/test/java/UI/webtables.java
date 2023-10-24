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
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class webtables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        // WebDriver driver = new EdgeDriver();{
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://trends.builtwith.com/websitelist/Responsive-Tables");
        //step 1 get the no of rows
       
        List <WebElement> rowelement = driver.findElements(By.xpath("//*[@id=\"mainForm\"]/div/div[2]/div/table/tbody/tr"));
     
        int rsize = rowelement.size();
        System.out.println(rsize);
        //step get the no of columns
        
        List <WebElement> columnelement = driver.findElements(By.xpath("//*[@id=\"mainForm\"]/div/div[2]/div/table/tbody/tr[1]/td"));
        int rcolumn = columnelement.size();
       System.out.println(rcolumn);
        
       for(int i=0;i<=rsize;i++) {
       
        for (int j=0;j<=rcolumn;j++)	{	 
        	
        	
     // System.out.print(driver.findElement(By.xpath("//*[@id=\"mainForm\"]/div/div[2]/div/table/tbody/tr/[" + i + "]/td[" + j + "]")).getText() + " ");
        System.out.print(driver.findElement(By.xpath("//*[@id=\"mainForm\"]/div/div[2]/div/table/tbody/tr[" + i +"]/td[" + j +"]")).getText()+"  ");
        }
        
System.out.println();
	
        
        
        
	}
	}
}
