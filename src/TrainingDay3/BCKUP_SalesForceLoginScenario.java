package TrainingDay3;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@RunWith(Parameterized.class)
public class BCKUP_SalesForceLoginScenario {
	
	
	String username;
	String password;
	String browserType;
	WebDriver driver;
	WebDriverWait wait;
	
	public BCKUP_SalesForceLoginScenario(String username,String password,String browserType){
		this.username = username;
		this.password = password;
		this.browserType = browserType;
	}
	
	@Before
	public void setUp(){
		if(browserType.equalsIgnoreCase("mozila")){
			driver = new FirefoxDriver();
		}else if(browserType.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\175524\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browserType.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver", "D:\\selenium training\\IEDriverServer_Win32_2.44.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		wait = new WebDriverWait(driver,20);
		
	}
	
	@After
	public void tearDown(){
		if(driver!=null){
			driver.quit();
		}
	}
	
	
	@Test
	public void firstTestCase(){
	
		driver.navigate().to("http://www.salesforce.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='button-login']")));		
		driver.findElement(By.xpath("//*[@id='button-login']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='username']")));
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id='Login']/span")).click();
		
	}
	
	@Parameters
	public static Collection<Object[]> parameter(){

		Object[][] data =new Object[3][3];
		
		data[0][0]="username1";
		data[0][1]="password1";
		data[0][2]="mozila";
		
		
		data[1][0]="username2";
		data[1][1]="password2";
		data[1][2]="chrome";
		
		data[2][0]="username3";
		data[2][1]="password3";
		data[2][2]="ie";
		
		return Arrays.asList(data);

	}
	
	

}
