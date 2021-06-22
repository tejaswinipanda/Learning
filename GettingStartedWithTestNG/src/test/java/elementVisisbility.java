import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import DataProvider.configFileReaderAlt;



public class elementVisisbility {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hisah\\Desktop\\Tejaswini\\Maven\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://beta.spicejet.com/");
		
		//Search button displayed in the page
		boolean b1= driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[7]/div")).isDisplayed();
		System.out.println(b1);
		
		
		//inEnabled
		boolean b2= driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[7]/div")).isDisplayed();
		System.out.println(b2);
		
		
		driver.quit();
	}

}
