package TrainingDay5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class moreWebTableExamples {

	
	public static void main(String[] args) throws InterruptedException {
		
		/*System.setProperty("webdriver.ie.driver", "C:\\Users\\175524\\Downloads\\IEDriverServer_Win32_2.45.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();*/
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.w3schools.com/Html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement table = driver.findElement(By.xpath("html/body/div[4]/div/div[2]/div[2]/div[1]/div/table[1]/tbody"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		List<String> listText= new ArrayList<String>();
		Set<String> SetText= new TreeSet<String>();
		outerloop:
		
			try{
				for (int r = 1;r <=rows.size();r++){
					List<WebElement> cols = rows.get(r).findElements(By.tagName("td"));
					listText.add(cols.get(0).getText());
					SetText.add(cols.get(0).getText());
				}
			}catch(Exception e){
				System.out.println("List size is " + listText.size());
				System.out.println("Set size is " + SetText.size());
			
			
			if(listText.size() == SetText.size()){
				System.out.println("Unique elements found");
			}else {
				System.out.println("Elemets not unique");
			}				
			}finally{
				Thread.sleep(2000L);
				driver.quit();
			}

	}

}
