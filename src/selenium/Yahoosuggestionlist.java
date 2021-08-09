package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Yahoosuggestionlist {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\QA\\seleniumjars\\geckodriver.exe");
		//Firefox driver//non static methods
				FirefoxDriver driver=new FirefoxDriver();
				
				driver.get("https://ca.yahoo.com/");
				
				
				driver.findElement(By.id("header-search-input")).sendKeys("canada");
				
				Thread.sleep(1000);
				
				List<WebElement> option=driver.findElements(By.xpath("//ul[@role='listbox']"));
				
			
				System.out.println(option.size());
				
				for(int i=0; i<option.size(); i++)
				{
					 
					
					System.out.println(option.get(i).getText());
				
				}
				
				
				
				
				
	}



	}


