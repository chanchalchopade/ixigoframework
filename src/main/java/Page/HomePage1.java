package Page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Test_Base_ixigo;

public class HomePage1 extends Test_Base_ixigo {

	@FindBy (xpath ="//img[@class='ixigo-logo']")private WebElement Logo;
	@FindBy (xpath ="(//input[@placeholder='Enter city or airport'])[1]")private WebElement from;
	@FindBy (xpath ="(//input[@placeholder='Enter city or airport'])[2]")private WebElement to;
	
	@FindBy (xpath ="//input[@placeholder='Depart']")private WebElement departdate;
	@FindBy (xpath ="//input[@placeholder='Return']")private WebElement returndate;
	
	@FindBy (xpath = "(//button[@class='ixi-icon-arrow rd-next'])[1]")private WebElement nextbutton;
	@FindBy (xpath = "")private WebElement departdate1;
	@FindBy (xpath ="")private WebElement returndate1;
	@FindBy (xpath ="(//input[@class='c-input u-v-align-middle'])[5]")private WebElement traveller;
	@FindBy (xpath ="(//span[@class='u-ripple-circle'])[1]")private WebElement searchbtn;
	
	
	public HomePage1()
	{
		PageFactory.initElements(driver, this);
	}
	public String verifyurl()
	{
		return driver.getCurrentUrl();
		
	}
	public boolean verifylogo()
	{
		return Logo.isDisplayed();
	}
	public void booking() throws Exception
	{
	from.sendKeys("HYD - Hyderabad, India");
	Actions act = new Actions(driver);
	//act.click().build().perform();
	act.sendKeys(Keys.ARROW_DOWN).build().perform();
	Thread.sleep(2000);
	
	to.sendKeys("NAG - Nagpur, India");
	Actions act1= new Actions(driver);
	act1.click().build().perform();
	Thread.sleep(1000);
	
	}
	public void 
	
	
	
}
