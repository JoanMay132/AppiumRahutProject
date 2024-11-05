package rahulAcademy.Appium;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class AppiumBasics extends BaseTestServer{

	@Test
	public void WifiSettingsName() throws MalformedURLException, URISyntaxException
	{
		
		
		//Actual automation
		//Xpath, id, accesibilityId, classname, androidUIAutomator
		
		//tagName[@attribute='value']
//		driver.findElement(By.xpath(null));
	
		
		// Setting wifi name
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		//---------------------------------------

		// Assertions we can use "GET TEXT")
		String alertTitle = driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();
		Assert.assertEquals(alertTitle, "WiFi settings");
		//---------------------------------------
		// Sending values in wifi settings
		driver.findElement(By.id("android:id/edit")).sendKeys("Joanpassword");
		driver.findElement(AppiumBy.id("android:id/button1")).click();
		//---------------------------------------

	}
}
