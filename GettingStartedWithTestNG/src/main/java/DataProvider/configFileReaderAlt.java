package DataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class configFileReaderAlt {
	
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		Properties properties = new Properties();
		FileInputStream fp =new FileInputStream("Configuration//Config.properties");
		
		properties.load(fp);
		
		System.out.println(properties.getProperty("driverPath"));
		System.setProperty("webdriver.chrome.driver", properties.getProperty("driverPath"));
		
		driver = new ChromeDriver();		
		
		System.out.println(properties.getProperty("url"));
		driver.get(properties.getProperty("url"));
		

	}

}
