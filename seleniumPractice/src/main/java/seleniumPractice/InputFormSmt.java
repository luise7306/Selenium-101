package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputFormSmt extends baseFile{
	
	@Test
	public void submitForm() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();

		WebElement inptForm = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Input Form Submit")));
		inptForm.click();

		/*
		 * try { Thread.sleep(3000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		
		WebElement btnSubmit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit' and contains(@class,'bg-lambda-900')]")));
		btnSubmit.click();
		
		WebElement fldName = driver.findElement(By.id("name"));
		String valMessage = fldName.getAttribute("validationMessage");
		
		//Because of local settings I see it in Spanish
		boolean isValid = valMessage.contains("Please fill out this field") || valMessage.contains("Completa este campo");
		Assert.assertTrue(isValid, "Message displayed: " + valMessage);
		
		driver.findElement(By.id("name")).sendKeys("Luis");
		driver.findElement(By.id("inputEmail4")).sendKeys("test03@test.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("temporal03");
		driver.findElement(By.name("company")).sendKeys("LambdaTest_testmu");
		driver.findElement(By.id("websitename")).sendKeys("www.lambdatest.com");
//		Select United States using the text property
		WebElement country = driver.findElement(By.name("country"));
		Select selCountry = new Select(country);
		selCountry.selectByVisibleText("United States");
		
		driver.findElement(By.id("inputCity")).sendKeys("Plano");
		driver.findElement(By.id("inputAddress1")).sendKeys("303 Main Street");
		driver.findElement(By.id("inputAddress2")).sendKeys("Green Forrest");
		driver.findElement(By.id("inputState")).sendKeys("Texas");
		driver.findElement(By.id("inputZip")).sendKeys("75074");
		
//		All fields filled in
		btnSubmit.click();
		
		WebElement expMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='success-msg hidden']")));
		String successMsg = expMessage.getText(); 
		
		System.out.println(successMsg);
		Assert.assertEquals(successMsg, "Thanks for contacting us, we will get back to you shortly.");
		
	}

}
