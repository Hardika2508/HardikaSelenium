package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshottest {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "D:\\QA\\seleniumjars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		 File scrfile=driver.getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(scrfile,new File("D:\\QA\\Testing\\screenshot.png"));

	}

}
