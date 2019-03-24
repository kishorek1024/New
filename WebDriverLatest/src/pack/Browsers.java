package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Kishore Kumar\\Desktop\\WD8\\Jars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://rediff.com");
		driver.manage().window().maximize();

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Kishore Kumar\\Desktop\\WD8\\Jars\\geckodriver.exe");
		WebDriver driver1=new FirefoxDriver();
		driver1.get("http://rediff.com");
		driver1.manage().window().maximize();
		
		
	}

}
