package TrainingDay5;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class webTable {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\175524\\Downloads\\IEDriverServer_Win32_2.45.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		//WebDriver driver = new FirefoxDriver();
		driver.get("http://www.w3schools.com/Html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement table = driver.findElement(By.xpath("html/body/div[4]/div/div[2]/div[2]/div[1]/div/table[1]/tbody"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		outerloop:
		for (int r = 1;r <=rows.size();r++){
			List<WebElement> cols = rows.get(r).findElements(By.tagName("td"));
			for(int c = 0;c<cols.size();c++){
				if(cols.get(c).getText().equals("Smith")){
					System.out.println("text found");
					break outerloop;
				}else{
					//System.out.println("Unable to find.");
				}
			}
		}
		
		Thread.sleep(2000L);
		driver.quit();
		
	}

}
