import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownHandel {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Static dropdown with select tag
		WebElement currencyDropdown = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		Select sel =new Select(currencyDropdown);
		sel.selectByIndex(2);
		sel.selectByVisibleText("USD");
		Thread.sleep(2000);
		
		System.out.println(sel.getFirstSelectedOption().getText());
		
		
		//Static dropdown 
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		int i=1;
		int adultCount =5;
		while(i<adultCount)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		
		//dynamic dropdown
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); //one way by index
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();//other way by parent child
		Thread.sleep(1000);
		
		
		//Auto suggesting dropdown
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		//class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all'
		List<WebElement> autoDuggestElements =driver.findElements(By.xpath("//*[@class='ui-menu-item']"));
		for(WebElement autoDuggestElement:autoDuggestElements)
		{
			if(autoDuggestElement.getText().equalsIgnoreCase("India"))
					{
				autoDuggestElement.click();
				Thread.sleep(2000);
				break;
					}
		}
		
		driver.quit();
		

	}

}
