package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Base_ixigo{
	

public static WebDriver driver;

public void initialization_ixigo()
{
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.ixigo.com/");
	
}

}
