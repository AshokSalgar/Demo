package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Auto_Suggestion {

	private static final String Thraed = null;

	public static void main(String[] args) throws Exception {
		// Browser open
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        
        
        WebElement txt_SearchBar=driver.findElement(By.xpath("//input[@name='q']"));
        txt_SearchBar.sendKeys("maven");
        
        Thread.sleep(3000);
        List<WebElement> list =driver.findElements(By.xpath("//ul[@class='G43f7e']"));
        System.out.println(list.size());
        
        Thread.sleep(3000);
        System.out.println(list.get(6).getText());
        
        Thread.sleep(3000);
        list.get(6).click();
        
        
	}

}
