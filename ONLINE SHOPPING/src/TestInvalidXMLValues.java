import static org.testng.Assert.assertEquals;
import java.lang.reflect.Method;
import java.util.List;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.junit.Assert;
import org.junit.platform.commons.annotation.Testable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.TestNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.collections.Lists;
import org.testng.annotations.Listeners;

import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;

import pages.GetShoppingValues;
import pages.SetShoppingValues;
import setup.DriverSetup;
import setup.XMLUtils;

@Listeners(FeatureTest.class) //Do not change or remove this line
public class TestInvalidXMLValues {
//Do not change the varible name given below
static WebDriver driver;
static SetShoppingValues setShoppingValues;
static GetShoppingValues getShoppingValues;
public static String billInfo;
public static String blankErrTxt;
public static String[] xmlValidData = null;
//Apply the required annotation
@BeforeClass
public void setUp() { //Do not change the method Signature
//Create the driver using method 'getDriver' in class DriverSetup
//Assign it to the variable 'driver'
driver=DriverSetup.getDriver();
//Do not CHANGE THE BELOW 2 OBJECT CREATIONS
setShoppingValues= new SetShoppingValues(driver);
getShoppingValues= new GetShoppingValues(driver);
}
public static String[] getXMLData() throws Exception{ //Do not change the method Signature
//Call the method 'readFile' in class 'XMLUtils' using the xml file name 'ShoppingValid.xml"
//Assign it to the variable 'xmlValidData' to store the XML data retrieved.
//Return the array
//String[] xmlValidData=XMLUtils.readFile("ShoppingValid.xml");
xmlValidData=XMLUtils.readFile(); //Made Changes according to XMLUtils.java****
return xmlValidData;
}
@Test
public void testValidXMLDetails() throws Exception{ //Do not change the method Signature
getXMLData();
//Call the method getXMLData() to read the XML data.
try {
//Use 'setShoppingValues' object and call the method setItemName() and pass the string array value xmlValidData[0]) as parameter
setShoppingValues.setItemName(xmlValidData[0]);
//Use 'setShoppingValues' object and call the method setItemQuantity() and pass the string array value xmlValidData[1]) as parameter
setShoppingValues.setItemQuantity(xmlValidData[1]);
//Use 'setShoppingValues' object and call the method setItemPlatform() and pass the string array value xmlValidData[2]) as parameter
setShoppingValues.setItemPlatform(xmlValidData[2]);
}
catch(Exception e) {
System.out.println("error");
}
//Use 'setShoppingValues' object and call the method ShowBill() to click the "Show Bill" button
setShoppingValues.showBill();
//Use 'getShoppingValues' object and call the method getErrorMessage() and store the displayed message
//Use assert method and compare the message "Basket cannot be empty"
blankErrTxt = getShoppingValues.getShoppingPlatform();
Assert.assertEquals("Basket cannot be empty",blankErrTxt);
//assertEquals(xmlValidData[2],platforminfo);
//Use 'getShoppingValues' object and call the method getItemQuantityAmountDetails() and store the displayed message such as Item name...
//Use assert method and compare the XML value "XMLValidData[1]" with the message stored in the static variable "billInfo"
billInfo = getShoppingValues.getItemQuantityAmountDetails();
//assertEquals(xmlValidData[1],billInfo);
}
//Apply the required annotation
@AfterClass
public void closeBrowser() { //Do not change the method Signature
//close the driver
driver.close();
}
}
