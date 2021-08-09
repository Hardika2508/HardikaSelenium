package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclasstest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\QA\\seleniumjars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
				 
				Actions  builder=new Actions(driver);
				WebElement electronics= driver.findElement(By.linkText("Electronics"));
				
				builder.moveToElement(electronics).build().perform();
				
				
				Thread.sleep(2000);
				
				List<WebElement> top=driver.findElements(By.xpath("(//nav[@aria-label='Top Categories']/ul)[3]/li"));
				 
				System.out.println(top.size());
		
				for(WebElement A:top)
				{
					System.out.println(A.getText());
				}

	}

}
