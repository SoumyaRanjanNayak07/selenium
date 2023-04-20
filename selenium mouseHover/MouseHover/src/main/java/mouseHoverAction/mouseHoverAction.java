package mouseHoverAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class mouseHoverAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		

		//Driver setUp"
	    System.setProperty("webdriver.chrome.driver", "D:\\Coding\\TechieCoding\\MouseHover\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.python.org/");
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		Thread.sleep(100);
	
		
		//Mouse Hover Action
		Actions action =new Actions(driver);
		//This Webelement is "About" and xpath locator used
		WebElement element=driver.findElement(By.xpath("/html/body/div/header/div/nav/ul/li[1]/a"));
		action.moveToElement(element).perform();
		System.out.println("Successfull Mouse Hover action Done!  ");
	
		
		Thread.sleep(3000);
		//Closing the driver/Browser.
		driver.close();


}
}



