package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Niketest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\QA\\seleniumjars\\geckodriver.exe");
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.nike.com/ca/");
		 
		Actions  builder=new Actions(driver);
		WebElement electronics= driver.findElement(By.linkText("Women"));
		
		builder.moveToElement(electronics).build().perform();
		
		
		Thread.sleep(2000);
		
		List<WebElement> top=driver.findElements(By.xpath("//a[contains(@aria-label,'main-menu, Women, Shoes')]"));
		 
		System.out.println(top.size());

		for(WebElement A:top)
		{
			System.out.println(A.getText());
		}

	}

}
