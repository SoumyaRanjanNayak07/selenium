import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.Select;
public class SetShoppingValues { //Do not change the class name
public WebDriver driver;
//Constructors are already given. If required you can add more code into it but do NOT remove code
public SetShoppingValues() { //Do not change the method Signature
}
public SetShoppingValues(WebDriver driver) { //Do not change the method Signature
this.driver=driver;
}
public void setItemName(String name) throws Exception { //Do not change the method Signature
//implement the drag and drop code here
//Locate the source web element that needs to be dragged
//(Choose the source web element based on the item 'name'retrived from the XML file)
WebElement source1=driver.findElement(By.id(name));
WebElement target=driver.findElement(By.id("droppable"));
Actions builder=new Actions(driver);
builder.clickAndHold(source1).moveToElement(target).release(source1).build().perform();
//Locate the target web element that needs to be dropped
//Creating object of Action class to build composite actions
//Performing the drag and drop action
}
public void setItemQuantity(String quantity) throws Exception{ //Do not change the method Signature
//Creating the object of Actions class to build composite actions
//Locate the slider web element
//Move the slider based on the quantity
int slidevalue=Integer.parseInt(quantity);
Actions builder1=new Actions(driver);
WebElement slider=driver.findElement(By.id("myRange"));
builder1.click(slider).build().perform();
int xoffset=0;
if(slidevalue==5) {
xoffset=-10;
}
else if(slidevalue==4) {
xoffset=-20;
}
else if(slidevalue==3) {
xoffset=-40;
}
else if(slidevalue==6) {
xoffset=-10;
}
else if(slidevalue==7) {
xoffset=-20;
}
builder1.dragAndDropBy(slider, xoffset, 0).build().perform();
//For Example
//You can use the below methods to move the slider
// * moveToElement(WebElement target)
// * dragAndDropBy(WebElement source, int xOffset, int yOffset)
//xOffset value is chosen as given below
// a. If the 'quantity' value is 5 the xOffset is "-10"
// b. If the 'quantity' value is 4 the xOffset is "-20"
// c. If the 'quantity' value is 3 the xOffset is "-40"
// d. If the 'quantity' value is 6 the xOffset is "10"
// e. If the 'quantity' value is 7 the xOffset is "20"
//Handle the code logic for different xOffset value, it must be dynamic based on quantity
//builder1.moveToElement(slider).click().dragAndDropBy(slider,(slidevalue*-2),0).build().perform();
//yOffset value is default '0'
}
public void setItemPlatform(String platform) throws Exception { //Do not change the method Signature
//"Select" package has been already imported
//Declare the drop down element as an instance of the select class
//Select 'Platform' drop down (for example: Use id or xpath to identify the web element)
//Select the platform option according to the 'platform' value read from the XML file (for example: Use selectByVisibleText)
//Locate the web element of the "OK" button and click it.
Select select1=new Select(driver.findElement(By.id("Platform")));
select1.selectByVisibleText(platform);
driver.findElement(By.id("quantityOK")).click();
}
public void showBill() { //Do not change the method Signature
//Locate the web element of the "Show Bill" button and click it
driver.findElement(By.id("showBill")).click();
}
public void showPrice() { //Do not change the method Signature
//Locate the web element of the link "Click to see Price of Vegetables' and click it
driver.findElement(By.id("popUp")).click();
}
}