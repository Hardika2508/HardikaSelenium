package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GooglesuggetionlistTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\QA\\seleniumjars\\geckodriver.exe");
		//Firefox driver//non static methods
				FirefoxDriver driver=new FirefoxDriver();
				
				driver.get("https://www.google.com/");
				
				
				driver.findElement(By.name("q")).sendKeys("canada");
				
				//Thread.sleep(1000);
				WebDriverWait wait= new WebDriverWait(driver,20);
				wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//ul[@role='listbox']/li"), 10));

				
				List<WebElement> option=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
				
			
				System.out.println(option.size());
				
				/*for(int i=0; i<option.size(); i++)
				{
					 
					
					System.out.println(option.get(i).getText());
				
				}*/
				
				
				for(WebElement a : option) {
					System.out.println(a.getText());
				}
				
				
	}

}
