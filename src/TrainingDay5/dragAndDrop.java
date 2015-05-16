package TrainingDay5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\175524\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	*/
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\175524\\Downloads\\IEDriverServer_Win32_2.45.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//	driver.switchTo().frame("demo-frame");
		driver.switchTo().frame(0);
		//System.out.println("A");		
		Actions action = new Actions(driver);
		//System.out.println("b");
		action.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']")));
		//System.out.println("C");
		action.dragAndDropBy(driver.findElement(By.xpath("//div[@id='draggable']")), 200, 200).build().perform();
		//System.out.println("D");
		Thread.sleep(3000L);
		driver.quit();
		
		driver.findElement(By.xpath("//div[@id='draggable']")).getLocation().getX();
		
		
	}

}
