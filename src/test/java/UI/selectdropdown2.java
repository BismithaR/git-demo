package UI;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selectdropdown2 {

	public static void main(String[] args)  throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		//WebDriver driver=new EdgeDriver();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles");
		driver.manage().window().maximize();
		WebElement ddown=driver.findElement(By.name("url"));
		//create an object start with class name
		Select select=new Select(ddown);
		select.selectByIndex(0);
		//provide the argument as web element
		select.selectByIndex(5);
		Thread.sleep(2000);
		select.selectByValue("search-alias=aps");
		Thread.sleep(2000);
		select.selectByVisibleText("Alexa Skills");
		
		
		// TODO Auto-generated method stub

	}

}
