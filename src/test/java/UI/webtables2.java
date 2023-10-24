package UI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webtables2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        // WebDriver driver = new EdgeDriver();{
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://trends.builtwith.com/websitelist/Responsive-Tables");
        List <WebElement> rowelement = driver.findElements(By.xpath("//*[@id=\"mainForm\"]/div/div[2]/div/table/tbody/tr"));
        
        int rsize = rowelement.size();
        System.out.println(rsize);
        //step get the no of columns
        
        List <WebElement> columnelement = driver.findElements(By.xpath("//*[@id=\"mainForm\"]/div/div[2]/div/table/tbody/tr[1]/td"));
        int rcolumn = columnelement.size();
       System.out.println(rcolumn);
       for ( int i=1; i<=rsize; i++)
		{
			for (int j=1; j<=rcolumn; j++)
			{
			//System.out.print(driver.findElement(By.xpath("//*[@id=\"mainForm\"]/div/div[2]/div/table/tbody/tr[" + i +"]/td[" + j +"]")).getText()+"  ");
			System.out.print(driver.findElement(By.xpath("//*[@id=\"mainForm\"]/div/div[2]/div/table/tbody/tr[" + i +"]/td[" + j +"]")).getText()+"  ");
		}
		
		System.out.println();
		}
	
       
       
	}

}
