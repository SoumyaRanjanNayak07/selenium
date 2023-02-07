package firstProject1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Driver setUp"
	    System.setProperty("webdriver.chrome.driver", "D:\\Coding\\firstProject1\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		Thread.sleep(100);
		
		// It will return the parent window name as a String
		String parent=driver.getWindowHandle();
		//using Set for multiple windows
		Set<String>s=driver.getWindowHandles();
		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{
		String child_window=I1.next();

		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		}
		}	
		//To click on pop up close button
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		//To switch to default Parent Window
		driver.switchTo().window(parent);
	
		Thread.sleep(3000);
		//Closing the driver/Browser.
		driver.close();

}
	
}	
	
