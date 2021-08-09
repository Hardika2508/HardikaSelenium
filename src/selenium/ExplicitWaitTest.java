package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\QA\\seleniumjars\\geckodriver.exe");
		//Firefox driver//non static methods
				FirefoxDriver driver=new FirefoxDriver();
				
				driver.get("http://www.echoecho.com/javascript4.htm");
				driver.findElement(By.xpath("//input[@value='confirm box']")).click();
				
				//Thread.sleep(2000);
				
				
				WebDriverWait wait=new WebDriverWait(driver,20);
				
				
				wait.until(ExpectedConditions.alertIsPresent());
				Alert a= driver.switchTo().alert();
				System.out.println(a.getText());
				
			a.accept(); // to click on select one
				//a.dismiss();
	}

}
