import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;//td[normalize-space()='sfsgrf']
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Shopify {
	static String baseUrl="https://webapps.tekstac.com/Shopify/";
	static WebDriver driver;
	public static WebDriver setWebDriver() {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\nsoum\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\nsoum\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
//		 driver =new ChromeDriver();
		 driver=new FirefoxDriver();
		 driver.get(baseUrl);
		 return driver;
	}
    public static void firstName(String fn)
    {
		driver.findElement(By.id("firstname")).sendKeys(fn);
	} 
	public static void lastName(String ln) {
		driver.findElement(By.id("lastname")).sendKeys(ln);
	}
	public static void userName(String un){
		driver.findElement(By.id("username")).sendKeys(un);
	}
	
	
	public static void selectCity(String city){
		Select category=new Select(driver.findElement(By.id("selectcity")));
		category.selectByVisibleText(city);
	}
	
    public static void genderSelect(String gender){
    	List<WebElement> genList=driver.findElements(By.className("fa fa-address-book icon"));
    	for(WebElement e:genList) {
    		System.out.println(e.getText());
    	}
    	WebElement p=driver.findElement(By.xpath("/html/body/form/div[6]/input[1]"));
    	boolean  GenderSelected=p.isSelected();
		if( GenderSelected==false)
    	{
    		p.click();
    	}
    	
	}
    
    
    public static void password(String pwd){
		driver.findElement(By.name("psw")).sendKeys(pwd);
	}
    public static void clickRegisterButton() {
    	driver.findElement(By.id("reg")).click();
	}
    
    
    
    public static String getFirstName(){
		return driver.findElement(By.xpath("//*[@id=\"ttab\"]/tbody/tr[3]/td[1]")).getText();
	}
    public static String getLastName(){
    	return driver.findElement(By.xpath("//*[@id=\"ttab\"]/tbody/tr[3]/td[2]")).getText();
	}
    public static String getUserName() {
    	return driver.findElement(By.xpath("//*[@id=\"ttab\"]/tbody/tr[3]/td[3]")).getText();
	}
	public static String getCity() {
		return driver.findElement(By.xpath("//*[@id=\"ttab\"]/tbody/tr[3]/td[4]")).getText();
	}
	public static void closeBrowser() {
		driver.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shopify s=new Shopify();
		setWebDriver();
		firstName("John");
		lastName("Carey");
		userName("John Carey");
	    selectCity("Chennai");
		genderSelect("Male");
		password("jfn786@#$");
		clickRegisterButton();
		closeBrowser();

	}

}

//import java.util.List;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//public class Shopify {
//	
//	static WebDriver driver;
//	public static WebDriver setWebDriver() {
////	System.setProperty("webdriver.chrome.driver","C:\\Users\\nsoum\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
//	System.setProperty("webdriver.gecko.driver","C:\\Users\\nsoum\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
////	 driver =new ChromeDriver();
//	 driver=new FirefoxDriver();
//	 driver.get("https://webapps.tekstac.com/Shopify/");
//	 return driver;
//}
//	public static void firstName(String fn)
//	{
//		driver.findElement(By.id("firstname")).sendKeys(fn);
//	}
//	public static void lastName(String ln)
//	{
//		driver.findElement(By.id("lastname")).sendKeys(ln);
//	}
//	public static void userName(String un)
//	{
//		driver.findElement(By.id("username")).sendKeys(un);
//	}
//	public static void selectCity(String city)
//	{
//		Select category = new Select(driver.findElement(By.id("selectcity")));
//		category.selectByVisibleText(city);
//	}
//	public static void genderSelect(String gender)
//	{
//		List<WebElement> genList = driver.findElements(By.className("fa fa-address-book icon"));
//		for(WebElement e : genList)
//		{
//			System.out.println(e.getText());
//		}
//		WebElement p = driver.findElement(By.xpath("/html/body/form/div[6]/input[1]"));
//		boolean GenderSelected = p.isSelected();
//		if(GenderSelected == false)
//		{
//			p.click();
//		}
//	}
//	public static void password(String pwd)
//	{
//		driver.findElement(By.id("pass")).sendKeys(pwd);
//	}
//	public static void clickRegesterButton()
//	{
//		driver.findElement(By.id("reg")).click();
//	}
//	public static String getFirstName()
//	{
//		return driver.findElement(By.xpath("//*[@id=\"ttab\"]/tbody/tr[3]/td[1]")).getText();
//	}
//	public static String getlastName()
//	{
//		return driver.findElement(By.xpath("//*[@id=\"ttab\"]/tbody/tr[3]/td[2]")).getText();
//	}
//	public static String getUserName()
//	{
//		return driver.findElement(By.xpath("//*[@id=\"ttab\"]/tbody/tr[3]/td[3]")).getText();
//	}
//	public static String getCity()
//	{
//		return driver.findElement(By.xpath("//*[@id=\"ttab\"]/tbody/tr[3]/td[4]")).getText();
//	}
//	public static void closeBrowser()
//	{
//		driver.close();
//	}
//	
//	public static void main(String[] args)
//	{
//		setWebDriver();
//		firstName("John");
//		lastName("Carey");
//		userName("John Carey");
//		selectCity("Chennai");
//		genderSelect("Male");
//		password("jfn786@#$");
//		clickRegesterButton();
//		closeBrowser();
//	}
//
//}
//
