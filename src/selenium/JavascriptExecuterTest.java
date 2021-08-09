package selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavascriptExecuterTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "D:\\QA\\seleniumjars\\geckodriver.exe");
	
				FirefoxDriver driver=new FirefoxDriver();
				
				driver.get("https://www.adidas.ca/");			
				
				
			
				WebElement about=driver.findElement(By.linkText("About Us"));
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				
				//jse.executeScript("window.scrollBy(0,4000)");
				//System.out.println(about.getLocation());
			    //about.click();
			    
			   
				//Scroll using x and Y cordinate
				//jse.executeScript("window.scrollBy(0,4000)");
				//System.out.println(aboutUs.getLocation());
				//aboutUs.click();
				
				//scroll until the element is in the view is true
				//jse.executeScript("arguments[0].scrollIntoView(true);", aboutUs);
				//aboutUs.click();
				
				//option 3
				jse.executeScript("arguments[0].click();", about);

				
		
		
		
		

	}

}
