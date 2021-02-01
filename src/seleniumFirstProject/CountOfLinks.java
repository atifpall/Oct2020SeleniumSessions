package seleniumFirstProject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountOfLinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/atifpall/Desktop/Softwares/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerDriver= driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		WebElement footer=footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		int size =footer.findElements(By.tagName("a")).size();
		
		for(int i=1; i<size;i++) {
			
			String clickOnLinks=Keys.chord(Keys.COMMAND,Keys.ENTER);
			footer.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinks);
			Thread.sleep(5000L);
		}
		
		
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();
		
		while(it.hasNext()){
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	
	}

}
