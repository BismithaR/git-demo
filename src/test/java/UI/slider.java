package UI;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class slider {

	public static void main(String[] args)
			throws InterruptedException{
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        // WebDriver driver = new EdgeDriver();{
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/slider/#colorpicker");
        driver.manage().window().maximize();
        WebElement frame =driver.findElement(By.xpath("//*[@id=\"swatch\"]"));
        driver.switchTo().frame(frame);
        WebElement slider = driver.findElement(By.xpath("//*[@id=\"red\"]/div"));
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(slider, -60, 100).perform();
	
	
	
	{
		// TODO Auto-generated method stub

	}

}
}