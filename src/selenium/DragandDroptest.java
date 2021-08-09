package selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragandDroptest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\QA\\seleniumjars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		WebDriverWait wait=new WebDriverWait(driver,20);

	
	driver.switchTo().frame(0);
	System.out.println("afterswitching");
	
				
 
 WebElement drag1=driver.findElement(By.id("draggable"));
 WebElement drop1=driver.findElement(By.id("droppable"));
				
     Actions builder=new Actions(driver);
	builder.dragAndDrop(drag1, drop1).build().perform();
	
	wait.until(ExpectedConditions.textToBePresentInElement(drop1, "Dropped!"));
	wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("droppable"), "Dropped!"));

				if(drop1.getText().equals("Dropped!"))
				{
					System.out.println("test passed");
				}
				else {
					System.out.println("Test Failed");
				}
	}

}
