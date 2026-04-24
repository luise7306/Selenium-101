package seleniumPractice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


public class baseFile {
	public RemoteWebDriver driver;
	@Parameters({"browsername", "testName", "OS"})
	@BeforeTest	
	public void setUp(String browsername, String testName, String OS) {
		if (browsername.equals("Chrome")) {
			ChromeOptions browserOptions = new ChromeOptions();
			browserOptions.setPlatformName(OS);
			browserOptions.setBrowserVersion("147.0");
			HashMap<String, Object> ltOptions = new HashMap<String, Object>();
			ltOptions.put("visual", true);
			ltOptions.put("video", true);
			ltOptions.put("build", "Certification Final");
			ltOptions.put("project", "Selenium 101");
			ltOptions.put("name", testName);
			ltOptions.put("selenium_version", "4.4.0");
			ltOptions.put("w3c", true);
			ltOptions.put("plugin", "java-testNG");
			browserOptions.setCapability("LT:Options", ltOptions);
			try {
				driver = new RemoteWebDriver(new URL("https://luiseg7306:LT_d7YYktJF8B4szKjQuIFPnGwCuTbI7EK7QWsLrsslGbQijgX@hub.lambdatest.com/wd/hub"), browserOptions);
				} catch (MalformedURLException e) {
					//TODO Auto-generated catch block
					e.printStackTrace();
				}			
		} else if(browsername.equals("Safari")) {
				  SafariOptions browserOptions = new SafariOptions();
				  browserOptions.setPlatformName(OS);
				  browserOptions.setBrowserVersion("18"); 
				  HashMap<String, Object> ltOptions =
				  new HashMap<String, Object>(); 
				  ltOptions.put("visual", true);
				  ltOptions.put("video", true); 
				  ltOptions.put("build","Certification Final"); 
				  ltOptions.put("project", "Selenium 101");
				  ltOptions.put("name", testName); 
				  ltOptions.put("selenium_version","4.4.0"); 
				  ltOptions.put("w3c", true); 
				  ltOptions.put("plugin", "java-testNG");
				  browserOptions.setCapability("LT:Options", ltOptions); 
					try {
						driver = new RemoteWebDriver(new URL("https://luiseg7306:LT_d7YYktJF8B4szKjQuIFPnGwCuTbI7EK7QWsLrsslGbQijgX@hub.lambdatest.com/wd/hub"), browserOptions);
						} catch (MalformedURLException e) {
							//TODO Auto-generated catch block
							e.printStackTrace();
						}			
		} else if (browsername.equals("Edge")) {
			EdgeOptions browserOptions = new EdgeOptions();
			browserOptions.setPlatformName(OS);
			browserOptions.setBrowserVersion("147.0");
			HashMap<String, Object> ltOptions = new HashMap<String, Object>();
			ltOptions.put("visual", true);
			ltOptions.put("video", true);
			ltOptions.put("build","Certification Final");			
			ltOptions.put("project", "Selenium 101");
			ltOptions.put("name", testName);			
			ltOptions.put("w3c", true);
			ltOptions.put("plugin", "java-testNG");
			browserOptions.setCapability("LT:Options", ltOptions);			
			try {
				driver = new RemoteWebDriver(new URL("https://luiseg7306:LT_d7YYktJF8B4szKjQuIFPnGwCuTbI7EK7QWsLrsslGbQijgX@hub.lambdatest.com/wd/hub"), browserOptions);
				} catch (MalformedURLException e) {
					//TODO Auto-generated catch block
					e.printStackTrace();
				}			
		} else if (browsername.equals("Firefox")) {
			FirefoxOptions browserOptions = new FirefoxOptions();
			browserOptions.setPlatformName(OS);
			browserOptions.setBrowserVersion("147.0");
			HashMap<String, Object> ltOptions = new HashMap<String, Object>();
			ltOptions.put("visual", true);
			ltOptions.put("video", true);
			ltOptions.put("build","Certification Final");			
			ltOptions.put("project", "Selenium 101");
			ltOptions.put("name", testName);			
			ltOptions.put("w3c", true);
			ltOptions.put("plugin", "java-testNG");
			browserOptions.setCapability("LT:Options", ltOptions);
			try {
				driver = new RemoteWebDriver(new URL("https://luiseg7306:LT_d7YYktJF8B4szKjQuIFPnGwCuTbI7EK7QWsLrsslGbQijgX@hub.lambdatest.com/wd/hub"), browserOptions);
				} catch (MalformedURLException e) {
					//TODO Auto-generated catch block
					e.printStackTrace();
				}			
		}
		driver.get("https://www.lambdatest.com/selenium-playground");
	}

		@AfterTest
		public void tearDown() {
			if (driver != null) {
				driver.quit();	
			}
		}
		

}
