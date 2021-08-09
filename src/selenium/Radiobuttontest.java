package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radiobuttontest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\QA\\seleniumjars\\geckodriver.exe");
		
				FirefoxDriver driver=new FirefoxDriver();
				
				driver.get("http://www.echoecho.com/htmlforms10.htm");
				
				
				
				List<WebElement> G1=driver.findElements(By.name("group1"));
				System.out.println(G1.size());
				
				for(int i=0; i<G1.size();i++)
				{
					System.out.println(G1.get(i).getAttribute("value")+"......"+G1.get(i).isSelected());
					
				}
				driver.findElement(By.xpath("//input[@value='Cheese']")).click();
				
				System.out.println("after");
				for(int i=0; i<G1.size();i++)
				{
					System.out.println(G1.get(i).getAttribute("value")+"......"+G1.get(i).isSelected());
					
				}
				

	}

}
