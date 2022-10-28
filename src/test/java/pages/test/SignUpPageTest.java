package pages.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUpPageTest extends BaseTest{
	

@Test(priority=1, description="This is to verify the sign up button --> Should be clickable, Should open the Add new user page")
public void verifySignUpBtn() {
	driver.findElement(By.xpath("//a[normalize-space()='Sign Up']")).click();
	String expectedTitle="Add new user";
	String actualTitle=driver.findElement(By.xpath("//h2[normalize-space()='Add new user']")).getText();
	if(actualTitle.equals(expectedTitle)) {
		System.out.println("Title of the signUp page is equal to the expected Title --> " +actualTitle);	
	}
	else {
		System.out.println("Title of the signUp page is NOT EQUAL to the expected Title --> " +actualTitle);
	}
	Assert.assertEquals(actualTitle,expectedTitle);
}
@Test(priority=2, description="Sign up with valid information --> User should be able to submit the form successfully")
public void signUpWithValidInformation() {
	driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Amina");
	driver.findElement(By.xpath("//input[@id='Surname']")).sendKeys("Khatoon");
	driver.findElement(By.xpath("//input[@id='E_post']")).sendKeys("Main Street");
	driver.findElement(By.xpath("//input[@id='Mobile']")).sendKeys("1112223333");
	driver.findElement(By.xpath("//input[@id='Username']")).sendKeys("Amiiinaaaa");
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("12345");
	driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("12345");
	driver.findElement(By.xpath("//input[@id='submit']")).click();
	
	String expectedValidation = "Registration Successful";
	String actualValidation = driver.findElement(By.xpath("//label[normalize-space()='Registration Successful']")).getText();
	
	if(actualValidation.equals(expectedValidation)) {
		System.out.println("The validation of the registration form is equal to the expected Text --> " +actualValidation + "<--");	
	}
	else {
		System.out.println("The validation of the registration form is not equal to the expected Text --> " +actualValidation + "<--");
	}
	Assert.assertEquals(actualValidation,expectedValidation);
}
}
