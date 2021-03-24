package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Verify_URL_Title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		String expectedTitle="LTK-FGMC Import/Export";
		String actualTitle="";
		driver.get(baseURL);
		actualTitle=driver.getTitle();
		if(actualTitle.contentEquals(expectedTitle)) {
		System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		driver.close();

	}

}
