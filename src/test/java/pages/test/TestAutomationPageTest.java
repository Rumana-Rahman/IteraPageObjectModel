package pages.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestAutomationPageTest extends BaseTest{
	
	@Test
	public void VerifyTestAutomationBtn() {
		driver.findElement(By.xpath("//a[normalize-space()='Test Automation']")).click();
		String expectedFormT="Test automation practice form";
		String actualFormT=driver.findElement(By.xpath("//h1[normalize-space()='Test automation practice form']")).getText();
		
		if(actualFormT.equals(expectedFormT)) {
			System.out.println("Title of the Automation practice form is equal to the expected Title --> " +actualFormT);	
		}
		else {
			System.out.println("Title of the Automation practice form is NOT EQUAL to the expected Title --> " +actualFormT);
		}
	}

}
