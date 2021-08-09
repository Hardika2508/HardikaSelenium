package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tabletest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\QA\\seleniumjars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> raw= driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
		System.out.println(raw.size());
		List<WebElement> col= driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]//td"));
		System.out.println(col.size());
		
		
		
		for(int i=1;i<=raw.size();i++)
		{
			
		
		for(int j=1;j<=col.size();j++)
{
			System.out.print(driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]//td["+j+"]")).getText());
System.out.print("   |    ");
	
}
		System.out.println();


	}
		
		
		
		
	}

}
