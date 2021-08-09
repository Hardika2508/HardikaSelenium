package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownlisttest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\QA\\seleniumjars\\geckodriver.exe");
		//Firefox driver//non static methods
				FirefoxDriver driver=new FirefoxDriver();
				
				driver.get("https://www.ebay.ca/");
				
				List<WebElement> list=driver.findElements(By.xpath("//select[@id='gh-cat']/option")); 
				
				

	System.out.println(list.size());
			
			for(int i=0; i<list.size(); i++)
			{
				 if(list.get(i).isSelected())
				 {
				
				System.out.println(list.get(i).getText()+"........"+list.get(i).isSelected());
			}
			}
			
			WebElement box=driver.findElement(By.id("gh-cat"));
			Select s =new Select(box);
			s.selectByIndex(2);
			Thread.sleep(2000);
			
			s.selectByValue("2984");
			Thread.sleep(2000);
			
			s.selectByVisibleText("Books");

			System.out.println("------------------------AFTER SELECTION..................");
			
			for(int j=0; j<list.size(); j++)
			{
				if(list.get(j).isSelected())
			{
				System.out.println(list.get(j).getText()+"........"+list.get(j).isSelected());
				
			}
			
			}
			}
	}
