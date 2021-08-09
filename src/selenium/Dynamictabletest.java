package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dynamictabletest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\QA\\seleniumjars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		
		List<WebElement> raw= driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println(raw.size());
		List<WebElement> col= driver.findElements(By.xpath("//table[@id='customers']//tr[2]/td"));
		System.out.println(col.size());
		
		
		
		for(int i=2;i<=raw.size();i++)
		{
			
		
		for(int j=1;j<=col.size();j++)
{
			System.out.print(driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]/td["+j+"]")).getText());
System.out.print("   |    ");
	
}
		System.out.println();


	}

}
}