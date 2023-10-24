package UI;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class frames1 {

	public static void main(String[] args)
			throws InterruptedException{
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        // WebDriver driver = new EdgeDriver();{
        ChromeDriver driver = new ChromeDriver();{
		// TODO Auto-generated method stub
        	driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_btoa");
        	driver.manage().window().maximize();
        	//driver.switchTo().frame("iframeResult");
        	driver.findElement(By.xpath("//*[@id=\"getwebsitebtn\"]/span")).click();
	
	
	
	
	
	
	
	{
		// TODO Auto-generated method stub

	}

}
	}
}
