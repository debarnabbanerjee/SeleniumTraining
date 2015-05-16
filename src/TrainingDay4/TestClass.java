package TrainingDay4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestClass {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\175524\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.navigate().to("http://hdfcbank.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/ul/li[2]"))).build().perform();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/ul/li[2]/div[2]/div[2]")));

		String part1 = "html/body/div[1]/div[2]/div[2]/div[2]/ul/li[2]/div[2]/div[2]/div[1]/ul/li[";
		String part2="]";
		String part3 = "/html/body/div[1]/div[2]/div[2]/div[2]/ul/li[2]/div[2]/div[2]/div[2]/div[";
		String part4 = "]/div/ul";
		//int i = 1;		

		//for(int i = 1;i<=9;i++){
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(part1+1+part2)));
		System.out.println("Menu Item name is " + driver.findElement(By.xpath(part1+1+part2)).getText());

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/div[2]/div[2]/div[2]/ul/li[2]/div[2]/div[2]/div[1]/ul/li[1]")));
		action.moveToElement(driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[2]/ul/li[2]/div[2]/div[2]/div[1]/ul/li[1]"))).build().perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/div[2]/div[2]/div[2]/ul/li[2]/div[2]/div[2]/div[2]/div[1]/div/ul")));
		action.moveToElement(driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[2]/ul/li[2]/div[2]/div[2]/div[2]/div[1]/div/ul"))).build().perform();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/div[2]/div[2]/div[2]/ul/li[2]/div[2]/div[2]/div[2]/div[1]/div/ul")));
		List<WebElement> link = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[2]/ul/li[2]/div[2]/div[2]/div[2]/div[1]/div/ul")).findElements(By.tagName("li"));

		for(int j = 0;j<=1;j++){				
			System.out.println("Sub Menu text is " + link.get(j).getText());
			link.get(j).click();
			System.out.println(driver.getTitle());
			driver.navigate().back();
						
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/div[2]/div[2]/div[2]/ul/li[2]")));
			action.moveToElement(driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[2]/ul/li[2]"))).build().perform();
			action.moveToElement(driver.findElement(By.xpath(part1+1+part2))).build().perform();
			link = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[2]/ul/li[2]/div[2]/div[2]/div[2]/div[1]/div/ul")).findElements(By.tagName("li"));
			
			
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(part1+1+part2)));
			
			
			
			
		}


		//}

		Thread.sleep(3000L);
		driver.quit();


	}

}
