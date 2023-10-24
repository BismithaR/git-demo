package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		//driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//driver.findElement(By.id("login-button")).click();
		//driver.close();
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		String Currenturl = driver.getCurrentUrl();
		System.out.println(Currenturl);
		String Title = driver.getTitle();
System.out.println(Title);
driver.getPageSource();
String GetPageSource = driver.getPageSource();
System.out.println(GetPageSource);
driver.quit();


		

	}

}
