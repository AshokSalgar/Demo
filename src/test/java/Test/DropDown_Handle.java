package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown_Handle {

	public static void main(String[] args) {
		// Browser open
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();
        
        //findwebelement
        WebElement drp_Country=driver.findElement(By.xpath("//select[@name='country']"));
       
        Select sel=new Select(drp_Country);
        sel.selectByIndex(2);
        
        sel.selectByValue("BANGLADESH");
        
        sel.selectByVisibleText("BERMUDA");
		
		System.out.println(sel.getFirstSelectedOption().getText());
		
		List<WebElement> list=sel.getOptions();
		System.out.println(list.size());
		
	}
	
}
		
	
