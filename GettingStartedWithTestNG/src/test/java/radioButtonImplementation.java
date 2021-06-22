import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class radioButtonImplementation {

	public static void main(String[] args) throws Exception {
		
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
			WebElement radioButton1 = driver.findElement(By.xpath("//*[@value='radio1']"));
			radioButton1.click();
			
			if(radioButton1.isSelected())
			{
				System.out.println("The radio button 1 is selected successfully");
			}
			
			
			driver.findElement(By.id("autocomplete")).sendKeys("ind");
			Thread.sleep(3000);
			List<WebElement> countryLists= driver.findElements(By.xpath("//ul[@id='ui-id-1']//div"));
			for(WebElement countryList:countryLists)
			{
				if(countryList.getText().equalsIgnoreCase("India"))
				{
					countryList.click();
					Thread.sleep(3000);
					System.out.println("India is selected");
					break;
				}
			}
			
			WebElement drop =driver.findElement(By.xpath("//*[@id='dropdown-class-example']"));
			Select select=new Select(drop);
			select.selectByIndex(2);
			System.out.println("The dropdown value selected is "+select.getFirstSelectedOption().getText());
			
			//driver.quit();
			
			
			String parenWindowHandler = driver.getWindowHandle();
			
			driver.findElement(By.xpath("//*[@id='openwindow']")).click();
			Set<String> windowHandels = driver.getWindowHandles();
			Iterator <String> it = windowHandels.iterator();
			if(!(it.equals(parenWindowHandler)))
			{
				it.next();
				driver.switchTo().window(it.next());
				Thread.sleep(2000);
				driver.close();
				driver.switchTo().window(parenWindowHandler);
				
			}
			
			

	}

}
