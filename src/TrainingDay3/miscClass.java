package TrainingDay3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class miscClass {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		System.out.println(driver.getTitle());
		
		
		
		
		
		
		
		Thread.sleep(2000L);
		driver.quit();
		
		
		
		
		
		

	}

}
