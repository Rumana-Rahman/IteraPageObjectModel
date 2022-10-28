package pages.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest{
	
	@Test
	public void verifyLoginBtn() {
		driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
		String expectedTL="LOGIN";
		String actualTL=driver.findElement(By.xpath("//td[normalize-space()='LOGIN']")).getText();
		
		if(actualTL.equals(expectedTL)) {
			System.out.println("Title of the Login page is equal to the expected Title --> " +actualTL);	
		}
		else {
			System.out.println("Title of the Login page is NOT EQUAL to the expected Title --> " +actualTL);
		}
		
	}
	

}
