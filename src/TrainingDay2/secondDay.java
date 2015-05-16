package TrainingDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import bsh.Capabilities;

public class secondDay {

	static WebDriver driver ;
	static WebDriverWait wait ;
	static String  URL="http://hdfc.com/" ;
	/*static String parentWindow ;
	static String secondWindow;*/

	public static void main(String[] args) throws InterruptedException {
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\175524\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(URL);		
		wait = new WebDriverWait(driver,20);		

		Thread.sleep(3000L);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='node-18']/div/div/div/div/div[3]/div/div/div[1]/ul/li[4]/a/img")));		
		driver.findElement(By.xpath("//*[@id='node-18']/div/div/div/div/div[3]/div/div/div[1]/ul/li[4]/a/img")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iter = windowHandles.iterator();
		while(iter.hasNext()){
			parentWindow = iter.next();
			secondWindow = iter.next();
		}

		System.out.println(parentWindow);
		System.out.println(secondWindow);

		driver.switchTo().window(secondWindow);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='home']/div[2]/div/div/div[1]/a/img")));
		driver.findElement(By.xpath("//*[@id='home']/div[2]/div/div/div[1]/a/img")).click();

		driver.switchTo().window(parentWindow);
		System.out.println("Switched");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='form-item form-type-textfield form-item-search-block-form']/input")));
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//div[@class='form-item form-type-textfield form-item-search-block-form']/input")).sendKeys("FIRST PAGE");
		Thread.sleep(2000L);
		driver.quit();*/		
		
		
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\175524\\Downloads\\chromedriver.exe");
		//driver = new ChromeDriver();//
		
		
		/*// ArrayList collections
		List<String> l = new ArrayList<String>();
		l.add("A");
		l.add("A");
		l.add("A");
		
		//System.out.println(l.size());
		
		// Set collections
		Set<String> s = new TreeSet<String>();
		s.add("A");
		s.add("A");
		s.add("B");
		
		//System.out.println(s.size());
		
		driver.get("http://hdfc.com/");
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='node-18']/div/div/div/div/div[3]/div/div/div[1]/ul/li[4]/a/img")));
		driver.findElement(By.xpath("//*[@id='node-18']/div/div/div/div/div[3]/div/div/div[1]/ul/li[4]/a/img")).click();		
		//System.out.println(driver.getWindowHandle());
		
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iter = windowHandles.iterator();
		
		String parentWindow = null;
		String secondWindow = null;
		
		while(iter.hasNext()){
			
			 parentWindow = iter.next();
			 secondWindow = iter.next();
			
		}
		
		System.out.println("first wndow id " + parentWindow);
		System.out.println("second Window " + secondWindow);
		
		
		driver.switchTo().window(secondWindow);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='home']/div[2]/div/div/div[1]/a/img")));
		driver.findElement(By.xpath("//*[@id='home']/div[2]/div/div/div[1]/a/img")).click();
		System.out.println("clicked in the second page.");
		
		driver.switchTo().window(parentWindow);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='edit-search-block-form--2']")));
		driver.findElement(By.xpath("//*[@id='edit-search-block-form--2']")).sendKeys("FIRST PAGE");*/
		
		// HTML table
		/*driver.get("http://www.w3schools.com/Html/html_tables.asp");
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div/div[2]/div[2]/div[1]/div/table[1]/tbody")));
		System.out.println("Waited");
		
		WebElement tableBody=driver.findElement(By.xpath("html/body/div[4]/div/div[2]/div[2]/div[1]/div/table[1]/tbody"));
		List<WebElement> rows = tableBody.findElements(By.tagName("tr"));
		System.out.println("No of rows " + rows.size());
		
		
		for(int r=1;r<rows.size();r++){			
			List<WebElement> cols =rows.get(r).findElements(By.tagName("td"));
			for(int c  =0;c<cols.size();c++){
				System.out.print(cols.get(c).getText() + " -- ");
			}
			System.out.println();
		}		
		
		Thread.sleep(5000L);
		driver.quit();*/
		
		// FRAME APPLICATION
		
		/*driver = new FirefoxDriver();
        driver.navigate().to("file:///D:/index.html");           
       
        driver.switchTo().frame("loginFrame");
        //driver.switchTo().frame(0);
        wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='username']")));             
        driver.findElement(By.xpath("//*[@id='username']")).sendKeys("XXXXXXXXXXXX");
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("XXXXXXXXXXXX");
        driver.findElement(By.xpath("//*[@id='submit']")).click();
        Thread.sleep(3000L);       
        driver.switchTo().alert().accept();
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//*[@id='clickMe']")).click();
        Thread.sleep(3000L);
        driver.switchTo().alert().accept();
        Thread.sleep(3000L);
        driver.quit();*/
        
        // Firefox profilling
		/*FirefoxProfile profile = new FirefoxProfile();
        profile.setAcceptUntrustedCertificates(true);         
        // 0 --> download to desktop
        // 1 -- > downlaod to default download location
        // 2 -- your custom directory.
                     
        profile.setPreference("browser.download.folderList", 2);
        profile.setPreference("browser.download.dir", System.getProperty("user.dir")+"\\Downloads");
        profile.setPreference("browser.download.manager.showWhenStarting", false);
        profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "images/jpeg,application/pdf,text/csv" +
                                    ",application/msword,image/jpeg,image/pjpeg,text/plain,application/plain,application/x-texinfo,application/x-texinfo," +
                                   "application/octet-stream");
                      profile.setPreference("pdfjs.disabled", true);


        driver = new FirefoxDriver(profile);
        driver.navigate().to("http://the-internet.herokuapp.com/download");
        wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='content']/div/a[5]")));
        driver.findElement(By.xpath("//*[@id='content']/div/a[1]")).click();
                     
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='content']/div/a[6]")));
        driver.findElement(By.xpath("//*[@id='content']/div/a[6]")).click();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='content']/div/a[5]")));
        driver.findElement(By.xpath("//*[@id='content']/div/a[5]")).click();
                     
        Thread.sleep(3000L);
        driver.quit();*/
		
		
		//System.out.println(System.getProperty("user.dir"));
        DesiredCapabilities cap = DesiredCapabilities.firefox();
        cap.setCapability(CapabilityType.BROWSER_NAME, "firefox");
        
      
		
		
		
		
		
		
		
		
		
		
		

	}

}

