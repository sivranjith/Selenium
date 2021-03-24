package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class OpenBrowser {

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
		driver.get("http://google.com");
	}

}
