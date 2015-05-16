package TrainingDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Keywords {
	
	static WebDriver driver;
	static WebDriverWait wait;	
		
	public static void main(String[] args) throws InterruptedException {	
		
		openBrowser("Mozila");
		navigate("http://www.salesforce.com");
		click("//*[@id='button-login']");
		Thread.sleep(2000);
		closeBrowser();
		

	}
	
	static public void openBrowser(String browserType){		
		if(browserType.equals("Mozila")){
			driver = new FirefoxDriver();
		}else if(browserType.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\175524\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();			
		}else if(browserType.equals("IE")){
			// code for IE.
		}
	}
	
	static public void waitforElementVisibility(String Xpath){
		wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath)));
		
	}
	
	static public void click(String Xpath){
		waitforElementVisibility(Xpath);
		driver.findElement(By.xpath(Xpath)).click();
		
	}
	
	static public void closeBrowser(){
		if(driver!=null){
			driver.quit();
		}
		
	}
	
	static public void navigate(String URL){
		driver.get(URL);
		
	}

}
