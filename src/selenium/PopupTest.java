package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopupTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","D:\\QA\\seleniumjars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.aliexpress.com/");
		
		List<WebElement> popup=driver.findElements(By.className("btn-close"));
		List<WebElement> notify=driver.findElements(By.xpath("//body/div[10]/div[1]/img[1]"));
		
		System.out.println(popup.size());
		System.out.println(notify.size());
		
		
		if(popup.size()>0 )
		{
			driver.findElement(By.className("btn-close")).click();
			//popup.get(0).click();
				driver.findElement(By.id("search-key")).sendKeys("computer");
			}
			
			else
		{
			
				driver.findElement(By.id("search-key")).sendKeys("computer");
			
			
		}
		
	}

}
