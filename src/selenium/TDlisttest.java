package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TDlisttest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","D:\\QA\\seleniumjars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.td.com/ca/en/personal-banking/");
		
		
		
		Thread.sleep(2000);
		List<WebElement> popup=driver.findElements(By.id("ensCall"));
		
		
		System.out.println(popup.size());
		
		
		
		if(popup.size()>0 )
		{
			driver.findElement(By.id("ensCall")).click();
			List<WebElement>footer=driver.findElements(By.id("myAnchor"));
			System.out.println(footer.size());
			 for(int i=0;i<footer.size();i++)
			 {
				 System.out.println(footer.get(i).getText());
			 }
			
				
			}
			
			else
		{
				List<WebElement>footer=driver.findElements(By.id("myAnchor"));
				System.out.println(footer.size());
				 for(int i=0;i<footer.size();i++)
				 {
					 System.out.println(footer.get(i).getText());
				 }
				
			
			
		}
		

	}

}
