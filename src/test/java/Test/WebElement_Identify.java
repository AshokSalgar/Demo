package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElement_Identify {

	public static void main(String[] args) {
		// Browser open
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//WebElement identify by using xpath
		
		WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));
		txt_email.sendKeys("Test@123");
		
		WebElement txt_password=driver.findElement(By.xpath("//input[@id='pass']"));
		txt_password.sendKeys("123456");
		
		//by contains
		WebElement btn_login=driver.findElement(By.xpath("//button[contains(@id,'u_0_5')]"));
		btn_login.click();
		
		//by index
		WebElement btn_forgotpassword=driver.findElement(By.xpath("(//*[@id=\"u_0_2_gM\"]/div[3]/a)[1]"));
		btn_forgotpassword.click();
		
		
		
		
		
		
		
		
		

	}

}
