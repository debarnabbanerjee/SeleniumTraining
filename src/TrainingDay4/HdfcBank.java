package TrainingDay4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HdfcBank {

	public static void main(String[] args) throws InterruptedException  {
		
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\175524\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.navigate().to("http://hdfcbank.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/ul/li[2]"))).build().perform();
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/ul/li[2]/div[2]/div[2]")));
		
		String part1 = "html/body/div[1]/div[2]/div[2]/div[2]/ul/li[2]/div[2]/div[2]/div[1]/ul/li[";
		String part2="]";
		String part3 = "/html/body/div[1]/div[2]/div[2]/div[2]/ul/li[2]/div[2]/div[2]/div[2]/div[";
		String part4 = "]/div/ul";
		int i = 1;		
		List<WebElement> links ;
		try{			
			while(driver.findElement(By.xpath(part1+i+part2)).isDisplayed()){
				action.moveToElement(driver.findElement(By.xpath(part1+i+part2))).build().perform();
				System.out.println("Link text is " + driver.findElement(By.xpath(part1+i+part2)).getText());
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(part3+i+part4)));
				System.out.println("Could wait for the sebmenu.");
				links= driver.findElement(By.xpath(part3+i+part4)).findElements(By.tagName("li"));
				System.out.println("No of sub menus are " + (links.size()));
				for(int j=0;j<links.size();j++){					
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(part3+i+part4)));
					action.moveToElement(links.get(j)).build().perform();
					System.out.println("Sub Link text is " + links.get(j).getText() + " and the number is " + (j+1));
										
					// click code needs to be written here.					
					links.get(j).click();
					Thread.sleep(5000L);
					System.out.println("Page title is " + driver.getTitle());
					driver.navigate().back();
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/div[2]/div[2]/div[2]/ul/li[2]")));
					action.moveToElement(driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[2]/ul/li[2]"))).build().perform();
					action.moveToElement(driver.findElement(By.xpath(part1+i+part2))).build().perform();
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(part3+i+part4)));
					links= driver.findElement(By.xpath(part3+i+part4)).findElements(By.tagName("li"));
				}
				System.out.println("******************************************************");
				
				System.out.println("Done for link " + i);
				i++;
			} 
			
		}catch(Exception e ){
			System.out.println("Done hovering for the element . I value is " + i);
			e.printStackTrace();
		}		
		
		Thread.sleep(2000L);
		driver.quit();

	}

}
