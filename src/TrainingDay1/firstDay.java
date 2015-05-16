package TrainingDay1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class firstDay {
	
	public static void main(String[] args) throws InterruptedException {
		// firefox
		//WebDriver driver = new FirefoxDriver();

		// internet explorer
		/*System.setProperty("webdriver.ie.driver", "C:\\Users\\175524\\Downloads\\IEDriverServer_Win32_2.45.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver()*/;
		
		// Chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\175524\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		WebDriverWait wait = new WebDriverWait(driver,20);
		driver.get("http://cleartrip.com/");		
		// WebDriverWait &&Implicit Wait
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section[2]/div/div/div/form/nav/ul/li[2]/label/input")));
		/*driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div/ul[2]/li[1]/a")).click();
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/div/div[1]/div[1]/div/div[2]/div[2]/div/div[4]/form/div[1]/div[2]/input")).sendKeys("username1");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/div/div[1]/div[1]/div/div[2]/div[2]/div/div[4]/form/div[2]/div[2]/input")).sendKeys("password1");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/div/div[1]/div[1]/div/div[2]/div[2]/div/div[4]/form/div[4]/button")).click();
		*/
		/*Actions action = new Actions(driver);
		WebElement element= driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/ul/li[4]"));
		action.moveToElement(element).build().perform();*/
		
		driver.findElement(By.xpath("/html/body/section[2]/div/div/div/form/div[2]/section[1]/div[1]/dl/dd/span/input[1]")).sendKeys("bangalore");
		Thread.sleep(3000L);
		driver.findElement(By.xpath("/html/body/section[2]/div/div/div/form/div[2]/section[1]/div[1]/dl/dd/span/input[1]")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("/html/body/section[2]/div/div/div/form/div[2]/section[1]/div[3]/dl/dd/span/input[1]")).sendKeys("Kolkata");
		Thread.sleep(3000L);
		driver.findElement(By.xpath("/html/body/section[2]/div/div/div/form/div[2]/section[1]/div[3]/dl/dd/span/input[1]")).sendKeys(Keys.TAB);
		Thread.sleep(2000L);
		driver.findElement(By.xpath("html/body/section[2]/div/div/div/form/div[2]/section[2]/div[1]/dl/dd/div/a/i")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/table/tbody/tr[2]/td[7]/a")));
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/table/tbody/tr[2]/td[7]/a")).click();
		
		Select selc = new Select(driver.findElement(By.xpath("//select[@id='Adults']")));
		selc.selectByIndex(2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
	

	}

}
