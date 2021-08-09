package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Yahoolisttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\QA\\seleniumjars\\geckodriver.exe");
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://ca.yahoo.com/");
		
		List<WebElement> alllist=driver.findElements(By.xpath("//li[@class='trending-list']/ul/li"));
		
		
		System.out.println(alllist.size());
		
		for(int i=0; i<=alllist.size(); i++)
		{
			System.out.println(alllist.get(i).getText());
		}
	}

}
