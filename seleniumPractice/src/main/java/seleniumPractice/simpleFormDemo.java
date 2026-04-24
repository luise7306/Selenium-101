package seleniumPractice;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class simpleFormDemo extends baseFile {
	
	@Test
	public void TestFormDemo() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
//		driver.get("https://www.testmuai.com/selenium-playground/");

		WebElement demoForm = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Simple Form Demo']")));
		demoForm.click();
		
		String valURL = driver.getCurrentUrl();
		
		boolean found = valURL.contains("simple-form-demo");
		assertTrue(found);
		
		String entMessage = "Welcome to LambdaTest";
		
		WebElement msgEle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Please enter your Message']")));
//				.visibilityOfElementLocated());
		msgEle.sendKeys(entMessage);
				
		driver.findElement(By.xpath("//button[text()='Get Checked Value']")).click();

		WebElement eleMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
		String valMessage = eleMessage.getText();
		
		Assert.assertEquals(valMessage, entMessage);		
	}
	

}
