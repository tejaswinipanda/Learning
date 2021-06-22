import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class adminLogin extends baseClass{
	 //private WebDriver driver;
	WebDriver driver = (WebDriver) launchBrowser();
	 
	
	 WebElement email =((WebElement) driver).findElement(By.xpath("//input[@type='text']"));
	 WebElement password =((WebElement) driver).findElement(By.xpath("//input[@type='password']"));
	 
	 
	 public void login(String emailId, String pass) {
		 email.sendKeys(emailId);
		 password.sendKeys(pass);
	 }
	 

	
}
