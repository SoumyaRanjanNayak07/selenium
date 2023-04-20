import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class firstclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nsoum\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.getTitle();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Tripod");
		driver.findElement(By.id("nav-search-submit-button")).click(); 
		driver.close();

	}

}
