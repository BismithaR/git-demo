package UI;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args)
			throws InterruptedException {
        // TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        // WebDriver driver = new EdgeDriver();
        ChromeDriver driver = new ChromeDriver();{
        	driver.get("https://semantic-ui.com/modules/dropdown.html");
        	driver.manage().window().maximize();
        	WebElement dropdown=driver.findElement(By.className("ui fluid dropdown selection multiple active visible"));
        	Select select=new Select(dropdown);
        	select.selectByIndex(2);
        	select.selectByIndex(0);
        	select.deselectAll();
        	
        }
		// TODO Auto-generated method stub

	

        }
	}