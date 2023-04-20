
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateOnlineShopping {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Launch the Browser by webdriver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nsoum\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
       
        //visit home page of application
        driver.get("https://www.flipkart.com/");
        Thread.sleep(3000);
       
        
        driver.findElement(By.className("_2IX_2- VJZDxU")).sendKeys("nsoumyaranjan46@gmail.com");
//        driver.findElement(By.className("_2IX_2- _3mctLh VJZDxU")).sendKeys("12345");
        
       
//        driver.findElement(By.className("_2KpZ6l _2doB4z")).click();
        //search "Home appliances" in search and click to search button
//        driver.findElement(By.name("q")).sendKeys("Home appliances");
//        driver.findElement(By.className("L0Z3Pu")).click();
//        Thread.sleep(2000);
//        try {
        //choose first product and add to cart 
//        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[3]/div[2]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/h2[1]/a[1]/span[1]")).click();
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[9]/div[4]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[9]/div[1]/span[1]/span[1]/span[1]/input[1]")).click();
//	    Thread.sleep(2000);
//	    
	    //After added print first product amount in console
//        String amount=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[2]")).getText();
//        System.out.println(" The order amount:"+amount);
//        Thread.sleep(2000);
//        
        //Navigate back to Home appliances page
//        driver.navigate().back();
//        Thread.sleep(1000);
//        driver.navigate().back();
//        
        //click on another product and add one more product 
//        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[3]/div[2]/div[2]/div[1]/span[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/h2[1]/a[1]/span[1]")).click();
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[9]/div[4]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[9]/div[1]/span[1]/span[1]/span[1]/input[1]")).click();
//	    Thread.sleep(2000);
//	    
	    //After added print first product amount in console
//      
//         String totalamount=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/span[2]/span[1]")).getText();
//        System.out.println(" The revised total order amount:"+totalamount);
//        
//        
        
//      String amount1=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[9]/div[4]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")).getText();
//     
//      if(
//        
        
       
       //close the driver
//        driver.close();
//	    
//        }
//        catch(Exception e ) {
//        	System.out.println("Amazon site Problem like There is product stock unavailable/not deliverable/there is no add to cart button like this  ");
//        }
        
        
	}

}