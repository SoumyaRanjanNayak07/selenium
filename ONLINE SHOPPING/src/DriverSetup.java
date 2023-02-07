import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DriverSetup {
public static WebDriver driver;
public static String baseUrl = "http://webapps.tekstac.com/OnlineShopping";
public static WebDriver getDriver() {
System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
FirefoxBinary firefoxBinary = new FirefoxBinary();
firefoxBinary.addCommandLineOptions("--headless");
FirefoxProfile profile = new FirefoxProfile();
FirefoxOptions firefoxOptions = new FirefoxOptions();
firefoxOptions.setBinary(firefoxBinary);
firefoxOptions.setProfile(profile);
driver = new FirefoxDriver(firefoxOptions);
driver.navigate().to(DriverSetup.baseUrl);
String baseUrl = "http://webapps.tekstac.com/OnlineShopping";
driver.get(baseUrl);
return driver;
}
}