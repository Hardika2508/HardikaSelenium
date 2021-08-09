package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Elementpresenttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\QA\\seleniumjars\\geckodriver.exe");
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		// we can not verify element test on webelement 
		
		List<WebElement>  element=driver.findElements(By.linkText("About"));
		
		System.out.println(element.size());
		if(element.size()>0)
		{
			System.out.println("Element Present");
			
		}
		else
		{
			System.out.println("Element not present");
		}

	}

}
