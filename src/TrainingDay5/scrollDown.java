package TrainingDay5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class scrollDown {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\175524\\Downloads\\IEDriverServer_Win32_2.45.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement apiLink = driver.findElement(By.xpath("//*[@id='content']/p[2]/a"));
		
		// code for scrolling to the last of the page.
		/*((JavascriptExecutor) driver)
        .executeScript("window.scrollTo(0, document.body.scrollHeight)");*/
		
		// code for scrolling till a particular element
		((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", apiLink);
		
		Thread.sleep(3000L);
		driver.quit();

	}

}
