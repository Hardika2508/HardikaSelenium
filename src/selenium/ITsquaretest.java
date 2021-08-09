package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ITsquaretest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\QA\\seleniumjars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://itsquare.ca/");
		
		WebElement C1=driver.findElement(By.linkText("Courses"));
		 Actions builder=new Actions(driver);
			builder.moveToElement(C1).build().perform();
			Thread.sleep(2000);
			
			List<WebElement> courses=driver.findElements(By.xpath("//li[@id='menu-item-1523']//ul[@class='sub-menu']/li"));
			 
			System.out.println(courses.size());

			for(WebElement A:courses)
			{
				System.out.println(A.getText());
			}


	}

}
