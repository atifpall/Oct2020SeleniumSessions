package seleniumFirstProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExercise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/atifpall/Desktop/Softwares/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
        driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22580/aus-vs-pak-2nd-test-pakistan-tour-of-australia-2019");

		WebElement table = driver.findElement(By.xpath("//div[@class='cb-col cb-col-67 cb-scrd-lft-col html-refresh ng-isolate-scope'] //div[@id='innings_1']/div[1]"));
        //WebElement table=driver.findElement(By.xpath("(//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])[3]"));
        int count= table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
	   int sum=0;
	   for(int i=0;i<count-3;i++) 
	   {
		   String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
		   int valueInteger=Integer.parseInt(value);
		   sum=sum+valueInteger;
		    
	   }
	   
	   
	   
	   String value1=driver.findElement(By.xpath("(//div[text()='Extras'])[1]/following-sibling::div[1]")).getText();
	   int valueInteger1=Integer.parseInt(value1);
	   int Total=sum+valueInteger1;
	   
	   //System.out.println(Total);
	   
	   
	   String actualTotal=driver.findElement(By.xpath("(//div[text()='Total'])[1]/following-sibling::div[1]")).getText();
	   int actual=Integer.parseInt(actualTotal);
	   //System.out.println(actual);
	   
	   if(actual==Total) 
	   {
		   System.out.println("Matched");
	   }
	   else 
	   {
		   System.out.println("Unmatched");
	   }
	   
 
Thread.sleep(2000);
driver.quit();
		
	}

}
