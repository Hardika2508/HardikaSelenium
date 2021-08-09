package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class Ebaysuggestionlist {

	public static void main(String[] args) throws InterruptedException {
	//ystem.setProperty("webdriver.gecko.driver", "D:\\QA\\seleniumjars\\geckodriver.exe");
//FirefoxDriver driver=new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "D:\\QA\\seleniumjars\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();

		driver.get("https://www.ebay.ca/");
		
		
		Thread.sleep(2000);
		driver.findElement(By.id("gh-ac")).sendKeys("iphone");
		

		
	
	Thread.sleep(3000);
		
		List<WebElement> sugg=driver.findElements(By.xpath("//ul[@id='ebay-autocomplete']//li//a"));
		
		System.out.println(sugg.size());
System.out.println("Suggestionlist");
for(int i=0; i<sugg.size(); i++)
{
	 
	
	System.out.println(sugg.get(i).getText());

}
	}

}
