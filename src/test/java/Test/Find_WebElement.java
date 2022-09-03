package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Find_WebElement {

	public static void main(String[] args) throws Exception {
		//browser open
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//identify webelement---use locators--id
		
		WebElement txt_email=driver.findElement(By.id("email"));
		txt_email.sendKeys("Ashok@123");
		
		WebElement txt_password=driver.findElement(By.id("pass"));
		txt_password.sendKeys("12345678");
		
		WebElement btn_login=driver.findElement(By.name("login"));
		btn_login.click();
		
		Thread.sleep(4000);
		driver.close();
		
		
		
		
		
		
		
		
		
		

	}

}
