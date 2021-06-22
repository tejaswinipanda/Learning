import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkBoxImplimentation {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.spicejet.com/");
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		////driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		
		//System.out.println(driver.findElements(By.xpath("//*[@type='checkbox']")).size());
		List<WebElement> checkboxes =driver.findElements(By.xpath("//*[@type='checkbox']"));
		System.out.println(checkboxes.size());
		for(WebElement check:checkboxes)
		{
			check.click();
			System.out.println(check.getTagName());
			
			
		}
	}

}
