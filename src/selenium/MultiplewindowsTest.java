  package selenium;

import java.util.Set;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class MultiplewindowsTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\QA\\seleniumjars\\geckodriver.exe");
	
				FirefoxDriver driver=new FirefoxDriver();
				
				driver.get("https://moodle.cestarcollege.com/moodle/");
				Thread.sleep(2000);

				driver.findElement(By.linkText("Faq")).click();
				
			Set<String> allWindows = driver.getWindowHandles();
			System.out.println(allWindows.size());
			
			Iterator<String> iter = allWindows.iterator();
			
			String parentwindow= iter.next();
			String childwindow=iter.next();
			System.out.println("Handle for main page"+parentwindow);
			System.out.println("Handle for FAQ page"+childwindow);
			
			driver.switchTo().window(childwindow);
			

			WebDriverWait wait=new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.titleContains("FAQ"));
			
			System.out.println(driver.getTitle());
			
			
			driver.switchTo().window(parentwindow);
			wait.until(ExpectedConditions.titleContains("Lambton"));
			
			System.out.println(driver.getTitle());
			
				
				
				
				
	}

}
