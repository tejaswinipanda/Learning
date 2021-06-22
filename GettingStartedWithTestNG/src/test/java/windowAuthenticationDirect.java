import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowAuthenticationDirect {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://admin:admin@the-internet.herokuapp.com/");
		WebElement basicAuthlnk= driver.findElement(By.xpath("//a[contains(text(),'Basic')]"));
		basicAuthlnk.click();
		driver.quit();
		
	}

}
