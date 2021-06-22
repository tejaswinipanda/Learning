import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public statc class loginPageTest {
	@test
	public void loginAdmin() {
		ChromeDriver driver =launchBrowser();
		navigateToPage(driver);
		
		
		adminLogin ad= new adminLogin();
		if(ad.email.isDisplayed()) {
			System.out.println("email text area displayed");
		}
		else
		{
			System.out.println("email text area not displayed");
		}
		//ad.email.sendKeys("admin@phptravels.com");
		//ad.password.sendKeys("demoadmin");
		driver.wait(10000);
		//ad.login("admin@phptravels.com", "demoadmin");
		//closeBrowser(driver);
	}
	@AfterMethod()
	public static void login() {
		driver.close();
	}

}
