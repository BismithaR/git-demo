package UI;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javascriptexecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        // WebDriver driver = new EdgeDriver();{
        ChromeDriver driver = new ChromeDriver();{
		// TODO Auto-generated method stub
        	driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        	
        	JavascriptExecutor jse = (JavascriptExecutor) driver;
        	//print the title of page
        	String script = "document.title;";
        	
        	String title = (String) jse.executeScript(script);
        	System.out.println(title);
        	//click button
        	driver.switchTo().frame("iframeResult");
        	jse.executeScript("myFunction()");
        	driver.switchTo().alert().accept();
        	//highlighting the button
        	
        WebElement highlightbutton = driver.findElement(By.xpath("/html/body/button"));
        jse.executeScript("arguments[0].style.backgroundColor = 'blue'", highlightbutton);
        	
	}

}
}