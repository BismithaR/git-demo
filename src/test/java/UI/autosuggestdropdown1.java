package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autosuggestdropdown1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        // WebDriver driver = new EdgeDriver();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.ca/");
    	driver.manage().window().maximize();
    	WebElement search = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));search.click();
    	search.sendKeys("vacuumcleaners");
    	search.sendKeys(Keys.ARROW_DOWN);
    	search.sendKeys(Keys.ENTER);
    	
        
        
        
        {
	}



	}

}
