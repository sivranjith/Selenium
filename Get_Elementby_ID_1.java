package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Get_Elementby_ID_1 {
	public static void main(String[] args) {
	ChromeOptions options = new ChromeOptions();
	//options.addArguments("--headless");
	 DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	 capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	 capabilities.setVersion("89.0.4389.90");
	 options.merge(capabilities);
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver(options);
	System.out.println("Hello Google");
	String baseURL="https://dev-portal.lendertoolkit.com/login";
	String tagName="";
	driver.get(baseURL);
	tagName=driver.findElement(By.id("username")).getTagName();
	String className = driver.findElement(By.cssSelector("input[id=username]")).getText();
	//System.out.println(tagName);
	System.out.println(className);
	driver.close();
	System.exit(0);
	
	
	}
	

}
