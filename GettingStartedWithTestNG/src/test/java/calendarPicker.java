import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calendarPicker {

	public static void main(String[] args) {
				
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://seleniumbase.io/demo_page");
		
		String title= driver.findElement(By.xpath("//h1")).getText();
		String revTitle="";
		int index=0;
		
		int StrLength= title.length();
		for (int i=StrLength-1;i>=0;i--) {
			
			 revTitle=  revTitle +title.charAt(i);
			 //revTitle=revTitle.concat(title.charAt(i));
			
		}
		System.out.println(revTitle);
		
		for (int i=0;i<StrLength;i++) {
			if(title.charAt(i)=='P')
			{
				System.out.println(i);
				 index=i;
			}
			
			
		}
		String sub=title.substring(index, StrLength);
		System.out.println(sub);
		driver.quit();
				

	}
	

}
