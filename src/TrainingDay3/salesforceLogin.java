package TrainingDay3;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@RunWith(Parameterized.class)
public class salesforceLogin {
	
	WebDriver driver;
	WebDriverWait wait;
	String username;
	String password;
	String browserType;
	String runmode ;
	Logger APP_LOGS;
	int iter;
	File scrFile;
	
	
	public salesforceLogin(String username,String password,String browserType,int iter){
		this.username = username;
		this.password = password;
		this.browserType = browserType;		
		this.iter =iter;
		
	}
	
	@BeforeClass
	public static void beforeClassMethod(){
		// start up the database connection.
		System.out.println("From before Class");				
	}
	
	@AfterClass
	public static void afterClassMethod(){
		// close data base connections.
		System.out.println("From after Class");
	}
	
	
	@Before
	public void setUp(){
		System.out.println("From before method");
		APP_LOGS = Logger.getLogger("devpinoyLogger");
		APP_LOGS.debug("Starting Logion testing for Iteration " + iter);
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver,20);
		driver.manage().window().maximize();
		//driver.manage().getCookies();		
	}
	
	@After
	public void tearDown(){
		System.out.println("From after method");
		if(driver!= null)
			driver.quit();
	}	
	
	@Test
	public void loginTestCase(){
		
		System.out.println("from login test case");
		driver.navigate().to("http://www.salesforce.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='button-login']")));
		driver.findElement(By.xpath("//*[@id='button-login']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='username']")));
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		//Assert.assertTrue("Login Failed", !driver.findElement(By.xpath("//*[@id='Login']")).isDisplayed());		
		//System.out.println("AfterAssert");
		//Assert.assertTrue(message, condition)
		try{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='error']")));
			if(driver.findElement(By.xpath("//*[@id='error']")).isDisplayed()){
				//Assert.fail("Unable to login.");
				APP_LOGS.debug("Login Failed for Iteration " + iter);
				takeScreenshots("Login test case _Iter "+ iter);
				fail("Unable to login.");
			}else {
				
			}
		}catch(Exception e){
			APP_LOGS.debug("Unable to check the login functionality for Iteration " + iter);
		}
		
	}

	
	@Parameters
	public static Collection<Object[]> parameter(){

		Object[][] data =new Object[3][4];
		
		data[0][0]="username1";
		data[0][1]="password1";
		data[0][2]="mozila";
		data[0][3]=1;	
		
		data[1][0]="username2";
		data[1][1]="password2";
		data[1][2]="chrome";		
		data[1][3]=2;
		
		data[2][0]="username3";
		data[2][1]="password3";
		data[2][2]="ie";		
		data[2][3]=3;
		
		return Arrays.asList(data);

	}
	
	public void takeScreenshots(String name) throws IOException{	
		scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir")+ "\\Screenshots\\"+name+".png"));
	}
	
	
	
	

}
