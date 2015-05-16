package TrainingDay4;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;





public class SeleniumGrid {
	
	//@Parameters({ "browserType" })
	@Test(dataProvider="getData")
	public void checkgmailEmail(String browsweType) throws MalformedURLException, InterruptedException{
		
		DesiredCapabilities dr=null;	
		
		if(browsweType.equals("firefox")){
			dr=DesiredCapabilities.firefox();
			dr.setBrowserName("firefox");
			dr.setPlatform(Platform.ANY);
		}else if(browsweType.equals("ie")){			
			dr=DesiredCapabilities.internetExplorer();
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\IEDriverServer.exe");
			dr.setBrowserName("iexplore");
			dr.setPlatform(Platform.WINDOWS);
			//System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\IEDriverServer.exe");
		}else if(browsweType.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
			dr=DesiredCapabilities.chrome();
			dr.setBrowserName("chrome");
			dr.setPlatform(Platform.ANY);
		}
		
		System.out.println("Browser mentioned is " + browsweType);
		/*dr=DesiredCapabilities.firefox();
		dr.setBrowserName("firefox");
		dr.setPlatform(Platform.ANY);
*/
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),dr);
		driver.navigate().to("http://gmail.com");
		driver.findElement(By.xpath("//input[@id='Email']")) .sendKeys("username");
		driver.findElement(By.xpath("//input[@id='Passwd']")) .sendKeys("password");
		Thread.sleep(10000L);
		driver.quit();
	}
	
	@DataProvider(parallel=true)
	public Object[][]  getData(){
		
		Object[][] data = new Object[3][1];
		
		data[0][0] = "firefox";
		/*data[1][0] = "firefox";
		data[2][0] = "firefox";
		data[3][0] = "firefox";
		data[4][0] = "firefox";*/
		
		data[1][0] = "ie";
		/*data[6][0] = "ie";
		data[7][0] = "ie";
		data[8][0] = "ie";
		data[9][0] = "ie";
		*/
		data[2][0] = "chrome";
	/*	data[11][0] = "chrome";
		data[12][0] = "chrome";
		data[13][0] = "chrome";
		data[14][0] = "chrome";*/
		
		return data;
		
	}
	

}
