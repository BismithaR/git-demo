package UI;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class webelements {

	public static void main(String[] args) 
			throws InterruptedException {
        // TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        // WebDriver driver = new EdgeDriver();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://na01.safelinks.protection.outlook.com/?url=https%3A%2F%2Fwww.saucedemo.com%2Fv1%2F&data=05%7C01%7C%7C2697732341c8440832d908dba2372ff6%7C84df9e7fe9f640afb435aaaaaaaaaaaa%7C1%7C0%7C638282130140760101%7CUnknown%7CTWFpbGZsb3d8eyJWIjoiMC4wLjAwMDAiLCJQIjoiV2luMzIiLCJBTiI6Ik1haWwiLCJXVCI6Mn0%3D%7C3000%7C%7C%7C&sdata=9xIcdAAX4PrpkAhdGyrVmqE2oKTf8M0WJp92Cjl7%2Bko%3D&reserved=0");
        driver.manage().window().maximize();
        driver.findElement(By.name("user-name")).sendKeys("standard_user1");
        driver.findElement(By.name("user-name")).clear();
        System.out.println(driver.findElement(By.name("user-name")).getAttribute("class"));
        System.out.println(driver.findElement(By.xpath("//*[@id=\"login-button\"]")).getCssValue("text-transform"));
        System.out.println(driver.findElement(By.xpath("//*[@id=\"login-button\"]")).getSize());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"login-button\"]")).getLocation());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"login-button\"]")).getText());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"login-button\"]")).getTagName());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"login-button\"]")).isSelected());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"login-button\"]")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"login-button\"]")).isEnabled());
       
}

		
		// TODO Auto-generated method stub

	}

