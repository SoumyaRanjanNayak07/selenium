import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetShoppingValues {
	public WebDriver driver; //Do not change the variable
	//Constructors are already given. If required you can add more code into it but do NOT remove the existing code
	public GetShoppingValues() {
	}
	public GetShoppingValues(WebDriver driver) { //Do not change the method signature
	this.driver=driver;
	}
	public String getItemQuantityAmountDetails() { //Do not change the method name
	//Locate the message displayed after clicking "Show Bill" button
	//Locate the text displaying billing information such as item name , quantity, price and total amount
	//Return the text using getText() method
	String msg=driver.findElement(By.id("billShow")).getText().replace("<br>","").trim();
	return msg;
	}
	public String getShoppingPlatform() { //Do not change the method name
	//Locate the message displayed after clicking "Show Bill" button.
	//Locate the text displaying shopping platform chosen
	//Return the text using getText() method
	String Bill=driver.findElement(By.xpath("//*[@id='billShow']/h4")).getText();
	return Bill;
	}
	public String getItemPriceDetails() { //Do not change the method name
	//Locate the message displayed after clicking the link 'Click to see price of Vegetables'
	//Locate the text displaying the price details of each vegetables
	//Return the text using getText() method
	String msg1=driver.findElement(By.id("myPopup")).getText().replace("<br>","").trim();
	return msg1;
	}
	/*
	* Method ONLY for Invalid Scenario
	*/
	public String getErrorMessage() {
	//Locate the error message displayed after reading the blank or empty vegetable
	//Locate the text displaying the message "Basket cannot be empty"
	//Return the text using getText Method
	String errmsg=driver.findElement(By.id("errormessage")).getText();
	return errmsg;
	}
}
